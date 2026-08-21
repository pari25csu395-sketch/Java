public class reversing_a_num {
    static int reversing_a_num(int num){
        int reversenum = 0;
        while(num !=0){
            int digit = num%10;
            reversenum = reversenum*10 + digit;
        
            num = num/10;
        }
        return reversenum;
       

    }
 public static void main(String[] args) {
    System.out.println(reversing_a_num(456));
    
 }{
        
    }

    
}

    

