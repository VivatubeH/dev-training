package oop.step3_polymorphism;

public class Main {
    public static void main(String[] args) {
        // 다형성 : 부모 타입 Animal로 자식인 Dog, Cat, Cow를 모두 다룰수있다.
        // 즉, 다루는 방식은 동일하되 내부 실제 동작은 객체 마다 상이하다.
        // 오버라이딩을 통해 가능함.
        Animal[] animals = {
                new Dog("초코"),
                new Cat("나비"),
                new Cow("얼룩이")
        };

        // 향상된 for문: 인덱스 없이 배열의 요소를 순차적으로 꺼내서 사용한다.
        // 단순 순회에 적합하며, 현재 몇 번째 요소인지는 직접 알 수 없다.
        // 단, 요소가 객체라면 그 객체의 상태를 바꾸는 메서드 호출은 가능하다.
        /*
            예)
            for (BankAccount account : accounts) {
                account.deposit(1000);
            }
         */
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
