public class Cajero extends Thread{
    
    Cuenta cuentaCompartida = new Cuenta();
    
    @Override
    public void run(){
        for (int i = 0; i < 2; i++) {
            System.out.println("Iteración: "+(i+1));
            try {
                retirando(200);
                sleep(3000);
                depositando(100);
                System.out.println("");
            } catch (InterruptedException ex) {
                System.out.println("Error al ejecutar el run en Cajero");
            }
        }
    }


    private synchronized void retirando(int retirando) {
        if (cuentaCompartida.getSaldoGlobal()>=retirando){            
            cuentaCompartida.retiro(retirando);
            System.out.println("El "+Thread.currentThread().getName()+" acaba de hacer un retiro de $"+retirando);
            System.out.println("El nuevo saldo tras el retiro es de :"+cuentaCompartida.getSaldoGlobal());
        }else{
            System.out.println("No hay plata papito, vaya otro cajero");
        }
    }
    
    private synchronized void depositando(int depositando) {
        System.out.println("El "+Thread.currentThread().getName()+" acaba de hacer un deposito de $"+depositando);
        cuentaCompartida.deposito(depositando);
        System.out.println("El nuevo saldo tras el deposito es de: $"+cuentaCompartida.getSaldoGlobal());
    }
}