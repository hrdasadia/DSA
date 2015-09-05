package CTCI;

public class Solution16 {

	public static void main(String[] args) {
		String input = "aabcccccaaa";
		System.out.println("input="+input);
		System.out.println("output="+compress(input));
		
		input = "abcdeff";
		System.out.println("input="+input);
		System.out.println("output="+compress(input));

		input = "aabbccddeeff";
		System.out.println("input="+input);
		System.out.println("output="+compress(input));
		
	}

	public static String compress (String input){
		if(input==null || input.length() <=1){
			return input;
		}	

			int current = 0;
			int runner = 0;
			StringBuilder sb = new StringBuilder();
			while(current<input.length()){
				int repeat = 0;
				while(runner<input.length() && input.charAt(current)==input.charAt(runner)){
						repeat++;
						runner++;
				}
				sb.append(Character.toString(input.charAt(current)));
				sb.append(Integer.toString(repeat));
				current=runner;
		}
			if(sb.toString().length() < input.length()){
			return sb.toString();
		}
			return input;
		}

}
