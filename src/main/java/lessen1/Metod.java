package lessen1;

import java.util.Scanner;

public class Metod {

    static void showValue (int value){
        //если В больше нуля вывести положительное
        // иначеесли равен нулю вывести ноль
        //иначе вывести отрицательное
        if (value>0) {
            System.out.println("Положительное");
        } else if (value==0){
            System.out.println("Ноль");}
        else  if (value<0) {
            System.out.println("Отрицательное");
        }

        }
    static boolean isPosition(int value) {
        return value > 0;
    }
    static void showAsText(int digit){
        //полусим 1 вывод один
        // 2- два
        switch (digit){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");


        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        showValue(value);
        System.out.println(isPosition(value));
        showAsText(value);

    //showValue(4);
    //showValue(-5);
    //showValue(0);

    }
}
