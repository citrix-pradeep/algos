
public class Exercise {


	public static void main(String[] args) {
		int sal=41000;
		if(sal<=10000){
			System.out.println("tax="+ sal*.10);
		}
		else if(sal<=40000) {
			System.out.println("tax="+ sal*.20);
			}
		else{
			System.out.println("tax="+ sal*.40);
		}
	}

}
