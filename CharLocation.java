package ch05;
import java.util.*;
public class CharLocation {
//	���� �Է��� ������ ���ĺ����� ���°���� ó�� ���Դ��� �˷��ִ� ���α׷��̴�.
//	�ش���ĺ��� ���������� ��� -1�� ǥ�õǸ� �ش���ĺ��� ������ ��� ���°�� ��ġ�� �ִ��� �˷��ش�.
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String s = scan.next();
		int[] storage = new int[26];
		
		for(int i=0;i<storage.length;i++) {
			storage[i]=-1;
		}
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<26;j++) {
				if(storage[j]==-1&&(int)s.charAt(i)==(j+97)) {
//					�̹� üũ�� �� ���ĺ��� �Ѿ�Բ� storage[j]==-1�̶�� ���� �־���.
					storage[j]=i;
					break;
				}
			}
		}
		for(int i=0;i<26;i++) {
			System.out.print(storage[i]+" ");
		}
	}
}
