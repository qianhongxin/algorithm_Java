package study.me;

/**
 * @author hongxin
 * @description: 字典树
 *  空间换时间，查询时间复杂度O(k)，k是查询的字符串长度
 *  适合查找前缀匹配的字符串，不适合动态字符串查找
 * @time 2019/4/12
 **/
public class Trie {

    private TrieNode root = new TrieNode('/');

    public void insert(char[] text) {
        TrieNode p = root;
        for (int i = 0; i < text.length; i++) {
            int index = text[i] - 'a';
            if (p.getChildren()[index] == null) {
                TrieNode trieNode = new TrieNode(text[i]);
                p.getChildren()[index] = trieNode;
            }
            p = p.getChildren()[index];
        }
        p.isEndingChar = true;
    }

    public boolean find(char[] pattren) {
        TrieNode p = root;
        for (int i = 0; i < pattren.length; i++) {
            int index = pattren[i] - 'a';
            if (p.getChildren()[index] == null) {
                return false;
            }
            p = p.getChildren()[index];
        }
        if (!p.isEndingChar()) {
            return false;
        }else {
            return true;
        }
    }

    class TrieNode {

        char data;

        private TrieNode[] children = new TrieNode[26];

        private boolean isEndingChar = false;

        public TrieNode(char data) {
            this.data = data;
        }

        public char getData() {
            return data;
        }

        public void setData(char data) {
            this.data = data;
        }

        public boolean isEndingChar() {
            return isEndingChar;
        }

        public void setEndingChar(boolean endingChar) {
            isEndingChar = endingChar;
        }

        public TrieNode[] getChildren() {
            return children;
        }

        public void setChildren(TrieNode[] children) {
            this.children = children;
        }
    }
}
