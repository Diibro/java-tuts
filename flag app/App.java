import java.util.Scanner;
class App{
     public static void main(String[] a){

          Scanner getIn = new Scanner(System.in);

          System.out.println("this is a program to print the multiplication table of any number you enter");
          int num;

          boolean alive = true;
          while(alive){
               System.out.println("please enter any number:");
               num = getIn.nextInt();
               for(int i = 1; i <= 12; i++){
                    int res = i * num;
                    System.out.println(num + " x " + i + " = " + res);
               }
          }

          getIn.close();

          

     }
}