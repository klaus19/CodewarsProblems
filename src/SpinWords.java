import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SpinWords {

    public String getSpinWords(String sentence) {
        //TODO: Code stuff here


        String rev = "";
        String final_str="";

        String[] str = sentence.split("\\s+"); //str =["Hello","lion"]
        for (int i=0;i<str.length;i++){
           if (str[i].length()>=5){
               String word  = str[i];
               for (int j=word.length()-1;j>=0;--j){
                   char[]ch = word.toCharArray();
                   rev+=ch[j];
                   final_str+=rev+""+str;
               }
           }else{
               final_str+=sentence;
           }
        }
        return final_str;
    }

    public static void main(String[] args) {
        SpinWords sp = new SpinWords();
        String st = "Hello lion";
        System.out.println(sp.getSpinWords(st));
    }
}
