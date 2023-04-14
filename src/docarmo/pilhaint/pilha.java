package docarmo.pilhaint;

public class pilha {
	
	No topo; 

	public pilha() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if(topo == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int e) {
		No elemento = new No();
		elemento.dado = e;
		if(isEmpty() ==  true) {
			topo = elemento;
		}else {
			elemento.proximo = topo;
			topo = elemento;
	 	 }
	}
	
	public int pop()throws Exception {
		if(isEmpty() == true) {
			throw new Exception("Não há elementos para desempilhar");	
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public int top() throws Exception {
		if(isEmpty()) {
			throw new Exception("Não há elementos na pilha");
		}
		int valor = topo.dado;
		return valor;
	}
	
	public int size() {
		int cont = 0;
		if(isEmpty() == false) {
			No auxiliar = topo;
			cont = 1;
			while (auxiliar.proximo != null) {
				auxiliar = auxiliar.proximo;
				cont++;
			}
		}
		return cont;
	}
}
