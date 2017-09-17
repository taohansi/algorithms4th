
import java.io.*;

public class Main {
    public static String binaryString(int num )
    {
        String out="";

        int xiNum=num%2;

        while(num!=0)
        {
            out=Integer.toString(xiNum)+out;
            num=num/2;

            xiNum=num%2;

        }
        return  out;

    }
    public static void main(String[] args) throws IOException
    {
        String c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=br.read();
        a=a-48;
       c=binaryString(a);

        System.out.println(c);
    }
}
