import java.util.Scanner;

public class Main {
  private static Calculator calculator = new Calculator();

  public static void main(String[] args) {
    System.out.println("Welcome to this nifty Calculator!\n\tEnter 'quit' to exit.");
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    while (!input.equals("quit")) {
      String[] words = input.split(" ");
      String first = words[0];
      if (first.equals("add")) {
        int lh = Integer.parseInt(words[1]);
        int rh = Integer.parseInt(words[2]);
        System.out.println(calculator.add(lh, rh));
      } else if (first.equals("subtract")) {
        int lh = Integer.parseInt(words[1]);
        int rh = Integer.parseInt(words[2]);
        System.out.println(calculator.subtract(lh, rh));
      } else if (first.equals("multiply")) {
        int lh = Integer.parseInt(words[1]);
        int rh = Integer.parseInt(words[2]);
        System.out.println(calculator.multiply(lh, rh));
      } else if (first.equals("divide")) {
        int lh = Integer.parseInt(words[1]);
        int rh = Integer.parseInt(words[2]);
        System.out.println(calculator.divide(lh, rh));
      } else if (first.equals("fib")) {
        int num = Integer.parseInt(words[1]);
        System.out.println(calculator.fibonacciNumberFinder(num));
      } else if (first.equals("bin")) {
        int num = Integer.parseInt(words[1]);
        System.out.println(calculator.intToBinaryNumber(num));
      } else {
        System.out.println("I don't know what that means!");
      }
      input = in.nextLine();
    }
    System.out.println("Goodbye!");
  }
}
