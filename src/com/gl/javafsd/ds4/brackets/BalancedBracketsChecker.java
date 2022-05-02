package com.gl.javafsd.ds4.brackets;
import java.util.Set;
import java.util.Stack;

public class BalancedBracketsChecker {
    private String brackets;

    public BalancedBracketsChecker(String brackets){
        this.brackets=brackets;
    }

    public boolean check(){
        if(brackets.length()%2 !=0){
            return false;
        }

        Stack<Character> stack=new Stack<Character>();
        Set<Character> openBracketsSet=BracketsManager.getOpenBrackets();
        Set<Character> closeBracketsSet=BracketsManager.getCloseBrackets();


        for(int i=0;i<brackets.length();i++){
            char aChar=brackets.charAt(i);

            if(openBracketsSet.contains(aChar)){
                stack.push(aChar);
            }

            else if(closeBracketsSet.contains(aChar)){
                char closedChar=aChar;

                Character openCharFromStack=stack.pop();

                Bracket bracketObj=BracketsManager.getBracket(closedChar);

                if(openCharFromStack.equals(bracketObj.getOpenBracket())){
                    continue;
                }
             }

              else {
                    System.out.println("An INVALID character was encountered during traversal...."+aChar);
                    return false;
              }

        }

        return stack.isEmpty();
    }
}
