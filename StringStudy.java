package ch05;
import java.util.*;
public class StringStudy {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
//		���� : ���ڿ��� ���� ���� ���� ���ڸ� ����Ѵ�. �Է��� ��ҹ��ڸ� �������� �ʾƵ� �ǰ�, ����� �빮�ڷθ��Ѵ�.
//			   ��, ���� ���� ���� ���ڰ� 2�� �̻��̸� �ش� ���ڿ��� ��°��� ?��� �Ѵ�.
//		����Ǯ�� :
//		1. 
		int check=0;
		int max=0;
		String s = scan.next();
		String news = s.toUpperCase();
		int[] nums = new int[s.length()];
		for(int i=0;i<s.length();i++) {
			if(nums[i]!=-1) {
				for(int j=i+1;j<s.length();j++) {
					if(news.charAt(i)==news.charAt(j)) {
						nums[j]=-1;
					}
				}
			}
		}
//		���ڿ��� ������ �տ��� �̹� ���� ���ڴ� -1�� �����Ѵ�.
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				for(int j=i;j<nums.length;j++) {
					if(news.charAt(i)==news.charAt(j))
						nums[i]++;
				}
			}
		}
//		nums[i]�� 0�� ���ڿ��Ը� �ش�Ǵ� �ݺ����̴�. �� ���ں��� ���ڿ��� ������ �� ���ڰ� ��ִ��� ����. 
		max=0;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[max]<nums[i+1])
				max=i+1;
		}
//		���� ���� ���ڸ� �����ִ� ������ ù��° ��ġ�� max�� �����Ѵ�.
		for(int i=0;i<nums.length;i++) {
			if(nums[max]==nums[i])
				check++;
		}
//		���� ���ڸ� �����ִ� �ִ밹���� ���� ���ڰ� 2���̻� �ִٸ� check�� 1�� ���Ѵ� check�� 2�� �Ѿ�� ?�� ����ϱ� ���ؼ���.
		if(check>=2)
			System.out.print("?");
		else if(check==1)
			System.out.print(news.charAt(max));
	}
}
