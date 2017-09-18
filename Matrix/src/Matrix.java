import java.util.
public class Matrix {
    public static double dot(double [] x,double [] y){
        if(x.length==y.length){
            int sum=0;
            for(int i=0;i<x.length;i++){
                sum+=x[i]*y[i];
            }
            return  sum;
        }
            else
                return -1;
    }
    public static double [][] mult(double [][]a,double [][] b){

    }
    public static void main(String []args)
    {

    }
}
