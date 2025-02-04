public class ArrayAlgorithms {

    public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 5, 8, 4, 3, 3};

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
            System.out.println(bigIndex);

            System.out.println("");

            //reverse the array into a new array
            System.out.println("Reverse Array:");
            int[] newArray = new int[numbers.length];
            int j = 0;
            for (int i = numbers.length - 1; i >= 0; i--) {
                newArray[j] = numbers[i];
                j++;
                }
            for (int num : newArray) {
                System.out.print(num + " ");
            }
            System.out.println("");

            //shift the array over by a variable int (moving the last to the front)
            System.out.println("Shift By One:");
            int[] shiftArray = new int[numbers.length];
            for (int k = 1; k < numbers.length; k++) {
                shiftArray[k] = numbers[k-1];
                shiftArray[0] = numbers[numbers.length -1];
            }
            for (int num : shiftArray) {
                System.out.print(num + " ");
            }
        }   
    }