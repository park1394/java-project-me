package _2_test_260114;

public class _3_Test_Loop_for_while_Ex {
    public static void main(String[] args) {
//        기본예시
//        1)
        System.out.println("기본 for 문 확인");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
//        2)
//        1~10 중 홀수만 출력
        System.out.println("기본 for 문 2 continue 확인");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
//        3)
//        1~10 중 6에서 멈추기
        System.out.println("기본 for 문 3 break 확인");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) break;
            System.out.println(i);
        }
    }
}
