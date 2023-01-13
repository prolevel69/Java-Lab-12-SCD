package scdlab;

public class generic {
	 // generic method printArray
	 public static < E > void printArray( E[] inputArray ) {
	 // Display array elements
	 for(E element : inputArray) {
		 System.out.println(element);
	 }
	 System.out.println();
	 
	 }
	 
	 public static < E > void printRevArray( E[] inputArray ) {
		 // Display array elements
		 for(int i =inputArray.length -1; i>= 0;i--) {
			 System.out.println(inputArray[i]);
		 }
		 System.out.println();
		 
		 }
	 public static void main(String args[]) {
		 // Create arrays of Integer, Double and Character
		 Integer[] intArray = { 1, 1, 1 };
		 Double[] doubleArray = { 6.1, 7.2, 8.3, 9.4 };
		 Character[] charArray = { 'S', 'A', 'M', 'E', 'E', 'E', 'R' };
		 System.out.println("Array integerArray contains:");
		 printArray(intArray); // pass an Integer array
		 System.out.println("Array integerArray contains:");
		 printRevArray(intArray);
		 
		 System.out.println("\nArray doubleArray contains:");
		 printArray(doubleArray); // pass a Double array
		 System.out.println("\nArray doubleArray contains:");
		 printRevArray(doubleArray);
		 System.out.println("\nArray characterArray contains:");
		 
		 printArray(charArray); // pass a Character array
		 System.out.println("\nArray characterArray contains:");
		 printRevArray(charArray);
	 }
}