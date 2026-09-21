import java.util.Scanner;

class B {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name=sc.nextLine();

        System.out.print("Enter your age: ");
        int age=sc.nextInt();

        System.out.print("enter your 1st subject marks : ");
        float firstmarks=sc.nextFloat();
        
        System.out.print("enter your 2st subject marks : ");
        float secondmarks=sc.nextFloat();
          
        System.out.print("enter your 3st subject marks : ");
        float thirdmarks=sc.nextFloat();

        System.out.print("enter your 4st subject marks : ");
        float fourthmarks=sc.nextFloat();

        System.out.print("enter your 5st subject marks : ");
        float fifthmarks=sc.nextFloat();
       
        double sum=firstmarks+secondmarks+thirdmarks+fourthmarks+fifthmarks;
        double avg=sum/5;
       
        System.out.println("your name : "+name);
        System.out .println("your age : "+age);

       System.out.println("your marks : "+firstmarks);
       System.out.println("your marks : "+secondmarks);
       System.out.println("your marks : "+thirdmarks);
       System.out.println("your marks : "+fourthmarks);
       System.out.println("your marks : "+fivithmarks);
    
      System.out.println("total marks : "+sum);
      System.out.println("avg marks   : "+avg);

              
                
    }
}