package excepciones1;

import javax.swing.JOptionPane;
public class Excepciones1 {

    public static void main(String[] args) {
    int x,y;
    
    try{
        x=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número 1","Solicito datos",3));
        y=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número 2","Solicito datos",3));
        JOptionPane.showMessageDialog(null,"La divicion de "+x+" y "+y+" es "+ (x/y),"mostrando resultado",1);
    }catch(NumberFormatException n){
        System.out.println(n.getMessage()+"No es un numero ENTERO");
    }
    catch (ArithmeticException a){
        System.out.println(a.getMessage()+ "No se pudo dividir entre 0");
    }
    }
    
}
