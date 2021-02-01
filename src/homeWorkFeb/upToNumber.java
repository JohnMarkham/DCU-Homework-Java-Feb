package homeWorkFeb;

public class upToNumber {
	
	public static void main(String[] args){
		upToNumber(5);
	}

	public static void upToNumber(int start) {
		// Write a program that has a recursive method called upToNumber that takes an int as
		// an argument and prints out all numbers from that number down to zero.
		System.out.println(start);
		start-=1;
		if (start < 0)
			return;
		upToNumber(start);
	}



}
