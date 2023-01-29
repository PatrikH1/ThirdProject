/**
 * 
 */
package jonas.Multiplication;

/**
 * @author Patrik
 *
 */
public class Multiplication {

	/**
	 * 
	 */
	public Multiplication() {
		// TODO Auto-generated constructor stub
	}
	
	public int tableNine() {
		return 1 * 9;
	}
	
	public void writeTableNine() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " * 9 = " + (i * 9));
		}			
	}
	
	public void writeTableFive() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " * 5 = " + (i * 5));
		}			
	}	
	
	public void writeAllTables() 
	{
		for (int j = 1; j < 101; j++) 
		{
			System.out.println("Table " + j + ":");
			System.out.println("_____________");
		    for (int i = 1; i < 11; i++) 
		    {
			    System.out.println(i + " * " + j + " = " + (i * j));
		    }	
		}
	}	
	
	public void writeAllTablesHoppsan() 
	{
		for (int j = 1; j < 101; j++) 
		{
			System.out.println("Table " + j + ":");
			System.out.println("_____________");
		    for (int i = 1; i < 11; i++) 
		    {
			    System.out.println(i + " * " + j + " = " + (i * j));
		    }	
		}
	}		

}
