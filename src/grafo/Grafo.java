package grafo;

import java.util.LinkedList;
import java.util.List;

import dijkstra.Dijkstra;

public class Grafo {
	List<Nodo> nodos;
	public Grafo() {
		nodos = new LinkedList<Nodo>();
	}
	public void agregarNodo(Nodo nuevoNodo) {
		nodos.add(nuevoNodo);
	}
	public Dijkstra obtenerCaminoMinimo(int indiceInicio, int indiceFinal) {
		return new Dijkstra(nodos.get(indiceInicio), nodos.get(indiceFinal));
	}

}
