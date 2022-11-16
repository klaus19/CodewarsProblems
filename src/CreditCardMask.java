public class CreditCardMask {

    public static String maskify(String str) {

        if (str.length()==1){
            return str;
        }

        if (str==""){
            return "";
        }
        if(str.length()<5){
            return str;
        }
        int j=0;
        String modified_str="";
        char[]ch = str.toCharArray();
        while (j<=ch.length-5){
            ch[j]= '#';
            modified_str+=ch[j];
            j++;
        }
        for (int i=ch.length-4;i<ch.length;i++){
            modified_str+=ch[i];
        }
        return modified_str;
    }

    public static void main(String[] args) {
        CreditCardMask cm = new CreditCardMask();
        String str="4556364607935616";
        String s1 = "1";
        String low = "64607935616";
        System.out.println(maskify(str));
        System.out.println(maskify(s1));
        System.out.println(maskify(low));
    }

}
