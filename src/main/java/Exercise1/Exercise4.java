package Exercise1;

import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        Random random = new Random();
        int index = 0;
        int[] theRandomNumbers = new int[index];
        int randomNumber = random.nextInt();

        while (randomNumber != 0){
            randomNumber = random.nextInt(301) - 150;
            System.out.println(randomNumber);
            index++;
                if(randomNumber != 0){
                    theRandomNumbers[index] = randomNumber;
                }
            }
    }
}

//4. Napisać program, który losuje liczby pseudolosowe z zakresu [-150, 150] dopóty, dopóki nie zostanie
//        wylosowana liczba 0. Następnie dokonuje dokładnie tyle samo losowań liczb pseudolosowych z zakresu [-
//        10, 10]. W wyniki działania programu należy wyświetlić stosunek sumy liczb parzystych dodatnich,
//        losowanych w pierwszej kolejności do iloczynu liczb nieparzystych ujemnych, losowanych w drugiej
//        kolejności.