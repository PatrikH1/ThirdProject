package Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public VectorTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 *  Class for testing the use of Vector.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<InfoClass> vec = new Vector<InfoClass>();
		
		int max = 10;
		for (int i = 0; i < max; i++) {
			vec.add(new InfoClass("Info " + i));
		}
					
		Iterator<InfoClass> iter = vec.iterator();
		while (iter.hasNext()) {
			System.out.println(((InfoClass) iter.next()).getTextStr());
		}		
	}
}

class InfoClass {
	String textStr;
	public InfoClass (String textStr) {
		this.textStr = textStr;
	}
	public String getTextStr() {
		return textStr;
	}	
}
