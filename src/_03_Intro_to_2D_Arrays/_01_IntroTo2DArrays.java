package _03_Intro_to_2D_Arrays;

public class _01_IntroTo2DArrays {

    public static void main(String[] args) {
        // 1. declare a 2D array of integers with 3, 1D arrays that each hold
        //    3 integers
    	int [][] newArray2d = { {1,2,3}, {4,5,6}, {7,8,9}};

        // 2. use two for loops to set all the elements in the 2D array to
        //    a different integer
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for(int i=0; i<newArray2d.length; i++) {
    		for(int x =0; x<newArray2d[i].length; x++) {
    			newArray2d[i][x] = newArray2d[i][x] * 2;
    		}
    	}
        
        // 3. print the third element from the second 1D array (2DArray[1][2])
    	System.out.println(newArray2d[1][2]);
        // 4. set the third element from the second 1D array to a different
        //    value
    	newArray2d[1][2]=15;
        // 5. print the element again and verify the value has changed
    	System.out.println(newArray2d[1][2]);
    }
}
