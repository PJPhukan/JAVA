/**
 * INHEITANCE IN JAVA
 * Types of inheritance :->
 * i) Single inheritance ,
 * ii) Multiple inheritance ,
 * iii) Multilevel inheritance ,
 * iv) Hierarchical inheritance and
 * v) Hybrid inheritance
 */

// (i) SINGLE INHERITANCE:A class can inherit from only one superclass. For
// example---

// base class
class Bicycle {
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String toString() {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}

// derived class
class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int gear, int speed,
            int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}

// ii) MULTILEVEL INHERITANCE :A class can inherit from another class which in
// turn inherits from another class. For example---

class GrandParent {
    // GrandParent methods and fields
}

class Parent extends GrandParent {
    // Parent methods and fields
}

class Child extends Parent {
    // Child methods and fields
}

// (iii) HIERARACHICAL INHERITANCE: Multiple classes inherit from a single
// superclass. For example---

class Animal {
    // Animal methods and fields
}

class Dog extends Animal {
    // Dog methods and fields
}

class Cat extends Animal {
    // Cat methods and fields
}

// (iv) MULTIPLE INHERITANCE (through interfaces):Java doesn't support multiple
// inheritance directly for classes due to the diamond problem, but it allows
// multiple inheritance through interfaces. For example--
interface Interface1 {
    // Interface1 methods
}

interface Interface2 {
    // Interface2 methods
}

class MyClass implements Interface1, Interface2 {
    // MyClass methods and fields
}



// (v) HYBRID INHERITANCE : In Java, hybrid inheritance typically involves combining different types of class inheritance (like single, multilevel, or hierarchical inheritance) along with implementing interfaces. The interface part is crucial for the "hybrid" aspect because Java doesn't directly support multiple inheritance for classes.

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven");
    }
}

class Bus extends Vehicle {
    void stop() {
        System.out.println("Bus stopped");
    }
}

class HybridCar extends Car {
    void chargeBattery() {
        System.out.println("Battery charging");
    }
}

class HybridBus extends Bus {
    void switchToElectricMode() {
        System.out.println("Switching to electric mode");
    }
}



public class Inheritance {
    public static void main(String arg[]) {
        MountainBike obj = new MountainBike(2, 10, 300);
        System.out.println(obj.toString());
        HybridCar hybridCar = new HybridCar();
        hybridCar.start();
        hybridCar.drive();
        hybridCar.chargeBattery();

        HybridBus hybridBus = new HybridBus();
        hybridBus.start();
        hybridBus.stop();
        hybridBus.switchToElectricMode(); 
    }
}
