package dijkstra;

import grafo.Arista;
import grafo.Nodo;
import monticulo.Monticulo;
import monticulo.MonticuloMinima;

public class Dijkstra {
	Camino minimo;
	public Dijkstra(Nodo inicio, Nodo fin) {
		minimo = obtenerCaminoMinimo(inicio, fin);
	}

	private Camino obtenerCaminoMinimo(Nodo inicio, Nodo fin) {
		Monticulo<Arista> monticuloOriginal = inicio.obtenerMonticuloAristas();
		Monticulo<Arista> monticuloAristas = new MonticuloMinima<Arista>(monticuloOriginal);
		Arista proxima;
		Camino menorCamino = null;
		Camino caminoActual = new Camino(inicio);
		while((proxima = monticuloAristas.quitar()) != null) {
			caminoActual = new Camino(inicio);
			Camino caminoRestante = obtenerCaminoMinimo(proxima.getDestino(),fin);
			if(caminoRestante != null) {
				caminoActual.agregarCamino(caminoRestante, proxima);
				if(caminoActual.esMenor(menorCamino)) {
					menorCamino = caminoActual;
				}
			}
		}
		if(inicio.equals(fin)) {
			menorCamino = caminoActual;
		}
		return menorCamino;
	}

	public Camino getCaminoMinimo() {
		return minimo;
	}
}
