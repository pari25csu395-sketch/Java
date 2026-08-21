public class remove_lastdigit{
    static void printdigits(int num){
        while(num != 0){
            int digit = num%10;
            System.out.println(digit);
            num = num/10;
        }
        }
    public static void main(String[] args) {
        int num = 236947493;
            printdigits(num);
    }
}