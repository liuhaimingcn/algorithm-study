package com.haiyue.algorithm.array;

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 * <p>
 * 示例：
 * <p>
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ContainerWithMostWater2 {
    public static void main(String[] args) {
        ContainerWithMostWater2 containerWithMostWater = new ContainerWithMostWater2();
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = containerWithMostWater.maxArea(nums);
        System.out.println(result);
    }

    private int maxArea(int[] nums) {
        // 思路：用两个指针标记最左和最右，每次移动数小的，因为数大的移动，宽度变小，面积必然减小，最终选出面积最大的值。
        int maxArea = 0;
        int left = 0;
        int right = nums.length - 1;
        while (right - left > 0) {
            int length = right - left;
            int height;
            int leftValue = nums[left];
            int rightValue = nums[right];
            if (leftValue > rightValue) {
                right--;
                height = rightValue;
            } else {
                left++;
                height = leftValue;
            }
            int currentArea = height * length;
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
        }
        return maxArea;
    }
}
