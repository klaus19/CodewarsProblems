
import java.util.ArrayList;
import java.util.List;


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
              if (list.get(j).length()>= 5) {
                  char[] ch = list.get(j).toCharArray();
                  for (int k = ch.length - 1; k >= 0; k--) {
                      rev += ch[k];
                      list.set(j, rev);
                  }
                  rev="";
              }
          }

        StringBuilder sb = new StringBuilder();
        for (String s:list){
            sb.append(s);
            sb.append(" ");
        }
        String becca = sb.toString();
        final_str+=becca;


        return final_str;
    }

    public static void main(String[] args) {
        SpinWords sp = new SpinWords();
        String st = "Batty is forever";
        String s1 = "you are love Nikita";
        System.out.println(sp.getSpinWords(st));
        System.out.println(sp.getSpinWords(s1));
    }
}
