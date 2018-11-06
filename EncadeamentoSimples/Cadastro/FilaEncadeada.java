package Cadastro;

import PilhaEncadeada.No;

public class FilaEncadeada {
	
	private No cabeca;
	public FilaEncadeada() {
		cabeca = null;
	}
	public Integer insereFim(Integer valor) {
		if(cabeca == null) {
			cabeca = new No(valor,null);
			return valor;
		}
		No aux=cabeca;
		cabeca=new No(valor,null);
		cabeca.setProximo(aux);
		return valor;
	}
	public No getCauda() {
		No aux = cabeca;
		if(aux==null)
			return null;
		while(aux.getProximo()!=null) {
			aux=aux.getProximo();
		}
		return aux;
		
	}
	public No getPenultimo(){
		No aux = cabeca;
		if(aux == null){
			return null;
		}
		while(aux.getProximo().getProximo() != null){
			aux = aux.getProximo();
		}
		return aux;
	}
	public Integer removeInicio() {
		if(cabeca==null) {
			System.out.println("Não existe elementos para remover. ");
			return null;
		}
		getPenultimo().setProximo(null);
		return null;
		
	}
	public void imprimirFila() {
		No aux = cabeca;
		if(cabeca==null) {
			System.out.println("Fila vazia.");
			return;
		}
		for(aux = cabeca;aux!=null;aux=aux.getProximo()) {
			System.out.println(aux.getValor());
		}
	}
	
}
