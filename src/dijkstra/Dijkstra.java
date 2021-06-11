package dijkstra;

import java.util.HashMap;
import java.util.Map;

import grafo.Arista;
import grafo.Nodo;
import monticulo.Monticulo;
import monticulo.MonticuloMinima;

public class Dijkstra {
	Map<Integer,Camino> mapaCaminos = new HashMap<Integer,Camino>();
	public Dijkstra(Nodo inicio, Nodo fin) {
		Camino caminoInicial = new Camino(inicio);
		obtenerCaminoMinimo(caminoInicial, fin);
	}

	private void obtenerCaminoMinimo(Camino caminoActual, Nodo fin) {
		Nodo nodoActual = caminoActual.getUltimoNodo();
		Monticulo<Arista> monticuloOriginal = nodoActual.obtenerMonticuloAristas();
		Monticulo<Arista> monticuloAristas = new MonticuloMinima<Arista>(monticuloOriginal);
		Arista proxima;
		Camino minimoNodoActual = mapaCaminos.get(nodoActual.getId());
		Camino nuevoMinimo = caminoActual.esMenor(minimoNodoActual) ? caminoActual : minimoNodoActual;
		mapaCaminos.put(nodoActual.getId(), nuevoMinimo);

		while((proxima = monticuloAristas.quitar()) != null) {
			Camino caminoRestante = new Camino(caminoActual);
			Nodo proximoNodo = proxima.getDestino();
			if(!caminoActual.nodoPertenceCamino(proximoNodo)) {
				caminoRestante.agregarArista(proxima);
				obtenerCaminoMinimo(caminoRestante, fin);
			}
		}
	}

	public Camino getCaminoMinimo(Nodo fin) {
		return mapaCaminos.get(fin.getId());
	}
}
