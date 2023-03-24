package String120;

public class String17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="HI How are you";
		int count=1;
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("No of words "+count);
	}

}
