/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    
    
    int count =0;
   if(position==0)
    {
       Node a = head.next;
        head = a;
        return head;
    }
    else{ 
    Node b = head;
    Node c = head;
    while(b.next!=null && count<position)
    {
        c= b;
        b=b.next;
        count++;
    }
    if(b.next==null)
    {
        if(b==head)
        {
            head= null;
            return head;
        }
        else
        {
            c.next= null;
            return head;
        }
    }
    else
    {
        c.next = b.next;
        return head;
    }
   }
}
