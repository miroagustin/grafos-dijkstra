package dijkstra;

import java.util.LinkedList;
import java.util.List;

import grafo.Arista;
import grafo.Nodo;

public class Camino {
	List<Nodo> nodosCamino = new LinkedList<Nodo>();
	int pesoTotalCamino = 0;
	
	public Camino(Nodo inicio) {
		nodosCamino.add(inicio);
	}
	
	public void agregarArista(Arista nuevaArista) {
		nodosCamino.add(nuevaArista.getDestino());
		pesoTotalCamino += nuevaArista.getPeso();
	}
	
	public void agregarCamino(Camino nuevoCamino) {
		for (Nodo nodo : nuevoCamino.nodosCamino) {
			this.nodosCamino.add(nodo);
		}
		pesoTotalCamino += nuevoCamino.pesoTotalCamino;
	}
	
	public int getPesoTotal() {
		return pesoTotalCamino;
	}
	public boolean esMenor(Camino caminoMenor) {
		if(caminoMenor == null) {
			return true;
		}
		return this.pesoTotalCamino < caminoMenor.pesoTotalCamino;
	}

	@Override
	public String toString() {
		return "Camino [nodosCamino=" + nodosCamino + "\npesoTotalCamino=" + pesoTotalCamino + "]";
	}
	
}
