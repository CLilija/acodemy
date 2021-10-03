package practice.classroom;

public class LoopSecondPractice {
    public static void main(String[] args) {

      /* while (condition) { //condition - true or false
      code block
      counter update
      }
       */
        int i = 1;
        while (i <= 10) {
            System.out.println("Hello world!");
            i++;
        }

        boolean isStudent = false;
        while (!isStudent) {
            System.out.println("Is not the student");
            isStudent = true;
        }

        String[] animals = {"Cat", "Dog", "Panda", "Leon", "Manky"};

        boolean isFound = false;

        while (!isFound) {
            for (String animal : animals) {
                if (animal.equals("Panda")) {
                    System.out.println("Found Panda!");
                    isFound = true;
                }
            }
        }

        int x = 5;
        while (x >= 0) {
            System.out.println(x);
            --x; //=x--
        }
        for (int y = 5; y >= 0; y--) {
            System.out.println(y);
        }

        int[] nums = {30, 10, 20, 10, 40};//110
        int b = 0;
        int sum = 0;
        while (b < nums.length) {
            sum = sum + nums[b];
            b++;
        }
        System.out.println("Sum of the numbers: " + sum);

        /*
        do {//do something } while (condition)
         */

        int counter = 20;
        do {
            System.out.println("Current number is: " + counter);
            counter--;
        } while (counter > 0);

    }
}
