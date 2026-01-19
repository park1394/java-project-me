package _2_test_260114.ex;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
//        실습2
//        1)1~100까지의 합 출력
//        힌트 for 문 활용
        System.out.println("=========실습2-1====================");
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += i; //sum = sum + i;
        }
        System.out.println("1~100까지의 총합 sum : " + sum);
//
//        2)사용자로부터 양수만 입력받고 음수가 입력되면 종료
//        힌트 do-while 문 활용
        System.out.println("=========실습2-2====================");
        // 1. 스캐너 도구 이용
        Scanner scanner = new Scanner(System.in);
        // 2. 입력 받기
        System.out.println("숫자를 입력하세요(숫자만),음수를 입력시 종료됩니다. : ");

        // 3. 스캐너 가져오기

        do {
            int number = scanner.nextInt();
            if(number <0) {
                System.out.println("음수를 입력시 종료합니다.");
                break;
            } else {
                System.out.println("입력한 값은 : " + number);
                System.out.println("숫자를 입력하세요(숫자만),음수를 입력시 종료됩니다. : ");
            }
        } while (true);
//
//        3)1~50 사이에서 7의 배수만 출력하되, 30이 넘으면 종료
//        힌트 for 문 활용
        System.out.println("=========실습2-3====================");
        for (int i = 1; i <= 50; i++) {
            if (i >30) {
                System.out.println("30초과시 종료합니다.");
                break; // for 문 탈출
            } else if(i % 7 != 0) { // 7의 배수가 아닌 경우, 다음 반복으로 진행.
                System.out.println("7의 배수가 아닙니다. " + i);
                continue;
            }
            // 30보다 작고, 7의 배수인경우.
            System.out.println("출력 값: " + i);

        }
    }
}
