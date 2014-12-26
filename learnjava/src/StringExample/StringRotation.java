////****  find ,if a given string is a rotation of another string or not  **////////
package StringExample;

public class StringRotation {

	public static void main(String[] args) {
		String s1="abcd";
		String s2="bcda";
		String s3=s1.concat(s1);
		if(s3.contains(s2)){
			System.out.println("s2 is rotation of s1");
		}else
			System.out.println("s2 is  not rotation of s1");
	}

}
