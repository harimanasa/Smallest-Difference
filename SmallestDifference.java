package algorithmsForPractice;

import java.util.Arrays;

public class SmallestDifference {
        public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
            int[] result = new int[2];
            int minimum = Integer.MAX_VALUE;
            Arrays.sort(arrayOne);
            Arrays.sort(arrayTwo);

            int i = 0;
            int j = 0;

            while(i < arrayOne.length && j <arrayTwo.length){
                int firstNumber = arrayOne[i];
                int secondNumber = arrayTwo[j];
                int curr = Math.abs(firstNumber-secondNumber);
                if(curr == 0){
                    minimum = 0;
                    result[0] = firstNumber;
                    result[1] = secondNumber;
                    return result;
                }
                else if(curr < minimum){
                    minimum = curr;
                    result[0] = firstNumber;
                    result[1] = secondNumber;
                    //System.out.println(firstNumber + " " + secondNumber);
                }
                if(firstNumber<=secondNumber){
                    i++;
                }
                else if(secondNumber<firstNumber){
                    j++;
                }
            }

            return result;
        }

        public static void main(String... args){
            int[] arrayOne = {-1,5,10,20,28,3};
            int[] arrayTwo = {26,134,135,15,17};
            int[] smallDiffResult = smallestDifference(arrayOne, arrayTwo);
            System.out.println(smallDiffResult[0] + " " + smallDiffResult[1]);
        }
    }


