//Castro Villaroel
public class Main {

    public static void main(String[] args) {
        Cajero cajero = new Cajero();
        
        Thread clienteA = new Thread(cajero ,"Cliente A");
        Thread clienteB= new Thread(cajero,"Cliente B");
        
        clienteA.start();
        clienteB.start();
    }
}