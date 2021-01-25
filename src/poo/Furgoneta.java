package poo;

public class Furgoneta extends Coche {
    private int capacidad_carga;
    private int plazas_extra;
//CONSTRUCTOR
    public Furgoneta(int capacidad_extra, int plazas_extra) {
        super();//llamar constructor clase padre
        this.capacidad_carga = capacidad_carga;
        this.plazas_extra = plazas_extra;

    }
    public String dimeDatosFurgoneta(){
        return"La capacidad de carga es : " + capacidad_carga+ "y las plazas son" + plazas_extra;
    }
}
