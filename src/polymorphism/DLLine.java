
package polymorphism;

/**
 *
 * @author marck
 */
public class DLLine implements DrawLine
{
    public char[][] drawLine(int i){

       char dlline[][]=new char[i][i];
       HelperClass.fillWithSpace(dlline);
       for(int k=dlline.length-1,j=0;j<dlline.length;k--,j++){
           dlline[j][k]='*';
       }
       return dlline;
    }
}