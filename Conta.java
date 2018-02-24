class Conta{
    
	int numero;
	String titular;
	double saldo;
	double limite; 
	String agencia;
	String datadeabertura;

	boolean saca(double valor){
		if (valor > 0){
		    if (saldo + limite >= valor){
			saldo -= valor;	
			return true;
		    }	
		} 
		return false;
	}
	
	String recuperaDadosParaImpressao(){
		String dados = "\nTitular; " + this.titular;
		
		//dados += "\nDia; " + this.dataDeAbertura.dia;
		//dados += "\nMes; " + this.dataDeAbertura.mes;
		//dados += "\nAno; " + this.dataDeAbertura.ano;
		return dados;
 	}
	 
	void deposita(double valor){
		saldo += valor;
	}

	void transfere(Conta destino, double valor){
		if(saca(valor)){
			destino.deposita(valor);		
		}			
		
	}
	
	double caulcularendimento(){
		return saldo *= 0.1;
		
	}
}
