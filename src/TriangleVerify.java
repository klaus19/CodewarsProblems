public class TriangleVerify {

    public static boolean isTriangle(int a, int b, int c) {

        if (a != 0 && b != 0 && c != 0)

            if ((a + b) > c && (b + c) > a && (c + a) > b)
                return true;

        return false;

    }

    public static void main(String[] args) {
        TriangleVerify tv = new TriangleVerify();
        int a=10,b=5,c=0;
        System.out.println(isTriangle(a,b,c));
    }

}
