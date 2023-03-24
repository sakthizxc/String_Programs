package String120;

public class String22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "sjdadee";
		int count = 1;
		int result = 0;
		char ans = 0;
		char[] arr = name.toCharArray();
		boolean[] check = new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
					check[j] = true;
				}
			}
			if(count>result && check[i]==false ) {
				result = count;
				 ans = arr[i];
			}
			count = 1;
		}
		System.out.println("the highest occured element is = "+ans);
	}
	}

