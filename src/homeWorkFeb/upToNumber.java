package homeWorkFeb;

public class upToNumber {
	
	public static void main(String[] args){
		upToNumber(5);
	}

	public static void upToNumber(int start) {
		// TODO Auto-generated constructor stub
		System.out.println(start);
		start-=1;
		if (start < 0)
			return;
		upToNumber(start);
	}



}
