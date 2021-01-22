package poo;
import javax.swing.*;
public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;

    private String color;
    private int peso_total;
   private boolean asientos_Cuero, climatizador;


    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    public String dimedatosgenerales() {//GETTTER
        return "La plataforma del vehículo tiene" + ruedas + "ruedas" + "Mide" + largo/1000 + "metros con un ancho de " + ancho + "cm y un peso de plataforma de" + peso_plataforma + "Kg";
    }


    public void establece_Color(String color_coche){//SETTER
      color=color_coche;
    }


    public String dime_color(){
        return"El coche es" + color;

    }

    public void configura_asientos(String asiento_cuero) {
        this.asientos_Cuero=asientos_Cuero;
      if(asientos_Cuero==true) {
          this.asientos_Cuero = true;
      }else{
          this.asientos_Cuero=false;
      }}
      public String dime_asientos(){
    if (asientos_Cuero==true){
        return"el coche tiene asientos de cuero";

    }else{
        return"el coche tiene asientos de serie";
    }

    }
    public void configura_climatizador(String climatizador){
        if(climatizador=="si") {
            this.climatizador = true;
        }else{this.climatizador=false;

        }
    }
    public String dime_climatizador() {
    if (climatizador == true) {
        return "el coche incorpora climatizador";}
    else{return "El coche lleva aire acondicionado";

}
}
}


