
public class Nonfinalclass extends NonaccessModifire  {

	void setrollno(){
		System.out.println("my roll no has been override to-"+rollno);
	}
	public static void main(String[] args) {
		Nonfinalclass ob1=new Nonfinalclass();
		ob1.setrollno();
	}

}
