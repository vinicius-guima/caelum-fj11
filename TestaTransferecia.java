class TestaTrasferencia{
	public static void main(String[] args){
		Conta origem = new Conta();
		origem.deposita(10000.0);
		origem.numero = 70;
		origem.titular = "Bolsonaro";
		Conta destino = new conta();
		dstino.deposita(30000.0);
		destino.titular = "pablo";
		destino.numero = 100;
		origem.mostra();
		destino.mostra();
		destino.mostra();
		origem.transfere(destino , 500);
		origem.mostra();
		destino.mostra();
		
	
	}


}
