package StringExample;

public class RemoveCharfromFirstString {

	
	public static void main(String[] args) {
		String s1="teststring";
		String s2="mask";
		String res="";
		int counts2[]=new int[256];
		for(int i=0;i<s2.length();i++)
			counts2[s2.charAt(i)]++;
		
		for(int i=0;i<s1.length();i++){
			if(counts2[s1.charAt(i)]==0){
				res+=s1.charAt(i);
			}
		}
		System.out.println(res);
	}

}
