import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        var nome = entrada.next();
        System.out.printf("Olá %s, seja bem vindo ao banco C5! Você ja possui uma conta? s/n \n" , nome);
        banco.verificarConta(entrada.next());

    }
    }
