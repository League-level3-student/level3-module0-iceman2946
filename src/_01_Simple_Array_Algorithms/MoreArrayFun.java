package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] value = new String [5];
		value [0]= "a";
		value [1] = "b";
		value [2] = "c";
		value [3] = "d";
		value [4] = "e";
		array(value);
		reverseArray(value);
		everyTwo(value);
	}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void array(String [] values) {
		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]);
		}
	}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
	public static void reverseArray(String [] values) {
		for (int i = values.length-1; i>-1; i--) {
			System.out.println(values[i]);
		}
	}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void everyTwo(String [] values) {
		for (int i=0; i<values.length; i++) {
			if(i % 2 == 0) {
				System.out.println(values[i]);
			}
		}
	}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.


}
