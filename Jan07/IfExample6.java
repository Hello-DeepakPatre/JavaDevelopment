public class IfExample6{
	public static void main(String args[]){
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		System.out.println("Does changes universal law of nature ...yes/no");
		String userInput = refVar.next();
		if(userInput.equalsIgnoreCase("yes")){
			System.out.println("You are right..");
		}//End of if block.
		System.out.print("It's universal truth..");
	}//End of main method.
}//End of class.