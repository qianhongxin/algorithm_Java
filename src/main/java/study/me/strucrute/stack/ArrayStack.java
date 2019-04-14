package study.me.strucrute.stack;

/**
 * @Description: 顺序栈
 * @Author: 钱红信
 * @Time: 2019/04/13 09:46
 */
public class ArrayStack {

    private String[] items;

    private int count;

    private int n;

    public ArrayStack(int n) {
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public boolean push(String item) {
        if(this.items == null || this.count == n) {
            return false;
        }
        this.items[count] = item;
        this.count++;
        return true;
    }

    public String pop() {
        if(this.items == null || this.count == 0) {
            return null;
        }
        String tmp = this.items[count - 1];
        this.count--;
        return tmp;
    }

    public String peek() {
        if(this.items == null || this.count == 0) {
            return null;
        }
        return this.items[count - 1];
    }
}
