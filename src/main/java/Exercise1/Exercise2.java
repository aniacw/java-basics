package Exercise1;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number");
        int number = scanner.nextInt();
        int[] userInput = new int[20];
        int index = 0;
        userInput[index] = number;

        int readNumber = 0;
        for (int i = 0; i<userInput.length; i++){
                readNumber = scanner.nextInt();
                if(readNumber>=1) {
                    userInput[index] = readNumber;
                }else break;
        }

        Random random = new Random();
        int highestNumber = 0;
        for(int m = 0; m<userInput.length; m++){
            if(userInput[m]>highestNumber) {
                highestNumber = userInput[m];
                System.out.println("highest number:" + highestNumber);
            }
        }

        int[] drawnNumbersArray = new int[highestNumber];

        System.out.println("Drawn numbers:");
        for(int n = 0; n<highestNumber; n++){
            int drawnNumber = random.nextInt(399)-199; //??????;
            drawnNumbersArray[n] = drawnNumber;
            System.out.print(drawnNumber + ", ");
        }
        System.out.println(drawnNumbersArray);

        int sumEverySecondNumber = 0;
        int sumEveryThirdNumber = 0;
        int countEverySecondNumber = 0;
        int countEveryThirdNumber = 0;
        for(int e = 0; e<drawnNumbersArray.length; e++){
            if(e % 2 == 0){
                sumEverySecondNumber += e;
                countEverySecondNumber ++;
            }else if(e % 3 == 0){
                sumEveryThirdNumber +=e;
                countEveryThirdNumber ++;
            }
        }

        System.out.println("sumEverySecondNumber " + sumEverySecondNumber);
        System.out.println("sumEveryThirdNumber " + sumEveryThirdNumber);
        System.out.println("countEverySecondNumber " + countEverySecondNumber);
        System.out.println("countEveryThirdNumber " + countEveryThirdNumber);

        double averageEverySecondNumber = sumEverySecondNumber / countEverySecondNumber;
        System.out.println("averageEverySecondNumber " + averageEverySecondNumber);

        double averageEveryThirdNumber = sumEveryThirdNumber / countEveryThirdNumber;
        System.out.println("averageEveryThirdNumber " + averageEveryThirdNumber);
    }
}
//2. Napisać program, który wczytuje od użytkownika liczby dopóty, dopóki nie zostanie podana liczba
//        mniejsza od 1. Następnie dokonuje losowania tylu liczb, ile wynosiła maksymalna z wartości podanych przez
//        użytkownika. Zakres losowanych liczb, to -199 do 199. W wyniku powinien zostać wyświetlony stosunek
//        średniej arytmetycznej wszystkich „co drugich" wylosowanych liczb dodatnich do wszystkich co trzecich
//        wylosowanych liczb (można zacząć od dowolnego momentu, ale nie później niż od 2 i 3 z podanych liczb).