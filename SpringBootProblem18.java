public class SpringBootProblem18 {
    int findSumOfFirstNPrimeNumbers(int n) {
        int k  = 0;
        int sum = 0;
        int currentNumber = 2;
        while(k < n ) {
            if(isPrimeOrNot(currentNumber)) {
                sum = sum + currentNumber;
                k++;
            } 
            currentNumber++;

        }
    }

    boolean isPrimeOrNot(int number) {
        int counter = 2;
        while(counter < number) {
            if(number % counter == 0 ) {
                return false;
            }
            counter++;
        }
        return true;


    }
}
