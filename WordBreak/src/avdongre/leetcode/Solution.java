package avdongre.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public boolean wordBreak(String s, Set<String> dict) {
		if ( s == null || s.isEmpty()) {
			return false;
		}
		for ( int i = 0; i < s.length(); i++) {
			//StringBuilder sb
		}
		return false;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		{
			Set<String> dict = new HashSet<String>();
			dict.add("leet");
			dict.add("code");
			System.out.println(s.wordBreak("leetcode", dict));
		}
	}

}

