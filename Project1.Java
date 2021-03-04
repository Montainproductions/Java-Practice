import java.util.ArrayList;
import java.util.Collections;

public class Project1{
    public Project1(){
        
    }

    public void Homework(String numRange){
        /*Problem: https://open.kattis.com/problems/heimavinna
        Started: 07/01/2021
        Finished: 07/01/2021
        */

        //Seperates all the numbers into an array
        String[] numbers = numRange.split(";");
        int amountOfProblems = 0;
        for(int i = 0; i < numbers.length; i++){

            //If the number is a continuase set then do the split it and find the amount of problems that it has
            if(numbers[i].contains("-")) {
                String[] rangeNumbers = numbers[i].split("-");
                for (int v = 0; v < rangeNumbers.length; v+=2) {
                    int highNumber = Integer.parseInt(rangeNumbers[v+1]);
                    int lowNumber = Integer.parseInt(rangeNumbers[v]);
                    int rangeOfProblems = (highNumber - lowNumber)+1;
                    amountOfProblems = amountOfProblems + rangeOfProblems;
                }
            } else {
                amountOfProblems++;
            }
        }
        System.out.println("Amount of Problems: " + amountOfProblems);
    }

    public void Tarifa(int megaBytes, int months, int[] array){
        /*Problem: https://open.kattis.com/problems/tarifa
        Started: 07/01/2021
        Finished: 07/01/2021
        */

        int totalAmountOfMB = megaBytes * months + megaBytes;
        for(int i = 0; i<array.length;i++){totalAmountOfMB = totalAmountOfMB-array[i];}
        System.out.println(totalAmountOfMB);
    }

    public void Inflation(int ballonAmount, ArrayList<Integer>gasArray){
        /*Problem: https://open.kattis.com/problems/inflation
        Started: 09/01/2021
        Finished: 10/01/2021
        */
        Collections.sort(gasArray);
        float fraction = 1;

        outerloop:
        for(float i=1; i<(ballonAmount+1); i++){
            for(int v = 0; v<gasArray.size();v++){
                int currentGas = gasArray.get(v);
                if (currentGas<=i){
                    float placeHolder = currentGas/i;
                    if (placeHolder <= fraction){
                        System.out.println("Final fraction: " + fraction);
                        fraction = placeHolder;
                    }
                    gasArray.remove(v);
                }else if(currentGas > 1){
                    System.out.println("Impossible");
                    break outerloop;
                }
            }
        }
    }

    public void Statistics(ArrayList<Integer>testCase){
        /*Problem: https://open.kattis.com/problems/statistics
        Started: 03/03/2020
        */

        /*for (int v = 0; v < rangeNumbers.length; v+=2) {
            int highNumber = Integer.parseInt(rangeNumbers[v+1]);
            int lowNumber = Integer.parseInt(rangeNumbers[v]);
            int rangeOfProblems = (highNumber - lowNumber)+1;
            amountOfProblems = amountOfProblems + rangeOfProblems;
        }*/

        public int minimum = min(testCase);
        max(testCase);
        System.out.print.ln(minimum);
    }

    public int min(ArrayList<Integer>numbersList){
        private int lowestNumber = null;
        for (Integer num : numbersList) { 		      
            switch(num){
                case num >= lowestNumber:
                    break;
                case num < lowestNumber:
                    lowestNumber = num;
                    break;
                case defult:
                    lowestNumber = num;
                    break;
            }
       }
       return lowestNumber;
    }
    public static void main(String[] args){Project1 f = new Project1();};
}