package IdeaProjects;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //           задача 1
        int[] arr = new int[30];
        arr[0] = 100000;
        arr[1] = 110000;
        arr[2] = 120000;
        arr[3] = 130000;
        arr[4] = 140000;
        arr[5] = 150000;
        arr[6] = 160000;
        arr[7] = 170000;
        arr[8] = 180000;
        arr[9] = 190000;
        arr[10] = 110010;
        arr[11] = 110011;
        arr[12] = 110012;
        arr[13] = 110013;
        arr[14] = 110014;
        arr[15] = 110015;
        arr[16] = 110016;
        arr[17] = 110017;
        arr[18] = 110018;
        arr[19] = 110019;
        arr[20] = 110020;
        arr[21] = 110021;
        arr[22] = 110023;
        arr[23] = 110023;
        arr[24] = 110025;
        arr[25] = 110024;
        arr[26] = 110027;
        arr[27] = 110200;
        arr[28] = 199999;
        arr[29] = 199900;
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("summa zatrat za mesiac " + sum + " rub");

        //           задача 2

        int maxExpenses = 99999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxExpenses) {
                maxExpenses = arr[i];
            }
        }
        System.out.println("max zatrat bilo " + maxExpenses + " rub");

        int minExpenses = 200000;
        for (int j : arr) {
            if (j <= minExpenses) {
                minExpenses = j;
            }
        }
        System.out.println("min zatrat bilo " + minExpenses + " rub");

        //           задача 3

        double average = sum / arr.length;
        System.out.println("srednee zna4inie " + average + " rub");

        //           задача 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int length = 0;
        for (int element : reverseFullName) {
            length++;
        }
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}