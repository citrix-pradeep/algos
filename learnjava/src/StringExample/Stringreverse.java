package StringExample;

public class Stringreverse {

	void reversestr(String s){
		for(int i=s.length()-1;i>=0;i--){
		 System.out.print(s.charAt(i));  		 
	   }
	}
	
		String reverseRec(String s1){
			if(s1.length()==0)
				return s1;
			else{
				
				 return reverseRec(s1.substring(1))+s1.charAt(0);
			}
		}
   
	
	public static void main(String[] args) {
		Stringreverse s=new Stringreverse();
		String a="aaabbb";
		s.reversestr(a);
		String x= s.reverseRec(a);
		System.out.println("\n" +x);
	}

}
