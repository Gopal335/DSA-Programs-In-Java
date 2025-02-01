import java.util.Scanner;

public class PorN{

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print ("Enter the no. ");
    int i= sc.nextInt();
    if(i<0){
        System.out.println("Negative");
        }
        else{
            System.out.println("Positive");
        }
}
}