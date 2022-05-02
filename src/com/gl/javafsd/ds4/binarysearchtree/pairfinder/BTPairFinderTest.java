package com.gl.javafsd.ds4.binarysearchtree.pairfinder;

public class BTPairFinderTest {
    public static void main(String[] args){
        test(120);
        test(60);
        test(190);
        test(500);
    }

    private static void test(int sum){
        BinarySearchTree tree=sample();
        BinarySearchTreePairFinder finder=new BinarySearchTreePairFinder(tree);

        finder.findPair(sum);
        System.out.println("*************************************");
    }

    private static BinarySearchTree sample(){
        BinarySearchTree tree=new BinarySearchTree();

        tree.insert(70);
        tree.insert(50);
        tree.insert(90);
        tree.insert(30);
        tree.insert(60);
        tree.insert(80);
        tree.insert(100);
        tree.insert(20);
        tree.insert(40);

        return tree;

    }

}
