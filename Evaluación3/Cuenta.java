public class Cuenta {
    private int saldoGlobal=1000;

    public int getSaldoGlobal() {
        return saldoGlobal;
    }

    public void setSaldoGlobal(int saldoGlobal) {
        this.saldoGlobal = saldoGlobal;
    }
    
    public void retiro(int montoRetiro){
        saldoGlobal = saldoGlobal- montoRetiro;
    }
    public void deposito(int montoDepositar){
        saldoGlobal+=montoDepositar;
    }
}
