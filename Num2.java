package practice;
import java.util.Scanner;
public class Num2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 0;
		long b = 0;
		long gcd = 0;
		
		Scanner sc = new Scanner(System.in);
		a=sc.nextLong();
		b=sc.nextLong();
		
		
		for(long i=Math.max(a, b); i>=1; i--) {
			if(a%i==0&&b%i==0) {
				gcd=i;
				break;
			}
		}
		System.out.println(gcd);
	}

}
