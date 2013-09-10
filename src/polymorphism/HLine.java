
package polymorphism;

/**
 *
 * @author marck
 */
public class HLine implements DrawLine
{
    public char[][] drawLine(int i){
       char hline[][]=new char[i][i];
       HelperClass.fillWithSpace(hline);
       for(int k=0,j=((int)Math.ceil(i/2));k<hline.length;k++){
           hline[j][k]='*';
       }
       return hline;
    }
}
