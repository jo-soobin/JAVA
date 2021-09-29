import java.util.Scanner;
class HashTable{
	String[] keys;
	int[] values;
	int M; //hash table 의 크기는 엠
	//Hash table constructor
	HashTable(int m) {
		keys = new String[m];
		values = new int[m];
		M=m;
	}
	//Hash값을 얻기위한 함수
	int hash(String key) { 
		return (key.hashCode()&0x7fffffff)%M;
	}
	//key 값을 가진 value 값을 저장하기 위한 함수
	void put(String key, int value) {
		int h = hash(key);
		while(keys[h] != null) h=(h+1)%M; 
		keys[h] = key;
		values[h]=value;
	}
	//key 값을 가진 것이 존재하는 경우 값 반환, 그렇지 않으면 null 반환
	Integer get(String key) {
		int h = hash(key);
		while(keys[h] != null) {
			if(keys[h].equals(key)) break;
			h = (h+1)%M;
		}
		if(keys[h] ==null) return null; //key[h]== null이면 null 아니면 values[h] 반환
		return values[h];
	}
	// key값을 가진 항목 삭제
	void remove(String key) {
		
	}
	// 해당 key가 존재하는지 검사
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
