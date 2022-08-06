package Q3;

import java.util.Stack;
public class bracketCheck {
    private String inputStr;

    //Constructor Implementation
    public bracketCheck(String in) {
        inputStr = in; //3 + (( 6 * 2) - 3)
    }

    public void CheckB() {
        int size = inputStr.length(); //11
        Stack stack = new Stack(); //Max size = 11

        for(int i=0; i<size; i++) {
            if(inputStr.charAt(i) == '(') {
                stack.push('(');
            }
            else if(inputStr.charAt(i) == ')') {
                stack.pop();
            }
        }

        if(!stack.isEmpty()) {
            System.out.println("Invalid String!");
        }
        else {
            System.out.println("Valid String!");
        }
    }

}