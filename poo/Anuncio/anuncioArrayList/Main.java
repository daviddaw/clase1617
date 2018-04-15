package anuncioArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListaAnunciosArrayList  vAnuncios=new ListaAnunciosArrayList();//Creamos el objeto que es un vector de anuncios
        //Creamos anuncios de radio y tv
        AnuncioRadioTV aRTV1= new AnuncioRadioTV("Dixan","Detergente",5,"ser",2,3);
        AnuncioPrensa aP1= new AnuncioPrensa("Dixan","Detergente",6,"Detergente Dixan",20);
        AnuncioRadioTV aRTV2= new AnuncioRadioTV("audiA3", "Coche",10,"ser",3,5);

        //Insertamos los anuncios  tenemos que usar el objeto creado
        vAnuncios.insertarAnuncio(aRTV1);
        vAnuncios.insertarAnuncio(aP1);
        vAnuncios.insertarAnuncio(aRTV2);
        
        vAnuncios.verAnuncios();
        
        System.out.println("El coste totalde todos los anuncios es "+vAnuncios.costeTotal());

    }


}