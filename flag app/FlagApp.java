public class FlagApp {
     public static void main (String[] a){
          System.out.println("this is the flag of america");

          for(int i = 1; i <= 15; i++){
               for(int j = 1; j <= 35; j++){
                    if(i <= 9 && j <= 6)
                         //printing the asterisk
                         System.out.print("* ");
                    else
                         //pinting the equal sign
                         System.out.print("= ");
                    
               }
               System.out.println("");
          }
     }
}
