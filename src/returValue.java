class Hi{
    double  p;
    double  q;
    double  r;


    double v(){
        return p*q*r;
    }
}


public class returValue {
    public static void main(String args[]){
        double vo;
        Hi h= new Hi();
        Hi hh= new Hi();
        h.p=5;
        h.q=6;
        h.r=6;
        vo= h.v();
        System.out.println(" h ="+vo);


        hh.p=7;
        hh.q=2;
        hh.r=8;
        vo= hh.v();
        System.out.println("hh ="+vo);
    }
}
