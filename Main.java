import java.util.Scanner;
class HashTable{
	String[] keys;
	int[] values;
	int M; //hash table �� ũ��� ��
	//Hash table constructor
	HashTable(int m) {
		keys = new String[m];
		values = new int[m];
		M=m;
	}
	//Hash���� ������� �Լ�
	int hash(String key) { 
		return (key.hashCode()&0x7fffffff)%M;
	}
	//key ���� ���� value ���� �����ϱ� ���� �Լ�
	void put(String key, int value) {
		int h = hash(key);
		while(keys[h] != null) h=(h+1)%M; 
		keys[h] = key;
		values[h]=value;
	}
	//key ���� ���� ���� �����ϴ� ��� �� ��ȯ, �׷��� ������ null ��ȯ
	Integer get(String key) {
		int h = hash(key);
		while(keys[h] != null) {
			if(keys[h].equals(key)) break;
			h = (h+1)%M;
		}
		if(keys[h] ==null) return null; //key[h]== null�̸� null �ƴϸ� values[h] ��ȯ
		return values[h];
	}
	// key���� ���� �׸� ����
	void remove(String key) {
		
	}
	// �ش� key�� �����ϴ��� �˻�
	boolean contains(String key) {
		int h = hash(key);
		while(keys[h] != null) {
			if(keys[h].equals(key)) return true;
			h=(h+1)%M;
		}
		return false;
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		HashTable map = new HashTable(499);
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);
		map.put("eight", 8);
		map.put("nine", 9);
		map.put("ten", 10);
		/*System.out.println("one is "+map.get("one"));
		System.out.println("five is "+(map.contains("five")?"":"not ")+"in map"); */
		while(true) {
			System.out.println("input a key for find (exit : quit) : ");
			String key = sc.next();
			if(key.equals("quit")) break;
			if(!map.contains(key)) {
				System.out.println(key+" is not found.");
				continue;
			}
			System.out.println(key+" is "+map.get(key));
		}
	}

}
