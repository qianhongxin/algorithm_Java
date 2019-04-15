package study.me.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Description: 利用栈实现括号匹配算法
 * Character 是 char 的包装类
 *
 * java中对象放入map等要重写hashcode，equals，否则根据鸽巢理论，肯定会冲突
 *
 * https://leetcode-cn.com/problems/valid-parentheses/solution/
 *
 * @Author: 钱红信
 * @Time: 2019/04/13 10:04
 */
public class BrackeMatching {

    private Map<Character, Character> brackes;

    public BrackeMatching() {
        brackes = new HashMap<Character, Character>();

        brackes.put(')', '(');
        brackes.put(']', '[');
        brackes.put('}', '{');
    }

    // 我的实现
    public boolean match(String s) {
        if(s == null) {
            return true;
        }

        Map<Character, Character> brackes = new HashMap<Character, Character>();
        brackes.put('(', ')');
        brackes.put('[', ']');
        brackes.put('{', '}');

        Stack stack = new Stack();
        char[] target = s.toCharArray();
        for (int i = 0; i < target.length; i++) {
            Character v = brackes.get(Character.valueOf(target[i]));
            if(v != null) {
               stack.push(String.valueOf(target[i]));
            }else {
                String f = null;
                if(!stack.isEmpty()){
                    f = (String) stack.pop();
                }
                if (f == null) {
                    if(brackes.get(target[i]) != null) {
                        stack.push(String.valueOf(target[i]));
                    }else {
                        return false;
                    }
                } else {
                    Character t = brackes.get(f.charAt(0));
                    if(t != null && t.equals(target[i])) {
                        continue;
                    }else {
                        return false;
                    }
                }
            }
        }

        // 校验栈是否为空，空则全部匹配上
        if(stack.isEmpty()) {
            return true;
        }

        return false;
    }

    // 标准实现
    public boolean match2(String s) {
        if(s == null) {
            return true;
        }

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(this.brackes.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if(topElement != this.brackes.get(c)) {
                    return false;
                }
            }else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BrackeMatching bm = new BrackeMatching();
        if(bm.match2("]")){
            System.out.println("ok");
        }
    }
}
