package study.me.BinarySearch;

/**
 * @author hongxin
 * @description: 二分查找
 * @time 2019/4/11
 **/
public class BinarySearch {

    /**
     * @author hongxin
     * @description: arr 是升序的, 迭代循环方式查找
     * 时间复杂度： o(logn)
     * @time 2019/4/11
     **/
    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int mid;
        // 条件是 <=
        while(low <= high) {
            // 防止溢出，等价于（low + high）/2
            mid = low + (high - low) >> 1;
            if(target == arr[mid]) {
                return mid;
            }else if(target > arr[mid]) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }

        return -1;
    }

    /**
     * @author hongxin
     * @description: 查找第一个等于给定值的下标
     * @time 2019/4/12
     **/
    public static int searchFirstEqual(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) >> 1;
            if(arr[mid] > target) {
                high = mid - 1;
            }else if(arr[mid] < target) {
                low = mid + 1;
            }else {
                if(mid == 0 || arr[mid - 1] != target) {
                    return mid;
                }else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    /**
     * @author hongxin fixme
     * @description: 查找最后一个等于给定值的下标
     * @time 2019/4/12
     **/
    public static int searchLastEqual(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) >> 1;
            if(arr[mid] > target) {
                high = mid - 1;
            }else if(arr[mid] < target) {
                low = mid + 1;
            }else {
                if(mid == arr.length - 1 || arr[mid + 1] != target) {
                    return mid;
                }else {
                    low = mid + 1;
                }
            }
        }

        return -1;
    }

    /**
     * @author hongxin
     * @description: 查找第一个大于等于给定值的下标
     * @time 2019/4/12
     **/
    public static int searchFirstGE(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) >> 1;
            if(arr[mid] >= target) {
                if(mid == 0 || arr[mid - 1] < target) {
                    return mid;
                }else {
                    high = mid - 1;
                }
            }else {
                low = mid + 1;
            }
        }

        return -1;
    }

    /**
     * @author hongxin
     * @description: 查找最后一个小于等于给定值的下标
     * @time 2019/4/12
     **/
    public static int searchLastLE(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) >> 1;
            if(arr[mid] <= target) {
                if(mid == arr.length - 1 || arr[mid + 1] > target) {
                    return mid;
                }else {
                    low = mid + 1;
                }
            }else {
                high = mid - 1;
            }
        }

        return -1;
    }

    /**
     * @author hongxin
     * @description: arr 是升序的, 递归循环方式查找
     * 时间复杂度： o(logn)
     * @time 2019/4/11
     **/
    public static int recursiveSearch(int[] arr, int target) {
        return doRecursiveSearch(arr, 0, arr.length - 1, target);
    }

    private static int doRecursiveSearch(int[] arr, int low, int high, int target) {
        // 递归结束条件
        if(low > high) {
            return -1;
        }

        // 逻辑处理
        int mid = low + (high - low) >> 1;

        // 进入下一层
        if(arr[mid] == target) {
            return mid;
        }else if(target > arr[mid]) {
            return doRecursiveSearch(arr, mid + 1, high, target);
        }else {
            return doRecursiveSearch(arr, low, mid - 1, target);
        }

        // 状态销毁
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5};
        System.out.println(searchLastEqual(arr, 3));
    }
}
