public class SecondsInADay {
  public static void main(String[] args) {
    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables above
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int h = 24;
    int m = 60;
    int s =60;
    int totals = h*m*s;
    System.out.println((h-currentHours)*s*m+(m-currentMinutes)*s+s-currentSeconds + " second left ");

  }
}
