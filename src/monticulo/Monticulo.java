package monticulo;

import java.util.ArrayList;
import java.util.List;

import grafo.Arista;

public abstract class Monticulo<TipoMonticulable extends Monticulable> {
	List<TipoMonticulable> monticulo;

	public Monticulo() {
		monticulo = new ArrayList<TipoMonticulable>();
		monticulo.add(null);
	}

	public void agregar(TipoMonticulable mon) {

		int indicePadre = (monticulo.size()) / 2;
		int indiceHijo = monticulo.size();
		monticulo.add(mon);
		TipoMonticulable aux;
		while (indicePadre > 0 && !compararMonticulables((aux = monticulo.get(indicePadre)), mon)) {
			monticulo.set(indiceHijo, aux);
			monticulo.set(indicePadre, mon);
			indiceHijo = indicePadre;
			indicePadre /= 2;
		}
	}

	public TipoMonticulable quitar() {
		if (monticulo.size() == 1)
			return null;
		TipoMonticulable ultimo = monticulo.remove(monticulo.size() - 1);
		if (monticulo.size() == 1)
			return ultimo;

		int padre = 1, hIzq = padre * 2, hDer = padre * 2 + 1;
		TipoMonticulable resultado = monticulo.get(padre);
		monticulo.set(padre, ultimo);
		while (hIzq < monticulo.size()) {
			TipoMonticulable hijoIzq = monticulo.get(hIzq);
			TipoMonticulable hijoDer = hDer < monticulo.size() ? monticulo.get(hDer) : null;
			TipoMonticulable hijoElegido = compararMonticulables(hijoIzq, hijoDer) ? hijoIzq : hijoDer;
			int hElegido = hijoElegido == hijoDer ? hDer : hIzq;

			if (compararMonticulables(hijoElegido, ultimo)) {
				monticulo.set(padre, hijoElegido);
				monticulo.set(hElegido, ultimo);
				padre = hElegido;
				hIzq = padre * 2;
				hDer = padre * 2 + 1;
			} else {
				return resultado;
			}
		}
		return resultado;
	}

	protected abstract boolean compararMonticulables(TipoMonticulable uno, TipoMonticulable otro);

	@Override
	public String toString() {
		return "Monticulo Generico [monticulo=" + monticulo + "]";
	}

	public TipoMonticulable verTope() {
		return monticulo.get(1);
	}

}
