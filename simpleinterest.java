class SimpleInterestCalc {
    int p, r, t;

    void calculate() {
        int si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
    }
}

class Rectangle {
    int l, b;

    void area() {
        System.out.println("Area: " + (l * b));
    }

    void perimeter() {
        System.out.println("Perimeter: " + (2 * (l + b)));
    }
}

class Triangle {
    int b, h;

    void area() {
        System.out.println("Area: " + (0.5 * b * h));
    }

    void perimeter() {
        System.out.println("Perimeter: " + (b + h + Math.sqrt(b * b + h * h)));
    }
}

class StudentAverage {
    int s1, s2, s3;

    void average() {
        int sum = s1 + s2 + s3;
        System.out.println("Average: " + (sum / 3));
    }
}

public class simpleinterest {
    public static void main(String[] args) {
        SimpleInterestCalc si = new SimpleInterestCalc();
        si.p = 1000;
        si.r = 10;
        si.t = 2;
        si.calculate();

        Rectangle rect = new Rectangle();
        rect.l = 10;
        rect.b = 5;
        rect.area();
        rect.perimeter();

        Triangle tri = new Triangle();
        tri.b = 3;
        tri.h = 4;
        tri.area();
        tri.perimeter();

        StudentAverage sa = new StudentAverage();
        sa.s1 = 80;
        sa.s2 = 90;
        sa.s3 = 70;
        sa.average();
    }
}
