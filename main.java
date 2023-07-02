import java.util.Scanner;
 
public class num {


public static void main(String  arg[]) {
   

stackclass top=null;

System.out.println("you want new node?!! yes 1 no 2");
Scanner input=new Scanner(System.in);
int x= input.nextInt();
stackclass s1=new stackclass();
stackclass s2=null;
s2=s1.createobj();

while(x==1){
   System.out.println("enter tha value");
   int value=input.nextInt();
   top=s2.entervalue(value,s2,top);
   top=s2;
System.out.println("you want to node ?!! yes 1 no 2");
x=input.nextInt();
s2=s1.createobj();
}
System.out.println("you want display all data yes 1 no 2!!!");
int k=input.nextInt();
stackclass temp=top;
if(k==1){
   while(temp!=null){
      
      System.out.print(temp.data+",");
      temp=temp.next;
   }
}

   }
    
   
}
