package study.me.leetcode;

/**
 * @Description: 搜索旋转排序数组
 * 描述：
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 *
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 *
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 *
 * 你可以假设数组中不存在重复的元素。
 *
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 *
 * 解法：
 * 将数组一分为二，其中一定有一个是有序的，另一个可能是有序，也能是部分有序。此时有序部分用二分法查找。
 * 无序部分再一分为二，其中一个一定有序，另一个可能有序，可能无序。就这样循环.
 *
 * 链接：
 * https://leetcode-cn.com/problems/search-in-rotated-sorted-array/comments/
 * @Author: 钱红信
 * @Time: 2019/04/12 22:40
 */
public class SearchRotatedSortArray {

    // fixme
    public static int search(int[] arr, int t){
        int low = 0, high = arr.length - 1;
        int mid;
//        while (low <= high) {
//            mid = low + ((high - low) >> 1);
//            if(arr[mid] == t) {
//                return mid;
//            }
//            if(arr[mid] < arr[high]) {
//                if(arr[mid] < t && t < arr[high]) {
//                    low = mid + 1;
//                    continue;
//                }
//            }else if(arr[low] < arr[mid]) {
//                if(arr[low] < t && t < arr[mid]) {
//                    high = mid - 1;
//                    continue;
//                }
//            }
//        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        search(nums, 0);
    }
}
