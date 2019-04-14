package study.me.leetcode;

import java.util.HashMap;

/**
 * @Description: 统计字符串j中每个字符在s中的数量只和, char的包装类型是Character
 * @Author: 钱红信
 * @Time: 2019/04/09 23:55
 */
public class JewelsAndStones {

    public static int numJewelsInStones(String J, String S) {
        if (J == null || S == null) {
            return 0;
        }
        char[] jChars = J.toCharArray();
        char[] sChars = S.toCharArray();

        HashMap<Character, Integer> sMap = new HashMap();
        Character key;
        for (int i = 0; i < sChars.length; i++) {
            key = sChars[i];
            if (sMap.get(key) == null) {
                sMap.put(key, 1);
            }else {
                sMap.put(key, sMap.get(key) + 1);
            }
        }

        int sum = 0;
        Integer n;
        for (int i = 0; i < jChars.length; i++) {
            n = sMap.get(jChars[i]);
            sum += n == null ? 0 : n;
        }

        return sum;
    }

    public static void main(String[] args) {
        numJewelsInStones("aA", "aAAbbbb");
    }

}
