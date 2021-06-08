package monticulo;

import grafo.Arista;

public class MonticuloMinima <TipoMonticulable extends Monticulable> extends Monticulo<TipoMonticulable>{

	public MonticuloMinima(Monticulo<TipoMonticulable> monticuloOriginal) {
		super(monticuloOriginal);
	}

	@Override
	protected boolean compararMonticulables(TipoMonticulable uno, TipoMonticulable otro) {
		if(otro == null) {
			return true;
		}
		return uno.compareTo(otro) < 0;
	}

}
