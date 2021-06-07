package grafo;

import monticulo.Monticulable;

public class Arista implements Monticulable {
	private Nodo destino;
	private int peso;

	public Arista(int peso, Nodo destino) {
		this.peso = peso;
		this.destino = destino;
	}

	@Override
	public int compareTo(Monticulable otro) {
		if (this == otro)
			return 0;
		if (otro == null)
			return 1;
		if (getClass() != otro.getClass())
			throw new RuntimeException("El otro debe ser de clase " + this.getClass() + " " + this + " " + otro);

		Arista otroNro = (Arista) otro;
		return Integer.compare(peso, otroNro.peso);
	}

	public Nodo getDestino() {
		return destino;
	}

	public int getPeso() {
		return peso;
	}
}
