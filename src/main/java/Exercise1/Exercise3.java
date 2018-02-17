package Exercise1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number...");//dlaczego jak sout byl tuz przed pierwszym for to nie dziala?
        int number = scanner.nextInt();
        int[] someArray = new int[30];
        int index = 0;
        someArray[index] = number;

        int sum = 0;
        while(number != 150){
           System.out.println("Type a number...");
           number = scanner.nextInt();
           index++;
           if(number != 150){
               someArray[index] = number;
               sum += number; //dlaczego nie sumuje pierwszej wpisanej liczby?
           }
        }

        System.out.println("Sum: " + sum);
        System.out.println("count: " + (index + 1));
        double average = sum / (index + 1);
        System.out.println("average: " + average);

        int count = 0;
        for(int n = 0; n<someArray.length; n++){
            if(someArray[n]>0){
                count++;
            }
        }
        System.out.println("Positive numbers count: "+ count);

    }
}
//3. Napisać program, który wczytuje od użytkownika liczby, do momentu aż zostanie podana liczba 150 (którą
//        pomijamy przy wszelkich statystykach). Po zakończeniu działania ma zostać wyświetlona informacja o
//        wartości średniej arytmetycznej wszystkich podanych liczb oraz ile z tych liczb było dodatnich.