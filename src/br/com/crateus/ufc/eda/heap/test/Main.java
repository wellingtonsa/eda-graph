package br.com.crateus.ufc.eda.heap.test;

import br.com.crateus.ufc.eda.heap.PTHeap;

public class Main {

	public static void main(String[] args) {
		PTHeap<Integer, String> heap = new PTHeap<Integer, String>();
		
		//insere novo no na heap
		heap.insert(1, "Joao");
		heap.insert(2, "Maria");
		heap.insert(3, "Jose");
		heap.insert(0, "Antonio");
		heap.insert(10, "Josa");
		heap.insert(11, "Antonia");
		heap.insert(20, "Joelma");
		heap.insert(5, "Desterro");
		
		//retorna o menor no
		System.out.println(heap.findMin());
		
		//retorna se a heap está vazia
		System.out.println(heap.isEmpty());
		
		//remove o menor no
		heap.deleteMin();
		System.out.println(heap.findMin());
	}

}
