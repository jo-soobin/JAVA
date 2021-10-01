package °úÁ¦2;

import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int[] stack = new int[str.length];
		int top =-1;
		
		for (int i = 0; i<str.length; i++) {
			char a = str[i].charAt(0);
			int num1, num2;
			
			switch (a) {
			case '+':
				num2 = stack[top--];
				num1 = stack[top--];
				stack[++top]=num1+num2;
				break;
				
			case '-':
				num2 = stack[top--];
				num1 = stack[top--];
				stack[++top]=num1-num2;
				break;
				
			case '*':
				num2 = stack[top--];
				num1 = stack[top--];
				stack[++top]=num1*num2;
				break;
				
			case '/':
				num2 = stack[top--];
				num1 = stack[top--];
				stack[++top]=num1/num2;
				break;
				
			default:
				stack[++top] = Integer.parseInt(str[i]);
				break;
			}
		}
		System.out.println(stack[top--]);
	}

}
