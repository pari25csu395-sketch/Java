// count the vowela in a string

public class q2 {
    public static void main(String[] args) {
        String str = " i lOve my family";
        int count = 0;
        for( int i = 0; i< str.length(); i++){

            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                count = count+1;
            }
        }
        System.out.println(count);
        

        
    }
    
}
