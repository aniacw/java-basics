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
        if(userInput[index]>highestNumber){//??
            highestNumber = userInput[index];//??
        }

        System.out.println("Drawn numbers:");
        for(int n = 0; n<highestNumber; n++){
            int drawnNumber = random.nextInt(-199)+398;
            System.out.println(drawnNumber);
        }


        }




    }
