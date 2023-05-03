public class StudentProgram1

{

public void identity(String x, int y)

{

String name = x;

int roll_no = y;

System.out.println("Name = "+ name);

System.out.println("Roll no. = " + roll_no);

}

public static void main(String args[])

{ StudentProgram1 st = new StudentProgram1();

st.identity("John", 2);

}

}