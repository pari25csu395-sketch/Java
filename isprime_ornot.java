public class isprime_ornot{
    static boolean isprimneornot(int num){
    for(int i = 2; i < num-1 ;i++){
        if (num % i == 0){
            return false;
        }
    }
    return true;
}
public static void main(String[] args) {
    System.out.println(isprimneornot(3));
    
}

}



    

    

