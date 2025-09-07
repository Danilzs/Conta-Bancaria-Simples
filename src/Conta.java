

public class Conta {

    private float saldo;
    private float chequeEspecial;

    Banco banco = new Banco();

    public void criarConta(float deposito){

        saldo = deposito;
        if(saldo <= 500){
            chequeEspecial = 50.0F;
        }else{
            chequeEspecial = (saldo/2);
        }
        System.out.println("Conta criada com sucesso!");
        System.out.println("Seu saldo é de: " + saldo);
        System.out.println("Seu cheque especial possui um valor de: " + chequeEspecial);
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }

    public void consultarChequeEspecial(){
        System.out.println("Cheque especial: " + chequeEspecial);
    }

    public boolean usandoChequeEspecial(){
        return saldo < 0;
    }


    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
