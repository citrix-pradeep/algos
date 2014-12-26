
public class ExampleString {

	public static void main(String[] args) {
		String s="hello boy";
		System.out.println("hey"+" "+s);
		System.out.println(s.toUpperCase());
		System.out.println(s.substring(2,4));
		String a="2232.2";
		//int x=Integer.parseInt(a);
		//System.out.println(x/2);
		double x=Double.parseDouble(a);
		System.out.println(x/2);
		/*
		 *how fast is string manipulation in java
		 */
		System.out.println(s.substring(6).toUpperCase());
		
	}

}
