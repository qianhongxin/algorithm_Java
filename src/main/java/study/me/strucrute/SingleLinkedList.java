package study.me.strucrute;

import java.util.LinkedList;

/**
 * @Description: 单链表
 *
 * @Author: 钱红信
 * @Time: 2018/12/08 20:59
 */
public class SingleLinkedList {

    private int length;

    private int capacity = 20;

    private Node head;

    public SingleLinkedList() {
    }

    public SingleLinkedList(int maxLength) {
        this.capacity = maxLength;
        this.length = 0;
    }

    private void add(int v) {
        if(length >= capacity) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if(head == null) {
            head = new Node(v);
            return;
        }
        Node p = head;
        while (p.getNextNode() != null) {
            p = p.getNextNode();
        }
        p.setNextNode(new Node(v));
    }

    public Node findByValue(int value) {
        Node p = head;
        while (p != null && p.value != value) {
            p = p.nextNode;
        }

        return p;
    }

    public Node findByIndex(int index) {
        Node p = head;
        int pos = 0;
        while (p != null && pos != index) {
            p = p.nextNode;
            ++pos;
        }
        return p;
    }

    /**
     * @Description 头插法
     *
     * @Return
     * @Throw
     * @Author 溪风
     * @Version V1.0.0
     * @Time 2019/1/6 00:25
     */
    public void insertToHead(int value) {
        Node node = new Node(value, null);
        insertToHead(node);
    }

    public void insertToHead(Node node) {
        if(head == null) {
            head = node;
        }else {
            node.nextNode = head;
            head = node;
        }
    }

    /**
     * @MethodName 尾插法
     * @Description
     *
     * @Return
     * @Throw
     * @Author 溪风
     * @Version V1.0.0
     * @Time 2019/1/6 00:57
     */
    public void insertTail(int value) {
        Node newNode = new Node(value, null);
        if(head == null) {
            this.head = newNode;
        }else {
            Node p = head;
            while (p.nextNode != null) {
                p = p.nextNode;
            }
            newNode.nextNode = p.nextNode; //因为p的下一个结点肯定是null，newNode作为尾结点也必须是null，所以这一步必须做，有个保障
            p.nextNode = newNode;
        }
    }

    public void insertAfter(Node p, int v) {
        Node newNode = new Node(v, null);
        insertAfter(p, newNode);
    }

    public void insertAfter(Node p, Node newNode) {
        if(p == null) {
            return;
        }
        newNode.nextNode = p.nextNode;
        p.nextNode = newNode;

    }

    public void insertBefore(Node p, int v) {
        Node newNode = new Node(v, null);
        insertBefore(p, newNode);
    }

    public void insertBefore(Node p, Node newNode) {
        if(p == null) {
            return;
        }
        if(head == p) { //head既是为null，也不会空指针，因为没利用head调用
            insertToHead(newNode);
            return;
        }
        Node q = head;
        while (q != null && q.nextNode != p) {
            q = q.nextNode;
        }
        if(q == null) {
            return;
        }
        q.nextNode = newNode;
        newNode.nextNode = p;
    }

    private void deleteByNode(Node p) {
        if(p == null || head == null) {
           return;
        }
    }

    private int deleteByValue(int v) {
        return 0;
    }

    class Node {

        private int value;

        private Node nextNode;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public Node(int value) {
            this.value = value;
            this.nextNode = null;
        }

        public Node(int value, Node node) {
            this.value = value;
            this.nextNode = node;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
        s.add(5);
        s.add(6);
        s.add(9);

        LinkedList l = new LinkedList();
        l.add(9);
        l.add(8);
        l.add(7);
    }

}
