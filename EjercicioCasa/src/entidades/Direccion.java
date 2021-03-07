package entidades;

import clasesenum.TipoVia;

public class Direccion {

	private TipoVia tipoVia;
	private String nombreVia;
	private int numero;
	private String cp;

	public Direccion(TipoVia tipoVia, String nombreVia, int numero, String cp) {
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.numero = numero;
		this.cp = cp;
	}

	public TipoVia getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(TipoVia tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		return tipoVia + ", " + nombreVia + " - Nº: " + numero + " - CP: " + cp;
	}

}
