class Obj{
    double width;
    double hight;
    double depth;

    double volume(){
        return  width*hight*depth;
    }
    void setDim(double w,double h,double d){
        width=w;
        hight=h;
        depth= d;

    }
}

public class prameterMethod {
    public static void main(String args[]){
        Obj ob= new Obj();
        Obj obb= new Obj();
        double vol;

        ob.setDim(5,6,7);
        obb.setDim(7,5,4);

        vol=ob.volume();
        System.out.println("ob = "+vol);

        vol= obb.volume();
        System.out.println("obb = "+ vol);

    }
}
