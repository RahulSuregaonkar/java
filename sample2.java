package Practice;

public class sample2 extends Sample {
	public static void main(String[] args) {
		String S = "mom";
		int len = S.length() - 1;
		String Emp = "";
		for (int i=len;i>=0;i--) {
			Emp = Emp + S.charAt(i);
		}
		if (Emp.equals(S))
			System.out.println("its a palindrome");
		else 
			System.out.println("its not a palindrome");

	}

}
