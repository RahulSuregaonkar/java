package Practice;

public class palindrome_practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "java";
		int len = S.length() - 1;
		String rev = "";
		for (int i = len; i>=0; i--) {
			rev = rev + S.charAt(i);
		}
		if (rev.equals(S)) {
			System.out.println("its a palindrome");
		}
		else {
			System.out.println("its not a palindrome");
		}
		

	}

}
