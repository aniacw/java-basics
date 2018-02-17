package Exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        System.out.println("Give the number");
        int number = scanner.nextInt();
        int[] theNumbers = new int[50];
        theNumbers[index] = number;

        while(number!=150){//???????
            System.out.println("Give the number");
            number = scanner.nextInt();
            index ++;
            if(number!=150){
                theNumbers[index] = number;//150 nie powinno byc w ogole dodane do tablicy?
            }
        }

        int sum = 0;
        int count = 0;
        System.out.println("Numbers without 150:");
        for(int i = 0; i<theNumbers.length; i++){
            if(theNumbers[i]!=0 && theNumbers[i]!=150){
                count++;
                System.out.print(theNumbers[i] + ", ");
                sum += theNumbers[i];
            }
        }

        System.out.println();
        System.out.println("Sum = " + sum);

        double average = sum/count;
        System.out.println("Average: " + average);

        System.out.println("Divided by 3:");
        for(int i = 0; i<theNumbers.length; i++){
            if(theNumbers[i] != 0 && theNumbers[i] % 3 == 0){
                System.out.println(theNumbers[i]);
            }
        }
    }
}
//1. Napisać program, który wczytuje od użytkownika liczby, do momentu aż zostanie podana liczba 150.
//        Po zakończeniu działania programu wyświetlona zostaje informacja o sumie oraz średniej z wszystkich
//        podanych liczb (poza 150) oraz jak wiele podanych zostało liczb dodatnich, podzielnych przez 3.