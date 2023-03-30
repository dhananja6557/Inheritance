public class Vehicle {
    void drive() {
        System.out.println("Driving!");
    }
    void vBreak() {
        System.out.println("Driving!");
    }
    void reverse() {
        System.out.println("Reverse!");
    }
}
class Car extends Vehicle {
    void motorRacing() {
        System.out.println("Racing!");
    }
}
class ModernCar extends Car {
    void flying() {
        System.out.println("Flying!");
    }
}
class Boat extends Vehicle {
    void surf() {
        System.out.println("Surfing!");
    }
}
class ModernBoat extends Boat {
    void landRiding() {
        System.out.println("Riding!");
    }
}
class TestOutput {
    public static void main(String[] args) {
        ModernCar mc = new ModernCar();
        ModernBoat mb = new ModernBoat();
        mc.flying();
        mc.drive();
        mc.motorRacing();
        mc.reverse();
        mc.vBreak();
        mb.surf();
        mb.drive();
        mb.landRiding();
        mb.reverse();
        mb.vBreak();
    }
}
