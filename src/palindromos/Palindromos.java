package palindromos;

/**
 *
 * @author BSCL11
 */
public class Palindromos { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Palindromos e = new Palindromos();
        System.out.println("La palabra es palindromo? "+e.palidromo("reconocer"));
      
        }
      
    public boolean palidromo(String palabra){
     
       boolean respuesta=true;
       int div= (palabra.length()/2);
       String [] test = new String [palabra.length()];
       test = palabra.split("");
       int contador = 0;
        //System.out.println(test[palabra.length()-1]);
        
        for(int i=0;i<=div-1;i++){
                
            if(test[i].equals(test[(palabra.length()-1)-i])){
            System.out.println(test[i]+"==" +test[(palabra.length()-1)-i]);
             contador = contador +1;
             }
               
            }
           if(contador==div){
              respuesta= true;
           } else{
                respuesta=false;
           }
       
        return respuesta;
    }
    
}
