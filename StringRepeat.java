package ch05;
import java.util.*;

public class StringRepeat {
//	���� : ������ ���̽��� ����, ������ ���ڿ�, ������ ���ڿ��� �� ���ڸ� �ݺ��� Ƚ���� �Է��Ѵ�. 
//	ex)1 2 ABC(�Է�) ==>AABBCC(���)
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int casenumber = scan.nextInt();
//		������ ���̽��� ������ ���´�.
		for(int i=0;i<casenumber;i++) {
//			���̽� ����ŭ �ݺ��Ѵ�.
			int charnumber=scan.nextInt();
//			���ڿ��� ���ڸ��� ����� �ݺ����� ���´�.
			String s = scan.next();
//			���ڿ��� �Է��Ѵ�.
			for(int j=0;j<s.length();j++) {
//				���ڿ��� ���̸�ŭ �ݺ��Ѵ�.
				for(int k=0;k<charnumber;k++) {
//					���ڿ����� charnumber��ŭ �ݺ��ؼ� ����Ѵ�.
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
//			(����������)��������� ���߱� ���� println�� ������.
		}
	}
}
