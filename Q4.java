package practice;
import java.util.Scanner;
public class Q4 {
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
		 int N, root;
	     Scanner sc = new Scanner(System.in);
	     N= sc.nextInt();

	     for(int i=2; i<=N; i++) { //i=2; root=1; j=1

	            root=(int)Math.sqrt(i); //i=1; root=1; j=1

	            for(int j=1; j<=root; j++) {

	                if(j!=1&&i%j==0) {

	                    break;

	                }else if(i!=1&&j==root){

	                    System.out.println(i);

	                }

	            }

	        }

	    }

	
	}


