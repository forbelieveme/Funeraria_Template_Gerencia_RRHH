package main;

import tramite.Administrador;
import tramite.Embalsamador;
import tramite.Sacerdote;

public class Prueba_Gerencia_RRHH_Template {

	public static void main(String[] args) {

		Administrador administrador= new Administrador();
		Embalsamador embalsamador= new Embalsamador();
		Sacerdote sacerdote = new Sacerdote();
		
		administrador.tramitar();
		embalsamador.tramitar();
		sacerdote.tramitar();
		
	}

}
