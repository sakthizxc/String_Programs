package String120;

public class String19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="SAKTHI";
		char[] ch=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
		if(ch[i]>='A' && ch[i]<='Z')
		{
			ch[i]=(char)(ch[i]+'a'-'A');
			
		}
		else if(ch[i]>='a' && ch[i]<='z')
		{
			ch[i]=(char)(ch[i]+'A'-'a');
			
		}
	}
		System.out.println(ch);
	}
	}
