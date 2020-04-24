import java.util.Arrays;
public class Array
{
    public static int [] b = new int [10];
    public Array(){
    }

    public static int[] regresaPosicion(int []t, int num, int indice, int i){
        if(indice != t.length-1)
            if(t[indice]==num){
                b[i]=indice;
                regresaPosicion(t, num, indice+1, i+1);

            }
            else{
                regresaPosicion(t, num, indice+1, i+1);
            }
            return b;

    }

    public static void main(String [] args){
        int [] a = {1,2,3,3,3,4,5,6,6,2};
        System.out.println(Arrays.toString(regresaPosicion(a,3,0,0)));
    }

}
