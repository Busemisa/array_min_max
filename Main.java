import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);



      System.out.print("How many elements will the array have :  ");
      int n = scan.nextInt();

      int[] list = new int[n];

      for(int i=0;i<list.length;i++){
          System.out.print("["+i+"] =");
          list[i]=scan.nextInt();

      }

      System.out.println("The series you entered is like this : ");

      for(int i=0;i<list.length;i++){
          System.out.println("["+i+"] ="+list[i]);
      }

      int min=list[0];
      int max=list[0];
      for(int i : list){ //foreach use
          if(i<min){
              min=i;
          }
          if(i>max){
              max=i;
          }
      }

      System.out.println("Minimum number : "+min);
      System.out.println("Maximum number: "+max);



    }
}

