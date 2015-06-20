
package prueba__tecnica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Prueba__tecnica {
    
public static int x,y,z;  
    
    

 public static void main(String[] args) throws IOException {
BufferedReader op = new BufferedReader(new InputStreamReader(System.in)); 
class_matriz aux= new class_matriz ();

System.out.println("ingrese el alto de la matriz");
x= Integer.parseInt(op.readLine() );
aux.alto(x);

System.out.println("ingrese el ancho de la matriz");
y= Integer.parseInt(op.readLine() );
aux.ancho(y);

System.out.println("ingrese la profundidad de la matriz");
z= Integer.parseInt(op.readLine() );
aux.profundo(z);

}
 
}