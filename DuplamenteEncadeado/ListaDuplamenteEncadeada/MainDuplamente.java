package ListaDuplamenteEncadeada;

public class MainDuplamente {
	public static void main(String[] args) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		lista.insereFim(new NoDuplo(3,null,null));
		lista.insereFim(new NoDuplo(12,null,null));
		lista.insereInicio(new NoDuplo(10,null,null));
		lista.insereInicio(new NoDuplo(2,null,null));
		lista.insereFim(new NoDuplo(150,null,null));
		lista.insereFim(new NoDuplo(33,null,null));
		
		ListaDuplamenteEncadeada lista2 = new ListaDuplamenteEncadeada();
		lista2.insereFim(new NoDuplo(1,null,null));
		lista2.insereFim(new NoDuplo(12,null,null));
		lista2.insereInicio(new NoDuplo(10,null,null));
		lista2.insereInicio(new NoDuplo(2,null,null));
		lista2.insereFim(new NoDuplo(150,null,null));
		lista2.insereFim(new NoDuplo(33,null,null));
		
		lista.imprimirLista();
		lista2.imprimirLista();
		testar(lista,lista2);
		//testar(lista,lista2);
		
	}
	public static void testar(ListaDuplamenteEncadeada list,ListaDuplamenteEncadeada list2) {
		int cont=0;
		if(list.getTam()==list.getTam()) {
			NoDuplo aux1=list.getHead();
			NoDuplo aux2=list2.getHead();
			for(int i=0;i<list.getTam();i++) {
				if(aux1.getValor().equals(aux2.getValor()))
					cont++;
				aux1=aux1.getProximo();
				aux2=aux2.getProximo();
			}
		}
		if(cont==list.getTam())
			System.out.println("São iguais");
		else
			System.out.println("Não são iguais");
	}
	
}
