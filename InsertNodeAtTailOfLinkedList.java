/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
  
    Node a = new Node();
    a.next = null;
    a.data = data;
    
    if(head==null){
        head = a;
        return head;
    }
    else
    {
        Node b = head;
        while(b.next!=null)
        {
            b= b.next;
        }
        b.next= a;
        return head;
    }
}
