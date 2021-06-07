package grafo;

import monticulo.Monticulo;
import monticulo.MonticuloMinima;

public class Nodo {
	private Monticulo<Arista> aristas;

	public Nodo() {
		this.aristas = new MonticuloMinima<Arista>();
	}
	public void agregarArista(Arista nuevaArista) throws Exception {
		aristas.agregar(nuevaArista);
	}
	public Arista obtenerAristaMinima() {
		return aristas.verTope();
	}
	public Monticulo<Arista> obtenerMonticuloAristas() {
		return aristas;
	}
}
