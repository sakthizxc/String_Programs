package String120;

public class String7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="SakhiDheena";
int count=1;
char[] a=name.toCharArray();
boolean[] check=new boolean[a.length];
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]==a[j] && check[i]==false)
		{
			count++;
			check[j]=true;
		}
		
	}
	if(check[i]==false)
	{
		System.out.println(a[i]+" = "+count);
		count=1;	
	}
	
}

	
	}

}
