import java.util.*;

public class HoneyComb {

	public static void main(String[] args) {
		/*
		 * ���� �׸��� ���� ���������� �̷���� ������ �ִ�. �׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�. 
		 * 
		 * ���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		 * 
		 * ���� ���, 13������ 3��, 58������ 5���� ������.*/
		Scanner scan = new Scanner(System.in);
//		�� ��ĭ�� ������ ������ �Է��Ѵ�.
		int Onenumber = 8; int plus = 12; int checknumber = 3; 
		int x = scan.nextInt();
		if(x==1)
		System.out.print(1);
//		1�� ������ 1�� ���� ���İ� �Ŷ�� ó���Ѵ�.
		else if(1<x&&x<8)
			System.out.print(2);
//		2~7�� �ش��ϴ� ��ȣ�� ���� else�� ���������� �ٸ��� ������ ���� ������ �� ���Ҵ�. 
		else {
			while(true) {
				if(Onenumber<=x&&x<Onenumber+plus) 
					break;
				Onenumber+=plus;
				plus=++checknumber*6;
			}
//			x�� �������� �������� ������ �Է��Ѵ�. �׸��� �ش������ ���ϸ� �ݺ����� ������.
			System.out.print(checknumber);
//			�󸶳� �̵��ߴ��� ����Ѵ�.
		}		
	}
}


