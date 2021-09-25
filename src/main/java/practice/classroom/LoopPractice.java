package practice.classroom;

public class LoopPractice {

    public static void main(String[] args) {

        //for(statement1; statement1; statement1){  }
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello, bay");
        }


        //i=0;
        //0<10 (true)
        //code is Executed

        //i=11
        //11,10 (false)
        //code is not Executed

        // beskonechnij
        //        for ( ; ; ) {
//            System.out.println("Hello, bay");
//        }

        String[] names = {"Alla", "Sasha", "Vova", "Masha", "Vova"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 4) {
                // num =numbers[1]
                System.out.println(numbers[i]);
            } else if (numbers[i] < 3) {
                System.out.println("Number less then 3: " + numbers[i]);
            } else {
                System.out.println("Other number: " + numbers[i]);
            }
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Vova"))
                System.out.println("I found Vova!");
        }

        for (String name : names) {  //v etom sluchae itteracija po vsemu massivu
            if (name.equals("Vova"))
                System.out.println(name);
        }

        System.out.println("=================");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }

}

