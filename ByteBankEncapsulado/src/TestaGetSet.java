
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		// conta.numero=1337; (nao compila devido ao private;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		// conta.titular = paulo;
		
		conta.setTitular(paulo);
		paulo.setNome("Paulo silveira");
		
		System.out.println(conta.getTitular().getNome());
		
		//para acessar modificar a profissao
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
		
		//poderia ser feito em duas partes
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);//vai dar sujeira pois está parado no titular
	}
		
		
	
}
