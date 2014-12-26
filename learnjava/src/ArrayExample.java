
public class ArrayExample {

	
	public static void main(String[] args) {
		int[] x= {1,2,3,4,5,6,7};
		for(int temp :x)
		System.out.println(temp);
		int[] y= new int[5];
		y[2]=3;
		y[4]=5;
		for(int temp:y)
			System.out.print(temp);
		System.out.println("");
		String[] str={"dog","cat","tiger"};
		for(String temp:str)
		System.out.println(temp);
		String[] s=new String[5];
		s[0]="abc";
		for(String temp:s)
			System.out.println(temp);
		
	}

}
