package ch05;
import java.util.*;

public class Dial {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * ��ȭ�� �ɰ� ���� ��ȣ�� �ִٸ�, ���ڸ� �ϳ��� ���� ������ �ݼ� ���� �ִ� �� ���� �ð�������� ������ �Ѵ�. ���ڸ� �ϳ� ������ ���̾��� ó�� ��ġ�� ���ư���, ���� ���ڸ� �������� ���̾��� ó�� ��ġ���� �ٽ� ������ �Ѵ�.

���� 1�� �ɷ��� �� 2�ʰ� �ʿ��ϴ�. 1���� ū ���� �Ŵµ� �ɸ��� �ð��� �̺��� �� �ɸ���, �� ĭ ���� �ִ� ���ڸ� �ɱ� ���ؼ� 1�ʾ� �� �ɸ���.

������� �ҸӴϴ� ��ȭ ��ȣ�� �� ���ڿ� �ش��ϴ� ���ڷ� �ܿ��. ��, � �ܾ �� ��, �� ���ĺ��� �ش��ϴ� ���ڸ� �ɸ� �ȴ�. ���� ���, UNUCIC�� 868242�� ����.

�ҸӴϰ� �ܿ� �ܾ �־����� ��, �� ��ȭ�� �ɱ� ���ؼ� �ʿ��� �ּ� �ð��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
		String s = scan.next();
		String[] into = new String[8];
		into[0]="ABC";
		into[1]="DEF";
		into[2]="GHI";
		into[3]="JKL";
		into[4]="MNO";
		into[5]="PQRS";
		into[6]="TUV";
		into[7]="WXYZ";
		
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<into.length;j++) {
				for(int k=0;k<into[j].length();k++) {
					if(s.charAt(i)==into[j].charAt(k))
						sum+=(j+3);
				}
			}
		}
		System.out.print(sum);
	}
}
