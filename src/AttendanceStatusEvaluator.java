import java.io.*;
import java.util.Scanner;
class AttendanceStatusEvaluator(){
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   int attendance=sc.nextInt();
    if((attendance >=0)&&(attendance<60)){
      System.out.println("Poor");
    }else if((attendance>=60) && (attendance<=85)){
      System.out.println("Satisfactory");
    }else if((attendance>85)&&(attendance<=100)){
      System.out.println("Excellent");
    }else{
      System.out.println("Enter positive integer");
    }
  }
}
   
