package String120;

public class String20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name1="care";
String name2="race";
int count=0;
int n1=name1.length();
int n2=name2.length();
//boolean ck=false;
if(n1!=n2)
{
	System.out.println("This is not Anagram String - Because length is different");
}
else{
for(int i=0;i<n1;i++)
{
	
	for(int j=0;j<name2.length();j++)
	{
		if(name1.charAt(i)==name2.charAt(j))
		{
			//ck=true;
			count++;
			break;
		}
		else
		{
			//ck=false;
		}
		
	}
	
	
}
if(count==n1)
{
	System.out.println("This is Anagram String");
}
else
{
	System.out.println("This is not Anagram String");
}
}

	}

}
