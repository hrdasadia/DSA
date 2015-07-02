package com.sorting;
import java.util.Arrays;


public class MergeSort {
	static int[] arr = {3,5,1,4,7,8,9,11,1};
	static int[] temp = new int[arr.length];
	public static void main(String args[]){
		//input
				
				mergeSort(arr);
				System.out.println("Final: " + Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr) {
		if(arr!=null && arr.length>1){
			int start = 0;
			int end = arr.length-1;
			int middle = (start+end)/2;
			divide(start,end,middle,arr);
		}
	}

	private static void divide(int start, int end, int middle, int[] arr) {
		if(start < end){
			divide(start,middle,(start+middle)/2,arr);
			divide(middle+1,end,(middle+1+end)/2,arr);
			merge(start,end,middle,arr);
		}
		
	}

	private static void merge(int start, int end, int middle, int[] arr) {
		if(start<end){
			for(int i=start;i<=end;i++){
				temp[i] = arr[i];
			}
			int i=start;
			int j=middle+1;
			int filler = start;		
			while(i<=middle && j<=end){
				if(arr[i]>arr[j]){
					arr[filler] = temp[j];
					j++;
				}else{
					arr[filler] = temp[i];
					i++;
				}
				filler++;
			}
			while(i<=middle){
				arr[filler] = temp[i];
				i++;
				filler++;
			}
		}
	}
}
