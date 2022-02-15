package feb15Test;

  class Bike
  {
	  public void Sound()
	  {
		  System.out.println("vurum vrummmmm");
	  }
	  
  }
  class Ninja extends Bike
  {
	  public void Sound()
	  {
		  System.out.println("futtt futtt futtt");
	  }
  }
  public class DynamicPolymorphism
  {
	  public static void main(String args[])
	  {
		  Bike animal1= new Bike();
		  Bike animal2= new Ninja();
		  
		  animal1.Sound();
		  animal2.Sound();
	  }
  }
	
	
	
	
	
	









