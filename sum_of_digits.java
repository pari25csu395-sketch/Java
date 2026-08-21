public class sum_of_digits {
    static int sum_of_digits(int num){
        int sum = 0;
        while(num !=0){
            int digit = num%10;
            sum = sum + digit;
            num = num/10;
        }
        return sum;
       

    }
 public static void main(String[] args) {
    System.out.println(sum_of_digits(456));
    
 }{
        
    }

    
}
