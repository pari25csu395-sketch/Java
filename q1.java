import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];

        for(int i = 0; i<size; i++){
            System.out.println("provide element for index 2" +i);
            array[i] = sc.nextInt();

        }
        int sum = 0;

        for(int i = 0; i<size; i++){
           sum += array[i];
            System.out.println(sum);


        }






        
    }
    
}
