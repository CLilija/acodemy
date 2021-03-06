package practice.classroom;

public class PrimitiveType {

    public static void main(String[] args) {

        System.out.println("Hello World");

        //Double primitive type practice

        double doubleMinValue = Double.MIN_VALUE;
        System.out.println(doubleMinValue);

        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println(doubleMaxValue);

        double doubleValue = 1337.13;
        System.out.println(doubleValue);

        //Float primitive type practice

        float floatMinValue = Float.MIN_VALUE;
        System.out.println(floatMinValue);

        float floatMaxValue = Float.MAX_VALUE;
        System.out.println(floatMaxValue);

        float floatValue = 1000.1f;
        System.out.println(floatValue);

        //Int primitive type practice
        int minIntValue = Integer.MIN_VALUE;
        System.out.println(minIntValue);

        int maxIntValue = Integer.MAX_VALUE;
        System.out.println(maxIntValue);

        int firstVariable = 200;
        int secondVariable = 400;
        System.out.println(Integer.max(firstVariable, secondVariable));
        System.out.println(Math.max(firstVariable, secondVariable));
        System.out.println(Integer.max(201, 401));
        System.out.println(Integer.compare(firstVariable,secondVariable));
        System.out.println(Integer.compare(secondVariable,secondVariable));
        System.out.println(Integer.compare(secondVariable,firstVariable));

        //String
        String myName = "Lilija";
        String lastName = "Cipiseva";
        System.out.println(myName + " " + lastName);
        System.out.printf("%s %s\n", myName, lastName);
        String nameAndUserName = String.format("%s %s\n", myName, lastName);
        System.out.println(nameAndUserName);

       //boolean
        boolean isStudent = false;

    }

}
