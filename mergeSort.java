import java.util.Random;//�պ�����
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
	static void mergeSort(int[] v, int from, int to) { //�߰� ���� ã��(�պ������̹Ƿ� ������ �� �κ��������� ������ ���� �������� ����)
		if(from == to) return; //�����Ͱ� �ϳ��� ������ �ʿ� ����. �ʱ������� ���� ���ٸ� �����Ͱ� �ϳ�=����� ���ɸ�. 
		int c = (from+to)/2; //�߰����� ã��
		mergeSort(v, from, c); //�κκ� ������ ���� ��������
		mergeSort(v, c+1, to); //�굵
		int[] t = new int[to+1]; //�պ����Ŀ��� �߰������� �ʿ��� �޸� ���� t ����
		int i = from, j=c+1, k=from;
		while(i <= c && j <= to) { //i�� c���� �۰ų� ���� j�� to ���϶�� (j�� to���� ū ���� �Ǹ� while�� Ż��)
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
		mergeSort(v, 0, n-1); //0���� n-1���� v ������ �ض�
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
