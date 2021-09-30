package practice;
import java.util.Scanner;
public class Check {
	
		/*static long sum(long n) {
			long sum =0;
			for(long i = 1; i<= n; i++) sum +=i;
			return sum;
		}
		*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = sum(n);
		System.out.println(sum);
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오> ");
		long a = sc.nextLong();
		long sum = 0;
		for(long i = 0; i<=a; i++) {
			sum += i;
		}
		System.out.println(sum);
		sc.close();
	}

}
