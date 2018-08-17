
public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(200));
		
		
		// não pode ser lido System.out.println(conta.saldo);
		System.out.println(conta.getSaldo());
		//nçao conseguimos ler o saldo.
		// precisamos de uma maneira de .. = método, criar um método para ler o saldo
		
		
		//não acessar o atributo, chamar os métodos (saca, deposita, transfere)
		//pribido conta.saldo = conta.saldo - 101;
		//não queremos que o saldo seja acessado de forma direta;
		
		//private, o atributo não pode ser alterado e nem lido por outra classe,
		//que não seja sua classe de origem.
		
		conta.numero = 1377;
		System.out.println(conta.numero);
		
	}

}
