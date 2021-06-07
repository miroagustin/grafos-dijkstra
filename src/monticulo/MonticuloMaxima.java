package monticulo;

public class MonticuloMaxima<T extends Monticulable> extends Monticulo<T>{

	@Override
	protected boolean compararMonticulables(Monticulable uno, Monticulable otro) {
		if(otro == null) {
			return true;
		}
		return uno.compareTo(otro) > 0;
	}

}
