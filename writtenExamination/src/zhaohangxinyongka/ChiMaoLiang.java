package zhaohangxinyongka;

import java.util.Scanner;

/**
 * Created by wangshuyang on 2018-8-30.
 */
public class ChiMaoLiang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String stringArray[] = string.split(" ");
        int[] intArray = new int[stringArray.length];
        int sum = 0;
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
            sum += intArray[i];
        }
        int H = scanner.nextInt();
        int min = sum / H;

    }
}
