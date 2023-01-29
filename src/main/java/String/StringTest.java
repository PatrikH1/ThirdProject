/**
 * 
 */
package String;

/**
 * @author Patrik
 *
 */
public class StringTest {

	/**
	 * 
	 */
	public StringTest() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/* String to split.  */
		String str = "one-two-three-uuuu";	
		String[] temp;
		String delimiter = "-";

		/* given string will be split by the argument delimiter provided. */
		temp = str.split(delimiter);

		/* print substrings */
		for(int i =0; i < temp.length ; i++)
			System.out.println(temp[i]);
		
		String [] epostAddresses = {"dan.patrik.hulthen@gmail.com",
				"hui.wang.hulthen@yahoo.se",
				"jonas.hulthen@live.com"};
		
		//epostSplit();
		epostSplit(epostAddresses);
	}
	
	static public void epostSplit()
	{
		String epost1 = "dan.patrik.hulthen@gmail.com";
		String epost2 = "hui.wang.hulthen@yahoo.se";
		String[] temp1;
		String[] temp2;
		String[] tempAddress1;
		String[] tempAddress2;
		String[] tempName1;
		String[] tempName2;
		/* delimiter */
		
		String delimiterA = "@";

		String delimiterPoint = "\\.";
		
		temp1 = epost1.split(delimiterA);
		temp2 = epost2.split(delimiterA);
		
		tempName1 = temp1[0].split(delimiterPoint);
		tempName2 = temp2[0].split(delimiterPoint);
		
		tempAddress1 = temp1[1].split(delimiterPoint);
		tempAddress2 = temp2[1].split(delimiterPoint);
		
		for(int i = 0; i < tempName1.length ; i++)
		{
			System.out.println(tempName1[i]);	
		}	
		
		for(int i = 0; i < tempAddress1.length ; i++)
		{
			System.out.println(tempAddress1[i]);	
		}	
		
		System.out.println();
		for(int i = 0; i < tempName2.length ; i++)
		{
			String beginner2=(tempName2[i].substring(0, 1)).toUpperCase();
			String rest2=tempName2[i].substring(1, tempName2[i].length());
			System.out.println(beginner2 + rest2);	
		}		
					
		System.out.println();
		for(int i = 0; i < tempAddress2.length ; i++)
		{					
			//System.out.println(tempAddress2[i]);
			String beginner2=(tempAddress2[i].substring(0, 1)).toUpperCase();
			// String rest2=tempAddress2[i].substring(1, tempAddress2[i].length());
			String rest2=tempAddress2[i].substring(1);
			System.out.println(beginner2 + rest2);	
		}				
	}
	
	static public void epostSplit(String[] eposts)
	{	
		for(int i = 0; i < eposts.length ; i++)
		{	
			String[] temp1;
			String[] tempAddress1;
			String[] tempName1;
			String epost1 = eposts[i];			
			String delimiterA = "@";
			String delimiterPoint = "\\.";
			
			temp1 = epost1.split(delimiterA);
			tempName1 = temp1[0].split(delimiterPoint);
			tempAddress1 = temp1[1].split(delimiterPoint);
			
			System.out.println();
			for(int j = 0; j < tempName1.length ; j++)
			{
				String beginner2=(tempName1[j].substring(0, 1)).toUpperCase();
				String rest2=tempName1[j].substring(1);
				System.out.println(beginner2 + rest2);	
			}	
			
			System.out.println();
			for(int j = 0; j < tempAddress1.length ; j++)
			{						
				//System.out.println(tempAddress2[i]);
				String beginner2=(tempAddress1[j].substring(0, 1)).toUpperCase();
				// String rest2=tempAddress2[i].substring(1, tempAddress2[i].length());
				String rest2=tempAddress1[j].substring(1);
				System.out.println(beginner2 + rest2);	
			}							
		}		
	}
}
