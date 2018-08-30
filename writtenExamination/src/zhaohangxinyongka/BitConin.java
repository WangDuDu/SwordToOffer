package zhaohangxinyongka;

import java.util.Scanner;

/**
 * Created by wangshuyang on 2018-8-30.
 */
public class BitConin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String stringArray[] = string.split(" ");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        int min = intArray[0] > intArray[1] ? intArray[1] : intArray[0];
        int difference = intArray[1] - intArray[0];
        for (int i = 2; i < intArray.length; i++) {
            min = min < intArray[i] ? min : intArray[i];
            difference = (intArray[i] - min) > difference ? intArray[i] - min : difference;
        }
        System.out.println(difference);

    }
}
