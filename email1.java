import java.util.*;
import java.io.*;
import java.lang.*;
class email
{
    private String firstName;
    private String lastName;
    private String department;
    private String company="AM";
    private String password;
    private int mailboxCap=15;
    private String alternateMail;
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    public email(String fname,String lname)throws IOException{
        firstName=fname;
        lastName=lname;
        department=setdepartment();
        password=setpassword();
        alternateMail=setAltMail();
        show();
        System.out.println("Do you want to change password?");
        char dec=(char)in.read();
        if(dec=='y'||dec=='Y')
        {
            System.out.println("Enter your new password");
            String pass=in.readLine();
            pass=in.readLine();
            changePass(pass);
        }
    }
    private String setdepartment()throws IOException
    {
        System.out.println("Department options:\n0.none\n1.Sales\n2.Development\n3.Accounting");
        System.out.println("Enter your department");
        int dep=Integer.parseInt(in.readLine());
        while(dep<0||dep>3)
        {
            System.out.println("Please enter a valid choice");
            dep=Integer.parseInt(in.readLine());
        }
        switch(dep)
        {
            case 0:
            return "";
            case 1:
            return "Sales";
            case 2:
            return "Development";
            case 3:
            return "Accounting";
        }
        return "";
    }
    private String setpassword()
    {
        String passavail="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$*^%";
        String pass="";
        for(int i=0;i<8;i++)
        {
            pass=pass+passavail.charAt((int)(Math.random()*passavail.length()));
        }
        return pass;
    }
    private String setAltMail()throws IOException
    {
        System.out.println("Enter an alternative email(In case you forget your password)");
        return in.readLine();
    }
    
    private void changePass(String pass)
    {
        this.password=pass;
        System.out.println("Password changed Successfully");
    }
    
    public void show()
    {
        System.out.println("\n\nWelcome to AM company\nEmployee:"+firstName+" "+lastName+"\nDepartment:"+department+"\nEmail:"+firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+".am.com\nPassword:"+password);
    }
   
}