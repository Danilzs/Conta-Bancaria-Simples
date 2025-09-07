import java.util.Scanner;

public class Banco {

    Conta conta = new Conta();

    public void depositar(float deposito) {
        float saldoAtual = conta.getSaldo() + deposito;
        conta.setSaldo(saldoAtual);
        System.out.println("Saldo atual = " + conta.getSaldo());
    }

    public void sacarDinheiro(float valor) {

        if (conta.getSaldo() >= -conta.getChequeEspecial()) {

            float saldoAtual = conta.getSaldo() - valor;
            conta.setSaldo(saldoAtual);
            System.out.println("Dinheiro sacado com sucesso!");
        } else if (conta.usandoChequeEspecial()) {
            System.out.println("Atenção: Você está utilizando cheque especial!");
        }


    }

    public void pagarBoleto(float valor) {
        Scanner dado = new Scanner(System.in);
        System.out.println("Informar o valor do Boleto: ");
        System.out.println("Escolha sua forma de pagamento: ");
        System.out.println("1 - Débito");
        System.out.println("2 - Cheque Especial");

        var opcao = dado.nextInt();

        switch (opcao) {
            case 1 -> {
                if (valor <= conta.getSaldo()) {
                    float saldoAtual = conta.getSaldo() - valor;
                    conta.setSaldo(saldoAtual);
                    System.out.println("Boleto pago com sucesso!");
                    System.out.println("Saldo atual = " + saldoAtual);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            }
            case 2 -> {
                if (valor <= conta.getChequeEspecial()) {

                    System.out.println("Boleto pago com sucesso!");
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            }
            default -> System.out.println("Opção invalida!");
        }
    }

    public void verificarConta(String entrada) {
        if (entrada.equalsIgnoreCase("s")) {
            System.out.println("Você já possui uma conta!");
            Scanner dado = new Scanner(System.in);
            operacoes();

        } else {
            Scanner dado = new Scanner(System.in);
            System.out.println("Vamos criar sua conta! Deposite algum valor para criar a conta: ");
            var valorInicial = dado.nextFloat();
            conta.criarConta(valorInicial);
            operacoes();

            }
        }


    public void operacoes(){
        Scanner dado = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 6){

            System.out.println("Operações disponiveis: ");
            System.out.println("1 - Consultar saldo.");
            System.out.println("2 - Consultar Cheque especial.");
            System.out.println("3 - Realizar depósito.");
            System.out.println("4 - Sacar dinheiro.");
            System.out.println("5 - Pagar boleto.");
            System.out.println("6 - Exit.");

            System.out.println("Escolha uma opção: ");
            opcao = dado.nextInt();
            
            switch (opcao) {
                case 1 -> conta.consultarSaldo();
                case 2 -> conta.consultarChequeEspecial();
                case 3 -> {
                    System.out.println("Insira o valor do depósito: ");
                    depositar(dado.nextFloat());
                }
                case 4 -> {
                    System.out.println("Informar o valor a ser retirado: ");
                    sacarDinheiro(dado.nextFloat());
                }
                case 5 ->{
                    System.out.println("Informar o valor do boleto: ");
                        pagarBoleto(dado.nextFloat());
                }
                case 6 -> System.out.println("Saindo do sistema...");
            }
        }

    }
    }


