package Vectores;

public class Multidimensional
{
    public static void main(String args[])
    {
        // declarar e inicializar array 2D
        int arr[][] = { {2,7,9,5,7},{3,6,1,4,9},{7,4,2,3,1},{4,6,8,7,4},{3,6,9,8,3}};
 
        // imprimir array 2D
        for (int i=0; i< 5 ; i++)
        {
            for (int j=0; j < 5 ; j++) {
                System.out.print(arr[i][j] + " ");
            }
 
            System.out.println();
        }
    }
}