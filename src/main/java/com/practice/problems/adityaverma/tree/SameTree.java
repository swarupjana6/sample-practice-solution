package com.practice.problems.adityaverma.tree;

import com.practice.problems.adityaverma.dynamicprog.tree.TreeNode;
import lombok.extern.log4j.Log4j2;

import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Log4j2
public class SameTree {

    public static void main(String[] args) {
        print(getInput1(), getInput1(), isSame -> assertEquals(true, isSame));
        print(getInput2(), getInput1(), isSame -> assertEquals(false, isSame));
    }

    private static TreeNode<Integer> getInput2() {
        TreeNode<Integer> root;
        root = new TreeNode<>(1);
        root.left = new TreeNode<>(21);
        root.right = new TreeNode<>(22);
        root.left.left = new TreeNode<>(31);
        root.left.right = new TreeNode<>(32);
        root.right.left = new TreeNode<>(33);
        root.right.right = new TreeNode<>(34);
        return root;
    }

    private static TreeNode<Integer> getInput1() {
        TreeNode<Integer> root = new TreeNode<>(1);

        root.left = new TreeNode<>(21);
        root.left.left = new TreeNode<>(31);
        root.left.left.left = new TreeNode<>(41);
        root.left.left.left.left = new TreeNode<>(51);

        root.right = new TreeNode<>(22);
        root.right.right = new TreeNode<>(32);
        root.right.right.right = new TreeNode<>(42);
        root.right.right.right.right = new TreeNode<>(52);
        return root;
    }

    private static void print(TreeNode<Integer> tree1, TreeNode<Integer> tree2, Consumer<Boolean> expected) {
        log.info("Input:: TreeNode: {} \n {}", tree1, tree2);
        expected.accept(isSameTree(tree1, tree2));
    }

    public static boolean isSameTree(TreeNode tree1, TreeNode tree2) {
        //BASE CONDITION
        if(tree1 == null && tree2 == null) return true;
        if(tree1 == null || tree2 == null) return false;
        if(tree1.val != tree2.val) return false;

        //HYPOTHESIS
        boolean isLeftSame = isSameTree(tree1.left, tree2.left);
        boolean isRightSame = isSameTree(tree1.right, tree2.right);

        //INDUCTION
        return (isLeftSame && isRightSame);
    }
}
