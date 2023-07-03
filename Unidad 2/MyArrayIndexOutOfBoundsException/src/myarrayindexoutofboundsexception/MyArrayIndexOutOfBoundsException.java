package myarrayindexoutofboundsexception;

public class MyArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        int[] array= {1,2,3};
            int x;
        try {
           x=array[3];
        } 
        catch (ArrayIndexOutOfBoundsException n) {
            System.out.println(n.getMessage()+" No es registro dentro del Array");
          }    
       }
    }