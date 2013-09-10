
package polymorphism;

/**
 *
 * @author marck
 */
public class DRLine implements DrawLine
{
   public char[][] drawLine(int i){
       char drline[][]=new char[i][i];
       HelperClass.fillWithSpace(drline);
       for(int k=0;k<drline.length;k++){
           drline[k][k]='*';
       }
       return drline;
    }
}