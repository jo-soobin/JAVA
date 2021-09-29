import java.util.Scanner;
public class Queston1add {
	static long sum(int n) {
		long sum =0;
		for(int i = 1; i<= n; i++) sum +=i;
		return sum;
	}
	static long advSum(int n) {
		long s = n;
		return s*(s+1)/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long et = System.currentTimeMillis();
		long sum = advSum(n);
		et = System.currentTimeMillis() - et;
		System.out.println("Sum from 1 to "+n+ " is "+sum);
		System.out.println("Elapsed time : "+et+"ms");
	}

}
