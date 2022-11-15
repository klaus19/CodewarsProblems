import java.util.Stack;

public class DisvowelTrolls {

    public static String disemvowel(String str) {
        // Code away...

        String s1="";

        for (int i=0;i<str.length();i++) {
           s1= str.replaceAll("[aeiouAEIOU]","");
        }
        return s1;

    }

    public static void main(String[] args) {
        DisvowelTrolls dv = new DisvowelTrolls();
        String st = "This is my heart";
        System.out.println(disemvowel(st));
    }

}
