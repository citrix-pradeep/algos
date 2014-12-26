package pak1;

public class Human {

	public int age;
	public String name;
	public void intro() {
		System.out.println("I am "+name+" and my age is "+age +".");
	}
	public void copy(Human Men){
		age=Men.age;
		name=Men.name;
		
	}
	public static void main(String[] args) {
		Human pk=new Human();
		Human deepu=new Human();
		deepu.age=30;
		deepu.name="deepak";
		pk.age=24;
		pk.name="pardeep";
		pk.copy(deepu);
		pk.intro();
		
	}

}
