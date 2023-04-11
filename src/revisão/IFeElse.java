package revisão;

public class IFeElse {

	public static void main(String[] args) {
		
//		Criar uma inteiro e atribuir uma idade
//		Se idade menor que 6 anos, imprimir “Ensino Infantil”
//		Se idade entre 6 e 10, imprimir “Fundamental 1”
//		Se idade entre 11 e 14, imprimir “Fundamental 2”
//		Se idade entre 15 e 17, imprimir “Ensino médio”
//		Se idade maior que 17, imprimir “Graduação”
//		Se idade menor que 0, imprimir “idade inválida”
		
		int idade = 5;
		
		if (idade < 0) {
			System.out.println("Idade Invalida");
		}else if(idade < 6) {
			System.out.println("Ensino Infantil");
		}else if(idade<=10) {
			System.out.println("Fundamental 1");
		}else if (idade <= 14) {
			System.out.println("Fundamental 2");
		}else if (idade < 18) {
			System.out.println("Ensino Médio");
		}else{
			System.out.println("Graduação");
		}
	}
}
