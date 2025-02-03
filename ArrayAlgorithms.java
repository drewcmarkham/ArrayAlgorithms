public class ArrayAlgorithms {

    public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};

            // print elements
            for (int num : numbers) {
                System.out.print(num + " ");
            }

            // sum elements
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println(sum);

            // find the mean
            sum /= numbers.length;
            System.out.println(sum);

            //find the smallest number
            int y = numbers[0];
            for (int num : numbers) {
                if (num < y) {
                    y = num;
                }
            }
            System.out.println(y);

            //find the biggest number
            int x = numbers[0];
            for (int num : numbers) {
                if (num > x) {
                    x = num;
                }
            }
            System.out.println(x);

            //find the mode (most common number)


            //reverse the array into a new array
            for (int i = 0; i < numbers.length; i++) {
                
            }
                
            }

            //shift the array over by a variable int (moving the last to the front)


    
    }
}