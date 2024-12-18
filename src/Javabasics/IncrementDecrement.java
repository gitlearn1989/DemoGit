package Javabasics;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  ++,--
		
	/*	int i=10;
		int k=10;
		
		System.out.println("The value of i before increment "+ i);
		
		//Post increment the value of i
		
		int j=i++;
		
		System.out.println("The value of j is "+j);
	
		System.out.println("The value of i is "+i);
		
	//pre increment
		
		System.out.println("The value of k is " + k);
		
		int l=++k;
		
		System.out.println("The value of l is "+l);
		System.out.println("The value of k is " + k);
	
		*/
		
		int a=100;
		
		int b=0;
		
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is " + b );
		
		System.out.println("The value of a is "+ a++);
		System.out.println("The value of b is " + b++ );
		
		System.out.println("The value of a is "+ a);
		System.out.println("The value of b is " + b);
		
		//pre decrement
		
		int c=200;
		
		int d=--c;
		
		System.out.println("the value of c "+ c);
		
		System.out.println("The value of d is "+ d);
		
		//post decrement
		
		int e=200;
		
		int f=e--;   // 200 assigned to f first 
		
		System.out.println("The value of f is "+ f); // valye of f is 200
		
		System.out.println("the value of e "+ e);  //value of e is 199
		
		
		
		
	}

}
