//���� : ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.

//��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.

//��� : �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.

import java.util.Scanner;
//���� �¶��� ���� 4344��
public class AverageAboveRatio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int wholecase=scan.nextInt(); 
//��ü ���̽��� ������ �Է��Ͻÿ�.
		int[] group=new int[1000];
//�л����� 1~1000������ �����Ѵ�.
		for(int i=0;i<wholecase;i++) { 
//�Է��� ���̽��� ������ŭ �۾��� �Ѵ�.
			int count=0;
			int sum = 0;
			int people=scan.nextInt();
//�л����� �Է��Ѵ�.
			for(int j=0;j<people;j++) {
				group[j]=scan.nextInt();
//�л����� ������ �Է��ϰ�
				sum+=group[j];
//�Է��� ������ ���տ� ���Ѵ�.	
			}
			for(int k=0;k<people;k++) {
				if(group[k]>(sum/(double)people)) {
//����̻��� �л��� �� ��� �ϳ��� count++�� �Ѵ�.
					count++;
				}
			}
			System.out.printf("%.3f",((count/(double)people)*100));
//����̻��� �л��� ������ (count/(double)people)*100�� ���Ѵ�.
			System.out.println("%");
		}
		scan.close();
	}
}