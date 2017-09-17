import java.util.Arrays;
public class BinarySearch {
    static int count=0;
    public static int rank(int key,int []arr,int low,int high)
    {
        count++;
        String str="";
        for(int i=0;i<count;i++)
            str+=" ";
        System.out.println(str+low+high);
        if(low<=high){
            int mid=low+(high-low)/2;
            if(key<arr[mid]) {
                return rank(key, arr, low, mid - 1);
            }
            if(key>arr[mid]) {
                return rank(key, arr, mid + 1, high);
            }
            return arr[mid];

        }
            else
                return -1;


    }
    public static void main(String [] args)
    {
        int n=5;
        int[] a=new int [n];
        for(int i=0;i<n;i++)
            a[i]=i;
        int key=1;

        int num=rank(key,a,0,a.length-1);


    }
}
