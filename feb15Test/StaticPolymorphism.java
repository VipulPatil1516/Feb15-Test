package feb15Test;

public class StaticPolymorphism 
{
	public static void main(String[] args)
	{
		SimpleCalcultor obj = new SimpleCalcultor();
		System.out.println(obj.add(25,25));
		System.out.println(obj.add(25,25,25));
		System.out.println(obj.sub(50, 5.5));
	}
	static class SimpleCalcultor
	{
	  int add(int a,int b)//take only Two integer addition
	  {
		  return a+b;
	  }
	  int add(int a,int b, int c)// take only three integer addition
	  {
		  return a+b+c;
	  }
	  double sub(int a,double b)// take only three integer addition
	  {
		  return  a-b;
	  }
	  
	}
	
	
	
	
}


