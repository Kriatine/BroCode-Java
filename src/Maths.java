public class Maths {
    static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2, 5); // Power
        double absolute = Math.abs(-4); // Absolute
        double squareroot = Math.sqrt(121);
        double round = Math.round(4.15);
        double ceiling = Math.ceil(4.15);
        double floor = Math.floor(3.99);
        double maximum = Math.max(10, 20); // Determines which number is bigger
        double minimum = Math.min(10, 20);
        double nearest = Math.rint(4.52); // Rounds to nearest integer. If it is equally close to two of them, it will round to the even number

        System.out.println(result);
        System.out.println(absolute);
        System.out.println(squareroot);
        System.out.println(round);
        System.out.println(ceiling);
        System.out.println(floor);
        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(nearest);
    }
}
