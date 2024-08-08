package Practice;

public class palindrome {

    public static void main(String[] args) {
        String S = "java";
        int len = S.length() - 1;
        String rev = "";
        for (int i = len; i >= 0; i--) {
            rev = rev + S.charAt(i);
        }
        if (S.equals(rev))
        	System.out.println("it is a palindrome");
        else
        	System.out.println("it is not a palindrome");
        	
    }

}

