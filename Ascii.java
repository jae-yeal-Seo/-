package ch05;
import java.util.*;
public class Ascii {
//	���� �Է��� ������(char)�� ASCII�ڵ�� �ٲ��ִ� ���α׷��̴�.
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		char x = scan.next().charAt(0);
		int answer = (int)x;
		System.out.print(answer);
	}

}
