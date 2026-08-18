import java.util.Scanner;

public class two_d_array_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int array[][] = new int[rows][columns];

        for(int i = 0; i<rows; i++){
            for(int j = 0; j< columns; j++){
                System.out.println("elements for row " +i + " and column " + j);
                array[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for(int i = 0; i<rows; i++){
            for(int j = 0; j< columns; j++){
                sum += array[i][j];
            }
        }
        System.out.println("sum is:");

        System.out.print(sum);



        
    }

    
}
