package answer;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nguyễn Phương Anh Việt - 2C17 - Tutorial 5");
        System.out.println("Activity 1:");
        int year = 2018;
        if (year % 4 != 0)
            System.out.println(year + " is not a leap year.");
        else if (year % 100 != 0)
            System.out.println(year + " is a leap year.");
        else if (year % 400 != 0)
            System.out.println(year + " is not a leap year.");
        else System.out.println(year + " is a leap year.");

        System.out.println("Activity 2:");
        System.out.println("ax^2 + bx + c = 0");
        double a = 2, b = 2, c = -4;
        double square = Math.pow(b, 2);
        double Delta = square - 4 * a * c;
        if (a == 0 && b == 0 && c == 0)
            System.out.println("The equation has infinitely many roots");
        else if (a == 0 && b == 0)
            System.out.println("The equation has no root.");
        else if (a == 0)
            System.out.println("x = " + -c / b);
        else if (Delta < 0)
            System.out.println("The equation has no real variable.");
        else {
            double x1 = ((-b + Math.sqrt(Delta)) / 2 / a);
            double x2 = ((-b - Math.sqrt(Delta)) / 2 / a);
            System.out.println("The equation has two roots:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
