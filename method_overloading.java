import java.util.*;

public class method_overloading {
    static int add(int a , int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }

public static void main (String [] args){
   int sum1 =  add(1,2);
    int sum2 = add(1,2,3);

    System.out.println("sum1:" + sum1);
    System.out.println("sum2:" + sum2);

}
}
