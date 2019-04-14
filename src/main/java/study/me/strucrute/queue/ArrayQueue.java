package study.me.strucrute.queue;

/**
 * @Description: 顺序队列
 * @Author: 钱红信
 * @Time: 2019/04/13 15:28
 */
public class ArrayQueue {

    private String[] items;

    // 队列元素个数
    private int count;

    // 队列大小
    private int n;

    // 队头，指向队头元素
    private int head = 0;

    // 队尾，指向队尾元素的下一个元素
    private int tail = 0;

    public ArrayQueue(int n) {
        this.items = new String[n];
        this.count = 0;
        this.n = n;
    }

    public boolean enQueue(String item) {
        if (item == null) {
            return false;
        }

        if(this.tail == this.n) {
           return false;
        }

        this.items[tail] = item;
        ++this.tail;

        return true;
    }

    public String deQueue() {
        if(head == tail) {
            return null;
        }

        String ret = items[head];
        ++head;

        return ret;
    }
}
