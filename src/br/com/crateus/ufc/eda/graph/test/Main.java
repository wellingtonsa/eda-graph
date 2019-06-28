package br.com.crateus.ufc.eda.graph.test;

import br.com.crateus.ufc.eda.graph.AdjacencyListGraph;
import br.com.crateus.ufc.eda.graph.AdjacencyMatrixGraph;

public class Main {

	public static void main(String[] args) {
		AdjacencyListGraph<String> graph = new AdjacencyListGraph<String>(4);
		//AdjacencyMatrixGraph<String> graph = new AdjacencyMatrixGraph<String>(4);
		
		//adiciona uma aresta entre os vértices v1 e v2
		graph.addEdge("Joao", "Maria");
		graph.addEdge("Antonio", "Paulo");
		graph.addEdge("Joao","Paulo");
		graph.addEdge("Maria","Antonio");
		
		
		// retorna o n´umero de v´ertices do grafo
		System.out.println(graph.countVertices());
		
		// retorna o n´umero de arestas do grafo
		System.out.println(graph.countEdges());
		
		//retorna o indice do vértice v, que indica, na sequências de inserções, a posição de inserção do vértice
		System.out.println(graph.index("Paulo"));
		
		//retorna o rótulo do vértice cujo indice é index
		System.out.println(graph.label(1));
		
		//verifica se existe vértice com rótulo v
		System.out.println(graph.contains("Jose"));
		
		//retorna os vértices adjacentes a v
		System.out.println(graph.adjacents("Joao"));
		
		//retorna o grau do vértice v
		System.out.println(graph.degree("Maria"));
	}

}
