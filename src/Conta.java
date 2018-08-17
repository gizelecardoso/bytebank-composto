public class Conta {

	// Temos 4 atributos - caracter�sticas - o que toda conta tem.
	
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular;
	
	//comportamentos - o que toda conta faz. - M�TODOS, maneira de fazer algo.
	// nome do m�todo - deposita, 
	//entre parenteses o que recebe, no caso o valor e o tipo da vari�vel valor, no caso double.
	//nesse caso n�o ter� retorno, ent�o ele � um void.
	
	
	public void deposita(double valor) {
		
		//saldo � um atributo por isso est� azul. Valor � uma vari�vel normal.
		this.saldo += valor; //this.saldo = this.saldo + valor;
		
	}
	
	// j� sei em que conta estou, eu j� estou orientado a um objeto.
	
	public boolean saca(double valor) {
		
		if(this.saldo>=valor) {
			this.saldo -= valor; //this.saldo = this.saldo - valor;
			
			return true;
		} else {
			return false;
			
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		if (this.saldo >= valor) {
			this.saldo -=valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
		
	}
	
	public double getSaldo() { //pegaSaldo.
		
		return this.saldo;
	}
	

}
