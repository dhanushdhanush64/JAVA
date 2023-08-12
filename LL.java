import java.util.*;
class LL{
    Node head;
    
    
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data=data;
            this.next= null;
        }
    }
    
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        
    }
    System.out.println("NULL");
}

    public void deleteFirst(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        head=head.next;
        
    }
    
    
    
    public static void main(String args[]){
        LL list=new LL();
        list.addFirst("this");
        list.addFirst("is");
        list.addFirst("a");
        
        list.addFirst("list");
        list.printList();
        list.deleteFirst();
        list.printList();
        
        
        
        
    }
   
}
