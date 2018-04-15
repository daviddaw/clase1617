package anuncioArrayList;

import java.util.ArrayList;
import java.util.Vector;

public  class ListaAnunciosArrayList {
    //A
    ArrayList<Anuncio> listaAnuncios;

    //C

    public ListaAnunciosArrayList() {
        listaAnuncios= new ArrayList<Anuncio>();
    }

    
    public void  verAnuncios() {
    	for (int i = 0; i < listaAnuncios.size(); i++) {
			System.out.println(listaAnuncios.get(i).toString());
			System.out.println("coste del anuncio"+i+": "+listaAnuncios.get(i).costeAnuncio());
		}
    }
    public double costeTotal(){
        double total=0;
        for (int i = 0; i < listaAnuncios.size(); i++) {
        total+=listaAnuncios.get(i).costeAnuncio();
        }
		return total;
    }

    public void insertarAnuncio(Anuncio anuncio){
        listaAnuncios.add(anuncio);
    }
    public int cantidadAnuncios(){
            return listaAnuncios.size();
    }
}
