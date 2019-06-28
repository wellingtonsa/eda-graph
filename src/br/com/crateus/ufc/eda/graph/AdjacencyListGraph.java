package br.com.crateus.ufc.eda.graph;

import java.util.LinkedList;

import br.com.crateus.ufc.eda.st.LinearProbingHashST;

public class AdjacencyListGraph<T extends Comparable<T>> implements Graph<T> {

	private final int V;
	private int E;
	private LinearProbingHashST<T, LinkedList<T>> adj;

	public AdjacencyListGraph(int V) {
		this.V = V;
		this.E = 0;
		this.adj = new LinearProbingHashST<T, LinkedList<T>>();
		
		for (Integer v = 0; v < V; v++) {
			this.adj.put((T) v, new LinkedList<T>());
		}
	}

	@Override
	public int countVertices() {
		return V;
	}

	@Override
	public int countEdges() {
		return E;
	}

	@Override
	public int index(T v) {
		return adj.getIndex(v);
	}

	@Override
	public T label(int index) {
		int count = 0;

		for (T v : adj.keys()) {
			if (count == index)
				return v;
			count++;
		}

		return null;
	}

	@Override
	public boolean contains(T v) {
		return adj.contains(v);
	}

	@Override
	public void addEdge(T v1, T v2) {
		if(!adj.get(v1).contains(v2) && !adj.get(v2).contains(v1)) {
			adj.get(v1).add(v2);
			adj.get(v2).add(v1);
			this.E++;
		}
	}

	@Override
	public Iterable<T> adjacents(T v) {
		return adj.get(v);
	}

	@Override
	public int degree(T v) {
		return adj.get(v).size();
	}

}
