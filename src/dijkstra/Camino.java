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
	
	public Camino(Camino caminoActual) {
		nodosCamino = new LinkedList<Nodo>(caminoActual.nodosCamino);
		pesoTotalCamino = caminoActual.pesoTotalCamino;
	}

	public void agregarArista(Arista nuevaArista) {
		nodosCamino.add(nuevaArista.getDestino());
		pesoTotalCamino += nuevaArista.getPeso();
	}
	
	public void agregarCamino(Camino nuevoCamino, Arista union) {
		for (Nodo nodo : nuevoCamino.nodosCamino) {
			this.nodosCamino.add(nodo);
		}
		pesoTotalCamino += nuevoCamino.pesoTotalCamino + union.getPeso();
	}
	
	public int getPesoTotal() {
		return pesoTotalCamino;
	}
	public Nodo getUltimoNodo() {
		return nodosCamino.get(nodosCamino.size() -1);
	}
	public boolean nodoPertenceCamino(Nodo nodo) {
		for (Nodo nodoCamino : nodosCamino) {
			if(nodoCamino.equals(nodo)) {
				return true;
			}
		}
		return false;
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
