import java.util.Scanner;

class D {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name=sc.nextLine();

        System.out.print("Enter your age: ");
        int age=sc.nextInt();

        System.out.print("enter your 1st subject marks : ");
        float firstmarks=sc.nextFloat();
        
        System.out.print("enter your 2nd subject marks : ");
        float secondmarks=sc.nextFloat();
          
        System.out.print("enter your 3th subject marks : ");
        float thirdmarks=sc.nextFloat();

        System.out.print("enter your 4th subject marks : ");
        float fourthmarks=sc.nextFloat();

        System.out.print("enter your 5th subject marks : ");
        float fifthmarks=sc.nextFloat();
       
        double sum=firstmarks+secondmarks+thirdmarks+fourthmarks+fifthmarks;
        double avg=sum/5;
       
        System.out.println("your name : "+name);
        System.out .println("your age : "+age);

       System.out.println("your marks : "+firstmarks);
       System.out.println("your marks : "+secondmarks);
       System.out.println("your marks : "+thirdmarks);
       System.out.println("your marks : "+fourthmarks);
       System.out.println("your marks : "+fifthmarks);
    
      System.out.println("total marks : "+sum);
      System.out.println("avg marks   : "+avg);

      if(avg>89)
      {

     System.out.println("Grade E");}
     

     else if(avg>70);
     {
     System.out.println("Grade A");}
    

                
    }
}