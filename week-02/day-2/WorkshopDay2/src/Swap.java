public class Swap {
  public static void main(String[] args) {
    // Swap the values of the variables
    int a, b, temp;
    a = 123;
    b = 526;
    System.out.println("Before swapping : a, b = "+a+", "+ + b);
    temp = a;
    a = b;
    b = temp;
    System.out.println("After swapping : a, b = "+a+", "+ + b);
  }
}
