package excepciones;
import javax.swing.JOptionPane;
public class Excepciones {

    public static void main(String[] args) {
        int x,y;
        try{
        x=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número 1:", "Solicito datos",3));
        //parseInt es 
        }catch (NumberFormatException n){
            System.out.println(n.getMessage()+"No es un numero ENTERO");
        }
    }
    
}
