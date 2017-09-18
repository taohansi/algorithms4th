public class BinarySearch {
    static int count;
    public static int counter(int key,int arr[],int low,int high)
    { int temp;

      int mid=0;
        while(low<high)
            {
                 mid = low + (high - low) / 2;
                if (key > arr[mid]) {
                    low = mid + 1;

                }
                else if (key < arr[mid]) {
                    high = mid - 1;

                }
                else
                    break;
            }
                while (key == arr[mid]) {

                    temp=mid;
                    while(key==arr[temp])
                    {
                        temp--;
                        count++;
                    }
                    while(key==arr[mid])
                    {
                        mid++;
                        count++;
                    }
                    return count-1;
                }


        return -1;
    }
    public static int rank(int key,int [] arr,int low,int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key > arr[mid]) {
                low = mid + 1;
                  return rank(key,arr,low,high);
            }
            if (key < arr[mid]) {
                high = mid - 1;
                 return rank(key,arr,low,high);
            }
            while (key == arr[mid] && mid > 0) {
                mid--;
            }

            return mid + 1;
        }
        return -1;

    }
    public static void main(String [] args)
    {
        int []a=new int[10];
        for(int i=0;i<10;i++)
            a[i]=i;
        a[3]=2;
        int ran=rank(2,a,0,9);
        int cou=counter(2,a,0,9);
        System.out.println(ran+" "+cou);
    }
}
