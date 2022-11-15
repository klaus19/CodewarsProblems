public class EqualCount {

    public boolean checkEqualCount(String str) {

        int count_O = 0;
        int count_X = 0;

        for (int i = 0; i < str.length(); i++) {
            char[]ch = str.toLowerCase().toCharArray();
            if (ch[i] == 'o') {

                count_O++;
            } else if (ch[i] == 'x') {
                count_X++;
            }
        }
        if (count_X == count_O)
            return true;
        return false;
    }

    public static void main(String[] args) {
        EqualCount eq = new EqualCount();
        String s1 = "ooxx";
        String s2 = "xooxx";
        System.out.println(eq.checkEqualCount(s1));
        System.out.println(eq.checkEqualCount(s2));
    }
}
