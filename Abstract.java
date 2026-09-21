abstract class shape{
   abstract void area();

   }

   class triangle extends shape{

    int height=10, base=6 ;

         void area(){
      

      System.out.println("Area of a triangle"+(0.5*base*height));                                                                                                                                                                                           

   }
}

   class circle extends shape{
      int radius=5 ;
    
         void area(){

   
      
      System.out.println("Area of a circle"+(3.14*radius*radius));
     }
   }

   class square extends shape{
      int side=6 ;
       void area(){

   

     System.out.println("Area of a square"+(side*side));
     }
   }

  public class Abstract {

      public static void main(String[]args){

        shape t= new circle();
         //circle   c= new circle();
       //  square   s= new square();

         t.area();
        // c.area();
         //s.area();
      }
}