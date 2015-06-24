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
		if(arr!=null && arr.length>=2){
			int start = 0;
			int end = arr.length-1;
			divide(0,(start+end)/2,arr);
			divide((start+end)/2+1,end,arr);
		
		}
	}

	private static void divide(int start, int end, int[] arr) {
		if(start < end){
			divide(start,(start+end)/2,arr);
			divide((start+end)/2+1,end,arr);
		}
		merge(start,end,arr);
	}

	private static void merge(int start, int end, int[] arr) {
		if(start<end){
			for(int i=start;i<=end;i++){
				temp[i] = arr[i];
			}
			int i=start;
			int j=((start+end)/2)+1;
			int filler = start;		
			while(i<=j && j<=end){
				if(arr[i]>arr[j]){
					arr[filler] = temp[j];
					j++;
				}else{
					arr[filler] = temp[i];
					i++;
				}
				filler++;
			}
			while(i<=j){
				arr[filler] = temp[i];
				i++;
				filler++;
			}
		}
		
		
	}
}
