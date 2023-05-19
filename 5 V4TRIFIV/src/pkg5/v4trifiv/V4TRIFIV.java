package pkg5.v4trifiv;

import funciones.funcionMultiplo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V4TRIFIV {
    public static void main(String[] args) throws IOException {
        //crear objeto para mandar a llamar el metodo
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        //creo objerto 
        funcionMultiplo mult= new funcionMultiplo();
        //entrada de datos
        System.out.println("dame el numero");
        numero=Integer.parseInt(bufEntrada.readLine());
        
        //salida de datos
        
        System.out.println(mult.retornaMultiplo(numero));
    }
    
}
