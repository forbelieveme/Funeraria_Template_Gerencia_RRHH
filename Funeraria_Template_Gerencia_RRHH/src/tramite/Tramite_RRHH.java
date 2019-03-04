package tramite;

public abstract class Tramite_RRHH {

	public final void tramitar() {
		pagoNomina();
		pagoPension();
		pagoSalud();
		pagoBonos();
		envioReciboNomina();
	}

	public abstract int pagoNomina();

	public abstract int pagoPension();

	public abstract int pagoSalud();

	public abstract int pagoBonos();

	public String envioReciboNomina() {
		return "Recibo enviado con los tramites de pago";
	}

}
