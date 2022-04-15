import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    for (int d = 2; d * d <= n; d++)
    {
      while (n % d == 0)
      { n = n / d;
        System.out.print(d + " ");
      }
    }
    if (n != 1)
    {
      System.out.print(n);
    }

  }
}