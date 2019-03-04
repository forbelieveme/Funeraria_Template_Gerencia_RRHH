package tramite;

import singleton.Impresora;

public abstract class Tramite_RRHH {

	public final void tramitar() {
		Impresora.getInstance().imprimir("Nomina: "+pagoNomina());
		Impresora.getInstance().imprimir("Pension: "+pagoPension());
		Impresora.getInstance().imprimir("Salud: "+pagoSalud());
		Impresora.getInstance().imprimir("Bonos: "+pagoBonos());
		Impresora.getInstance().imprimir(envioReciboNomina());
	}

	public abstract int pagoNomina();

	public abstract int pagoPension();

	public abstract int pagoSalud();

	public abstract int pagoBonos();

	public String envioReciboNomina() {
		return "Recibo enviado con los tramites de pago";
	}

}
