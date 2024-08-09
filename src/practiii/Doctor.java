package practiii;

public class Doctor {
	
	void dermotologist() {
		System.out.println("hey come i wil do blood test");
	}

}
 class Enginer extends Doctor{
	
	void coding()
	{
		System.out.println("coding coding");
	}
}
 class Mainclass{
public static void main(String[] args)	{
	// TODO Auto-generated method stub
      Enginer e= new Enginer();
      e.coding();
	}
 }
 
