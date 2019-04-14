package study.me.algorithm;

import study.me.strucrute.stack.ArrayStack;

/**
 * @Description: 利用两个栈模拟浏览器的前进后退功能
 *
 * @Author: 钱红信
 * @Time: 2019/04/13 13:18
 */
public class BrowserAheadAndBack {

    // 当前的栈顶就是当前元素，即浏览器当前显示的页面数据
    private ArrayStack ahead;

    private ArrayStack back;

    public BrowserAheadAndBack() {
        // 实际使用时，需要能动态扩容的栈
        ahead = new ArrayStack(6);
        ahead.push("a");
        ahead.push("b");
        ahead.push("c");
        ahead.push("d");
        ahead.push("e");

        back = new ArrayStack(6);
    }

    // 前进
    public String goAhead() {
        // 判断是否可以继续前进
        if(ahead.getCount() <= 1) {
            return null;
        }

        if(back.getCount() == back.getN()) {
            back.pop();
        }
        back.push(ahead.pop());

        return ahead.peek();
    }

    public String goBack() {
        // 判断是否可以继续后退
        if(back.getCount() == 0) {
            return ahead.getCount() == 0 ? null : ahead.peek();
        }

        if(ahead.getCount() == ahead.getN()) {
            ahead.pop();
        }
        ahead.push(back.pop());

        return ahead.peek();
    }

    public static void main(String[] args) {
        BrowserAheadAndBack browserAheadAndBack = new BrowserAheadAndBack();
        for (int i = 0; i < 5; i++) {
            System.out.println(browserAheadAndBack.goAhead());
        }

    }
}
