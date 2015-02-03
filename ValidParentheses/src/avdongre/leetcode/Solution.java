package avdongre.leetcode;

/**************************************************************************************
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not.
 **************************************************************************************/

public class Solution {
	public boolean isValid(String s) {

		java.util.Map<Character, Character> mp = new java.util.HashMap<Character, Character>();
		mp.put('(', ')');
		mp.put('[', ']');
		mp.put('{', '}');

		java.util.Stack<Character> stack = new java.util.Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char currentCharacter = s.charAt(i);
			if (mp.keySet().contains(currentCharacter)) {
				stack.push(currentCharacter);
			} else if (mp.values().contains(currentCharacter)) {
				if (!stack.empty() && mp.get(stack.peek()) == currentCharacter) {
					stack.pop();
				} else {
					return false;
				}
			}
		}

		return stack.isEmpty();

	}
}