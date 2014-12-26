package Stack;

import java.util.*;  
class stack  
{  
     int size,top=-1;  
     int stackAr[];  
     public stack(int size)  
     {  
          this.size=size;  
          stackAr=new int[size];  
     }  
     public void push (int data)  
     {  
          //System.out.println("-------size: "+size);  
          if (top<(size-1))  
          {  
               stackAr[++top]=data;  
               System.out.println("-------top: "+top);  
          }  
          else  
               System.out.println("No space to insert.");  
     }  
     public void pop()  
     {  
          System.out.println("element is removed: "+stackAr[top]);  
          top--;  
     }  
     public void display()  
     {  
          if (top!=-1)  
          {   
               for (int i=0;i<=top;i++ )  
               {  
                    System.out.print(stackAr[i]+"\t");  
               }  
          }  
          else  
               System.out.println("Empty");  
          //System.out.println();  
     }  
}  
class StackADT   
{  
     public static void main(String[] args)   
     {  
          System.out.print("Enter the size of the array:");  
          Scanner scan=new Scanner(System.in);  
          int size=scan.nextInt();  
          stack obj=new stack(size);  
          while (true)  
          {  
               System.out.println("\n1. push.\n2.pop.\n3.display.\n4.exit.\n");  
               int option=scan.nextInt();  
               switch (option)  
               {  
               case 1:  
                    System.out.println("Enter element:");  
                    int data=scan.nextInt();  
                    obj.push(data);  
                    break;  
               case 2:  
                    obj.pop();  
                    break;  
               case 3:  
                    obj.display();  
                    break;  
               case 4:  
                    System.exit(0);  
               default:  
                    System.out.println("wrong input..");  
               }  
          }  
     }  
}  

