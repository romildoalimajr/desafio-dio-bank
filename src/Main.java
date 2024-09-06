
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente romildo = new Cliente();
		romildo.setNome("Romildo");
		
		Conta cc = new ContaCorrente(romildo);
		Conta cp = new ContaPoupanca(romildo);
		
		Gerente gerente = new Gerente();
			
		cc.imprimirExtrato();
		System.out.println();
		cp.imprimirExtrato();
		
		cc.depositar(1500.00);
		cp.depositar(1000.00);
		
		cc.transferir(130.00, cp);
		cc.imprimirExtrato();
		
		System.out.println();
		cp.imprimirExtrato();
		
		gerente.aplicarLimite(cc, null);
		
		cc.imprimirExtrato();
		
	}

}
