package br.com.crateus.ufc.eda.graph.test;

import br.com.crateus.ufc.eda.graph.AdjacencyListGraph;

public class Main {

	public static void main(String[] args) {
		AdjacencyListGraph<Integer> graph = new AdjacencyListGraph<Integer>(5);
		
		//adiciona uma aresta entre os v�rtices v1 e v2
		graph.addEdge(1, 2);
		graph.addEdge(3, 4);
		graph.addEdge(1,4);
		
		// retorna o n�umero de v�ertices do grafo
		System.out.println(graph.countVertices());
		
		// retorna o n�umero de arestas do grafo
		System.out.println(graph.countEdges());
		
		//retorna o indice do v�rtice v, que indica, na sequ�ncias de inser��es, a posi��o de inser��o do v�rtice
		System.out.println(graph.index(1));
		
		//retorna o r�tulo do v�rtice cujo indice � index
		System.out.println(graph.label(3));
		
		//verifica se existe v�rtice com r�tulo v
		System.out.println(graph.contains(5));
		
		//retorna os v�rtices adjacentes a v
		System.out.println(graph.adjacents(1));
		
		//retorna o grau do v�rtice v
		System.out.println(graph.degree(4));
	}

}