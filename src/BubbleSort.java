import java.util.Arrays;

//Also known as sinking sort
//Compare each element with the next one and swap if next one is smaller
//Larger elements will sink in every iteration
//Optimization1: Comparison can go till (lastElement - currentIndex) because elements at the end are already sorted
//Optimization2: If inner iteration has no swaps, its already sorted


/*
 * For perfectly sorted lists: The only significant advantage that bubble sort has over most other implementations, 
 * even quicksort, but not insertion sort, is that the ability to detect that the list is sorted is efficiently built into the algorithm. 
 * When the list is already sorted (best-case), the complexity of bubble sort is only O(n).
 * The positions of the elements in bubble sort will play a large part in determining its performance. 
 * Large elements at the beginning of the list do not pose a problem, as they are quickly swapped. 
 * Small elements towards the end, however, move to the beginning extremely slowly. This has led to these types of elements being named rabbits and turtles, respectively.
 * 
 * Worst case: On(n^2)
 * O(n) when nearly sorted i.e. its adaptive
 */


public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {3,5,1,4,7,8,9,11};
		bubbleSort(arr);
		System.out.println("Final: "+Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr){
		for(int start = 1;start<=arr.length;start++){
			boolean swaps = false;
			for(int i=0;i<arr.length-start;i++){
				if(arr[i] > arr[i+1]){
					int temp =  arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swaps = true;
				}
			}
			if(!swaps){
				break;
			}
		}
	}
}
