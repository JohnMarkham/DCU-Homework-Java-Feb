/**
 * 
 */
package homeWorkFeb;

/**
 * @author j_mar
 *
 */
public class Counter {

	public static int noTimes;
	
	/**
	 * 
	 */
	public Counter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c = new Counter();
		c.upToNumber(5);
		System.out.println("NoTimes variable is " + noTimes);
	}
	
	
		
	
	private void upToNumber(int start) {
		// Write a program that has a recursive method called upToNumber that takes an int as
		// an argument and prints out all numbers from that number down to zero.
		noTimes+=1;
		System.out.println(start);
		start-=1;
		if (start < 0)
			return;
		upToNumber(start);
	}
}
