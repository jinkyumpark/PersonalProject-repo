import java.util.Scanner;

public class annuity {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Do you want to select for groups too?(Y/N): ");
		
		String groups = stdin.nextLine();
		char groupsC = groups.charAt(0);
		
		int num1 = (int)(Math.random()*9);
		int num2 = (int)(Math.random()*9);
		int num3 = (int)(Math.random()*9);
		int num4 = (int)(Math.random()*9);
		int num5 = (int)(Math.random()*9);
		int num6 = (int)(Math.random()*9);
		
		int numgroup = (int)(Math.random()*3)+1;
		
		String nums1 = Integer.toString(num1);
		String nums2 = Integer.toString(num2);
		String nums3 = Integer.toString(num3);
		String nums4 = Integer.toString(num4);
		String nums5 = Integer.toString(num5);
		String nums6 = Integer.toString(num6);
		
		String nums = nums1 + nums2 + nums3 + nums4 + nums5 + nums6;
		
		if(groupsC == 'Y') {
			System.out.println("Your number is " + nums + " of group " + numgroup);
		} else {
			System.out.println("Your number is " + nums + ".");
		}
		stdin.close();
	}
}
