
package prueba__tecnica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




class Prueba__tecnica {
    
public static int x,y,z,w,a;  
public static int x1,y1,z1,x2,y2,z2;
public static int qbo [][][];
    
    
/**
 * 
 * @param args
 * @throws IOException 
 */
    public static void main(String[] args) throws IOException {
     
    BufferedReader op = new BufferedReader(new InputStreamReader(System.in)); 
    Class_matriz aux= new Class_matriz();
   

    System.out.println("cuantas matrices desea ejecutar");
    int opc = Integer.parseInt(op.readLine() );
    
        for (int i=0; i<opc;i ++){
    
            System.out.println("ingrese tamaño de la matriz");
            int opc1= Integer.parseInt(op.readLine() );
            aux.alto(opc1);
            aux.ancho(opc1);
            aux.profundo(opc1);
      
            System.out.println("cantidad de queries:"); 
            int opc2= Integer.parseInt(op.readLine() );
      
            int cont=0;
            while (cont<opc2){
    
                System.out.println("ingrese queries ");
                String cad = "";
                cad= op.readLine();
    
                String delimitadores= " ";
                String[] palabrasSeparadas = cad.split(delimitadores);
    
        
                switch (palabrasSeparadas[0]){
                
                    case "update":
                        x = Integer.parseInt(palabrasSeparadas[1]);
                        y = Integer.parseInt(palabrasSeparadas[2]);
                        z = Integer.parseInt(palabrasSeparadas[3]);
                        w = Integer.parseInt(palabrasSeparadas[4]);
                        qbo=aux.getcargar();
                        qbo[x][y][z]=w;
                        
                        System.out.println("Coordenada a modificar: " +x +y +z+"\nValor cargado: " +w); 
                    
                        cont++;

                       break;
                
                    case"query":
                         x1 = Integer.parseInt(palabrasSeparadas[1]);
                         y1 = Integer.parseInt(palabrasSeparadas[2]);
                         z1 = Integer.parseInt(palabrasSeparadas[3]);
                         x2 = Integer.parseInt(palabrasSeparadas[4]);
                         y2 = Integer.parseInt(palabrasSeparadas[5]);
                         z2 = Integer.parseInt(palabrasSeparadas[6]);
                         aux.sumar(x1, y1, z1, x2, y2, z2);
                         System.out.println("sumar entre la Coordenada "+x1 +y1 +z1+" y la Coordenada "+x2 +y2 +z2);
                         System.out.println("el resultado de la suma es: "+aux.getsumar());
                         
                                 

                          cont++;
                        break;
                    
                    default:
                        System.out.println(" queries invalido.\n Por favor ingrese requies de nuevo:");      
         
                }
            }
            

        }
    }
}

