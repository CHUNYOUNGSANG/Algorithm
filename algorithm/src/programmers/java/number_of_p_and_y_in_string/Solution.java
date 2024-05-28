package programmers.java.number_of_p_and_y_in_string;

class Solution {
    boolean solution (String s) {
        String[] arr = s.toLowerCase().split("");
        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if ("p".equals(arr[i])) {
                pCount++;
            }
            else if ("y".equals(arr[i])) {
                yCount++;
            }
        }
        if (pCount != yCount) {
            return false;
        }
        return true;
    }
}
