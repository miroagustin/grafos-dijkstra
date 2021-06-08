package monticulo;

public class MonticuloMaxima<TipoMonticulable extends Monticulable> extends Monticulo<TipoMonticulable>{

	public MonticuloMaxima(Monticulo<TipoMonticulable> monticuloOriginal) {
		super(monticuloOriginal);
	}
	public MonticuloMaxima() {
		super();
	}
	@Override
	protected boolean compararMonticulables(TipoMonticulable uno, TipoMonticulable otro) {
		if(otro == null) {
			return true;
		}
		return uno.compareTo(otro) > 0;
	}

}
