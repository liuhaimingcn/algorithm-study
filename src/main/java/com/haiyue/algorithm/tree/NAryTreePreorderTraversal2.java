package com.haiyue.algorithm.tree;

import java.util.Collections;
import java.util.LinkedList;
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
public class NAryTreePreorderTraversal2 {

  public static void main(String[] args) {
    Node root = new Node();
    List<Integer> result = NAryTreePreorderTraversal2.preorder(root);
    System.out.println(result);
  }

  // 思路：手动维护一个栈用来迭代，想将根节点放入栈中，然后弹出获取结果，并再次将子节点依次放入栈中，
  //      直到栈中的数据全部弹出。
  private static List<Integer> preorder(Node root) {
    LinkedList<Node> stackList = new LinkedList<>();
    LinkedList<Integer> resultList = new LinkedList<>();
    if (root == null) {
      return resultList;
    }
    stackList.add(root);
    while (!stackList.isEmpty()) {
      Node lastNode = stackList.pollLast();
      resultList.add(lastNode.val);
      List<Node> childrenList = lastNode.children;
      if (childrenList != null) {
        Collections.reverse(childrenList);
        stackList.addAll(childrenList);
      }
    }
    return resultList;
  }
}
