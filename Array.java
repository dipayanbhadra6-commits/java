import java.util.Scanner;

Class ArrayInser{
 
 public static void main(System args[]){

 Scanner c =new int[10];
 
 int arr[0]=10;
     arr[1]=20;
     arr[2]=30;
     arr[3]=40;
     arr[4]=50;
   
   int n=5;
int pas,value,i;
for (i=0; i<=n-1;i++){
System.out.println("Element of the array at index "+i+": "+arr[i]);
}

System.out.println("Enter the position where you want add new element: ");
pos= sc.nextInt();

System.out.print("Enter the value you want to insert:");
value=sc.nextln();

for(i=n-1; i>=pos; i--){
 arr[i+1]=arr[i];
}

arr[pos]=value;

n=n+1;
System.out.println("Array after insertion is:");
for(i=0; i<n; i++){
 
System.out.println("Element at index "+i+ "is" +arr[i]);
}

System.out.println("Total length of the array is" +n);
}
}
