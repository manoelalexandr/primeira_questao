package primeira_questao;

import java.util.Locale;
import java.util.Scanner;

import entities.NotaFiscal;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		NotaFiscal nota = new NotaFiscal();
		int cont = 0;
		
		
		while(cont!=3) {
			System.out.println("Que opereção deseja realizar? ");
			System.out.println("1 - Cadastrar nota fiscal");
			System.out.println("2 - Mostrar dados e valores da Nota Fiscal");
			System.out.println("3 - Sair");
			cont = sc.nextInt();
			if(cont==1) {
				
				System.out.println("Informe o numero da peça: ");
				sc.nextLine();
				nota.setNumero(sc.nextLine());
				System.out.println("De a descriçao do produto: ");
				nota.setDescricao(sc.nextLine());
				System.out.println("Informe a quantidade desse produto: ");
				nota.setQuantidade(sc.nextInt());
				System.out.println("informe o preço do produto: ");
				nota.setPreco(sc.nextDouble());
				
				
			}else if(cont == 2) {
			
				System.out.println(nota);
			
			}else if(cont == 3) {
				System.out.println("Operação Finalizada!");
				
		}
			
		}
		sc.close();


	}

}
