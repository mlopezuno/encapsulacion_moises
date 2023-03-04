public class CuentaBanco {
    private String propietario;
    private double saldo;

    //constructor
    public CuentaBanco(String propietario, double saldoInicial){
        this.propietario = propietario;
        this.saldo = Math.max(saldoInicial, 0);
    }

    //Metodo para retirar dinero
    public double getretiro(double cantidad){
        if (cantidad<= this.saldo){
            this.saldo = this.saldo - cantidad;
            return cantidad;
        }
        return 0;
    }

    //Metodo - Representar un deposito
    public double getdeposito(double cantidad){
        this.saldo=cantidad+this.saldo;
        return cantidad;
    }

    public String getPropietario(){
        return propietario;
    }

    public double getSaldo(){
        return saldo;
    }
}
