package study.me.algorithm.sort;

/**
 * @author 32415
 * @description: 冒泡排序，时间复杂度O(n2) (平均时间复杂度)
 * @time 2019/4/15
 **/
public class BubbleSort {

    public static void sort(int[] arr) {
        if(arr == null || arr.length == 1) {
            return;
        }

        int n = arr.length;
        int tmp;
        // 每次只排序一个数，相邻元素比较大小。每一趟排序好的一个元素都在最后边一个位置上（从小到大，从大到小都是）。所以每次j都是从0开始往后比较
        for(int i = 0; i < n; i++) {
            // j的条件是 n-i-1
            for(int j = 0; j < n - i - 1; j++) {
                // 从小到大
                if(arr[j] > arr[j + 1]) {
                    tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }

                // 从大到小
//                if(arr[j] < arr[j + 1]) {
//                    tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
