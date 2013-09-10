
package polymorphism;

/**
 *
 * @author marck
 */
public class VLine implements DrawLine
{
   public char[][] drawLine(int i){
       char vline[][]=new char[i][i];
       HelperClass.fillWithSpace(vline);
       for(int k=0,j=((int)Math.ceil(i/2));k<vline.length;k++){
           vline[k][j]='*';
       }
       return vline;
    }
}