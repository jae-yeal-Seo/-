package ch05;
import java.util.*;
public class HanSu{
/*
 * �Ѽ�(�� �ڸ����� ���������� �̷�� ��)
 * 1. 1~99�� ��� �Ѽ�(���ڸ����� 2�� �ۿ� ���� ������ �� �ڸ����� ���� �ϳ��ۿ� ����)
 * 2. 100~999������ �� �ڸ����� ���̰� �����ؾ� �Ѽ��� �ȴ�.*/
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		int input = scan.nextInt();
		int number = 0;
		for(int i=1;i<=input;i++) {
			if(i<100)
				number++;
//			1~99������ ��� �Ѽ��̴�.
			else {
				int bak = i/100;
				int sip = i/10-10*bak;
				int il = i-bak*100-10*sip;
//				�� �ڸ����� �߷��´�.
				if((sip-bak==il-sip)||(sip-bak==il-sip))
					number++;
			}
//			�� �ڸ����� ���̰� �����ϸ� �Ѽ��� �����ϰ� number�� ���ڸ� ���Ѵ�.
		}
		System.out.print(number);
	}
}