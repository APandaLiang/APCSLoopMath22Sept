public class Multipleofx
{
		  public static void main(String[] args) 
		  {
	            for(int i=1; i < 1001; i++)
	            {
	            	boolean isPrime = true;
	            
	                    for(int p=2; p < i ; p++)
	                    {

	                            if(i % p == 0)
	                            {
	                                    isPrime = false;
	                                    break;
	                            }
	                    }
	                    if(isPrime)
	                            System.out.print(i + ", ");
	            }
	       }
	}