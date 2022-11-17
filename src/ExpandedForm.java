import java.util.ArrayList;
import java.util.List;

public class ExpandedForm {

    public static String expandedForm(int num)
    {
        String[] str = Integer.toString(num).split("");
        String result;
        List<String> l = new ArrayList<String>();

        for(int i = 0; i < str.length; i++){
            if(Integer.valueOf(str[i]) > 0){
                String s = str[i];
                for(int j = i; j < str.length - 1; j++){
                    s += '0';
                }
                l.add(s);
            }
        }

        result = l.toString();
        result = result.substring(1, result.length() - 1).replace(",", " +");
        System.out.println(result);

        return result;
    }

    public static void main(String[] args) {
        ExpandedForm esp = new ExpandedForm();
        int no=12;
        System.out.println(expandedForm(no));
    }
}
