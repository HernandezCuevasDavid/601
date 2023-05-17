/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.v1.trifit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author yeihb
 */
public class V1Trifit {

    public static void main(String[] args) throws IOException {
           
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
            
            int numero;
            float mul3;
            float mul5;
        System.out.println("Dame el nuemro: ");
        numero = Integer.parseInt ( bufEntrada.readLine()); 
        
        mul3 =numero%3;
        mul5=numero%5;
        
        if(mul3==0){
            System.out.println("TRI");
        }
        if(mul5==0){
            System.out.println("FIV");
        }
        if(mul3==0 && mul5==0){
            System.out.println("TRIFIV");
        }
        
        
    }
    
}
