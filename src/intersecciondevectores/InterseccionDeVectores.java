
package intersecciondevectores;
import java.util.Scanner;
public class InterseccionDeVectores {
public static void main(String[] args) {
    Scanner datos=new Scanner(System.in);
        int A[],B[],C[],a,b,i=1,j=1,s=0;
    A = new int [10];
    B= new int [10];
    C= new int [10];
    
    System.out.print("Ingrese la cantidad del primer vector A:");
    a=datos.nextInt();
    System.out.print("Ingrese la cantidad del segundo vector B:");
    b=datos.nextInt();
    
    for(i=1;i<=a;i++)
    {
     System.out.print("A["+i+"]:");
    A[i]=datos.nextInt();
    }
    
    for(j=1;j<=b;j++)
    {
     System.out.print("b["+j+"]:");
    B[j]=datos.nextInt();
    }
    
    System.out.println("INTERSECCION");
    for(i=1;i<=a;i++)
    {
       for(j=1;j<=b;j++)
       {
           if(A[i]==B[j])
           {
               C[i]=A[i];
               s=s+1;
               System.out.print("C["+s+"]:"+C[i]);
           }
       }
    }
    
    
        
        
    }
    
}
