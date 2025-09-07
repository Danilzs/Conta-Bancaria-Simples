# Conta Bancária Simples

Este projeto é uma aplicação simples de gerenciamento de conta bancária em Java, permitindo ao usuário realizar operações básicas como depósito, saque, consulta de saldo, utilização de cheque especial e pagamento de boletos. Ele foi criado através da minha jornada de aprendizado no Bootcamp Java pela DIO.

---

## Demanda do Exercício

> **Escreva um código onde temos uma conta bancária que possa realizar as seguintes operações:**
> - Consultar saldo
> - Consultar cheque especial
> - Depositar dinheiro
> - Sacar dinheiro
> - Pagar um boleto
> - Verificar se a conta está usando cheque especial
>
> **Siga as seguintes regras para implementar:**
> - A conta bancária deve ter um limite de cheque especial somado ao saldo da conta.
> - O valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação.
> - Se o valor depositado na criação da conta for de R$500,00 ou menos, o cheque especial deve ser de R$50,00.
> - Para valores acima de R$500,00, o cheque especial deve ser de 50% do valor depositado.
> - Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.

---

## Funcionalidades

- **Criação de Conta**: O usuário pode criar uma conta informando um valor inicial de depósito, que define o limite do cheque especial conforme as regras acima.
- **Consulta de Saldo**: Consulta do saldo atual da conta.
- **Consulta de Cheque Especial**: Verifica o valor disponível de cheque especial.
- **Depósito**: Permite depositar valores na conta.
- **Saque**: Possibilita sacar dinheiro da conta, com verificação do cheque especial.
- **Pagamento de Boleto**: Realiza o pagamento de boletos utilizando saldo ou cheque especial, conforme escolha do usuário.
- **Verificação de Cheque Especial**: Identifica se o usuário está utilizando o cheque especial.

---

## Como executar

1. **Pré-requisitos**:
   - Java instalado (JDK 8 ou superior)
   - Terminal ou IDE (Eclipse, IntelliJ, etc.)

2. **Passos**:
   - Clone este repositório:
     ```sh
     git clone https://github.com/Danilzs/Conta-Bancaria-Simples.git
     ```
   - Compile os arquivos:
     ```sh
     javac src/*.java
     ```
   - Execute o programa principal:
     ```sh
     java -cp src Main
     ```

---

## Estrutura dos arquivos

- **Banco.java**: Gerencia as operações bancárias (depósito, saque, pagamento de boletos, etc).
- **Conta.java**: Representa a conta bancária do usuário, armazenando saldo e cheque especial, e implementa as regras de criação e uso do cheque especial.
- **Main.java**: Ponto de entrada do sistema; faz a interação inicial com o usuário e chama os métodos principais.

```
src/
 ├─ Banco.java
 ├─ Conta.java
 └─ Main.java
```

---

## Fluxo do programa

1. O usuário informa seu nome e se já possui uma conta.
2. Se não possuir, é solicitado um valor inicial para criar a conta e o cheque especial é definido conforme as regras.
3. Após a verificação/criação, são apresentadas as opções de operações:
    - Consultar saldo
    - Consultar cheque especial
    - Realizar depósito
    - Sacar dinheiro
    - Pagar boleto
    - Sair do sistema

Cada operação pode ser executada múltiplas vezes até que o usuário escolha sair.

---

## Exemplo de uso

```
Digite seu nome:
> João
Olá João, seja bem vindo ao banco C5! Você ja possui uma conta? s/n
> n
Vamos criar sua conta! Deposite algum valor para criar a conta:
> 1000
Conta criada com sucesso!
Seu saldo é de: 1000.0
Seu cheque especial possui um valor de: 500.0

Operações disponiveis:
1 - Consultar saldo.
2 - Consultar Cheque especial.
3 - Realizar depósito.
4 - Sacar dinheiro.
5 - Pagar boleto.
6 - Exit.
Escolha uma opção:
> 1
Saldo atual: 1000.0
...
```

---

## Autor

- [Danilzs](https://github.com/Danilzs)

---

## Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
