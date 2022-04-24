package com.practice.problems.adityaverma.dynamicprog.tree;

public class TreeNode<T> {

	public T value;
	public TreeNode<T> left;
	public TreeNode<T> right;
	
	public TreeNode() {
	}

	public TreeNode(T value) {
		this.value = value;
	}

	public TreeNode(T value, TreeNode<T> left, TreeNode<T> right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
}
