class TestaReferencia{
	public static void main(String[] args){
		Conta c1 = new Conta();
		c1.numero = 10;
		c1.titular = "Maluf";
		Conta c2 = new Conta();
		c2.numero = 10;
		c2.titular = "Maluf";
		System.out.println(c1 ==c2);
		c1 = c2;
		c2.numero = 20;
		System.out.println(c1.numero);
	}
}
