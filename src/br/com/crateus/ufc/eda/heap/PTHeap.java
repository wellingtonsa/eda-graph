package br.com.crateus.ufc.eda.heap;

public class PTHeap<K extends Comparable<K>, V> implements Heap<K, V> {

	protected HNode root;

	protected class HNode {
		K key;
		V value;
		int dist;
		HNode left;
		HNode right;

		public HNode(K key, V value) {
			this.key = key;
			this.value = value;
			this.dist = 0;
		}
	}

	@Override
	public void insert(K key, V value) {
		root = merge(new HNode(key, value), root);
	}

	@Override
	public V findMin() {
		return root.value;
	}

	@Override
	public void deleteMin() {
		root = merge(root.left, root.right);
	}

	@Override
	public boolean isEmpty() {
		return root == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}
	
	
	public HNode merge(HNode h1, HNode h2) {
	    if (h1 == null) 
	        return h2; 
	    if (h2 == null) 
	        return h1; 
	    if (h1.key.compareTo(h2.key) < 0)
	        return mergeMethod(h1, h2); 
	    else 
	        return mergeMethod(h2, h1);
	}
	
	

	private HNode mergeMethod(HNode h1, HNode h2) {
	    if (h1.left == null) {
	    	 h1.left = h2; 
	    }
	    else{ 
	        h1.right = merge(h1.right, h2); 
	        if (h1.left.dist < h1.right.dist) 
	            h1 = swapChildren(h1); 
	        h1.dist = h1.right.dist + 1; 
	    } 
	    return h1; 
	}

	private HNode swapChildren(HNode h1) {
		HNode temp = h1.left;
		h1.left = h1.right;
		h1.right = temp;
		return h1;
		
	}
}
