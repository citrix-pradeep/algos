package StringExample;

public class StringPermutation {
	
	void permute(String s,int i,int n){
		if(i==n){
			System.out.println(s);
			return;
		}
		else{
			for(int j=i;j<=n;j++){
				swap(s.charAt(i),s.charAt(j));
				permute(s,s.charAt(i+1),n);
				swap(s.charAt(i),s.charAt(j));
				
			}
		}
		
	}
 private void swap(char charAt, char charAt2) {
		char temp;
		temp=charAt;
		charAt=charAt2;
		charAt=temp;
		
	}
public static  void main(String args[]){
	 
	 StringPermutation ob1=new StringPermutation();
	 String s1="abc";
	 ob1.permute(s1,0,2);
 }
}
