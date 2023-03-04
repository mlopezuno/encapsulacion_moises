import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Instancia de cuenta de banco
        CuentaBanco cuentaBanco = new CuentaBanco("Moi Lopez", 1000);

        //ACTIVIDAD:
        //Retirar 500
        System.out.println("Se ha hecho un retiro de "+ cuentaBanco.getretiro(500)+" Tu saldo restante es de "+cuentaBanco.getSaldo());

        //Depositar 5,000
        System.out.println("Se ha hecho un deposito de "+cuentaBanco.getdeposito(5000)+" Tu saldo restante es de "+cuentaBanco.getSaldo());

        //Retirar  2,000
        System.out.println("Se ha hecho un retiro de "+cuentaBanco.getretiro(2000)+" Tu saldo restante es de "+cuentaBanco.getSaldo());


        //Imprime el nombre del propietario de la cuenta
        System.out.println("El nombre del propietario de la cuenta es "+cuentaBanco.getPropietario());

        //Imprime el saldo actual del propietario
        //System.out.println("El saldo restante de la cuenta es "+cuentaBanco.getSaldo());
    }
}