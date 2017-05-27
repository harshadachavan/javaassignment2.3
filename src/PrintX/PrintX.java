package PrintX;

public class PrintX {

	public static void main(String[] args) {
		/*
		 * The program to display "*" in following pattern
		 * 
		 *        *_____*
		 *        _*___*
		 *        ___*
		 *        _*___*
		 *        *_____*
		 * */
		
		
		  int rownumber;            
	      int columnnumber;              
	       
	           
	      rownumber=5;         
	      columnnumber=5;         
	        
	        for(int row = 0 ; row < rownumber; row++)       
	        {
	        	int numOfChar=0;                   
	        	for(int col=0;col < columnnumber; col++)      
	        	{
	        	    if(row==col || col+row == columnnumber-1)        
	        	    {   
	        	    	System.out.print("*");   
	        	    	numOfChar++;
	        	    }	
	        	    else
	        	    	System.out.print("_");        
	        	    if((numOfChar==2 && row!=2) || (numOfChar==1 && row==2))
	        	    	break;
	        	}
	        	System.out.print("\n");       
	        }        
		
		

	}

}
