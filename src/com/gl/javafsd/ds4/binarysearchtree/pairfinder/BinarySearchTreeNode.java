package com.gl.javafsd.ds4.binarysearchtree.pairfinder;

public class BinarySearchTreeNode {
    private Integer data;
    private BinarySearchTreeNode leftNode;
    private BinarySearchTreeNode rightNode;

    public BinarySearchTreeNode(Integer data){
        this.data=data;
    }

    public Integer getData(){
        return data;
    }

    public void setData(Integer data){
        this.data=data;
    }

    public BinarySearchTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinarySearchTreeNode leftNode){
        this.leftNode=leftNode;
    }

    public BinarySearchTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinarySearchTreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public String toString(){
        return "(" + data + ")";
    }

}
