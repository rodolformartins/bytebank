package bytebank;

public class testeCliente {
	public static void main(String[] args) {
		
		Conta contaDoRodolfo = new Conta(1235, 123);
		
		contaDoRodolfo.setNumero(123);
		
		contaDoRodolfo.setAgencia(655);
		
		contaDoRodolfo.deposita(-155);
		
		Cliente rodolfo = new Cliente();
		
		contaDoRodolfo.setTitular(rodolfo);
		
		contaDoRodolfo.getTitular().setNome("Rodolfinho");
		
		
		System.out.println(contaDoRodolfo.getSaldo());
		
		System.out.println(contaDoRodolfo.getTitular().getNome());
		
		
	}

}
