package demo;

public class Operators {
	public static void main(String args[]) {
		int discountPercentage = 10;
		double totalPrice = 800;
		double priceAfterDiscount = totalPrice * (1 - ((double) discountPercentage / 100));
		if (totalPrice > 500) {
			priceAfterDiscount = priceAfterDiscount * (1 - ((double) 5 / 100));
		}
		System.out.println("Discount--------------------------------------");
		System.out.println("Customer has paid a bill of amount: "+ priceAfterDiscount);
		
		///unary operators
		
		int numOne = 10;
		int numTwo = 5;
		boolean isTrue = true;
		System.out.println("Unary Operators------------------------------------------");
		System.out.println(numOne++ + " " + ++numOne); //Output will be 10 12
		System.out.println(numTwo-- + " " + --numTwo); //Output will be 5 3
		System.out.println(!isTrue + " " + ~numOne); //Output will be false -13
		
		///Arithmetic Operators
		
		System.out.println("Arithmetic Operators-------------------------------------");
		System.out.println(numOne + numTwo); //Output will be 15
		System.out.println(numOne - numTwo); //Output will be 5
		System.out.println(numOne * numTwo); //Output will be 50
		System.out.println(numOne / numTwo); //Output will be 2
		System.out.println(numOne % numTwo); //Output will be 0
		
		///Relational Operators
		
		
		System.out.println("Relationsl Operators-------------------------------------");
		System.out.println(numOne > numTwo); //Output will be true
		System.out.println(numOne < numTwo); //Output will be false
		System.out.println(numOne == numTwo); //Output will be false
		
		///Logical Operators
		
		
		
		int numThree = 30;
		System.out.println("Logical Operators------------------------------------------");
		System.out.println(numOne > numTwo && numOne > numThree); //Output will be false
		System.out.println(numOne < numTwo || numOne > numTwo); //Output will be true
		
		
		///Ternary Operators
		
		int min = (numOne < numTwo) ? numOne : numTwo;
		System.out.println("Ternary Operators-------------------------------------------");
		System.out.println(min); //Output will be 5
		
		///Assignment Operators
		
		
		System.out.println("Assignment Operators------------------------------------------");
		System.out.println(numOne); //Output will be 10
		numOne += 5;
		System.out.println(numOne); //Output will be 15
		numOne -= 5;
		System.out.println(numOne); //Output will be 10
		numOne *= 5;
		System.out.println(numOne); //Output will be 50
		numOne /= 5;
		System.out.println(numOne); //Output will be 10
	}


}
