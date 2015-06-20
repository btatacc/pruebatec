
package prueba__tecnica;


public class class_matriz {
    int T;
    int N;
    int M;
    
    public class_matriz (){
    T=0;
    N=0;
    M=0;
    
}
  public void alto (int t){
    this.T = t;   
         
  }  
  
  ////////////
  
   public void ancho (int n){
    this.N = n;   
           }   
  ///////////
   
   public void profundo (int m){
    this.M = m;   
         
  } 
   public int getT(){
        return T ;
        
    } 
   public int getN(){
        return N ;
        
    } 
   
    public int getM(){
        return M ;
        
    } 
}
