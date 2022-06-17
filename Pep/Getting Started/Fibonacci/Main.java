import java.util.*;

public class Main {
    public static void fibo(int n){
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++)
        {
            System.out.println(a+b);
            int c=a+b;
            a=b;
            b=c;
            
        }
        
        
    }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n= scn.nextInt();
    fibo(n);
        
    
  }
}