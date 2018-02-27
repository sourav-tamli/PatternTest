
public class PatternTest {
    
	public static void main (String args[])
	{
		for(int i = 1 ; i < 5 ; i++) //for the number of lines
		{
			
			if( i == 2 || i == 3)
			{
				System.out.print("$        $");
				System.out.println();
			}
	
			else
			{
				for(int j = 1 ; j < 5 ; j++)
				{
					System.out.print("$  ");
				}
			
		    }
			System.out.println();
			
			
		}
			
			
	}
}
