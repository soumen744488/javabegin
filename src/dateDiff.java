import java.util.Scanner;

public class dateDiff {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);

        String a = sc.nextLine();
        String b=sc.nextLine();
        int c= Integer.parseInt(a)-Integer.parseInt(b);
        System.out.println(c);
    }
}
