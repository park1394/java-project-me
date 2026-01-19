package _2_test_260114;

public class _4_Test_Array_Ex {

    //        예제 3: 배열 리턴 메서드 사용
    // 함수 정의
    public static int[] getData() {
        // 함수의 기능 -> 배열을 생성. 요소를 정수를 가지는 크기 가 3인 배열을 생성.
        return new int[]{5, 10, 15};
    }

    public static void main(String[] args) {
        // 예제 1: 배열 선언 후 출력
        System.out.println("예제 1: 배열 선언 후 출력");
        int[] nums = {10, 20, 30};
        for (int n : nums) { // 향상된 for , 배열의 모든 요소를 순회.
            // nums 배열에서, 요소를 하나씩 꺼내서 이용하기.
            System.out.println(n);
        }

// 예제 2: 2차원 배열 순회
        System.out.println("예제 2: 2차원 배열 순회");
        int[][] grid = {{1,2}, {3,4}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("예제 3: 배열 리턴 메서드 사용");
        //        예제 3: 배열 리턴 메서드 사용
        // static, main 메소드 밖으로 이동 했음.
        // getData() : 함수 사용.
        // 자바스크립트 , 함수 기억 ? 1) 함수 선언 2) 함수 사용(호출), 함수명 작성.
        int[] result = getData(); // 2)함수 사용 -> 함수의 정의로 이동함.
        // 컨트롤을 누른 상태에서, 함수명을 클릭 해보세요.
        int[] result2 = getData();
        int[] result3 = getData();
        System.out.println(result[1]); // 10
    }
}
