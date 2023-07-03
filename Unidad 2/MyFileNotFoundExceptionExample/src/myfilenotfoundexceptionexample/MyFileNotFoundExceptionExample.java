package myfilenotfoundexceptionexample;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class MyFileNotFoundExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("archivo.txt"));
            String linea;
            } 
        catch (FileNotFoundException e) {
            System.out.println("El archivo no pudo ser encontrado: " + e.getMessage());
        }
    }
}