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
public class ContainerWithMostWater {
    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = containerWithMostWater.maxArea(nums);
        System.out.println(result);
    }

    private int maxArea(int[] nums) {
        // 思路：遍历数组内的所有两两组和，并找出面积最大的一个组合
        int maxArea = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int currentArea = this.getArea(nums[i], nums[j], j - i);
                if (currentArea > maxArea) {
                    maxArea = currentArea;
                }
            }
        }

        return maxArea;
    }

    private int getArea(int a, int b, int length) {
        int height;
        if (a >= b) {
            height = b;
        } else {
            height = a;
        }
        return length * height;
    }
}
