

public class string_methoda {
    public static void main(String[] args) {

        String str = "   " ;        
        System.out.println(str.length()); // spaces hai toh length hai
        System.out.println(str.isBlank()); //koi element nhi h
        System.out.println(str.isEmpty()); // spsces hai pr element nhi h

        String name = "  Pari  ";
        System.out.println(name.length()); // trim krne se phle ki space
        name = name.trim(); // khali spaces ko trim krdega
        System.out.println(name.length()); // trim krne ke baad ki spaces

        String name1 = "Pari";
        System.out.println(name1.toUpperCase());
        String name2 = "PARI";
        System.out.println(name2.toLowerCase());

        String str1 = "MY NAME IS PARI";

    System.out.println(str1.substring(0,7));// begning in dex inclusive, last index exclusive
    System.out.println(str1.contains("PARI"));

    int num = 5123;
    String strr = String.valueOf(num);
    System.out.println(num+1);// addition ho jaega
    System.out.println(strr+1); // concatinate ho jaega

    String strrr = "Pari loves aggarwal";
    System.out.println(strrr.startsWith("Pari l"));
    System.out.println(strrr.endsWith("Aggarwal"));

    String namee = "Parth";
    char[] crr = namee.toCharArray();
    for (char ch: crr) {
        System.out.println("value of char:" + ch);
    }

    String input = " my name is pari aggarwal";
    String[] words = input.split(",");
    for(String str : words){
        System.out.println(str);
    }



    }
    
}
