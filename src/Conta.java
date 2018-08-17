public class Conta {

	// Temos 4 atributos - características - o que toda conta tem.
	
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular;
	
	//comportamentos - o que toda conta faz. - MÉTODOS, maneira de fazer algo.
	// nome do método - deposita, 
	//entre parenteses o que recebe, no caso o valor e o tipo da variável valor, no caso double.
	//nesse caso não terá retorno, então ele é um void.
	
	
	public void deposita(double valor) {
		
		//saldo é um atributo por isso está azul. Valor é uma variável normal.
		this.saldo += valor; //this.saldo = this.saldo + valor;
		
	}
	
	// já sei em que conta estou, eu já estou orientado a um objeto.
	
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
