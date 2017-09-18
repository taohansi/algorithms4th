public class gcd {
    public static int g(int a,int b){
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        if(b==0) return a;
        a=a%b;
        System.out.println(a+" "+b);
        return g(b,a);

    }
    public static void main(String [] args)
    {
        int a=1111111;
        int b=1234567;
        int c;
        c=g(a,b);
        System.out.println(c);
    }

}
