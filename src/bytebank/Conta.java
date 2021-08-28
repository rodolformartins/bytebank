package bytebank;

public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;
    
    
    
    //M�todo deposita
    public void deposita(double valor){
    	this.saldo += valor;
    }
    
    
    //M�todo saca
    public boolean saca(double valor) {
    	if(saldo >= valor) {
    		this.saldo -= valor;
    		return true;
    	}
    	return false;
    }
    
    
    //M�todo para transferir dinheiro
    public boolean transfere(double valor, Conta destino) {
    	if(this.saldo >= valor) {
    		saca(valor);
    		destino.deposita(valor);
    		return true;
    	}
    	return false;
    }
    
   
    
    
    
    
    
    
}
