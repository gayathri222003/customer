import java.util.Scanner;
public class calc{
    public static void main(String[] args)
    {
        double n1,n2,result;
        String op;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter num 1=");
        n1=input.nextDouble();
        System.out.println("Enter num 2=");
        n2=input.nextDouble();
        System.out.println("Enter operator=");
        op=input.next();
        switch(op)
        {
            case"+":result=n1+n2;
            System.out.println(n1+""+op+""+n2+" = "+result);
            break;
            case"-":result=n1-n2;
            System.out.println(n1+""+op+""+n2+" = "+result);
            break;
            case"*":result=n1+n2;
            System.out.println(n1+""+op+""+n2+" = "+result);
            break;
            case"/":result=n1+n2;
            System.out.println(n1+""+op+""+n2+" = "+result);
            break;
        }

        
        
    }
}