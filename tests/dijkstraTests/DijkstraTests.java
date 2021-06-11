package dijkstraTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import grafo.Arista;
import grafo.Grafo;
import grafo.GrafoBidireccional;
import grafo.GrafoDireccional;
import grafo.Nodo;

class DijkstraTests {
	Grafo grafo;
	Grafo grafo2;

	@BeforeEach
	void setUp() throws Exception {
		grafo = new GrafoDireccional();
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
		Arista arista12 = new Arista(1, nodo2);
		nodo1.agregarArista(arista12);
		Arista arista23 = new Arista(1, nodo3);
		nodo2.agregarArista(arista23);
		Arista arista24 = new Arista(1, nodo4);
		nodo2.agregarArista(arista24);
		Arista arista45 = new Arista(1, nodo5);
		nodo4.agregarArista(arista45);
		Arista arista56 = new Arista(1, nodo6);
		nodo5.agregarArista(arista56);
		Arista arista67 = new Arista(1, nodo7);
		nodo6.agregarArista(arista67);
	}

	@Test
	void testDijkstra() {
		System.out.println(grafo.obtenerCaminoMinimo(0, 6));
	}

	@Test
	void testDijkstra2() throws Exception {
		grafo2 = new GrafoDireccional();
		Nodo nodo1 = new Nodo(1);
		grafo2.agregarNodo(nodo1);
		Nodo nodo2 = new Nodo(2);
		grafo2.agregarNodo(nodo2);
		Nodo nodo3 = new Nodo(3);
		grafo2.agregarNodo(nodo3);
		Nodo nodo4 = new Nodo(4);
		grafo2.agregarNodo(nodo4);
		Nodo nodo5 = new Nodo(5);
		grafo2.agregarNodo(nodo5);
		Nodo nodo6 = new Nodo(6);
		grafo2.agregarNodo(nodo6);
		Nodo nodo7 = new Nodo(7);
		grafo2.agregarNodo(nodo7);
		Nodo nodo8 = new Nodo(8);
		grafo2.agregarNodo(nodo8);
		Nodo nodo9 = new Nodo(9);
		grafo2.agregarNodo(nodo9);
		Nodo nodo10 = new Nodo(10);
		grafo2.agregarNodo(nodo10);
		Arista arista12 = new Arista(1, nodo2);
		nodo1.agregarArista(arista12);
		Arista arista14 = new Arista(1, nodo4);
		nodo1.agregarArista(arista14);
		Arista arista23 = new Arista(3, nodo3);
		nodo2.agregarArista(arista23);
		Arista arista25 = new Arista(2, nodo5);
		nodo2.agregarArista(arista25);
		Arista arista37 = new Arista(3, nodo7);
		nodo3.agregarArista(arista37);
		Arista arista45 = new Arista(1, nodo5);
		nodo4.agregarArista(arista45);
		Arista arista48 = new Arista(1, nodo8);
		nodo4.agregarArista(arista48);
		Arista arista56 = new Arista(2, nodo6);
		nodo5.agregarArista(arista56);
		Arista arista59 = new Arista(1, nodo9);
		nodo5.agregarArista(arista59);
		Arista arista67 = new Arista(2, nodo7);
		nodo6.agregarArista(arista67);
		Arista arista910 = new Arista(1, nodo10);
		nodo9.agregarArista(arista910);
		Arista arista107 = new Arista(1, nodo7);
		nodo10.agregarArista(arista107);
		System.out.println(grafo2.obtenerCaminoMinimo(0, 6));
	}
	
	@Test
	void testDijkstraPrincesa() throws Exception {
		Grafo grafoPrincesa = new GrafoBidireccional();
		Nodo nodo1 = new Nodo(1);
		grafoPrincesa.agregarNodo(nodo1);
		Nodo nodo2 = new Nodo(2);
		grafoPrincesa.agregarNodo(nodo2);
		Nodo nodo3 = new Nodo(3);
		grafoPrincesa.agregarNodo(nodo3);
		Nodo nodo4 = new Nodo(4);
		grafoPrincesa.agregarNodo(nodo4);
		Nodo nodo5 = new Nodo(5);
		grafoPrincesa.agregarNodo(nodo5);
		Nodo nodo6 = new Nodo(6);
		grafoPrincesa.agregarNodo(nodo6);
		Nodo nodo7 = new Nodo(7);
		grafoPrincesa.agregarNodo(nodo7);
		Nodo nodo8 = new Nodo(8);
		grafoPrincesa.agregarNodo(nodo8);
		Nodo nodo9 = new Nodo(9);
		grafoPrincesa.agregarNodo(nodo9);
		Arista arista12 = new Arista(3, nodo2);
		grafoPrincesa.agregarAristaNodo(nodo1, arista12);
		Arista arista13 = new Arista(2, nodo3);
		grafoPrincesa.agregarAristaNodo(nodo1,arista13);
		Arista arista23 = new Arista(4, nodo3);
		grafoPrincesa.agregarAristaNodo(nodo2,arista23);
		Arista arista26 = new Arista(1, nodo6);
		grafoPrincesa.agregarAristaNodo(nodo2,arista26);
		Arista arista38 = new Arista(1, nodo8);
		grafoPrincesa.agregarAristaNodo(nodo3,arista38);
		Arista arista86 = new Arista(5, nodo6);
		grafoPrincesa.agregarAristaNodo(nodo8,arista86);
		Arista arista45 = new Arista(2, nodo5);
		grafoPrincesa.agregarAristaNodo(nodo4,arista45);
		Arista arista34 = new Arista(2, nodo4);
		grafoPrincesa.agregarAristaNodo(nodo3, arista34);
		Arista arista36 = new Arista(2, nodo6);
		grafoPrincesa.agregarAristaNodo(nodo3,arista36);
		Arista arista69 = new Arista(3, nodo9);
		grafoPrincesa.agregarAristaNodo(nodo6,arista69);
		System.out.println("Camino de la princesa al principe: "+grafoPrincesa.obtenerCaminoMinimo(8, 0));
		System.out.println("Camino de la princesa al primer dragon: "+grafoPrincesa.obtenerCaminoMinimo(8, 7));
		System.out.println("Camino de la princesa al segundo dragon: "+grafoPrincesa.obtenerCaminoMinimo(8, 4));
	}

}
