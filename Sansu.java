package ch05;
import java.util.*;

public class Sansu {
//	���� : ������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. �̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���. 
	
//����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.

//����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�. 
	
//����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.

//�� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String s1 = scan.next();
		String s2 = scan.next();
		
		int newnum1=(s1.charAt(2)-'0')*100+(s1.charAt(1)-'0')*10+(s1.charAt(0)-'0');
		int newnum2=(s2.charAt(2)-'0')*100+(s2.charAt(1)-'0')*10+(s2.charAt(0)-'0');
		
//		�ƽ�Ű �ڵ带 �̿��ؼ� char�� int�� �ٲ۴�.
		
		if(newnum1>newnum2)
			System.out.print(newnum1);
		else
			System.out.print(newnum2);
	}
}
