package BitMegic;
//Smaple comment
public class nextpowof2 {

int nextpoweroftwo(int x){
	int count=0;
	if((x&(~(x&(x-1)))) == x)
		return x;
	while(x!=0){
		x=x>>1;
		count++;
	}
return 1<<count;
//1<<100010
}

	public static void main(String[] args) {
		int n=17;
		nextpowof2 ob1=new nextpowof2();
		System.out.println(ob1.nextpoweroftwo(n));

	
}
}
