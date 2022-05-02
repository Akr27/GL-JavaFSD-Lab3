package com.gl.javafsd.ds4.binarysearchtree.pairfinder;
import java.util.LinkedHashSet;
import java.util.Set;

public class BinarySearchTreePairFinder {
    private BinarySearchTree tree;
    private boolean found=false;
    public BinarySearchTreePairFinder(BinarySearchTree tree){
        this.tree=tree;
    }

    public void findPair(int sum){
        Set<Integer> nodes=new LinkedHashSet<Integer>();
        findPairInternal(sum,tree.getRoot(),nodes);

        if(!found){
            System.out.println("For the sum "+sum+" , No matching nodes found.");
        }

    }

    private boolean findPairInternal(int sum,BinarySearchTreeNode aNode,Set<Integer> nodes){

        if(aNode==null){
            return false;
        }
        found=findPairInternal(sum, aNode.getLeftNode()e, nodes);

        if(found){
            return true;
        }

        int difference=sum-aNode.getData();

        if(nodes.contains(difference)){
            found=true;
            System.out.println("For the sum "+sum+" ,the number of matching nodes found: "+aNode.getData()+" , "+difference);
            return found;
        }

        else{
            nodes.add(aNode.getData());

        }

        if (!found){
            return findPairInternal(sum,aNode.getRightNode(),nodes);
        }

        else {
            return true;
        }
    }
}
