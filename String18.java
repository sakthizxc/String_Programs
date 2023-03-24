package String120;

public class String18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="1sakthi";
char[] ch=name.toCharArray();
for(int i=0;i<name.length();i++)
{
if(ch[i]>='a' && ch[i]<='z')
{
	ch[i]=(char)(ch[i]-'a'+'A');
	break;
}
else if(ch[i]>='A' && ch[i]<='Z')
{
	ch[i]=(char)(ch[i]-'a'+'A');
	break;
}
}
System.out.println(ch);

	}

}
