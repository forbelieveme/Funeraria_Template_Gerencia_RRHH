package tramite;

public class Administrador extends Tramite_RRHH{

	@Override
	public int pagoNomina() {
		return 100;
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
		return 50;
	}

}
