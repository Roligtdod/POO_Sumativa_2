package data;

import model.Excursion;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.Tour;

import java.util.ArrayList;

public class GestorServicios {


    public GestorServicios(){

        ArrayList<Tour> tour = new ArrayList<>();
        tour.add(new Excursion("101","RM", "Turistico","5",120000,"Templo Bahai", "Las torres 2000"));
        tour.add(new PaseoLacustre("102","Valparaiso", "Turistico","10",210000,"Terrestre"));
        tour.add(new RutaGastronomica("103","Bio-Bio", "Gastronomico","10",139000,"5"));
        tour.add(new RutaGastronomica("104","Valparaiso", "Gastronomico","10",110000,"3"));
        tour.add(new Excursion("105","Bio-Bio", "Turistico","5",120000,"Concepción", "Cerro 960"));

        for(Tour t : tour){
            t.MostrarDatos();
        }
    }






}
