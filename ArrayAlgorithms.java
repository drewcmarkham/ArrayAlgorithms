import java.util.ArrayList;

public class ArrayAlgorithms {

    public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 5, 8, 4, 3, 3, 4, 4, 4};

            // print elements
            System.out.println("All Elements:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println("");

            // sum elements
            System.out.println("Sum Elements:");
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println(sum);
            System.out.println("");

            // find the mean
            System.out.println("Mean:");
            sum /= numbers.length;
            System.out.println(sum);
            System.out.println("");

            //find the smallest number
            System.out.println("Smallest Number:");
            int y = numbers[0];
            for (int num : numbers) {
                if (num < y) {
                    y = num;
                }
            }
            System.out.println(y);
            System.out.println("");

            //find the biggest number
            System.out.println("Biggest Number:");
            int x = numbers[0];
            for (int num : numbers) {
                if (num > x) {
                    x = num;
                }
            }
            System.out.println(x);
            System.out.println("");

            //find the mode (most common number)
            System.out.println("Mode:");
            int [] counts = new int[x + 1];
            for (int num : numbers) {
                counts[num] += 1;
            }
            int bigNum = counts[0];
            int bigIndex = 0;
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] > bigNum) {  
                    bigNum = counts[i];
                    bigIndex = i;
                }
            }
            // System.out.println(bigIndex);


            int biggestIndex = 0;
            int mostCommon = numbers[0];
            for (int num : numbers) {
                int commonCount = 0;
                for (int num2: numbers) {
                    if (num == num2) {
                        commonCount++;
                    }
                }
                if (commonCount > mostCommon) {
                    mostCommon = commonCount;
                    biggestIndex = num;
                }
            }
            System.out.println(biggestIndex);

            System.out.println("");

            //reverse the array into a new array
            System.out.println("Reverse Array:");
            int[] newArray = new int[numbers.length];
            int j = 0;
            for (int i = numbers.length - 1; i >= 0; i--) {
                newArray[j] = numbers[i];
                j++;
                }

            int[] reversed = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                reversed[numbers.length -1 - i] = numbers[i];
            }
            for (int num : newArray) {
                System.out.print(num + " ");
            }
            System.out.println("");

            //shift the array over by a variable int 
            System.out.println("Shifted Array");
            for (int shift = -numbers.length * 2; shift < numbers.length * 2; shift++) {
                int[] shifted = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    int nearZeroShift = (shift % numbers.length + numbers.length);
                    shifted[(nearZeroShift + i) % numbers.length] = numbers[i];
                }
                for (int shiftedNum : shifted){
                    System.out.print(shiftedNum + " ");
                }
                System.out.println("");
            }

            // (moving the last to the front)
            System.out.println( "\nLast To Front:");
            int[] shiftArray = new int[numbers.length];
            for (int k = 1; k < numbers.length; k++) {
                shiftArray[k] = numbers[k-1];
                shiftArray[0] = numbers[numbers.length -1];
            }
            for (int num : shiftArray) {
                System.out.print(num + " ");
            }
            System.out.println("");

            //ArrayList Algorithms

            ArrayList<Integer> numbersList = new ArrayList<Integer>();
            // add 10 random numbers
            for (int i = 0; i < 10; i++) {
                numbersList.add((int)(Math.random() * 20));
            }

            // print the list
            System.out.println("Print List:");

            System.out.println(numbersList);

            // sum of the list
            System.out.println("Sum:");

            int total = 0;
            for (int num : numbersList) {
                total += num;
            }
            System.out.println(total);

            // mean of the list
            System.out.println("Mean:");

            System.out.println(numbersList.size());

            // smallest number in the list
            System.out.println("Smallest Number:");
            int z = numbersList.get(0);
            for (int num : numbersList) {
                if (num < z) {
                    z = num;
                }
            }
            System.out.println(z);

            // biggest number in the list
            System.out.println("Biggest Number:");
            int v = numbersList.get(0);
            for (int num : numbersList) {
                if (num > v) {
                    v = num;
                }
            }
            System.out.println(v);

            // mode of the list
            System.out.println("Mode:");

            int biggestIndex2 = 0;
            int mostCommon2 = 0;
            for (int num : numbersList) {
                int commonCount2 = 0;
                for (int num2 : numbersList) {
                    if (num2 == num) {
                        commonCount2++;
                    }
                }
                if (commonCount2 > mostCommon2) {
                    mostCommon2 =  commonCount2;
                    biggestIndex2 = num;
                }
            }
            System.out.println(biggestIndex2);

            // reverse the list
            System.out.println("Reversed Array List:");

            ArrayList<Integer> reversedArrayList = new ArrayList<Integer>();
            for (int i = 0; i < numbersList.size(); i++) {
                reversedArrayList.add(0, numbersList.get(i));
            }

            System.out.println(reversedArrayList);

            // shift the list over by a variable int
            System.out.println("Shift Array List:");

            for (int shift = -numbersList.size() * 2; shift < numbersList.size() * 2; shift++) {
                ArrayList<Integer> shifted2 = new ArrayList<Integer>();
                for (int i = 0; i < numbersList.size(); i++) {
                    int nearZeroShift = (shift % numbersList.size() + numbersList.size());
                    shifted2.add(i, numbersList.get((nearZeroShift + i) % numbersList.size()));
                }
                for (int shiftedNum : shifted2){
                    System.out.print(shiftedNum + " ");
                }
                System.out.println("");
            }

        }   
    }