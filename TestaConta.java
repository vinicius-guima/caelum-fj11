class TestaConta{
	public static void main(String[] args){
/*		Conta conta = new Conta();
		System.out.println(conta);
		conta.numero = 224;
		conta.titular = "Collor";
		conta.saldo = 20000.0;
		conta.limite = 5000.0;
		conta.mostra();
		boolean saca = conta.saca(-10000.0);
		    if(saca){
			System.out.println("sacado");
		    }else{
			System.out.println("Erro ao sacar");
			 }
		conta.mostra();
	}
		
}

*/
	Conta c1 = new Conta();// exercicio 1, 2, 3 pag 46
	
	c1.titular = "Hugo";
	c1.numero = 123;
	c1.agencia = "45678-9";
	c1.saldo = 50.0;
	c1.datadeabertura = "04/06/2015";

	c1.deposita(100.0);
	System.out.println("saldo atual " + c1.saldo);
	System.out.println("rendimento mensal " + c1.caulcularendimento());

	System.out.println(c1.recuperaDadosParaImpressao());
	}
}
