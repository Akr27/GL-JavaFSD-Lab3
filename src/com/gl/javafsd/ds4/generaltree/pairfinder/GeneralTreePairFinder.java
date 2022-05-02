package com.gl.javafsd.ds4.generaltree.pairfinder;
import java.util.LinkedHashSet;
import java.util.Set;

public class GeneralTreePairFinder {
    private GeneralTreeNode<Integer> root;
    private boolean found=false;

    public GeneralTreePairFinder(GeneralTreeNode<Integer> root){
        this.root=root;
    }

    public void findPair(int sum){
        Set<Integer> nodes=new LinkedHashSet<Integer>();
        findInternalPair(sum,root,nodes);

        if(!found){
            System.out.println("Matching nodes NOT found for the given sum of "+sum);
        }
    }

    private void findInternalPair(int sum,GeneralTreeNode<Integer> aNode,Set<Integer> nodes){
        int difference=sum-aNode.getData();

        if (nodes.contains(difference)){
            found=true;
            System.out.println("For the given sum of "+sum+", matching nodes are: "+aNode.getData()+" ,with difference: "+difference);
        }
        else {
            nodes.add(aNode.getData());

            for (GeneralTreeNode<Integer> child : aNode.getChildren()){
                findInternalPair(sum,child,nodes);
            }
        }
    }
}
