package bytebank;

public class TestaMetodos {
	public static void main(String[] args) {
	Conta contap1 = new Conta();
	
	Conta contap2 = new Conta();
	
	contap1.deposita(300);
	
	contap1.saca(100);
	
	contap1.transfere(100, contap2);
	
	System.out.println("Conta p1 possui: R$" +contap1.saldo);
	
	
	System.out.println("Conta p2 possui: R$" + contap2.saldo);
}
}
