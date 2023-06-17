package Conicas2;

import java.sql.SQLOutput;

//Clase Parabola
public class Parabola {

    //Variables
    private float ejex; //eje x coordenadas
    private float ejey; //eje y coordenadas
    private float a; //parametro a
    private float b; //parametro b
    private float c; //parametro c


    //Constructores
    public Parabola(float ejex, float ejey, float a, float b, float c) {
        this.ejex = ejex;
        this.ejey = ejey;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método calcular el vertice X, ingresar manualmente los valores de a y b
    private float coordX_parabola(float a, float b){
        return this.ejex = b/(2*a);
    }

    // Método calcular el vertice Y ingresar manualmente los valores a y b y c
    private float coordY_parabola(float a, float b, float c){
        return this.ejey = (float) ((a*Math.pow(this.ejex,2))+(b*this.ejex)+c);
    }
    private void impVer_parabola(){
        System.out.println("\tLa coordenada del vértice es: "+"("+String.format("%.2f",ejex)+","+String.format("%.2f",ejey)+")");
    }

    //Mostrar informacion---------------------------------
    public void mostrarInfo(){
        System.out.println("Datos registrados:");
        System.out.println("\tParametro a = "+getA());
        System.out.println("\tParametro b = "+getB());
        System.out.println("\tParametro c = "+getC());

        System.out.println("Resultado de los calculos:");
        System.out.println("\tCoordenada en x = "+ String.format("%.2f",(coordX_parabola(a,b))));
        System.out.println("\tCoordenada en y = "+ String.format("%.2f",(coordY_parabola(a,b,c))));
        impVer_parabola();
    }
    //------------------------------------------------------

    //Setters y getters
    public float getEjex() {
        return ejex;
    }

    public void setEjex(float ejex) {
        this.ejex = ejex;
    }

    public float getEjey() {
        return ejey;
    }

    public void setEjey(float ejey) {
        this.ejey = ejey;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
}
