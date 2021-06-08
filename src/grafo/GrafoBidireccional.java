package grafo;

public class GrafoBidireccional extends Grafo{

	@Override
	public void agregarAristaNodo(Nodo nodo, Arista arista) {
		nodo.agregarArista(arista);
		Arista ladoInverso = new Arista(arista.getPeso(),nodo);
		arista.getDestino().agregarArista(ladoInverso);		
	}

}
