package _5_test_260119.ex;

public class _2_Main_Ex2 {
    public static void main(String[] args) {
//        실습2
//        배열에서  instanceof로 타입 구별 출력
//        1) Animal 클래스 부모 타입으로 배열 = aniList 을 생성함.
        //        2) Animal 클래스를 상속 받은 자식 클래스 : Dog, Cat,
        //       aniList 배열에, 요소로, Dog 타입도,Cat 타입도, Animal 타입도 요소를 담기.
        _2_Animal_Ex2[] aniList = {
                new _2_Dog_Ex2(),
                new _2_Cat_Ex2(),
                new _2_Animal_Ex2()
        };

//        3) 반복문을 이용하고, instanceof를 이용해서,
//                각 타입을 확인 후, 각 타입에 맞는 내용을 호출하기.
        for(_2_Animal_Ex2 animal :aniList) {
            if(animal instanceof _2_Dog_Ex2) {
                _2_Dog_Ex2 dog1 = (_2_Dog_Ex2) animal;
                dog1.sound();
            } else if (animal instanceof _2_Cat_Ex2) {
                _2_Cat_Ex2 cat1 = (_2_Cat_Ex2) animal;
                cat1.sound();
            } else {
                _2_Animal_Ex2 animal1 = (_2_Animal_Ex2) animal;
                animal1.sound();
            }
        }

    }
}
