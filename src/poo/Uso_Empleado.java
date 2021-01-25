package poo;
import java.util.*;

public class Uso_Empleado {
    public static void main(String[] args) {
      /*  Empleado empleado1=new Empleado("Diego Granda",85000,1990,12,17);
        Empleado empleado2=new Empleado("Pepe",95000,1980,9,12);
        Empleado empleado3=new Empleado("Luisa",100000,1987,3,1);
        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);
        System.out.println("Nombre: "+ empleado1.getNombre() + "Sueldo " + empleado1.getSueldo() + "Fecha de alta " + empleado1.getAltacontrato());
        System.out.println("Nombre: "+ empleado2.getNombre() + "Sueldo " + empleado2.getSueldo() + "Fecha de alta " + empleado2.getAltacontrato());
        System.out.println("Nombre: "+ empleado3.getNombre() + "Sueldo " + empleado3.getSueldo() + "Fecha de alta " + empleado3.getAltacontrato());*/
        Empleado[] misEmpleados=new Empleado[4];
        misEmpleados[0]=new Empleado("Diego Granda",85000,1990,12,17);
        misEmpleados[1]=new Empleado("Pepe",95000,1980,9,12);
        misEmpleados[2]=new Empleado("Luisa",100000,1987,3,1);
        misEmpleados[3]=new Empleado("Antonio Fernández");
        /*for (int i = 0; i <3 ; i++) {
            misEmpleados[i].subeSueldo(5);   // hecho con un bucle fori para recorrer el arrray.
        }*/
        for (Empleado e:misEmpleados) {e.subeSueldo(5);

        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Nombre: " + misEmpleados[i].getNombre() + " Sueldo: " + misEmpleados[i].getSueldo() + " Fecha alta " +misEmpleados[i].getAltacontrato());

        }Arrays.sort(misEmpleados);


    }

    static class Empleado implements  Comparable{

        //Constructor1
        public Empleado(String nom, double sue,int anyo, int mes, int dia) {
    nombre=nom;
    sueldo= sue;
    GregorianCalendar calendario=new GregorianCalendar( anyo, mes-1, dia);
    altacontrato=calendario.getTime();
        }

        //Constructor2
        public Empleado(String nom){
          this(nom,30000,2000,01,01);
        }

        //getters
        public String getNombre() { //getter
            return nombre;
        }

        public double getSueldo() { //getter
            return sueldo;
        }

        public Date getAltacontrato() { //getter
            return altacontrato;
        }
        //setters

        public void setNombre(String nombre) { //setter
            this.nombre = nombre;
        }

        public void subeSueldo(double porcentaje) { //setter
            double aumento = sueldo * porcentaje/100;
        }

        public void setAltacontrato(Date altacontrato) { //setter
            this.altacontrato = altacontrato;
        }

        private String nombre;
        private double sueldo;
        private Date  altacontrato;


        @Override
        public int compareTo(Object miObjeto) {
            Empleado otroEmpleado=(Empleado)miObjeto;
            if (this.sueldo<otroEmpleado.sueldo){
            return -1;}
            if (this.sueldo > otroEmpleado.sueldo) {
                return 1;
                return 0;
            }
        }
    }
}
