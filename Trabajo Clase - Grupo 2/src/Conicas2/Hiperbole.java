package Conicas2;

//Calculo Hiiperbole basica
public class Hiperbole {
    private double a_hip,b_hip, c_hip ,Lr_hip;//Variables

    //Punto a,b
    public Hiperbole(double a_hip, double b_hip) {
        this.a_hip = a_hip;
        this.b_hip = b_hip;
    }
    //SETTERS y GETTERS//
    public double getA(){return a_hip;}
    public void setA(double a) {
        this.a_hip = a;
    }
    public double getB(){return b_hip;}
    public void setB(double b) {
        this.b_hip = b;
    }

    public void variables(){
        a_hip = Math.sqrt(this.a_hip);
        b_hip = Math.sqrt(this.b_hip);
        c_hip = Math.sqrt((this.a_hip*this.a_hip)+(this.b_hip*this.b_hip));
        Lr_hip = ((2*(this.b_hip*this.b_hip))/this.a_hip);
        //Mensaje de coordenadas tomadas
        System.out.println("Informacion:");
        System.out.println("\tSe toma en cuenta el centro (0,0)");
        System.out.println("\tEn el eje Y tanto hacia arriba y abajo: " + String.format("%.2f",this.a_hip));
        System.out.println("\tEn el eje x tanto hacia derecha e izquierda: " + String.format("%.2f",this.b_hip));
        System.out.println("\tCon estas coordenadas se dibuja un rectangulo donde se generan las asintotas al momento de trazar una cruz entre los vertices contrarios");
        System.out.println("\tSe traza una linea horizontal desde el punto (-" + (String.format("%.2f",this.Lr_hip/2)) + "," + (String.format("%.2f",this.c_hip)) + ") hasta (" + (String.format("%.2f",this.Lr_hip/2)) + "," + (String.format("%.2f",this.c_hip)) + ")");
    }
}