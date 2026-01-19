package _5_test_260119;

public class _1_2_Test_AnimalMain_Ex {
    public static void main(String[] args) {
        _1_2_Test_Cat_Ex cat1 = new _1_2_Test_Cat_Ex();
        //cat1 은 타입 : _1_2_Test_Cat_Ex , 본인 타입임.
        cat1.sound();

        // 작은 타입 -> 큰 타입 : 업 캐스팅.
        //cat2 은 타입 : _1_2_Test_Animal_Ex , 부모 타입임.
        _1_2_Test_Animal_Ex cat2 = new _1_2_Test_Cat_Ex();
        cat2.sound();

        // 타입 검사 해보기.
        if (cat2 instanceof _1_2_Test_Cat_Ex) {
            // 큰 타입 -> 작은 타입 : 다운 캐스팅.
            _1_2_Test_Cat_Ex c = (_1_2_Test_Cat_Ex) cat2;
            System.out.println("_1_2_Test_Cat_Ex 타입입니다.");
        }

    }
}
