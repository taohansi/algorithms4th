public class binomial {

    static int num=11;
    static int knum=6;
    static double[][] a=new double [num][knum];

        static int c=0;
        public static double B(int n,int k,double p){
            c++;
            System.out.println(c);
            if(n==0&&k==0) return 1.0;
            if(n<0||k<0) return 0.0;
            if(a[n][k]==0)
                a[n][k]=(1.0-p)*B(n-1,k,p)+p*B(n-1,k-1,p);
            return a[n][k];
        }
        /*public static double B(double[][] a,int n,int k ,double p){
            c++;
            System.out.println(c);
            if(n==0&&k==0) return 1.0;
            if(n<0||k<0) return 0.0;
            if(a[n][k]==0)
                a[n][k]=(1.0-p)*B(a,n-1,k,p)+p*B(a,n-1,k-1,p);
            return a[n][k];

        }*/
        public static void main(String [] args)
        {
            double num=B(10,5,0.5);
            System.out.println(num);
        }
    }


