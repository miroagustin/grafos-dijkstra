package monticulo;

public class MonticuloMinima <TipoMonticulable extends Monticulable> extends Monticulo<TipoMonticulable>{

	@Override
	protected boolean compararMonticulables(TipoMonticulable uno, TipoMonticulable otro) {
		if(otro == null) {
			return true;
		}
		return uno.compareTo(otro) < 0;
	}

}
