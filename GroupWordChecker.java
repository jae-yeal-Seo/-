import java.util.*;

public class GroupWordChecker {
/*
 * �׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�. ���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, 
 * 
 * kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������, aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.

	�ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/	
	private static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		int number = scan.nextInt();
//		��� ���ڿ��� �Է��� ���� �Է��Ѵ�.
		String[] dana = new String[number];
//		number���� ��ŭ index�� �ִ� ���ڿ� �迭�� �����.
		for(int i=0;i<number;i++) {
			dana[i] = scan.next();
		}
// 		���ڿ��� number�� ��ŭ �Է��Ѵ�.
		for(int i=0;i<number;i++) {
//			��� ���ڿ��� �˻��Ѵ�.
			for(int j=1;j<dana[i].length();j++) {
				if(dana[i]=="0")
					break;
//				�ι�°�� ù��°��, ����°�� �ι�°�� ... ��������°�� ��������° ���� �񱳸� �Ѵ�.
				if(dana[i].charAt(j)==dana[i].charAt(j-1))
					continue;
//				���� ���� ��Ĵ�� ������ �� �μ��� ���ٸ� ���� ���ڷ� �Ѿ��.
				else {
					for(int k=j-1;k>=0;k--) {
						if(dana[i].charAt(j)==dana[i].charAt(k)) {
							dana[i]="0";
							break;
						}
					}
				}
//				���� ���� �ٸ� ���ڿ��� �̿��� ���, �ش� ���ڿ� "ù��° ����~�ش繮�� ������"���� ���ؼ� ���� ���ڰ� ������ �ش� ���ڿ��� "0"���� ����� ������
//				�ش繮�ڿ��� �� �̻� üũ���� �ʰ� if(dana[i]=="0")break;��� ���ǹ��� �ִ´�.
			}
		}
		int newnumber = number;
		for(int i=0;i<number;i++) {
			if(dana[i]=="0")
				newnumber--;
		}
//		"0"�̾��� ���ڿ��� �׷�ܾ �ƴϹǷ� number���� 1�� ����. 
	System.out.print(newnumber);
	}
}
// �ش� ���ڿ��� "0"���� ����� ��ų, newnumber��� ���ο� ������ ���������ν� number�� �����̸��� ��ġ�� �ʰ��ϴ� �� ������ �߿��ߴ� ����̾���. 
