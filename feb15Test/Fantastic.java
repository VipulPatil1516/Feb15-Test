package feb15Test;

import org.junit.Test;

public class Fantastic 
{ 
	@Test
   public void fantastic()
   {
	   String[] StringValue= new String [5];  //Memory Allocated
	   StringValue[0]="Good";  //First Position
	   StringValue[1]="Fantastic";  //Second
	   StringValue[2]="Fantastij";   // third
	   StringValue[3]="Fantastic";  // fourth
	   StringValue[4]="Fantastic";  // fifth
	   String fant = "Fantastic";    //Compare
	       int len= fant.length();
	           for(int i=0; i<5; i++)
	           {
	        	   int lengString= StringValue[i].length();
	        	     if(len==lengString)   //compare
	        	     {
	        	    	 if(fant==StringValue[i])
	        	    	 {
	        	    		 System.out.println("Successfull");
	        	    	 }
	        	    	 else
	        	    		 System.out.println("Failed");
	        	    	 }
	        	     else
	        	    	 
	        	    		 System.out.println("Failed");
	        	    	 }
	        	     }
	           
   }