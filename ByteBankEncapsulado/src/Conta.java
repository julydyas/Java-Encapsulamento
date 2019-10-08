public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	// o titular está apontando referencia ao objeto Cliente
	
	//metodo deposita, sempre precisa colocar o tipo da variavel)
	public void deposita(double valor) {
		// saldo=saldo + valor ou saldo +=valor
		this.saldo += valor; // this (substitui a conta do paulo
		
	}
	public boolean saca(double valor) {
		if (this.saldo>= valor) {
			this.saldo -= valor;
			return true;
		} else { 
			return false;
		}
			
	}
	public boolean transfere (double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
			} return false;
	}
	public double getSaldo() {
		return this.saldo;
	}
		public int getNumero() {
			return this.numero;
		}
		//neste caso não devolve nada por isso usa void
		public void setNumero (int numero) {
			this.numero = numero;
		}
		
		public int getAgencia() {
			return this.agencia;
		}
		
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		public Cliente getTitular() {
			return titular;
		}


	}
