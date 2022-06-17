import java.util.*;

public class Main {
    public static int countN(int n){
        int d=0, r=0;
        while(n>0)
        {n/=10;
        d++;
        }
        return d;
    }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n= scn.nextInt();
        System.out.println(countN(n));
  }
}