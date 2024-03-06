package arrays;

public class maxminarray {
	
	    public static void main(String[] args) {
	        int[] arr = { 5892,6852,5486,8588,92589,41580,5205,5683,4000,55490};

	        int min = arr[0];
	        int max = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        System.out.println("Minimum element: " + min);
	        System.out.println("Maximum element: " + max);
	    }
	}


	