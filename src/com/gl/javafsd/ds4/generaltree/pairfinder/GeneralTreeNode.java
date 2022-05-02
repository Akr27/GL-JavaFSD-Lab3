package com.gl.javafsd.ds4.generaltree.pairfinder;
import java.util.ArrayList;
import java.util.List;

public class GeneralTreeNode<DT> {
    private DT data;
    private List<GeneralTreeNode<DT>> children;

    public GeneralTreeNode(DT data){
        this.data=data;
        this.children=new ArrayList<GeneralTreeNode<DT>>();
    }

    public DT getData() {
        return data;
    }

    public void setData(DT data) {
        this.data = data;
    }

    public List<GeneralTreeNode<DT>> getChildren() {
        return children;
    }

    public void setChildren(List<GeneralTreeNode<DT>> children) {
        this.children = children;
    }

    public void addChildren(GeneralTreeNode<DT> child){
        this.children.add(child);
    }

    public String display() {
         return display(this,0);
    }

    public String display(GeneralTreeNode<DT> aNode,int level){
        String result="\t".repeat(level)+aNode.getData()+"\r\n";

        for (GeneralTreeNode<DT> treeNode : aNode.getChildren()){
            result = result + display(treeNode,(level+1));
        }
        return result;
    }
}
