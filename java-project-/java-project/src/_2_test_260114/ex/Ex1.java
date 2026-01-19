package _2_test_260114.ex;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // 1. 스캐너 도구 이용
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========실습 1-1==================");
//        1)나이를 입력받아 65세 이상이면 "노년층" 출력
        // 2. 입력 받기
        System.out.println("나이를 입력하세요(숫자만) : ");

        // 3. 스캐너 가져오기
        int age = scanner.nextInt();
        // 4. 출력
        if (age >= 65) {
            System.out.println("노년층입니다.");
        } else {
            System.out.println("노년층이 아닙니다.");
        }


//
//        2) switch 문으로 메뉴 선택
//        메뉴 번호에 따라서, 음식 메뉴 출력 하기.
//                입력 화면은, 메뉴 화면
//        1. 김밥 2. 국밥 3.칼국수 4.국수 등.
//        예시
//        case 1  김밥, 본인 원하는 메뉴 추가. 출력해보기.

        System.out.println("===========실습 1-2==================");
        // 2. 입력 받기
        System.out.println("============================== ");
        System.out.println("점심메뉴판 ");
        System.out.println("1. 김밥 2. 국밥 3.칼국수 4.국수 5.도시락 ");
        System.out.println("원하는 점심 메뉴를 선택해주세요(1~5) : ");
        System.out.println("============================== ");
        // 3. 스캐너 가져오기
        int menuNumber = scanner.nextInt();
        // 4. 출력
        switch (menuNumber) {
            case 1:
                System.out.println("김밥 메뉴를 선택했습니다. 가격은 3000원입니다.");
                break;
            case 2:
                System.out.println("국밥 메뉴를 선택했습니다. 가격은 9000원입니다.");
                break;
            case 3:
                System.out.println("칼국수 메뉴를 선택했습니다. 가격은 6000원입니다.");
                break;
            case 4:
                System.out.println("국수 메뉴를 선택했습니다. 가격은 5000원입니다.");
                break;
            case 5:
                System.out.println("도시락 메뉴를 선택했습니다. 가격은 0원입니다.");
                break;

        }



//
//        3)점수에 따라 A~F 등급 출력, if 문 이용해보기.
//        A: 90점이상
//        B: 80점이상
//        C: 70점이상
//        D: 60점이상
//        F: 나머지
        System.out.println("===========실습 1-3==================");
        // 2. 입력 받기
        // 점수 입력 받기.
        System.out.println("점수를 입력하세요(숫자만 :0 ~ 100) : ");
        // 3. 스캐너 가져오기
        int score = scanner.nextInt();
        // 4. 출력
        if(score >= 90) {
            System.out.println("점수 등급은 : A 입니다.");
        } else if (score >= 80) {
            System.out.println("점수 등급은 : B 입니다.");
        }
        else if (score >= 70) {
            System.out.println("점수 등급은 : C 입니다.");
        }
        else if (score >= 60) {
            System.out.println("점수 등급은 : D 입니다.");
        } else {
            System.out.println("점수 등급은 : F 입니다.");
        }
    // 최종 작업 후, 스캐너 도구 반납, 자원 반납.
    scanner.close();


    } // main
} // class
