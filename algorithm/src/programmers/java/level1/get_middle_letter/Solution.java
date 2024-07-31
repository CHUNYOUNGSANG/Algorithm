package programmers.java.level1.get_middle_letter;

class Solution {
    public String solution(String s) {
        int length = s.length();
        int middle = length / 2;

        if (length % 2 == 0) {
            return s.substring(middle - 1, middle + 1);
        } else {
            return String.valueOf(s.charAt(middle));
        }
    }
}
