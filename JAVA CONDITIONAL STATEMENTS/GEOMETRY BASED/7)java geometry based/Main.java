import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double x1=s.nextDouble();
        double y1=s.nextDouble();
        double x2=s.nextDouble();
        double y2=s.nextDouble();
        double dx=x2-x1;
        if(dx<0)dx=-dx;
        double dy=y2-y1;
        if(dy<0)dy=-dy;
        double distance=dx*dx+dy*dy;
        distance=Math.sqrt(distance);
        System.out.print("distance:"+distance);
    }
}