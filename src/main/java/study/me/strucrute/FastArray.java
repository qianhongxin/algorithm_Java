package study.me.strucrute;

/**
 * @Description: 某些情况下: 1. 让数组的插入达到O(1)  2. 删除用批量删除提高性能
 *               做到1的情况需要记录当前数组中有几个数据，而且数据要连续
 *
 * @Author: 溪风
 * @Time: 2019/01/05 13:00
 */
public class FastArray {

    /**
     * @Description: 元素插入数组中指定位置
     *
     * @Auther: 溪风
     * @Date: 2019/1/5 17:13
     */
    public void insert(int[] arr, int target, int position) {
        if(arr == null) {
            throw new NullPointerException("arr 不能为空");
        }
        if(arr.length == 0 || position < 0 || position > arr.length) {
            throw new RuntimeException("arr 中无法插入，请检查");
        }

        int temp = arr[position];
        arr[position] = target;
    }

    /**
     * @Description: 标记要删除的元素，然后到一定数量后，批量删除
     *
     * @Auther: 溪风
     * @Date: 2019/1/5 19:44
     */
    public boolean delete() {
        return true;
    }

}
