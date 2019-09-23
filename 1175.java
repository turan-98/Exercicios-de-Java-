import java.util.Scanner;
/**
 *
 * @author samuel.silva
 */
class Main {
  public static void main(String[] args) {
     Scanner atv =new Scanner(System.in); 
     int X= 0; 
     int N[]=new int[20];

  for(int i=0;i<N.length;i++){
      N[i]=atv.nextInt(); 
     } 
    for(int j=0;j<=10;j++){ 
        X= N[19-j]; N[19-j]=N[j]; 
        N[j]=X; 
      } for(int k=0;k<N.length;k++){ 
        System.out.println("N["+k+"] = "+N[k]);
        }
     }
}
