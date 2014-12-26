package StringExample;

public class printduplicats {

	public static void main(String[] args) {
		String s="geeksforgeeks";
		int[] count=new int[256];
		for(int i=0;i<s.length();i++)
			count[s.charAt(i)]++;
	
		for(int i=0;i<256;i++){
			if(count[i]>1){
				System.out.println((char)i+"="+count[i]);

				
			}
		}
		
	}

}
