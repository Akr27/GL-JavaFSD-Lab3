package com.gl.javafsd.ds4.brackets;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class BracketsManager {
    private static Set<Bracket> predefinedBrackets;
    public BracketsManager(){

    }

    static {
        predefinedBrackets=new LinkedHashSet<Bracket>();
        predefinedBrackets.add(new Bracket('(',')'));
        predefinedBrackets.add(new Bracket('[',']'));
        predefinedBrackets.add(new Bracket('{','}'));
        predefinedBrackets.add(new Bracket('<','>'));
    }

    public static Set<Character> getOpenBrackets(){
        Set<Character> result=new LinkedHashSet<Character>();
        Iterator<Bracket> iterator=predefinedBrackets.iterator();

        while (iterator.hasNext()){
            Bracket bracket=iterator.next();
            result.add(bracket.getOpenBracket());
        }

        return result;
    }

    public static Set<Character> getCloseBrackets(){
        Set<Character> result=new LinkedHashSet<Character>();
        Iterator<Bracket> iterator= predefinedBrackets.iterator();

        while (iterator.hasNext()){
            Bracket bracket=iterator.next();
            result.add(bracket.getCloseBracket());
        }

        return result;

    }

    public static Bracket getBracket(Character closeBracket){

        for (Bracket predefinedBracket:predefinedBrackets){
            if (predefinedBracket.getCloseBracket().equals(closeBracket)){
                return predefinedBracket;
            }
        }

        return null;
    }

}
