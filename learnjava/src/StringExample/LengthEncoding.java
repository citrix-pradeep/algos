
////aaaabbccccc=a4b2c5////
package StringExample;

public class LengthEncoding {
	
public static void main(String[] args) {
		
		String s = "aaaaaaaaabbbbbbccdpppppppp";
		int count = 0;
		char temp = s.charAt(0);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==temp)
				count++;
			else
			{
				System.out.print(temp+""+count);
				count = 1;
				temp = s.charAt(i);
			}
		}
		System.out.print(temp+""+count);
	}
}
                               
	

