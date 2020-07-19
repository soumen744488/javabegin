import javax.swing.*;
class Boxx{
    double h;
    double w;
    double s;

    void voi()
    {
        System.out.println("vol is : ");
        System.out.println(h*w*s);
    }
}
public class addMethod {
    public static void main(String args[]){
        Boxx mybox1= new Boxx();
        Boxx mybox2= new Boxx();

        mybox1.w=10;
        mybox1.h=9;
        mybox1.s=9;

        mybox1.voi();


        mybox2.h=5;
        mybox2.w=6;
        mybox2.s=4;

        mybox2.voi();

    }
}
