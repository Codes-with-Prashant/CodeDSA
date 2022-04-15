import java.util.*;

public class Main {
     public static int countN(int n) {
    int d = 0, r = 0;
    while (n > 0)
    { n /= 10;
      d++;
    }
    return d;
  }
  public static void rotate(int n,int r){
      int len=countN(n);
       r=(r%len+len)%len;
    int a=n/(int)Math.pow(10,r);
    int b=n%(int)Math.pow(10,r);
    System.out.println( (b*(int)Math.pow(10,len-r)+a));
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
     int r = scn.nextInt();
   rotate(n,r);
  }
}