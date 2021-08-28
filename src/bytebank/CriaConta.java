package bytebank;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 200;
        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
        primeiraConta.saldo += 100;
        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);


        Conta segundaConta = new Conta();

        segundaConta.saldo = 50;

        System.out.println("Primeira conta tem: " + primeiraConta.saldo);
        System.out.println("Segunda conta tem: " + segundaConta.saldo);


        //Verificando o endereco de cada objeto
        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}
