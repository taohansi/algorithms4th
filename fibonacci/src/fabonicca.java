public class fabonicca {
    static int n=10;
    static long [] a=new long[n];
    public static long F(int N)
    {
        if(N==0) return 0;
        if(N==1) return 1;
        if(a[N]==0) {
            a[N] = F(N-1)+F(N-2);

        }

            return a[N];


    }

    public static void main(String args[])
    {
       System.out.println(F(8));

    }
}
