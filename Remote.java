package ch05;

public class Remote{
	public static void main(String[] args){
/*
 * �������� : check�迭�� 10001���� �����(10000�� ����� �����ϰ� �ϱ� ����)
 * 		   i=1~10000������ �����ѹ��� "�ƴ�"���� checkint��� �� ��, check[checkint]��1�� �ִ´�.
 * 		   i=1~10000���� ������ �� check[i]�� 0�� ������ �����ѹ��� ���̴�. 
 * 		   */
		int[] check = new int[10001];
		for(int i=1;i<=10000;i++) {
			int man=i/10000;
			int chun=i/1000-10*man;
			int bak=i/100-100*man-10*chun;
			int sip=i/10-1000*man-100*chun-10*bak;
			int il=i-10000*man-1000*chun-100*bak-10*sip;
			int checkint = i+man+chun+bak+sip+il;
			if(checkint<=10000) {
			check[checkint]=1;
			}
		}
		for(int i=1;i<=10000;i++) {
			if(check[i]==0) {
				System.out.println(i);
			}
		}
		
	}
}