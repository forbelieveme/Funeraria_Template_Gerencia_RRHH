package tramite;

public class Sacerdote extends Tramite_RRHH{

	@Override
	public int pagoNomina() {
		return 200;
	}

	@Override
	public int pagoPension() {
		return (int) (pagoNomina()*0.4);
	}

	@Override
	public int pagoSalud() {
		return pagoPension();
	}

	@Override
	public int pagoBonos() {
		return 70;
	}

}
