import java.util.Scanner;  
public class Largest_039  
{  
public static void main(String[] args)   
{  
int x, y, z, largest, temp;  
  
Scanner sc = new Scanner(System.in);  
 System.out.println("Enter the first number:");  
x = sc.nextInt();  
System.out.println("Enter the second number:");  
y = sc.nextInt();  
System.out.println("Enter the third number:");  
z = sc.nextInt();  
if (x >= y && x >= z)
 System.out.println(x+ " is largest");
 else if (y >= x && y >= z)
 System.out.println(y+ " is largest");
 else
 System.out.println(z+ " is largest");
            
}  
}
