class stackclass {
    int data;
    stackclass next;
    
    public stackclass createobj(){
        System.out.println("object created");

return new stackclass();

    }
public stackclass entervalue(int x,stackclass s3,stackclass top1){
if(top1==null){
    
   s3.next=null;
   s3.data=x;
top1=s3;
   return s3;
   }else {
    
    
      s3.data=x;
      s3.next=top1;
      top1=s3;
      return s3;
   }
}

}
