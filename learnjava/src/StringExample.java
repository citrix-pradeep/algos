
public class StringExample {

	
	public static void main(String[] args) {
//		String s1="hello";
//		System.out.println(s1.concat("world"));
//		System.out.println(s1.toUpperCase());
		String a1="Hello";
		String a2="Hello";
		String a3=new String("Hello");
		if(a1==a2)
			System.out.println("a1 and a1 refers to same object ");
		else
			System.out.println("a1 a2 are not same");
		if(a1==a3)
			System.out.println("a1 and a3 refers to same OBj");
		else
			System.out.println("a1 and a3 are not same");
	}

}
 