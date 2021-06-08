package grafo;

public class GrafoDireccional extends Grafo {

	@Override
	public void agregarAristaNodo(Nodo nodo, Arista arista) {
		nodo.agregarArista(arista);
	}

}
