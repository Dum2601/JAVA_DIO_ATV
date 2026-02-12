import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        // Chamando a classe Scanner a instanciando como readKey (apesar da brincadeira com a linguagem C#, torna levemente mais legível para quem não entende a linguagem ainda)
        Scanner readKey = new Scanner(System.in);
        // Instanciando a class Conta
        Conta conta = new Conta();

        // Responsável por manter o menu CLI funcionando ao chamar o programa até que seja alterado
        int opcao = 0;

        while (opcao != 3) { // Faz com que o CLI continue sendo mostrando até finalizar
            System.out.println("\nDio Bank:");
            System.out.println("================================");
            System.out.println("1 - Ver o saldo.");
            System.out.println("2 - Solicitar valor.");
            System.out.println("3 - Sair.");
            System.out.print("Escolha uma opção: ");

            opcao = readKey.nextInt(); // A lógica do Menu (retorna a função da opção desejada)

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + conta.getBalance());
                    break;

                case 2:
                    System.out.print("Digite o valor a sacar: ");
                    double valor = readKey.nextDouble();

                    conta.setValorSolicitado(valor);
                    conta.sacar();
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        readKey.close();
    }
}

// Classe separada para melhor legibilidade
class Conta {
    // Atributos da classe utilizando do princípio do encapsulamento da Programação Orientada a Objetos
    private double saldo;
    private double valorSolicitado;

    // Construtor da classe
    public Conta() {
        this.saldo = 25.0;
        this.valorSolicitado = 18.0;
    }

    // Setter responsável por informar o valor
    public void setValorSolicitado(double valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
    }

    // Função interna para confirmar se o valor a ser retirado é menor
    private boolean balanceCheck() {
        return this.saldo > this.valorSolicitado;
    }

    // Função do saque de valor
    public void sacar() {
        if (balanceCheck()) {
            this.saldo = this.saldo - this.valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    // Getter para ter o saldo da conta atual informado
    public double getBalance() {
        return this.saldo;
    }
}
