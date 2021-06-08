package dijkstraTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import grafo.Arista;
import grafo.Grafo;
import grafo.Nodo;

class DijkstraTests {
	Grafo grafo;
	@BeforeEach
	void setUp() throws Exception {
		grafo = new Grafo();
		Nodo nodo1 = new Nodo(1);
		grafo.agregarNodo(nodo1);
		Nodo nodo2 = new Nodo(2);
		grafo.agregarNodo(nodo2);
		Nodo nodo3 = new Nodo(3);
		grafo.agregarNodo(nodo3);
		Nodo nodo4 = new Nodo(4);
		grafo.agregarNodo(nodo4);
		Nodo nodo5 = new Nodo(5);
		grafo.agregarNodo(nodo5);
		Nodo nodo6 = new Nodo(6);
		grafo.agregarNodo(nodo6);
		Nodo nodo7 = new Nodo(7);
		grafo.agregarNodo(nodo7);
		Arista arista12 = new Arista(1,nodo2);
		nodo1.agregarArista(arista12);
		Arista arista23 = new Arista(1,nodo3);
		nodo2.agregarArista(arista23);
		Arista arista24 = new Arista(1,nodo4);
		nodo2.agregarArista(arista24);
		Arista arista45 = new Arista(1,nodo5);
		nodo4.agregarArista(arista45);
		Arista arista56 = new Arista(1,nodo6);
		nodo5.agregarArista(arista56);
		Arista arista67 = new Arista(1,nodo7);
		nodo6.agregarArista(arista67);
	}

	@Test
	void testDijkstra() {
		System.out.println(grafo.obtenerCaminoMinimo(0, 6));
	}

}
