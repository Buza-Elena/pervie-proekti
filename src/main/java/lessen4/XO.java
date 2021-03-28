package lessen4;

import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class XO {
    private static final char DEFAULT = '_';
    private static final char X = 'X';
    private static final char O = 'O';
    private static final int SIZE = 4;
    private static final char[][] MAP = new char[SIZE][SIZE];

}
    /**
     * _ _ _ x
     * _ _ _ 0
     * _ _ _ 0
     * _ _ _ x
     **/
    public static void intMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; i++) {
                    MAP[i][j] = DEFAULT;
                }
            }
        }
    private static void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; i++) {
                    System.out.println(MAP[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    initMap();
    private static void game(Scanner in) {
        
        System.out.println("Игра Крестики Нолики");
        System.out.println("Для хода необходимо ввести номер строки и номер столбца");
        int stepCounter = 0;
        while (true) {
            System.out.println("Baаш ход: ");
            String line = in.nextLine(); String[] args = line.split(" ");
            if (args.length != 3) {
                System.out.println("Введите два числа");
                continue;
            } else {
                try {
                    int x = Integer.parseInt(args[0]); int y = Integer.parseInt(args[1]);
                    x--; y--;
                }
                    if (isVelid(x, y)) {
                        makeStep(x, y, X);
                        stepCounter++;
                        System.out.println();
                    }
                        if (checkVictory(X)) {
                            System.out.println("Вы победили");
                            return;
                        }
                        if (stepCounter == 16){
                            System.out.println("ничья");
                            return;
                        }
                        System.out.println("Ход компьютора");
                        
                        joke();
                        movePC();
                        stepCounter++;
                        if (chekVictory(0)){
                            System.out.println("Вы ппроиграли");
                            return;
                        }
                     else {
                        System.out.println("Некорректный ход.\n" +
                                "Введите два с числа от 1 до 4");
                    }
                     (Exception e){
                        System.out.println("Введите два числа");
                        continue;
                    }
                }
            }
    private static boolean isVelid(int x, int y) {
    }
}

    private static void initMap() {
    }

    private static void joke() {
        TimeUnit.MILLISECONDS.sleep(300);
        System.out.println("Думаю о природе");
        TimeUnit.MILLISECONDS.sleep(300);
        System.out.println("Туалет");
        imeUnit.MILLISECONDS.sleep(300);
        System.out.println("Смотрю в глаза");
        imeUnit.MILLISECONDS.sleep(300);
        System.out.println("Гулять пошли");
        imeUnit.MILLISECONDS.sleep(300);
        System.out.println("Ту");
    }
    }

    private static void movePC() {
        for (int i = 0; i < SIZE; i++) {
         for (int j =0; j < SIZE; j++) {
         if (MAP [i] [j] == DEFAULT){
            makeStep(i,j,0);
            return;
         }
        }
    }
    private static void initMap() {
    }
    private static boolean checkVictory(char x) {
        // нфписать логику
        return false;
    }
    private static void makeStep ( int x, int y, char sym){
        MAP[x] [y] = sym;
    }
    private static boolean isVelid ( int x, int y){
        return x >= 0 && x <= SIZE && y >= 0 & y < SIZE;
    }
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       geme(in);
    }

}

    private static void joke() {
    }

    private static void movePC() {
    }

    private static void chekVictory() {
    }

    private static void makeStep() {
    }

    private static void initMap() {
    }

    private static void initMap() {
    }

    private static void isVelid() {
    }