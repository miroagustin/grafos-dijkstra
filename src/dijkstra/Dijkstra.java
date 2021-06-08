package dijkstra;

import grafo.Arista;
import grafo.Nodo;
import monticulo.Monticulo;
import monticulo.MonticuloMinima;

public class Dijkstra {
	Camino minimo;
	public Dijkstra(Nodo inicio, Nodo fin) {
		Camino caminoInicial = new Camino(inicio);
		obtenerCaminoMinimo(caminoInicial, fin);
	}

	private void obtenerCaminoMinimo(Camino caminoActual, Nodo fin) {
		Nodo nodoActual = caminoActual.getUltimoNodo();
		Monticulo<Arista> monticuloOriginal = nodoActual.obtenerMonticuloAristas();
		Monticulo<Arista> monticuloAristas = new MonticuloMinima<Arista>(monticuloOriginal);
		Arista proxima;

		while((proxima = monticuloAristas.quitar()) != null && caminoActual.esMenor(minimo)) {
			Camino caminoRestante = new Camino(caminoActual);
			Nodo proximoNodo = proxima.getDestino();
			if(!caminoActual.nodoPertenceCamino(proximoNodo)) {
				caminoRestante.agregarArista(proxima);
				obtenerCaminoMinimo(caminoRestante, fin);
				if(caminoRestante.getUltimoNodo().equals(fin) && caminoRestante.esMenor(minimo)) {
					minimo = caminoRestante;
				}
			}
		}
	}

	public Camino getCaminoMinimo() {
		return minimo;
	}
}
