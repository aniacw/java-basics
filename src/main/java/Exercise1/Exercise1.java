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
                theNumbers[index] = number;//150 nie powinno bycw ogole dodane do tablicy?
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

        int count2 = 0;
        for(int i = 0; i<theNumbers.length; i++){
            if(theNumbers[index] % 3 ==0){
                count2++;
                System.out.println(count2);
        }

        }





    }
}
