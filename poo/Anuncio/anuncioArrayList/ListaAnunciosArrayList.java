package anuncioArrayList;

import java.util.ArrayList;




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
    
    
    public double sumaTiempoEmisora(String Emisora) {
    	double tiempoEmisora = 0;
    	AnuncioRadioTV auxE = null ;
    	for (int i = 0; i < listaAnuncios.size(); i++) {
			if (listaAnuncios.get(i) instanceof AnuncioRadioTV) {
			auxE=(AnuncioRadioTV)listaAnuncios.get(i);
			if (auxE.getEmisora().equals(Emisora)) {
				tiempoEmisora+=auxE.getDuracion();
			}
			}

		}
    	
		return tiempoEmisora;
    }
}
