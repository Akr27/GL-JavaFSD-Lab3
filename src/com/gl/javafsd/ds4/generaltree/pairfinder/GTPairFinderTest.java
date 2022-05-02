package com.gl.javafsd.ds4.generaltree.pairfinder;

public class GTPairFinderTest {
    public static void main(String[] args){
        GeneralTreeNode<Integer> root=sampleTree1();

        String result=root.display();
        System.out.println(result);

        test(root,120);
        test(root,130);
        test(root,150);
        test(root,1000);
    }

    private static void test(GeneralTreeNode<Integer> root,int sum){
        System.out.println("*********************************************");
        GeneralTreePairFinder pairFinder=new GeneralTreePairFinder(root);
        pairFinder.findPair(sum);
    }

    public static GeneralTreeNode<Integer> sampleTree1(){
        GeneralTreeNode<Integer> _10 = new GeneralTreeNode<Integer>(10);
        GeneralTreeNode<Integer> _20 = new GeneralTreeNode<Integer>(20);
        GeneralTreeNode<Integer> _30 = new GeneralTreeNode<Integer>(30);
        GeneralTreeNode<Integer> _40 = new GeneralTreeNode<Integer>(40);
        GeneralTreeNode<Integer> _50 = new GeneralTreeNode<Integer>(50);

        _10.addChildren(_20);_10.addChildren(_30);
        _10.addChildren(_40);_10.addChildren(_50);

        GeneralTreeNode<Integer> _60 = new GeneralTreeNode<Integer>(60);
        GeneralTreeNode<Integer> _70 = new GeneralTreeNode<Integer>(70);
        GeneralTreeNode<Integer> _80 = new GeneralTreeNode<Integer>(80);

        _20.addChildren(_60);
        _20.addChildren(_70);
        _20.addChildren(_80);

        GeneralTreeNode<Integer> _90 = new GeneralTreeNode<Integer>(90);
        _30.addChildren(_90);

        GeneralTreeNode<Integer> _100 = new GeneralTreeNode<Integer>(100);
        GeneralTreeNode<Integer> _110 = new GeneralTreeNode<Integer>(110);
        GeneralTreeNode<Integer> _120 = new GeneralTreeNode<Integer>(120);
        GeneralTreeNode<Integer> _130 = new GeneralTreeNode<Integer>(130);
        GeneralTreeNode<Integer> _140 = new GeneralTreeNode<Integer>(140);

        _40.addChildren(_100);_40.addChildren(_110);
        _40.addChildren(_120);_40.addChildren(_130);
        _40.addChildren(_140);

        GeneralTreeNode<Integer> _150 = new GeneralTreeNode<Integer>(150);
        _50.addChildren(_150);

        return _10;

    }

    private static GeneralTreeNode<String> moviesTree(){

        GeneralTreeNode<String> bms=new GeneralTreeNode<String>("Book My Show");
        GeneralTreeNode<String> bangalore=new GeneralTreeNode<String>("Bangalore");
        GeneralTreeNode<String> rrrKannada=new GeneralTreeNode<String>("RRR (Kannada)");
        GeneralTreeNode<String> kgfKannada=new GeneralTreeNode<String>("KGF Chapter 2 (Kannada)");
        GeneralTreeNode<String> beastKannada=new GeneralTreeNode<String>("Beast (Kannada");

        bangalore.addChildren((rrrKannada));
        bangalore.addChildren(kgfKannada);
        bangalore.addChildren(beastKannada);

        GeneralTreeNode<String> chennai=new GeneralTreeNode<String>("Chennai");
        GeneralTreeNode<String> rrrTamil=new GeneralTreeNode<String>("RRR (Tamil)");
        GeneralTreeNode<String> kgfTamil=new GeneralTreeNode<String>("KGF Chapter 2 (Tamil)");

        chennai.addChildren(rrrTamil);
        chennai.addChildren(kgfTamil);

        bms.addChildren(bangalore);
        bms.addChildren(chennai);

        String result= bms.display();
        System.out.println(result);

        return bms;

    }
}
