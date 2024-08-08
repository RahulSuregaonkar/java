package Practice;

public class reverse_1_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S ="java";
		int len=S.length()-1;
		String rev="";
		for (int i=len;i>=0;i--) {
			rev = rev + S.charAt(i);
		}
		System.out.println(rev);
		

	}

}
