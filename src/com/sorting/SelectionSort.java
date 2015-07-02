package com.sorting;
import java.util.Arrays;

//swap the least element with first element
//second least with second element and so on..

public class SelectionSort {
	public static void main(String[] args) {
		//input
		int[] arr = {3,5,1,4,7,8,9,11,1};
		selectionSort(arr);
		System.out.println("Final: " + Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr){
		for(int i = 0;i<arr.length; i++){
			int minElement = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j] < arr[minElement]){
					minElement = j;
				}
			}
			if(minElement > i){
				int temp = arr[i];
				arr[i] = arr[minElement];
				arr[minElement] = temp;
			}
		}
	}
}
