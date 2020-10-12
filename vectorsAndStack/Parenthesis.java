package vectorsAndStack;
import java.util.Stack;

import vectorsAndStack.MyStack;

public class Parenthesis {

	public static void main(String[] args) throws Exception {
		Stack<Character> stack = new Stack<>();
		boolean flag = true;
		String par = "{{{}}}[][]()()";
		for (int i = 0; i < par.length(); i++) {
			char ch = par.charAt(i);
			if(ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
			}
			try {
				char openbrac = stack.peek();
				if(ch == '}' && openbrac == '{') {
					stack.pop();
				}else if(ch == ']' && openbrac == '[') {
					stack.pop();
				}else if(ch == ')' && openbrac == '(') {
					stack.pop();
				}
				
			}catch(Exception e){
				System.out.println("The String is not balanced");
				flag = false;
				break;
			}
			
			
		}
		if(flag) {
		if(stack.isEmpty()) {
			System.out.println("The given String is balanced");
		}else {
			System.out.println("The given String is not balanced");
		}
		}

	}

}
