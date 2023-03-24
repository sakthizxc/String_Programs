package String120;

public class String8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="SakthiDheena";
char[] a=name.toCharArray();
int count=1;
boolean[] check=new boolean[a.length];
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]==a[j] && check[i]==false)
		{
			check[j]=true;
			count++;
			//System.out.println(a[i]);
		}
	}
	if(count>1)
	{
		System.out.println(a[i]);
		count=1;
	}
}
	}

}
