package com.haiyue.algorithm.tree;

import java.util.List;

/**
 * @author liuhaiming on 2020/7/8.
 */
public class Node {

  public int val;
  public List<Node> children;

  public Node() {
  }

  public Node(int _val) {
    val = _val;
  }

  public Node(int _val, List<Node> _children) {
    val = _val;
    children = _children;
  }
}
