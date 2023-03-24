package String120;

public class String4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Dheena";
char check='e';
int count=0;
for(int i=0;i<name.length();i++)
{
	if(check==name.charAt(i))
	{
		count++;
	}
}
System.out.println(count);
	}

}
