public class StudentProgram2

{

public void identity( int r,double p,String add)

{

String address = add;

int roll_no =r;
double phone_number=p;

System.out.println("Roll Number = "+ roll_no);

System.out.println("Phone Number = " + phone_number);

System.out.println("Address = " + address );
}

public static void main(String args[])

{ StudentProgram2 st = new StudentProgram2();

st.identity(125,9454558,"Arunodhayam");
StudentProgram2 st1 = new StudentProgram2();

st1.identity(126,5482587,"Lavanya");


}

}