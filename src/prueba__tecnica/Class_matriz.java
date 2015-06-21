
package prueba__tecnica;


public class Class_matriz {
    int T;
    int N;
    int M;
    int i,j,k;
    int matriz[][][];
    int suma;
  
    public Class_matriz (){
        T=0;
        N=0;
        M=0;
        suma=0;

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
    

  /**
   * Carga la matriz y los inicializa en cero.
   * @return matriz de tres dimenciones 
   */
    public int[][][] getcargar (){
    
        matriz = new int [T] [N] [M]; 
 

        for (i=0; i<T; i++){
              for(j=0; j<N; j++){
                  for (k=0; k<M; k++){

                       matriz[i][j][k]=0;   

                      

                  }
                 }
              }

         return matriz;
    }
    
   /**
   * Carga la matriz y los inicializa en cero.
   * @return matriz de tres dimenciones 
   */
    public void sumar (int a,int b,int c,int d,int e,int f){
    
     
        
        for (i=a; i<d-1; i++){
              for(j=b; j<e-1; j++){
                  for (k=c; k<f-1; k++){

                       suma += matriz[i][j][k];   

                      

                  }
                 }
              }

         
    } 
    
    public int getsumar () {
        return suma;
        
        
    }
            
    
}