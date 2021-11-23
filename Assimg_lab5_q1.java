
package assimg_lab5_q1;

import java.util.Scanner;


public class Assimg_lab5_q1 {

    
    public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);
       
        System.out.println("The Memeber is : ");
        String type=input.next();
        System.out.println("The years of work : ");
        int n=input.nextInt();
        MemeberFactory mf=new MemeberFactory();
        Staff m=mf.getmemeber(type);
        m.GetSalary();
        m.getYearsOfWork(n);
        
       
    }
    
}
