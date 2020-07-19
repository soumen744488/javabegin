import javax.swing.*;
class Box{
    double width;
    double hight;
    double depth;
    Box(){
        width=5;
        hight=4;
        depth=3;

    }
    double volume(){
        return width*hight*depth;
    }

}
public class constructor {
    public static void main(String[] args){
        Box obj= new Box();
        Box objj = new Box();
        double vol;


        vol= obj.volume();
        System.out.println("vol= "+vol);

        vol=objj.volume();
        System.out.println("vol= "+vol);
    }
}
