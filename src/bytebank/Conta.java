package bytebank;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
    
    
    
    //Criando o construtor da classe
    public Conta(int agencia, int numero) {
    	total++;
    	this.agencia = agencia;
    	this.numero = numero;
    	this.saldo = 100;
    	System.out.println("Criando uma conta");
    }
    
    
    
    
    //Método deposita
    public void deposita(double valor){
    	if(valor > 0) {
    	this.saldo += valor;
    	}
    	else {
    		System.out.println("Impossível depositar valor negativo!");
    	}
    }
    
    
    //Método saca
    public boolean saca(double valor) {
    	if(saldo >= valor) {
    		this.saldo -= valor;
    		return true;
    	}
    	return false;
    }
    
    
    //Método para transferir dinheiro
    public boolean transfere(double valor, Conta destino) {
    	if(this.saldo >= valor) {
    		saca(valor);
    		destino.deposita(valor);
    		return true;
    	}
    	return false;
    }
    
    
    //Métodos getters and setters
    
    public double getSaldo() {
    	return this.saldo;
    }
    
    public void setSaldo(double saldo) {
    	this.saldo = saldo;
    }
    
    
    public int getAgencia() {
    	return this.agencia;
    }
    
    public void setAgencia(int agencia) {
    	this.agencia = agencia;
    }
    
    public Cliente getTitular() {
    	return this.titular;
    }
    
    public void setTitular(Cliente titular) {
    	this.titular = titular;
    }
    
    
    
    public int getNumero() {
    	return this.numero;
    }
    
    public void setNumero(int numero) {
    	this.numero = numero;
    }
    
    public static int getTotal() {
    	return Conta.total;
    }
    
    
      	
   
    
    
    
    
    
    
}
