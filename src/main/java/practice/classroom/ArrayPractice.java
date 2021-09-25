package practice.classroom;

import java.sql.Array;
import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {

        //data type
        //[]
        //name
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        int firstNumber = numbers[0];
        System.out.println(firstNumber);

        int[] arrayOfNumbers = new int[3];
        arrayOfNumbers[0] = 5;
        arrayOfNumbers[1] = 3;
        arrayOfNumbers[2] = 2;
        System.out.println(Arrays.toString(arrayOfNumbers));

        String[] names = {"Nik", "Mik", "Andrey", "Mark"};
        String[] emptyArray = new String[4];
        emptyArray[0] = "Nik";
        emptyArray[1] = "Andrey";
        emptyArray[2] = "Nikita";
        emptyArray[3] = "Markus";
        //emptyArray[4] = "Nika";
        System.out.println(Arrays.toString(emptyArray));

        boolean[] booleanArray = {true,false,false,true,true};
        boolean isAutumn = booleanArray[0];
        boolean isHotOutside = booleanArray[2];
        System.out.printf("Outside is quite hot: %s", isHotOutside);
        }

    }




