package com.java;

public class Array_DS {
	// Complete the reverseArray function below.
	 static int[] reverseArray(int[] a) {
	        int newArr[] = new int[a.length];
	        int j =0;
	        System.out.println(a.length-1);
	        for(int i=a.length-1; i>=0;i--){
	        	System.out.println(a[i]);
	        newArr[j] = a[i];
	        j=j+1;
	        }
	        

		return newArr ;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores ={100 ,90, 90, 80, 75, 60};
		int[] res =reverseArray(scores);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);

		}
	}

}
