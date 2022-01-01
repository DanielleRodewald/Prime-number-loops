public class loops {
    public static void main(String[] args) {
        int numOfPrimes = 20;
        int numOfPrimesPerLine = 5;
        int count = 0;
        int number = 2;

        System.out.println("The first 20 prime numbers are: ");

        while (count < numOfPrimes) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }


            if (isPrime) {
                count++;
                if (count % numOfPrimesPerLine == 0) {
                    System.out.println(number);
                } else
                    System.out.print(number + " ");
            }

            number++;

        }
    }
}