import java.util.Scanner;
class Queue{
	static int N = 100; //공간 수 선언
	int[] data; //배열변수
	int head, tail; //인덱스 변수명
	Queue() { data = new int[N]; head = tail = 0; }
	void add(int e) { 
		data[tail] = e; //add로 데이터 e가 추가가됨. 이때 새 데이터인 e는 현재 tail인 인덱스에 추가가 됨.
		tail = (tail+1)%N; //새로운 data e가 tail에 추가되고, tail은 오른쪽으로 한 칸 옮긴다.
	}
	void remove() { 
		head = (head+1)%N;
	}
	int peek () { return data[head];}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue queue = new Queue(); //queue라는 객체 생성
		while(true) { //while 무한정 반복
			int v = sc.nextInt(); //v라는 변수 입력받아서 
			if(v  == -1) break;
			if(v != 0) {
				queue.add(v);
			}
			else {
				System.out.println("PEEK = "+queue.peek());
				queue.remove();
			}
		}

	}

}
