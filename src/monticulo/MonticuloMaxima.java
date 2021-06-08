package monticulo;

public class MonticuloMaxima<TipoMonticulable extends Monticulable> extends Monticulo<TipoMonticulable>{

	public MonticuloMaxima(Monticulo<TipoMonticulable> monticuloOriginal) {
		super(monticuloOriginal);
	}
	@Override
	protected boolean compararMonticulables(Monticulable uno, Monticulable otro) {
		if(otro == null) {
			return true;
		}
		return uno.compareTo(otro) > 0;
	}

}
