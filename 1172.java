/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;
import java.util.Scanner;

/**
 *
 * @author samuel.silva
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int X[] = new int[10], x = 1;
        for(int i = 0; i < 10; i++){
            Scanner num = new Scanner(System.in);
            X[i] = num.nextInt();
        }
        for(int j = 0; j < X.length; j++){
                if(X[j] == 0 || X[j] < 0 ){
                    X[j] = x;
                    
            }
            System.out.println("X["+j+"] = " + X[j]);
        }

    }
    
}
