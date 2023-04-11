package revisão;

public class TiposPrimitivos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Declarar uma variável int com o valor 2147483647
//		Incrementar o valor da variável em 1
//		Imprimir o valor na tela
//		Decrementar o valor da variável em 1
//		Imprimir o valor na tela
//		Criar uma variável do tipo long e atribuir a ela o valor da variável 
//		int criada inicialmente
//		Incrementar o valor da variável tipo long em 10000
//		Imprimir o valor da variável tipo long

		
		int valorInicial = 2147483647;
		valorInicial++;
		System.out.println(valorInicial);
		valorInicial--;
		System.out.println(valorInicial);
		long valorFinal = valorInicial;
		valorFinal = valorFinal + 10000;
		System.out.println(valorFinal);
	}

}