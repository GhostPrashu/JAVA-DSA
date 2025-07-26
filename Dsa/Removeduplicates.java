package Dsa;
class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
        this.next=null;
    }
}

class Linkedlisttraversal {
    ListNode head;
    void traversal(){
        if(head==null){
            System.out.println("List is empty");
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;

        }
        System.out.println("Null");
    }
    void insert_at_end(int data){
        ListNode newnode=new ListNode(data);
        if(head==null){
            head=newnode;
            return;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    void removedup(){
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if (temp.data == temp.next.data){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
    }
}

public class Removeduplicates {
    public static void main(String[] args) {
        Linkedlisttraversal ob=new Linkedlisttraversal();
        ob.insert_at_end(20);
        ob.insert_at_end(30);
        ob.insert_at_end(45);
        ob.insert_at_end(60);
        ob.insert_at_end(12);
        ob.removedup();
        ob.traversal();
    }
}
