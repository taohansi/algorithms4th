public class histogram {
    public static int[] histogram(int [] a,int length)
    {
        int [] arr=new int [length];
        int j=0;
        while(j<length) {
            for (int i = 0; i < a.length; i++) {
                if(j==a[i])
                    arr[i]++;
            }
            j++;
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int size=5;
        int [] a=new int [size];
        for(int i=0;i<5;i++)
        {
            a[i]=i;
        }
        int m=6;

        int [] b=new int [m];
        b=histogram(a,m);
        for(int j=0;j<m;j++)
        {
            System.out.println(b[j]);
        }


    }
}
