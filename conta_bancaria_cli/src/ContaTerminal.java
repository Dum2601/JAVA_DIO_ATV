import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Conta teste = new Conta();
        System.out.println(teste.getBalance());

    }
}



class Conta {
    private Scanner readKey = new Scanner(System.in);
    private double saldo;
    private double valorSolicitado;

    public Conta() {
        this.saldo = 25.0;
        this.valorSolicitado = 18.0;
    }

    private boolean balanceCheck(double valorSolicitado) {
        if (this.saldo > valorSolicitado) {
            return true;
        } else {
            return false;
        }
    }

    public void setSaldo(double valorSolicitado) {
        if (this.balanceCheck(valorSolicitado)){
            this.saldo = this.saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double getBalance() {
        return this.saldo -= this.valorSolicitado;
    }
}
