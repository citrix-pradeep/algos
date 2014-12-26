package pak1;

public class ExerciseBox {

	
	public static void main(String[] args) {
		Box ob1=new Box();
		Box ob2=new Box();
		
		ob1.width=10;
		ob1.hight=20;
		ob1.area();
		ob2=ob1;
		ob2.area();
		}

}
