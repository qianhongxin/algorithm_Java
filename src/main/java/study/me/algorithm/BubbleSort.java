package study.me.algorithm;

public class BubbleSort {

    public static void sort(int[] arr) {
        if(arr == null) {
            return;
        }

        int n = arr.length;
        int tmp;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
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
