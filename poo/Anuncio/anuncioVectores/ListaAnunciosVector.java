package anuncioVectores;

import java.util.Vector;

public class ListaAnunciosVector {
    //A
    Vector<Anuncio> listaAnuncios;

    //C

    public ListaAnunciosVector() {
        listaAnuncios= new Vector<Anuncio>();
    }

    public void verAnuncios(){
        double total=0;
        
        for (int i = 0; i < listaAnuncios.size(); i++) {
        total+=listaAnuncios.elementAt(i).costeAnuncio();
        }
    }

    public void insertarAnuncio(Anuncio anuncio){
        listaAnuncios.addElement(anuncio);
    }
    public int cantidadAnuncios(){
            return listaAnuncios.size();
    }
}
