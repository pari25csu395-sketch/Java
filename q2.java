// wap to find the max value of element inside the array
import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];

        for ( int i = 0; i<size; i++){
            System.out.println("provide element for index " +i);
            array[i] = sc.nextInt();
        }

        int maxvalue = array[0];

        for ( int i = 0; i<size; i++){ // comparing values
            if(array[i] > maxvalue){ 
                maxvalue = array[i]; // update

            }
           
        }
        System.out.println("max value is " + maxvalue);


    }

    
}
