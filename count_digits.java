public class count_digits {
    static int count_digits(int num){
        int count = 0;
        while(num !=0){
            num = num/10;
            count ++;
        }
        return count;

    }
    public static void main(String[] args) {
        System.out.println(count_digits(455267875));
    }
    
}
