package °úÁ¦2;

import java.util.Scanner;

public class num5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     String str = sc.next();
	     char[] stack = new char[str.length()];
	     int top = -1;
	     for(int i = 0; i < str.length(); i++){
	         char c = str.charAt(i);
	         if(c == '}') {
	              if(stack[top] == '{'){
	                  top--;
	                }
	                else {
	                   System.out.println("ERROR");
	                    break;
	                }
	            }

	           if(c == ']') {
	                if(stack[top] == '['){
	                    top--;
	                }
	                else {
	                    System.out.println("ERROR");
	                    break;
	                }
	            }

	            if(c == ')') {
	                if(stack[top] == '('){
	                    top--;
	                }
	                else {
	                    System.out.println("ERROR");
	                    break;
	                }
	            }
	            if((c == '(') || (c == '[') || (c == '{')){
	                stack[++top] = c;
	            }
	        }
	        if(top == -1){
	            System.out.println("OK");
	        }
	}

}
