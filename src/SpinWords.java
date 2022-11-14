import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SpinWords {

    public String getSpinWords(String sentence) {

        String rev = "";
        String final_str="";

        String[] str = sentence.split("\\s+"); //str =["Hello","lion"]
        //create a aRRAYlISST
        List<String>list = new ArrayList<>();
        for (int i=0;i<str.length;i++) {
            list.add(str[i]);
        }
          for (int j=0;j<list.size();j++) {
              char[] ch = list.get(j).toCharArray();
              if (ch.length >= 5) {
                  for (int k = ch.length - 1; k >= 0; k--) {
                      rev += ch[k];
                      list.set(j, rev);
                  }
              }
          }

        String becca = list.stream().map(Object::toString)
                .collect(Collectors.joining(" "));
        final_str+=becca;


        return final_str;
    }

    public static void main(String[] args) {
        SpinWords sp = new SpinWords();
        String st = "Batty is forever";
        System.out.println(sp.getSpinWords(st));
    }
}
