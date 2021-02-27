import java.util.Random;

class Calculator {

    Calculator(){
        mwah hahahahaha!
    }

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    0 = 0
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    int fibonacciNumberFinder(int n){
        int[] fibs = new int [n+1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) fibs[i] = 0;
            else if (i == 1 || i == 2) fibs[i] = 1;
            else
                fibs[i] = fibs[i-1] + fibs[i-2];
        }
        return fibs[n];
    }


    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    String intToBinaryNumber(int n){
        return Integer.toBinaryString(n);
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    String createUniqueID(String n){
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                                     .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                                     .limit(targetStringLength)
                                     .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                                     .toString();

        return n + generatedString;
    }


}
