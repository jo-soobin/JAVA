import java.util.Scanner;
class Queue{
	static int N = 100; //���� �� ����
	int[] data; //�迭����
	int head, tail; //�ε��� ������
	Queue() { data = new int[N]; head = tail = 0; }
	void add(int e) { 
		data[tail] = e; //add�� ������ e�� �߰�����. �̶� �� �������� e�� ���� tail�� �ε����� �߰��� ��.
		tail = (tail+1)%N; //���ο� data e�� tail�� �߰��ǰ�, tail�� ���������� �� ĭ �ű��.
	}
	void remove() { 
		head = (head+1)%N;
	}
	int peek () { return data[head];}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue queue = new Queue(); //queue��� ��ü ����
		while(true) { //while ������ �ݺ�
			int v = sc.nextInt(); //v��� ���� �Է¹޾Ƽ� 
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
