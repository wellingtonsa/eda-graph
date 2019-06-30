package br.com.crateus.ufc.eda.heap;

public interface Heap<K, V> {

	void insert(K key, V value);
	V findMin();
	void deleteMin();
	boolean isEmpty();
	boolean isFull();
}
