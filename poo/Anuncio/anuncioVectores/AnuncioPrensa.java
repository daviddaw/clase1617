package anuncioVectores;

public class AnuncioPrensa extends Anuncio {

private static final double costeTesxto=58;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidadTexto() {
        return cantidadTexto;
    }

    public void setCantidadTexto(int cantidadTexto) {
        this.cantidadTexto = cantidadTexto;
    }

    private String titulo;
private int cantidadTexto;

//C


    public AnuncioPrensa(String nombre, String producto, int diasEmision,String titulo, int cantidadTexto) {
        super(nombre, producto, diasEmision);
        this.titulo=titulo;
        this.cantidadTexto=cantidadTexto;

    }

    @Override
    public double costeAnuncio() {
        return 0;
    }


}
