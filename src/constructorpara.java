class BoXXx{
    double height;
    double weight;
    double depth;
     BoXXx(double w,double h,double d){
         weight=w;
         height=h;
         depth=d;

     }
     double volume(){
         return weight*height*depth;
     }

}
public class constructorpara {
    public static void main(String arg[]){
        BoXXx obj= new BoXXx(8,7,5);
        BoXXx obje= new BoXXx(5,2,3);
        double vol;

        vol= obj.volume();
        System.out.println("obj = "+vol);
        vol=obje.volume();
        System.out.println("objj = "+vol);

    }
}
