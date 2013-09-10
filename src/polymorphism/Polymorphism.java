
package polymorphism;
import java.io.*;
/**
 *
 * @author marck
 */
public class Polymorphism {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean haserror;
        int j = 0;
        System.out.print("Enter how long the line is: ");
        
        do{
            haserror = false;
            try{
                j = Integer.parseInt(br.readLine());
            }catch(Exception ex){
                haserror = true;
                System.out.println("Wrong Input");
            }
        }while(haserror);//pwede pala to
        
        if(HelperClass.checkIfEven(j))
            j++;
        
        DrawLine lines[] = { new HLine(), new DRLine(), new DLLine(), new VLine() };
        char clines[][][] = new char[lines.length][j][j];
        
        for(int i=0; i<lines.length; i++){
            clines[i] = lines[i].drawLine(j);
        }
        
        char cc[][] = new char[j][j];
        
        for(int i = 0; i<clines.length;i++){
            HelperClass.combineArrayChars(cc, clines[i]);
        } 
        
        for(int i=0;i<cc.length;i++){
            for(int k=0;k<cc[i].length;k++){
                System.out.print(""+cc[i][k]);
            }
            System.out.println();
        }
    }
}
