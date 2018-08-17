
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissão = "programador";
		
		Conta contaDoPaulo = new Conta ();
		contaDoPaulo.deposita(100);
		
		//composição dos objetos nessa linha. Objeto do tipo conta com a referência no titular para o objeto do tipo Cliente.
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);
		
		
	}

}
