import java.util.*;
public class ScannerLineInputConfusion {

	public static void main(String[] args) {
		//line input+line input
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		//line input+integer/decimal/string word/character input
		String s3 = sc.nextLine();
		int i = sc.nextInt();
		
		//integer/decimal/string word/character input+line input
		String sW = sc.next();
		sc.nextLine();
		String s4 = sc.nextLine();
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s3);
		System.out.println(i);
		
		System.out.println(sW);
		System.out.println(s4);
	}
}
