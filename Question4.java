package practice;
import java.util.Scanner;
public class Question4 {
	static int divCount(int n) {
		int cnt =0;
		for(int i = 1; i<=n; i++) {
			if(n%i ==0) cnt++;
		}
		return cnt;
	}
	static int pi(int n) {
		int pi =0;
		for(int i =1; i <=n; i++) {
			if(divCount(i)==2 ) pi++;
		}
		return pi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pcnt = pi(n);
		System.out.println(pcnt);
	}

}
