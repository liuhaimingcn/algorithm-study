package com.haiyue.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 * <p>
 * 示例:
 * 输入: [1,null,3,2,4,null,5,6]
 * 输出: [1,3,5,6,2,4]
 * <p>
 * 说明:
 * 递归法很简单，你可以使用迭代法完成此题吗?
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class NAryTreePreorderTraversal {

  public static void main(String[] args) {
    Node root = new Node();
    List<Integer> result = NAryTreePreorderTraversal.preorder(root);
    System.out.println(result);
  }

  // 思路：递归，前序遍历先将根节点的值放入结果中，再循环递归子节点，获取对应的结果，并放入结果中
  private static List<Integer> preorder(Node root) {
    if (root == null) {
      return new ArrayList<>();
    }
    List<Integer> result = new ArrayList<>();
    result.add(root.val);
    List<Node> children = root.children;
    if (children != null) {
      for (int i = 0; i < children.size(); i++) {
        List<Integer> childResult = preorder(children.get(i));
        result.addAll(childResult);
      }
    }
    return result;
  }
}
