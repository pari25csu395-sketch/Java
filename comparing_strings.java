
public class comparing_strings {
    public static void main(String[] args) {
        String name1 = "Pari";
        String name2 = "pari";

        if( name1.equalsIgnoreCase(name2)){ // not case sensitve.
            System.out.println("equal");

        }
        else{
            System.out.println("not equal");
        }


        // if( name1.equals(name2)){ // case sensitive hai 
        //     System.out.println("both are equal");

        // }
        // else{
        //     System.out.println("both are not equal");

        // if(name1 == name2){
        //     System.out.println("both are equal");
        // }
        // else{
        //     System.out.println("both are not equal");
        // }
    }
    
}
