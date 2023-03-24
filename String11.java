package String120;

public class String11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="madam";
		System.out.println(name);
		String rev="";
		char[] arr=new char[name.length()];
		for(int i=arr.length-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
			
		}
		System.out.println(rev);
		if(name.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
