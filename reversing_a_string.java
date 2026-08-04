import java.util.*;
public class reversing_a_string {
    public static void main(String arfgs[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String emp = "";
        for(int i = s.length() -1; i>=0; i-- ){
            emp +=s.charAt(i);
        }
        System.out.println(emp);
    }
    
}
