public class armstrong_no {
    static boolean isarmstrong_no(int num){
        int sum = 0;
        int original = num;
        while(num!=0){
            int digit = num%10;
            int cubeofdigit = digit*digit*digit;
            sum = sum + cubeofdigit;
            num = num/10;

            
        }
        if(sum == original){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println(isarmstrong_no(153));
    }
    
}
