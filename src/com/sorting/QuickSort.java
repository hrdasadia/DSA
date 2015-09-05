package com.sorting;

import java.util.Arrays;

/*
 * Quicksort is a conquer-then-divide algorithm, 
 * It does most of the work during the partitioning and the recursive calls. 
 * The subsequent reassembly of the sorted partitions involves trivial effort
 */

public class QuickSort {

	static int[] arr = {3,5,1,4,7,8,9,11,1};
	
	public static void main(String args[]){
		//input
				int low=0, high = arr.length-1;
				int pivot = low+(int)(Math.random()*(high-low));
				quickSort(arr,low,high,pivot);
				System.out.println("Final: " + Arrays.toString(arr));
	}
	
	private static void quickSort(int[] arr, int low, int high, int pivot) {
		 
		if(low<high){
			int pivot_value = arr[pivot];
			int i = low;
			int j = high;
			while(i<j){
					while(arr[i] < pivot_value){
						i++;
					}
					while(arr[j] > pivot_value){
						j--;
					}
					if(i<=j){
						if(arr[i] > arr[j]){
							int temp = arr[j];
							arr[j] = arr[i];
							arr[i] = temp;
						}
						i++;
						j--;
					}
			}
			if(low<j){
				pivot = low+(int)(Math.random()*(j-low));
				quickSort(arr,low,j,pivot);
			}
			if(high>i){
				pivot = i+(int)(Math.random()*(i-high));
				quickSort(arr,i,high,(i+high)/2);
			}
		}
	}


	}
