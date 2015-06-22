import java.util.Arrays;

//start from index 1 and check backwards for 'right' place to insert
//Better than selection and bubble sort
/*
 * Adaptive, i.e., efficient for data sets that are already substantially sorted: 
 * the time complexity is O(nk) when each element in the input is no more than k places away from its sorted position
 * Stable & in place
 */

public class InsertionSort {

	public static void main(String[] args) {
		//input
		int[] arr = {3,5,1,4,7,8,9,11,1};
		insertionSort(arr);
		System.out.println("Final: " + Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++){
			int current = arr[i];
			for(int j=i-1;j>=0;j--){
				if(arr[j] > current){
					arr[j+1] = arr[j];
					arr[j] = current;
				}else{
					break;
				}
			}	
		}
	}
	
}
