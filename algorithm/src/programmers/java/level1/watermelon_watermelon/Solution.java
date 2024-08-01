package programmers.java.level1.watermelon_watermelon;

class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer.append("수");
            } else {
                answer.append("박");
            }
        }
        return answer.toString();
    }

    // 테스트 메서드
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(3)); // 출력: "수박수"
        System.out.println(sol.solution(4)); // 출력: "수박수박"
    }
}