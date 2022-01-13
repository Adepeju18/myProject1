//3 Write a java program to print sum of all number between 1-10
public class sum {

	public static void main(String[] args) {
		int num = 0;
		for(int i= 0; i<=10; i++) 
		{
			num +=i;
			
		}
		System.out.println(num);
	}

}

		
public class reverse {

	public static void main(String[] args) {
		int num1 = 1234567890,  reversed = 0;
		System.out.println("Number:" + num1);
		
		while(num1 !=0){
		    reversed = reversed * 10;
		    reversed = reversed + num1 % 10;
		    num1 = num1 / 10;
		}
		    System.out.println("Reverse number:" +reversed); 

	

}
}