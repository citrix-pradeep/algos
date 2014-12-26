package BitMegic;

public class print1to10 {

	public void print(int n){
		if(n==0){
			return;
		}
		print(n-1);
		System.out.print(n);
	}
	public void print2(int n){
		if(n==0){
			return;
			}
		System.out.print(10-n+1);
		print2(n-1);
	}
	public static void main(String[] args) {
		print1to10 a=new print1to10();
		a.print(10);
		System.out.println("\n");
		a.print2(10);

	}

}
