
package university.management.system.saau;

/**
 *
 * @author waghs
 */
public class NumberGenerator {
        private int numericValue;
        int start = 1; 
        int limit=10000; 
     public NumberGenerator(int i){
        // Generating numbers in increasing order
        for ( i = start; i <= limit; i++) {
            this.numericValue = i;
           // System.out.println(i);
        }
      }
        public int getNumericValue(){
            return numericValue;
        }
        
        





public static void main(String args[]){
   //new NumberGenerator(int);
       NumberGenerator numbergenerator = new NumberGenerator(10);
       int valueFromObject = numbergenerator.getNumericValue();
    }
}