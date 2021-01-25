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


    public Coche() {//CONSTRUCTOR
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    public String dimedatosgenerales() {//GETTTER
        return "La plataforma del vehículo tiene" + ruedas + "ruedas" + "Mide" + largo/1000 + "metros con un ancho de " + ancho + "cm y un peso de plataforma de" + peso_plataforma + "Kg" +"el color es:" + dime_color();
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

    public static class Uso_Vehiculo {


        public static void main (String[] args) {
            Coche miCoche1=new Coche();
            miCoche1.establece_Color("Rojo");
            Furgoneta mifurgoneta1= new Furgoneta(7,580);
            mifurgoneta1.establece_Color("Azul");
            mifurgoneta1.configura_asientos("si");
            mifurgoneta1.configura_climatizador("Si");
            System.out.println(miCoche1.dimedatosgenerales());
            System.out.println(mifurgoneta1.dimedatosgenerales() + mifurgoneta1.dimeDatosFurgoneta());

            /*
            Coche micoche = new Coche();
            micoche.establece_Color(JOptionPane.showInputDialog("introduce color"));
            System.out.println(micoche.dimedatosgenerales());
            System.out.println(micoche.dime_color());
            micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero"));
            System.out.println(micoche.dime_asientos());
            micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador"));
            System.out.println(micoche.dime_climatizador());*/


        }
    }
}


