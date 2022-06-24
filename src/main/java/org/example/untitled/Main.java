package org.example.untitled;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello :>");
        Car car1 = new Car();
        car1.number = 1;
        car1.speed = 230;

        Car car2 = new Car();
        car2.number = 2;
        car2.speed = 210;

        car1.달리다();
        car2.달리다();
    }

}

class Car {
    int number;
    int speed;

    void 달리다() {
        System.out.printf("%d번 자동차가 최고속력 %dkm로 달립니다.\n", number, speed);
    }
}
