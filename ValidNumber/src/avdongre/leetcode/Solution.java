package avdongre.leetcode;

/******************************************
 * Validate if a given string is numeric.
 * 
 * Some examples: "0" => true " 0.1 " => true "abc" => false "1 a" => false
 * "2e10" => true
 ******************************************/

public class Solution {
	public boolean isNumber(String s) {

		s = s.trim();
		if (s.isEmpty()) {
			return false;
		}

		String regex = "[-+]?(\\d+\\.?|\\.\\d+)\\d*(e[-+]?\\d+)?";
		if (s.matches(regex)) {
			return true;
		} else {
			return false;
		}

	}
}