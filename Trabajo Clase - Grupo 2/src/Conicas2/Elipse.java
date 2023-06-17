package Conicas2;

public class Elipse {

    // Creacion de los atributos
    private double eje_mayor;
    private  double eje_menor;

    // Constructor
    public Elipse( double eje_mayor, double eje_menor) {
        this.eje_mayor = eje_mayor;
        this.eje_menor = eje_menor;
    }

    public double getEje_mayor() {
        return eje_mayor;
    }

    public void setEje_mayor(double eje_mayor) {
        this.eje_mayor = eje_mayor;
    }

    public double getEje_menor() {
        return eje_menor;
    }

    public void setEje_menor(double eje_menor) {
        this.eje_menor = eje_menor;
    }

    private double area_elipse(){
        double area = Math.PI*this.eje_mayor*this.eje_menor;
        return area;
    }

    private double perimetro_elipse(){
        double perimetro = (Math.PI * 3*(this.eje_mayor + this.eje_menor) - Math.sqrt((3*this.eje_mayor+this.eje_menor)*(this.eje_mayor+ (3*this.eje_menor))));
        return perimetro;
    }

    public void mostrarInfo(){
        System.out.println("Datos registrados:");
        System.out.println("\tEje mayor = "+getEje_mayor());
        System.out.println("\tEje menor = "+getEje_menor());

        System.out.println("Resultado de los calculos:");
        System.out.println("\tArea = "+ String.format("%.2f",area_elipse()));
        System.out.println("\tPerimetro = "+ String.format("%.2f",perimetro_elipse()));
    }
}