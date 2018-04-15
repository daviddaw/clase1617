package anuncioArrayList;

import java.util.Vector;

public  class ListaAnunciosVector {
    //A
    Vector<Anuncio> listaAnuncios;

    //C

    public ListaAnunciosVector() {
        listaAnuncios= new Vector<Anuncio>();
    }

    
    public void  verAnuncios() {
    	for (int i = 0; i < listaAnuncios.size(); i++) {
			System.out.println(listaAnuncios.elementAt(i).toString());
			System.out.println("coste del anuncio"+i+": "+listaAnuncios.elementAt(i).costeAnuncio());
		}
    }
    public double costeTotal(){
        double total=0;
        for (int i = 0; i < listaAnuncios.size(); i++) {
        total+=listaAnuncios.elementAt(i).costeAnuncio();
        }
		return total;
    }

    public void insertarAnuncio(Anuncio anuncio){
        listaAnuncios.addElement(anuncio);
    }
    public int cantidadAnuncios(){
            return listaAnuncios.size();
    }
}
