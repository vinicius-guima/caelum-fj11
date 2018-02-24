class TestaContaComModificador{
	public static void main(String[] args){
		Conta c1 = new Conta();
		c1.saldo = 10000;
		c1.deposita(20000);
		System.out.println(c1.recuperaDadosParaImpressao());

	}

}
