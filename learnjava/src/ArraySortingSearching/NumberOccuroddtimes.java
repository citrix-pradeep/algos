package ArraySortingSearching;

public class NumberOccuroddtimes {

	public int occuroddtimes(int a[]) {
		int x=0;
		for(int i=0;i<a.length;i++){
			 x=x^a[i];
		}
		return x;
	}
	public static void main(String[] args) {
		int a[]={1,1,2,2,3,3,4,4,4,4,3,3,3,3,1};
		NumberOccuroddtimes ob=new NumberOccuroddtimes();
		System.out.println("Number occur odd times is :"+ob.occuroddtimes(a));
	}

}
