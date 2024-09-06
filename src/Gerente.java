import java.util.List;

public class Gerente {

	private List<Cliente> cliente;
	private List<Conta> conta;
	
	public void aplicarLimite(Conta conta, Cliente cliente) {
		
		conta.saldo += (conta.saldo / 3) * 5;
		
	}
	
	public void liberarEmprestimo(Conta conta, Cliente cliente) {
		
	}
}
