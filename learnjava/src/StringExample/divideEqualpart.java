package StringExample;

public class divideEqualpart {

	void divideString(String s, int n)
	{
	   int str_size = s.length();
	   int i;
	   int part_size;
	 
	   /*Check if string can be divided in n equal parts */
	   if(str_size%n != 0)
	   {
	     System.out.println("Invalid Input: String size is not divisible by n");
	     return;
	   }
	 
	   /* Calculate the size of parts to find the division points*/
	   part_size = str_size/n;
	   System.out.println(part_size);
	   for(i = 0; i< str_size; i++)
	   {
		     if(i%part_size == 0){
		    	 System.out.println("\n");  
		     }
	        /* newline separator for different parts */
	    	System.out.print(s.charAt(i));
	   }
	}
	
	public static void main(String[] args) {
		divideEqualpart d=new divideEqualpart();
		String s="ababcccc";
		d.divideString(s, 2);
		
	}

}
