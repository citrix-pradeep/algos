package BitMegic;

public class powof2 {

 	  public void pow(int x){
		// int z=(~x&(x-1));
 		 if((x&(~(x&(x-1))))==x)
 		 {  // in case of 0 input it says pow of 2 this is a bug
 			 System.out.println("pow of 2");
 		 }
 		 else{
 			 System.out.println(" Not a pow of 2");
 		 }
	}
	
	public static void main(String[] args) {
		powof2 ob1=new powof2();
		ob1.pow(1);
		

	}

}
