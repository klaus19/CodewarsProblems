public class SumNumbers {

    public int GetSum(int a, int b) {
        //Good luck! [-1,0,1,2] =
        int sum =0;
        int temp = a;
        if (a < b){
            while (temp<=b){
                sum+=temp;
                temp++;
            }
        }

        if (a==b){
            return a;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumNumbers sm = new SumNumbers();
        int t1=1,t2=1;
        int a=-1,b=0;
        int c=-1,d=2;
        System.out.println(sm.GetSum(a,b));
        System.out.println(sm.GetSum(c,d));
        System.out.println(sm.GetSum(t1,t2));
    }
}
