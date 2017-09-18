public class binomial {
    /*static int num=101;
    static int knum=51;
    static double[][] a=new double [num][knum];*/

 static int c=0;
    public static double B(int n,int k,double p){
        double [][] a=new double[n+1][k+1];

        for(int i=0;i<n+1;i++)
            for(int j=0;j<k+1;j++)
                a[i][j]=-1;
        return B(a,n,k,p);
    }
    public static double B(double[][] a,int n,int k ,double p){

        if(n==0&&k==0) return 1.0;
        if(n<0||k<0) return 0.0;
        if(a[n][k]==-1) { c++;
            System.out.println(c);
            a[n][k] = (1.0 - p) * B(a, n - 1, k, p) + p * B(a, n - 1, k - 1, p);
        }
        return a[n][k];

    }
    public static void main(String [] args)
    {
        double num=B(100,50,0.5);
        System.out.println(num);
    }
}
