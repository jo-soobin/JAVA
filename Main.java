import java.util.Scanner;
public class Main {
	static void printJosepus(int n , int k) {
		int size = n+1;
		int[] queue = new int[size];
		int head=0, tail =0;
		for(int i = 1; i<=n; i++) queue[tail++] = i;
		while(head != tail) {
			for(int i = 1; i<k; i++) {
				queue[tail] = queue[head]; //queue에서 데이터 하나 빼서 큐에 넣음
				tail = (tail+1)%size;
				head = (head+1)%size;
			}
			System.out.println(queue[head]);
			head = (head+1)%size;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int k = sc.nextInt();
				printJosepus(n,k);
	}

}
