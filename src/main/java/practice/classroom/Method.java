package practice.classroom;

public class Method {
    public static void main(String[] args) {
        int y = 1;
        int x = 2;
        int z = y + x;
        System.out.println("Your result: " + z);
        sum(1, 10);

        int n = returnSum(1, 10);
        System.out.println("Your result: " + n);

        printName("Nikita");

        String Albert = name("Albert");
        System.out.println(Albert);
    }

    public static void sum(int firstNumber, int sekondNumber) {
        int result = firstNumber + sekondNumber;
        System.out.println("Your result: " + result);
    }

    public static int returnSum(int firstNumber, int sekondNumber) {
        return firstNumber + sekondNumber;
    }

    public static void printName(String name) {
        System.out.println("Print you name: " + name);
    }

    public static String name(String name) {
        printName(name);
        return name;
    }

}
