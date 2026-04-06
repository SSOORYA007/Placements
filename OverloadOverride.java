class Shape {
    double area(double radius) {
        return 3.14 * radius * radius;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(double base, double height, int flag) {
        return 0.5 * base * height;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        super.sound();
        System.out.println("Cat meows");
    }
}

public class OverloadOverride {
    public static void main(String[] args) {

        System.out.println(" Method Overloading (Area of Shapes) ");
        Shape s = new Shape();
        System.out.println("Area of Circle (r=5)          = " + s.area(5));
        System.out.println("Area of Rectangle (4 x 6)     = " + s.area(4, 6));
        System.out.println("Area of Triangle (b=3, h=8)   = " + s.area(3, 8, 1));

        System.out.println("\n Method Overriding");
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();

        // a.sound();
        d.sound();
        c.sound();
    }
}
