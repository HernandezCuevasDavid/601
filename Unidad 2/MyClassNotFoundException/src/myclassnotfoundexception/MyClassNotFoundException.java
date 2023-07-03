package myclassnotfoundexception;

public class MyClassNotFoundException {

    public static void main(String[] args) {
        try {
            Class.forName("Gabriel");
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontro la clase "+e.getMessage());
        }
    }
}