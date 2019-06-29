package br.com.crateus.ufc.eda.graph.utils;

import java.io.InputStream;

import br.com.crateus.ufc.eda.graph.Graph;
import br.com.crateus.ufc.eda.graph.search.BreadthFirstPaths;

public class GraphUtils {

	public static <T> Iterable<T> shortestPath(Graph<T> graph, T v1, T v2) {
		BreadthFirstPaths<T> bfs = new BreadthFirstPaths<T>(graph, v1);
		return bfs.pathTo(v2);
		 
	 }
	
	public static Graph<String> readFromFile(InputStream is, String sep){
		return null;
		
	}
}

