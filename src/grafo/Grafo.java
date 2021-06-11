package grafo;

import java.util.LinkedList;
import java.util.List;

import dijkstra.Camino;
import dijkstra.Dijkstra;

public abstract class Grafo {
	List<Nodo> nodos;
	Dijkstra dijkstraGrafo;
	public Grafo() {
		nodos = new LinkedList<Nodo>();
	}
	public void agregarNodo(Nodo nuevoNodo) {
		nodos.add(nuevoNodo);
	}
	public abstract void agregarAristaNodo(Nodo nodo, Arista arista);
	public Camino obtenerCaminoMinimo(int indiceInicio, int indiceFinal) {
		if(dijkstraGrafo == null)
			dijkstraGrafo = new Dijkstra(nodos.get(indiceInicio), nodos.get(indiceFinal));
		return dijkstraGrafo.getCaminoMinimo(nodos.get(indiceFinal));
	}

}
