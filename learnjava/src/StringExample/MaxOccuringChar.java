package StringExample;

public class MaxOccuringChar {

	
	public static void main(String[] args) {
		String s="geeekseeeeforgekkkks";
		//String res= "";
		int maxcount=0;
		int maxindex=0;
		int count[]=new int[256];
		for(int i=0;i<s.length();i++){
			count[s.charAt(i)]++;
		
		if(maxcount<count[s.charAt(i)]){
			maxcount=count[s.charAt(i)];
			//System.out.println(s.charAt(i));
		}
		}
		for(int i=0;i<256;i++){
			if(count[maxindex]<count[i]){
				maxindex=i;
				
			}
		}
		System.out.println((char)maxindex+" repet "+ maxcount+" times");
	}


}
