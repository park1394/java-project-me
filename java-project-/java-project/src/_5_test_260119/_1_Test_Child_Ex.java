package _5_test_260119;

public class _1_Test_Child_Ex extends _1_Test_Parent_Ex{
    _1_Test_Child_Ex() {
        //super() 부모 생성자 호출이 생략이 되어있다.
        // 상속 받은 자식 클래스의 생성자를 호출시, 반드시) 부모 클래스의 생성자를 먼저 호출한다.
        System.out.println("자식 생성자 호출");
    }
}
