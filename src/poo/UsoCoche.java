package poo;

import javax.swing.*;

public class UsoCoche {


    public static void main(String[] args) {
        Coche micoche=new Coche();
        micoche.establece_Color(JOptionPane.showInputDialog("introduce color"));
        System.out.println(micoche.dimedatosgenerales());
        System.out.println(micoche.dime_color());
        micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero"));
        System.out.println(micoche.dime_asientos());
        micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador"));
        System.out.println(micoche.dime_climatizador());


    }
}
