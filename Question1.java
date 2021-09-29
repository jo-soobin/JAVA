import java.util.Scanner;
public class Question1 {
	static long sum(int n) {
		long sum =0;
		for(int i = 1; i<= n; i++) sum +=i;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long et = System.currentTimeMillis();
		long sum = sum(n);
		et = System.currentTimeMillis() - et;
		System.out.println("Sum from 1 to "+n+ " is "+sum);
		System.out.println("Elapsed time : "+et+"ms");
				
	}

}
