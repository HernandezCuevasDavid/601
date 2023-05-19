package pkg3.v2trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V2TRIFIV {

    public static void main(String[] args) throws IOException {
         BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
            //DECKARACION DE VARIABLES
            int numero;
            float mult3;
            float mult5;
            //ENTRADA DE DATOS
        System.out.println("Dame el nuemro: ");
        numero = Integer.parseInt ( bufEntrada.readLine());
        
        //PROCESAR DATOS
        
        mult3=numero%3;
        mult5=numero%5;
        //SALIDA DE DATOS 
        
        if(mult3==0 && mult5==0){
            System.out.println("TRIFIV");
        }
        else if(mult3==0){
            System.out.println("TRI");
        }
        else if(mult5==0){
            System.out.println("FIV");
        }
    
    }
    
}
