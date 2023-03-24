package String120;

public class String5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Sakthivel";
		//char check='e';
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u')
			{
				count++;
			}
			
		}
		System.out.println("Count of Vowels = "+count);
	}

}
