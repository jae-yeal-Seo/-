package ch05;
import java.util.*;

public class WordNumber {
//	���� : ���ڿ��� �ִ� �ܾ��� ������ �����Ѵ�. 
//	*next()�޼ҵ尡 �ƴ϶� nextLine()�̶�� �޼ҵ带 ��� ���͸� ġ�� �������� ���ڿ��� �ϳ��� ���ڿ��� �ν��� �� �ִ�.
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String s = scan.nextLine();
//		���ڿ��� �Է¹޴´�.
		int number=0;
//		�ܾ��� ������ ����.
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '&&i!=0&&i!=s.length()-1)
				number++;
		}
//		ó���� �������� �ܾ��� �������⿡ ���ǹ��� �����̹Ƿ� �ΰ��� ������ ���� ������ ���鰹���� ����.
		if(s.length()>0) {
			if(s.length()==1&&s.charAt(0)==' ')
				System.out.print(number);
			else 
				System.out.print(number+1);
		}
//		���ڿ��� ���̰� 0�̻��� �� ������ �ϳ��� �ִ� ���ڿ�(s.length()==1�̰� s����' '�ϳ��� ����ִ� ���)�� �����ϰ� number(������ ����)+1�� ����Ѵ�.
		else
			System.out.print(number);
//		���ڿ��� ���̰� 0�̸� 0/Ȥ�� number��� ����Ѵ�.
	}
}
