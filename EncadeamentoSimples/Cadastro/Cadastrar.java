package Cadastro;

import java.util.Scanner;

public class Cadastrar {
	private Scanner scan;

	public void cadastro() {
		PilhaEncadeada pilha = new PilhaEncadeada();
		scan = new Scanner(System.in);
		int valor=0;
		do {
			valor = scan.nextInt();
			if(valor>0)
				pilha.insereFim(valor);
		}while(valor>0);
		FilaEncadeada filaPar = new FilaEncadeada();
		FilaEncadeada filaImpar = new FilaEncadeada();
		No valorNo = pilha.getCabeca();
		for(int i =0;i<pilha.getTam();i++) {
				valor = valorNo.getValor();
				if(valor%2==0)
					filaPar.insereFim(valor);
				else
					filaImpar.insereFim(valor);
				valorNo = valorNo.getProximo();
		}
		System.out.println("Fila Par:");
		filaPar.imprimirFila();
		System.out.println("Fila Impar:");
		filaImpar.imprimirFila();
	}
}
