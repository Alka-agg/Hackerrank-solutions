Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    
    Node a = new Node();
    a.data = data;
    int count =0;
    
    if(head==null && position==0)
    {
        head = a;
        return head;
    }
    else
    {
        if(position==0)
        {
            a.next=head;
            head = a;
            return head;
        }
        else{
            Node b= head;
            while(b.next!=null && count<position-1)
            {
                b=b.next;
                count++;
            }
            if(b.next==null)
            {
                a.next=null;
                b.next=null;
                return head;
            }
            else
            {
                a.next= b.next;
                b.next=a;
                return head;
            }
        }
    }
}
