import java.util.Random;//합병정렬
import java.util.Scanner; //merge sort
public class mergeSort {
	static void selectionSort(int[] v, int from, int to) {
		for(int i =from; i<to; i++) {
			int min = i;
			for(int j = i+1; j <=to; j++) if(v[min] > v[j]) min=j;
			int t = v[min]; v[min] = v[i]; v[i]=t;
		}
	}
	static void selectionSort(int[]v, int n) {
		selectionSort(v, 0, n-1);
	}
	static int[]t;
	static void mergeSort(int[] v, int from, int to) { //중간 지점 찾기(합병정렬이므로 정렬을 두 부분집합으로 나눠서 각각 선택정렬 시행)
		if(from == to) return; //데이터가 하나면 정렬할 필요 없음. 초기조건이 둘이 같다면 데이터가 하나=계산이 덜걸림. 
		int c = (from+to)/2; //중간지점 찾기
		mergeSort(v, from, c); //두부분 나눠서 각각 선택정렬
		mergeSort(v, c+1, to); //얘도
		int[] t = new int[to+1]; //합병정렬에서 추가적으로 필요한 메모리 공간 t 생성
		int i = from, j=c+1, k=from;
		while(i <= c && j <= to) { //i가 c보다 작거나 같고 j가 to 이하라면 (j가 to보다 큰 값이 되면 while문 탈출)
			if(v[i]<=v[j]) t[k++]= v[i++];
			else t[k++] = v[j++];
		}
		while(i <= c)
			t[k++] = v[i++];
		while(j <= to)
			t[k++] = v[j++];
		for(i = from; i <=to; i++) v[i] = t[i];
	}
	static void mergeSort(int[] v, int n) {
		t = new int[n];
		mergeSort(v, 0, n-1); //0부터 n-1까지 v 정렬을 해라
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(100);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for(int i = 0; i<n; i++) v[i] = rand.nextInt(1000000);
		long ts = System.currentTimeMillis();
		selectionSort(v,n);
		mergeSort(v,n);
		ts = System.currentTimeMillis() - ts;
		for(int i = 0; i<10; i++) System.out.println(v[i]);
		System.out.println("Elapse time is "+ts+"ms.");
	}

}
