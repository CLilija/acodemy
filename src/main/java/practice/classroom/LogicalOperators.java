package practice.classroom;

public class LogicalOperators {
    public static void main(String[] args) {


        //Conditional statement
        //operator: if
        //switch

        boolean isStudent = true;

        if (isStudent) {
            System.out.println("He can ask for ISIC card");
        }
        boolean isOtherStudent = false;

        if (!isOtherStudent) {
            System.out.println("He can ask for ISIC card");
        }
        boolean result = 10 > 0;
        if (10 < 11) {
            System.out.println("Yes, 10 < 11, is  " + result);
        }
        //Boolean Variable Expression
        boolean isEmployee = true;
        if (isEmployee) {
            System.out.println("Yes, this person is {COMPANY} employee");
        } else {
            System.out.println("No, this person is not {COMPANY} employee");
        }

        //Inline Expression
        if (10 < 0) {
            System.out.println("Yes, this is true");
        } else {
            System.out.println("No, it is false");
        }

        //Logical operators AND and OR
        int speedMercedes = 40;
        int speedBmw = 50;
        int speedPorche = 200;
        int speedMcLaren = 200;

        if (speedBmw > speedMercedes && speedBmw > speedPorche) {
            System.out.println("Yes, bmw speed is greater than mercedes and greater than porche");
        } else {
            System.out.println("Something went wrong");
        }

        if (speedBmw > speedMercedes || speedBmw > speedPorche) {
            System.out.println("Yes, bmw speed is greater than mercedes and greater than porche");
        } else {
            System.out.println("Something went wrong");
        }

        boolean isThisStudent = false;
        boolean isLecturer = false;

        if (isLecturer) {
            System.out.println("Yes, this person is a Lecturer");
        } else if (isThisStudent) {
            System.out.println("Yes, this is Student");
        } else {
            System.out.println("Go out!");
        }

        //operator: switch
        int ukSize = 6;
        int euSize;
        switch (ukSize) {
            case 6:
                euSize = 39;
                System.out.println("EU Size: " + euSize);
                break;
            case 7:
                euSize = (int) 40.5;
                System.out.println("EU Size: " + euSize);
                break;
            default:
                System.out.println("Cannot find proper size");
        }
    }


}
