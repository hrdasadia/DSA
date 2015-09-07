package CTCI;

import java.util.Stack;

public class Solution1626 {

	public static void main(String[] args) {
		String input = "2*3+5/6*3+15";
		double answer = calculate(input);
		System.out.println(answer);
	}

	public static double calculate(String input) {
		Stack<String> s1 = new Stack<String>();
		Stack<String> s2 = new Stack<String>();
		if (input == null || input.length() == 0) {
			return 0.0;
		}
		String num = "";
		String ops = "";
		for (int i = 0; i < input.length(); i++) {
			char current = input.charAt(i);

			if (current == '*' || current == '+' || current == '-'
					|| current == '/') {
				ops = ops + Character.toString(current);
				s1.push(num);
				num = "";
				s1.push(ops);
				ops = "";
			} else {
				num = num + Character.toString(current);
			}

		}
		s1.push(num);
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		num = "";
		ops = "";
		while (!s2.isEmpty()) {
			String op1 = (s1.isEmpty()?s2.pop():s1.pop());
			String opr = s2.pop();
			String op2 = s2.pop();
			if (opr.equals("*")) {
				double result = Double.parseDouble(op1)
						* Double.parseDouble(op2);
				s1.push(Double.toString(result));
			} else if (opr.equals("/")) {
				double result = Double.parseDouble(op1)
						/ Double.parseDouble(op2);
				s1.push(Double.toString(result));
			} else {
				s1.push(op1);
				s1.push(opr);
				s1.push(op2);
			}
		}
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		while (!s2.isEmpty()) {
			String op1 = (s1.isEmpty()?s2.pop():s1.pop());
			String opr = s2.pop();
			String op2 = s2.pop();
			if (opr.equals("+")) {
				double result = Double.parseDouble(op1)
						+ Double.parseDouble(op2);
				s1.push(Double.toString(result));
			} else if (opr.equals("-")) {
				double result = Double.parseDouble(op1)
						- Double.parseDouble(op2);
				s1.push(Double.toString(result));
			}
		}

		return Double.parseDouble(s1.pop());
	}
}
