import java.util.Random;

public class BubbleSort {


    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }
        System.out.println("Before");
        printArray(numbers);

        boolean swappedSomethings = true;

        while (swappedSomethings) {
            swappedSomethings = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swappedSomethings = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        System.out.println("After");
        printArray(numbers);


        long endTime  = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        System.out.println("\nTiempo transcurrido en nanosegundos: " + elapsedTime);
    }



    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
