
public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(200));
		
		
		// n�o pode ser lido System.out.println(conta.saldo);
		System.out.println(conta.getSaldo());
		//n�ao conseguimos ler o saldo.
		// precisamos de uma maneira de .. = m�todo, criar um m�todo para ler o saldo
		
		
		//n�o acessar o atributo, chamar os m�todos (saca, deposita, transfere)
		//pribido conta.saldo = conta.saldo - 101;
		//n�o queremos que o saldo seja acessado de forma direta;
		
		//private, o atributo n�o pode ser alterado e nem lido por outra classe,
		//que n�o seja sua classe de origem.
		
		conta.numero = 1377;
		System.out.println(conta.numero);
		
	}

}
