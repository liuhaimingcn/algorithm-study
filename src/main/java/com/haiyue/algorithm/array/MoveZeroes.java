package com.haiyue.algorithm.array;

import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * <p>
 * 说明:
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        // 思路： 交换，非0的和第一个0进行交换
        int firstZeroIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (value != 0 && firstZeroIndex != -1) {
                nums[firstZeroIndex] = value;
                nums[i] = 0;
                firstZeroIndex = firstZeroIndex + 1;
            }
            if (nums[i] == 0 && firstZeroIndex == -1) {
                firstZeroIndex = i;
            }
        }
    }
}
