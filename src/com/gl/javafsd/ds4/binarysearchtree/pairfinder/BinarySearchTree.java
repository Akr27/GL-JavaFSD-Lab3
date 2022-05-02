package com.gl.javafsd.ds4.binarysearchtree.pairfinder;

public class BinarySearchTree {
    private BinarySearchTreeNode root;
    public BinarySearchTree(){
        root=null;
    }

    public void insert(Integer value){
        root=insert(root,value);
    }

    private BinarySearchTreeNode insert(
            BinarySearchTreeNode currentNode, Integer value){

            if(currentNode==null){
                return newNode(value);
            }
            else if(value<=currentNode.getData()){
                BinarySearchTreeNode newNode=insert(currentNode.getLeftNode(),value);

                currentNode.setLeftNode(newNode);
                return currentNode;
            }
            else{BinarySearchTreeNode newNode=insert(currentNode.getRightNode(),value);
                currentNode.setRightNode(newNode);
                return currentNode;

            }
    }

    private BinarySearchTreeNode newNode(Integer value){
        BinarySearchTreeNode newNode=new BinarySearchTreeNode(value);
        return newNode;
    }

    public void preOrderTraversal(){
        preOrderTraversal(this.root);
    }

    private void preOrderTraversal(BinarySearchTreeNode aNode){
        if(aNode==null){
            return;
        }
        System.out.println(aNode.getData());
        preOrderTraversal(aNode.getLeftNode());
        preOrderTraversal(aNode.getRightNode());
    }

    public BinarySearchTreeNode getRoot(){
        return root;
    }
}
