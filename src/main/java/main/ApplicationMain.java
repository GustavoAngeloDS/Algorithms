package main;

import bst.BinarySearchTree;

public class ApplicationMain {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(9);
        binarySearchTree.insert(11);
        binarySearchTree.insert(10);
        binarySearchTree.insert(17);
        binarySearchTree.insert(16);
        binarySearchTree.insert(7);
        binarySearchTree.insert(44);
        binarySearchTree.insert(4);
        binarySearchTree.insert(1);
        binarySearchTree.insert(5);

        binarySearchTree.search(0);
        binarySearchTree.search(44);
    }
}
