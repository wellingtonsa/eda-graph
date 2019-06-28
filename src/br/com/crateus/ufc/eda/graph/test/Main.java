package br.com.crateus.ufc.eda.graph.test;

import br.com.crateus.ufc.eda.graph.AdjacencyListGraph;
import br.com.crateus.ufc.eda.graph.AdjacencyMatrixGraph;

public class Main {

	public static void main(String[] args) {
		AdjacencyListGraph<String> graph = new AdjacencyListGraph<String>(4);
		//AdjacencyMatrixGraph<String> graph = new AdjacencyMatrixGraph<String>(4);
		
		//adiciona uma aresta entre os v�rtices v1 e v2
		graph.addEdge("Joao", "Maria");
		graph.addEdge("Antonio", "Paulo");
		graph.addEdge("Joao","Paulo");
		graph.addEdge("Maria","Antonio");
		
		
		// retorna o n�umero de v�ertices do grafo
		System.out.println(graph.countVertices());
		
		// retorna o n�umero de arestas do grafo
		System.out.println(graph.countEdges());
		
		//retorna o indice do v�rtice v, que indica, na sequ�ncias de inser��es, a posi��o de inser��o do v�rtice
		System.out.println(graph.index("Paulo"));
		
		//retorna o r�tulo do v�rtice cujo indice � index
		System.out.println(graph.label(1));
		
		//verifica se existe v�rtice com r�tulo v
		System.out.println(graph.contains("Jose"));
		
		//retorna os v�rtices adjacentes a v
		System.out.println(graph.adjacents("Joao"));
		
		//retorna o grau do v�rtice v
		System.out.println(graph.degree("Maria"));
	}

}
