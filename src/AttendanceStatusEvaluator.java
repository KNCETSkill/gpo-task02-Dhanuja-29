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
    }else {
      System.out.println("Excellent");
    }}
  }
}
   
