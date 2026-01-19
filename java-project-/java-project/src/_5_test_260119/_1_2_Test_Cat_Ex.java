package _5_test_260119;

public class _1_2_Test_Cat_Ex extends _1_2_Test_Animal_Ex{
    @Override
    public void sound() {
        // 부모의 기능에도, 이름: sound() 있지만, 재정의를 하면,
        // 자식의 재정의한 기능을 사용함.
        // 만약, 자식 클래스 , 재정의를 안하면, 그 때는 부모의 기능을 사용함.
        System.out.println("야옹~");
    }
}
