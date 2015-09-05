package CTCI;

import java.util.HashSet;
import java.util.Set;

public class Solution18 {

	public static void main(String[] args) {
		int[][] input = new int[5][5];
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input[i].length;j++){
				input[i][j] = 1;
			}
		}
		input[0][1] = 0;
		input[2][3] = 0;
		
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input[i].length;j++){
				System.out.print(input[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		input = zero(input);
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input[i].length;j++){
				System.out.print(input[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] zero (int[][] input){
		if(input==null || input.length == 0){
		return input;
	}
		
	Set<Integer> rows = new HashSet<Integer>();
		Set<Integer> cols = new HashSet<Integer>();

		for(int i=0;i<input.length;i++){
		for(int j=0;j<input[i].length;j++){
			if(input[i][j] == 0){
		rows.add(i);
		cols.add(j);
	}
	}
	}

		for(int i=0;i<input.length;i++){
		for(int j=0;j<input[i].length;j++){
			if(rows.contains(i) || cols.contains(j)){
		input[i][j] = 0;
	}
	}
	}
		
		return input;
	}

}
