package pkg4.v3trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V3TRIFIV {
    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
            //DECKARACION DE VARIABLES
            int numero;
            //ENTRADA DE DATOS
            System.out.println("Dame el nuemro: ");
        numero = Integer.parseInt ( bufEntrada.readLine());
     
        //SALIDA DE DATOS
        
        System.out.println(retornaMultiplo(numero));
        
    }
    
    
    //FUNCION
    
    public static String retornaMultiplo(int num){
            float mult3;
            float mult5;
            
        mult3=num%3;
        mult5=num%5;
        
        if(mult3==0 && mult5==0){
            return "TRIFIV";
        }
        else if(mult3==0){
            return "TRI";
        }
        else if(mult5==0){
            return "FIV";
        }
        return "Ningun valor";    
    }
}
