package dijkstra;

import grafo.Arista;
import grafo.Nodo;
import monticulo.Monticulo;
import monticulo.MonticuloMinima;

public class Dijkstra {

	public Dijkstra(Nodo inicio, Nodo fin) {
		obtenerCaminoMinimo(inicio, fin);
	}

	private Camino obtenerCaminoMinimo(Nodo inicio, Nodo fin) {
		Monticulo<Arista> monticuloOriginal = inicio.obtenerMonticuloAristas();
		Monticulo<Arista> monticuloAristas = new MonticuloMinima<Arista>(monticuloOriginal);
		Arista proxima;
		Camino menorCamino = null;
		while((proxima = monticuloAristas.quitar()) != null) {
			Camino caminoActual = new Camino(inicio);
			caminoActual.agregarCamino(obtenerCaminoMinimo(proxima.getDestino(),fin));
			if(caminoActual != null && caminoActual.esMenor(menorCamino)) {
				menorCamino = caminoActual;
			}
		}
		return menorCamino;
	}
}
