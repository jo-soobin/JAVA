package practice;
import java.util.Scanner;
public class Num4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		for(long i=1; i <=a; i++) {
			prime(i);
		}
	}
	public static void prime(long num) {
		if(num == 1) {
			return;
		}
		if (num ==2 ) {
			System.out.println(num);
			return;
		}
		for(long i =2; i<num;i++) {
			if(num%i==0) {
				return;
			}
		}
		System.out.println(num);
		return;
	}

}
