public class VariableMutation {
  public static void main(String[] args) {
    // make the "a" variable's value bigger by 10
    int a = 3;
    a += 10;
    System.out.println(a);

    // make b smaller by 7
    int b = 100;
    b -= 7;
    System.out.println(b);

    // please double c's value
    int c = 44;
//    double c = 44;
    System.out.println(c);

    // please divide by 5 d's value
    int d = 125;
    d /= 5;

    System.out.println(d);

    // please cube of e's value
    int e = 8;
    e^=3;
    System.out.println(e);

    // tell if f1 is bigger than f2 (print as a boolean)
    int f1 = 123;
    int f2 = 345;
    boolean bigger = false;
    boolean  smaller = true;
    System.out.println(f1>f2);
    System.out.println(f1<f2);

    // tell if the double of g2 is bigger than g1 (print as a boolean)
    int g1 = 350;
    int g2 = 200;
    boolean bigger2 = true;
    boolean smaller2 = false;
    System.out.println((g2*2)>g1);
    System.out.println((g2*2)<g1);

    // tell if it has 11 as a divisor (print as a boolean)
    int h = 135798745;
    boolean has = true;
    boolean hasnt = false;
    System.out.println((h/11));

    int i1 = 10;
    int i2 = 3;
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

    int j = 1521;
    // tell if j is dividable by 3 or 5 (print as a boolean)
  }
}