import java.util.*;

public class CroatiaAlphabet {
		static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String s = scan.next();
//		���ڸ� �Է¹޴´�.
		int length = s.length();
//		���ڿ��� ���̸� ���� length��� ������������ ����ִ´�. 
		
		for(int i=0;i<s.length();i++) {
//			���ڿ� ó������ ������ ������ �Ѵ�.
			if(i<s.length()-1&&s.charAt(i+1)=='=') {
//				i<s.length()-1�� �� ������ ������ ���ڿ� �� s.charAt(i+1)�޼ҵ带 ������ �� ���⶧���̴�(�迭�� index����)
				length=length-1;
				if(i>=1&&s.charAt(i)=='z'&&s.charAt(i-1)=='d')
//					�� ���ǹ��� "dz="�� ���ڿ��� �����ϴ� ���̱� ������ �ݵ�� ���� ���ǹ��ȿ� �־�� �Ѵ�.(���� ���ǹ��� "����"�� �Ǵ� �����̱� ������)
					length = length-1;
			}
			else if(i<s.length()-1&&s.charAt(i+1)=='-') {
				length = length-1;
			}
			else if((i>=1&&s.charAt(i)=='j'&&s.charAt(i-1)=='l')||(i>=1&&s.charAt(i)=='j'&&s.charAt(i-1)=='n'))
					length = length-1;
		}
		System.out.print(length);
	}

}
