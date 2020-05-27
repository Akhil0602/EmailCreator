import java.util.*;
import java.io.*;
import java.lang.*;
public class email_create extends email1
{
    email_create(String fname,String lname)throws IOException
    {
        super(fname,lname);
    }
public static void main(String args[])throws IOException
    {
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        int num_emp;
        System.out.println("Enter number of employees");
        num_emp=Integer.parseInt(in.readLine());
        for(int i=0;i<num_emp;i++)
        {
        System.out.println("Enter your First Name");
        String Fname=in.readLine();
        System.out.println("Enter your Last Name");
        String Lname=in.readLine();
        email_create emp=new email_create(Fname,Lname);
        emp.show();
        
        }
    }
}