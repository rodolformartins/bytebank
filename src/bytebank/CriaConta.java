package bytebank;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(123, 526);

        primeiraConta.setSaldo(200);
        System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());
        primeiraConta.setSaldo(100);
        System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());


        Conta segundaConta = new Conta(124, 158);

        segundaConta.setSaldo(50);
        
        System.out.println("total de contas criadas: " + Conta.getTotal());

        System.out.println("Primeira conta tem: " + primeiraConta.getSaldo());
        System.out.println("Segunda conta tem: " + segundaConta.getSaldo());


        //Verificando o endereco de cada objeto
        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}
