package CTCI;

public class Solution19 {

	public static void main(String[] args) {
		String s1 = "eaterbottlw";
		String s2 = "erbottlewat";
		
		System.out.println(isRotated(s1, s2));
		
	}

	public static boolean isRotated (String s1, String s2){
		if(s1==null||s2==null){
			return false;
		}
			if(s1.length()==s2.length()){
			String match = s2+s2;
			if(match.contains(s1)){
			return true;
		}
		}
		return false;
		}

}
