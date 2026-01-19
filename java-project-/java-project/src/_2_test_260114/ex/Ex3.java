package _2_test_260114.ex;

import java.util.Scanner;

public class Ex3 {



    public static void main(String[] args) {
        // 1. 스캐너 도구 이용
        Scanner scanner = new Scanner(System.in);

//        실습3
//        1)
//        사용자로부터 정수 5개를 입력받아 배열에 저장하고 역순 출력
//        힌트)
//        - 크기가 5개인 정수를 요소로 가지는 배열 생성
        int[] arr = new int[5];
        System.out.println("실습3-1, 숫자를 5개 입력해주세요: ");
//        - 스캐너를 이용해서, 입력받은 정수를 , 배열에 담기 , 반복문 활용
//        arr[0] = scanner.nextInt();
//        arr[1] = scanner.nextInt();
//        arr[2] = scanner.nextInt();
//        arr[3] = scanner.nextInt();
//        arr[4] = scanner.nextInt();
        //반복문 활용 해보기.
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
//                - 배열에서 꺼내서, 출력하기.
//        System.out.println("배열에서 요소 꺼내기 : " + arr[0]);
//        System.out.println("배열에서 요소 꺼내기 : " + arr[1]);
//        System.out.println("배열에서 요소 꺼내기 : " + arr[2]);
//        System.out.println("배열에서 요소 꺼내기 : " + arr[3]);
//        System.out.println("배열에서 요소 꺼내기 : " + arr[4]);

        for (int i = 4; i >= 0; i--) {
            System.out.println("배열에서 요소 꺼내기 : " + arr[i]);
        }

//        2)
//        3x3 배열(테이블, 행렬, 이중 배열)을 만들어 모든 요소에 1~9 채우고 출력
        System.out.println("실습3-2,  3x3 배열(테이블, 행렬, 이중 배열)을 만들어 모든 요소에 1~9 채우고 출력 ");
        // 순서1, 배열 생성
        int[][] grid = new int[3][3];

        // 순서2, 생성된 배열을 이중 for문을 이용해서, 값을 대입
        // 시작 값을 설정.
        int number = 1;
        // 행을 결정 for 문 , 바깥쪽 for
        for (int i = 0; i < 3; i++) {
            // 열을 결정 for 문, 안쪽  for
            for (int j = 0; j < 3; j++) {
                grid[i][j] = number++;
                // i = 0 일 때 , j = 0 ~ 2, [0][0], [0][1], [0][2]
                // i = 1 일 때 , j = 0 ~ 2, [1][0], [1][1], [1][2]
                // i = 2 일 때 , j = 0 ~ 2, [2][0], [2][1], [2][2]
            }
        }


        // 순서3, 생성된 배열을 이중 for 문을 이용해서, 값을 출력.
//        System.out.println(grid[0][0]);
//        System.out.println(grid[0][1]);
//        System.out.println(grid[0][2]);
//        System.out.println(grid[1][0]);
//        System.out.println(grid[1][1]);
//        System.out.println(grid[1][2]);
//        System.out.println(grid[2][0]);
//        System.out.println(grid[2][1]);
//        System.out.println(grid[2][2]);
        for (int[] row : grid) { // grid라는 행렬에서, 각 0행, 2행까지, 3개의 행을 꺼내기.
            for (int val : row) {
                System.out.println("배열의 요소 꺼내기 : " + val);
            }
        }

//
//        3)
//        문자열 배열을 메서드로 받아 가장 긴 문자열을 반환
//        힌트)
//        - 배열에서, 가장 긴 문자열을 반환하는 메서드를 생성합니다.
//        public static String 메서드명(String[] 배열이름)
//        - 반복문을 이용해서, 배열 안에 들어 있는 문자열 중에서 가장 긴 문자열 찾아서
//        배치. 배열의 길이를 이용하면. 배열. length()
        System.out.println("실습3-3, 문자열 배열을 메서드로 받아 가장 긴 문자열을 반환");
        // 함수 사용
        // 준비물 1) 샘플 배열(문자열을 요소로 가지는)
        String[] array = {"apple", "banana", "kiwi"};
        // 2) 함수 사용, 사용법 -> 함수이름(인자값)
        // getLongest(array) -> 기능이, 문자열을 반환, 반환된 값을 담을 변수가 필요함.
        String result = getLongest(array);
        System.out.println("실습 3-3 : 가장 긴 문자열은? " + result);

    }

    // - 배열에서, 가장 긴 문자열을 반환하는 메서드를 생성합니다.
    // 순서1
    // 함수 정의? O, 호출?X
    public static String getLongest(String[] words) {
        // 샘플 배열 생성.
//                                5        6         4
        // String[] words = {"apple", "banana", "kiwi"};
        //   배치. 배열의 길이를 이용하면. 배열. length()
        // 순서2, 가장 긴 문자열을 임시로 담을 변수 선언.
        String longest = "";
        // 순서3,
        // - 반복문을 이용해서, 배열 안에 들어 있는 문자열 중에서 가장 긴 문자열 찾아서
        for(String word: words) { // words 배열안에 문자열 요소를 순회를 돌면서, 요소를 하나씩 꺼내기
            if(word.length() > longest.length()) {
                // 시도1, word:"apple", longest : "", 5 > 0 , true , longest : "apple"
                // 시도2, word:"banana", longest : "apple", 6 > 5 , true , longest : "banana"
                // 시도3, word:"kiwi", longest : "banana", 4 > 6 , false , longest : "banana"
                longest = word;
            } // if 닫는 부분
        } // for 닫는 부분
        // 순서4, 반복문이 끝나면 반환하기
        return longest; // 메서드가 반환하는 문자열 의미.
    } // getLongest 메서드 닫는 부분


}
