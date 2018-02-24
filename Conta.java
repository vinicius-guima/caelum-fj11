 public class Conta{
    
	private int numero;
	private String titular;
	private double saldo;
	private double limite; 
	private String agencia;
	private String datadeabertura;

	public Conta(){
		limite = 1000;
	}

	public Conta (String titular){
		this.titular = titular;
	}

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
	
	public int getNumero(){
		return numero;
	}

	public void setNumero (int numero){
		this.numero = numero;
	}

	public String getTitular(){
		return titular;
	}

	public  void setTitular(String titular){
		this.titular = titular;
	}
		
	public double getSaldo(){
		return saldo;
	}
		
	public double getLimite(){
		return limite;
	}
	
	public void setLimite(double limite){
		this.limite = limite;
	}
}


















	

