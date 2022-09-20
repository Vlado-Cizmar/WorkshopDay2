public class Bmi {
  public static void main(String[] args) {
    double massInKg = 81.2;
    double heightInKg = 1.78;
    //BMI = weight (kg) ÷ height2 (meters);
    double BMI = massInKg/(heightInKg*heightInKg);
    System.out.println(BMI+ " %");
  }
}
