import java.util.Scanner;
public class Queston1 {
	//n�� ���� ����� ����
	static int divCount(int n) {
		int cnt =0;
		for (int i =1; i <=n; i++) {
			if(n%i ==0) cnt++;
		}
		return cnt;
	}
	
	static int pi(int n) {
		//n���� �۰ų� ���� �Ҽ��� ����
		int pi =0;
		for(int i =1; i<=n; i++) {
			if(divCount(i) ==2) pi++;
		}
		return pi;
	}
	
	static int pi2(int n) {
		//n���� �۰ų� ���� �Ҽ��� ����
		int pi =0;
		for(int i =1; i<=n; i++) {
			if(divCount(i) ==2) pi++;
		}
		return pi  ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long timeStamp = System.currentTimeMillis();
		int pcnt = pi(n);
		long elapsedTime = System.currentTimeMillis()-timeStamp;
		System.out.println("pi("+n+")="+pcnt);
		System.out.println("Elasped time is "+elapsedTime+"ms");
		
	}

}
