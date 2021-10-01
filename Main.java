import java.util.Scanner; //이중연결리스트 작성법
class Node{
	public int data;
	public Node prev, next;
	Node(int e){data=e; prev=next=this;}
}
class Queue{
	Node root;
	Queue() {root = new Node(0);}
	void add(int e) { 
		Node node = new Node(e);
		node.next = root;
		node.prev = root.prev;
		root.prev.next = node;
		root.prev = node;
	}
	void remove() { 
		root.next = root.next.next;
		root.next.prev = root;
	}
	int peek () { return root.next.data;}
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
