package Conicas2;

public class Circunferencia {

    private float radio_cir; //El radio del circulo
    private float angulo_central; //Angulo central de la circunferencia

    //Constructor
    public Circunferencia(float radio_cir, float angulo_central) {
        this.radio_cir = radio_cir;
        this.angulo_central = angulo_central;
    }

    //Getters y setters

    public float getAngulo_central() {
        return angulo_central;
    }

    public void setAngulo_central(float angulo_central) {
        this.angulo_central = angulo_central;
    }

    public float getRadio_cir() {
        return radio_cir;
    }

    public void setRadio_cir(float radio_cir) {
        this.radio_cir = radio_cir;
    }


    //Metodo para calcular el perimetro/circunferencia teniendo el radio declarado, sea en constructor, getter o setter
    private double perimetro_cir(){
        double aux = Math.PI*2;
        return aux*getRadio_cir();
    }

    //Metodo para calcular el area de circunferencia teniendo declarado el radio
    private double area_cir(){
        double aux = getRadio_cir()*getRadio_cir();
        return Math.PI*aux;
    }

    //Metodo para calcular angulo inscrito teniendo el angulo central declarado
    private double angulo_inscrito_cir(){
        return (getAngulo_central()/2);
    }

    //Mostrar informacion---------------------------------
    public void mostrarInfo(){
        System.out.println("Datos registrados:");
        System.out.println("\tRadio = "+getRadio_cir());
        System.out.println("\tAngulo central = "+getAngulo_central());

        System.out.println("Resultado de los calculos:");
        System.out.println("\tPerimetro = "+ String.format("%.2f",perimetro_cir()));
        System.out.println("\tArea = "+ String.format("%.2f",area_cir()));
        System.out.println("\tAngulo inscrito = "+ String.format("%.2f",angulo_inscrito_cir()));
    }
    //------------------------------------------------------
}