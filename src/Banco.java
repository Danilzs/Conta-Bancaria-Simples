import java.util.Scanner;

public class Banco {

   Conta conta = new Conta();

    public void depositar(float deposito){
        float saldoAtual = conta.getSaldo() + deposito;
        conta.setSaldo(saldoAtual);
        System.out.println("Saldo atual = " + conta.getSaldo());
    }

    public void sacarDinheiro(float valor){

        if(conta.getSaldo() >= -conta.getChequeEspecial()){

            float saldoAtual = conta.getSaldo() - valor;
            conta.setSaldo(saldoAtual);
            System.out.println("Dinheiro sacado com sucesso!");
        }else if(conta.usandoChequeEspecial()){
            System.out.println("Atenção: Você está utilizando cheque especial!");
        }


    }

    public void pagarBoleto(float valor) {
        Scanner dado = new Scanner(System.in);

        System.out.println("Escolha sua forma de pagamento: ");
        System.out.println("1 - Débito");
        System.out.println("2 - Cheque Especial");

        var opcao = dado.nextInt();

        switch (opcao) {
            case 1 -> {
                if(valor <= conta.getSaldo()) {
                    System.out.println("Boleto pago com sucesso!");
                } else{
                System.out.println("Saldo insuficiente!");
                }
            }
            case 2->{
                if(valor <= conta.getChequeEspecial()){

                    System.out.println("Boleto pago com sucesso!");
                }else{
                    System.out.println("Saldo insuficiente!");
                }
            }
            default -> System.out.println("Opção invalida!");
        }
    }



}
