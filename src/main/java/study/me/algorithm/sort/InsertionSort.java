package study.me.algorithm.sort;

/**
 * @author 32415
 * @description: 插入排序
 * 将待排序数组分成两个区间，左边有序，右边无序。然后从右边选择第一个元素依次和左边有序区间元素比较插入对应位置。比冒泡排序比较次数少，所以一般插入和冒泡优先选择插入
 *
 * 比如 0，3, 6   待插入是 1
 * 第一次：0,3,6,6
 * 第二次：0,3,3,6
 * 第三次：0,1,3,6  -》有序
 *
 * @time 2019/4/15
 **/
public class InsertionSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length == 1) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            for (; j >= 0; --j) {
                if(arr[j] > value) {
                    arr[j + 1] = arr[j]; // 移动，前面的元素覆盖后面的元素
                }else {
                    break;
                }
            }
            arr[j + 1] = value; // 插入数据，等arr[j] 不大于 value，此时在arr[j + 1]插入目标元素
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
