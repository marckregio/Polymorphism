
package polymorphism;

/**
 *
 * @author marck
 */
public class HelperClass
{
   public static boolean checkIfEven(int i){
       return (i%2==0);
    }
    
   public static void fillWithSpace(final char[][] c){
       for(int i=0,j=0;i<c.length && j<c.length;i++){
           c[j][i]=' ';
           if(i+1==c.length){
               j++;
           }
       }
    }
    
   public static void combineArrayChars(final char[][] c,final char[][] d){
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                if(d[i][j]=='*'){
                    c[i][j]=d[i][j];
                }
            }
        }
   }
}