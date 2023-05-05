import java.util.*;

public class AreaProgram6

{

   double l , b;

   void setDim(double ll , double bb)

   {

       l = ll;

       b = bb;

   }

   double getArea()

   {

       return l*b;

   }

   public static void main(String args[])
{
  Scanner Sc = new Scanner(System.in);

       double l , b;

       System.out.print("Enter Length : ");

       l = Sc.nextDouble();

       System.out.print("Enter Breadth : ");

       b = Sc.nextDouble();

 AreaProgram6 rect = new AreaProgram6();

       rect.setDim(l , b);

       System.out.print("Area of Rectangle : " + rect.getArea());

   }

}