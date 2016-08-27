
//Drawing program, for more details please go to www.samxuhome.com


import java.util.Scanner;
import java.io.*;
public class TurtleGraphics {

    
    public static String[] track = {" ","*"};
   
    public static void main(String[] args)  throws InterruptedException, Exception {
    
        String[][] graph= new String[21][21];
        String[][] graph1=new String[21][21];
         for(int m=0; m<21;m++){
             for (int n=0; n<21; n++){
               graph[m][n]=track[0];
               graph1[m][n]=track[0];
             }
        }
         
        int cR =0;
        int cC=0;
        int f=0;
        int dir = 0;
     
        
        for (int t=0; t<10;t+=0){
        System.out.print("Enter command (9 to end input): ");
        Scanner input = new Scanner(System.in);
        Scanner forw=new Scanner(System.in);
        int c= input.nextInt();
        if(c==1){
        f=0;
       Thread.sleep(500);}
        else if (c==2){
        f=1;
        Thread.sleep(500);
        }
        else if(c==3){
            dir+=1;
        }
        else if(c==4){
            dir-=1;
        }
        else if(c==5){
            
            System.out.print("Enter forward spaces: ");
            int k= forw.nextInt();
            if(dir==0 && f==0){
            cR+=k;
            }
            else if(dir==0 && f==1){
            for (int u=cR; u<=k+cR; u++){
            graph[u][cC]=track[1];
            }
            cR+=k;
            }
            if(dir==1 && f==0){
            cC+=k;
            }
            else if(dir==1 && f==1){
            for (int v=cC; v<=k+cC; v++){
            graph[cR][v]=track[1];
            }
            cC+=k;
            }
            if(dir==2 && f==0){
            cR-=k;    
            }
            else if(dir==2 && f==1){
            for (int u1=cR; u1>=cR-k; u1--){
            graph[u1][cC]=track[1];
            }
            cR-=k;
            }
            
            if(dir==3 && f==0){
            cC-=k;
            }
            
            else if(dir==3 && f==1){
            for (int v1=cC; v1>=cC-k; v1--){
            graph[cR][v1]=track[1];
            }
            cC-=k;
            }
           
            if (dir>3 || dir<0){
            dir=0;
            }
            
            
            if (cR>21||cC>21){
                System.out.println("Wrong, the array has a maximum size of 20*20, program end.");
                System.exit(0);
            }
            
        }
        else if(c==6){
            System.out.println("The Drawing is: ");
        
           
             for(int m=0; m<21;m++){
             for (int n=0; n<21; n++){
               
               System.out.print(graph[m][n]+" ");
             }
                 System.out.println("");
             }
           
             cR=0;
             cC=0;
             dir=0;
              for(int m=0; m<21;m++){
             for (int n=0; n<21; n++){
               graph[m][n]=graph1[m][n];
             }
        }
            
        }
        else if(c==9)
        break;
        
        }
    }
   
}