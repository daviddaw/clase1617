package anuncioVectores;

public class AnuncioRadioTV extends Anuncio {
	//A
private static final double costeSegundo = 100;	
private String emisora;
private int duracion;
private int frecuencia;
	//C
public AnuncioRadioTV(String nombre, String producto, int diasEmision, String emisora, int duracion, int frecuencia) {
	super(nombre, producto, diasEmision);
	this.emisora = emisora;
	this.duracion = duracion;
	this.frecuencia = frecuencia;
}

//abs
    @Override
    public double costeAnuncio() {
        return costeSegundo*duracion*frecuencia*super.getDiasEmision();
    }

//GS
	public String getEmisora() {
		return emisora;
	}


	public int getDuracion() {
		return duracion;
	}


	public int getFrecuencia() {
		return frecuencia;
	}


	public void setEmisora(String emisora) {
		this.emisora = emisora;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}
    
    
}
