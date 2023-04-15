//public class Node {
//    int data;
//    Node next;
//    Node(int data)
//    {
//        this.data=data;
//        this.next=null;
//    }
//    public static void insertAtEnd(Node head,int data)
//    {
//        Node newNode=new Node(data);
//        Node curr=head;
//        while(curr.next!=null)
//        {
//            curr=curr.next;
//        }
//        curr.next=newNode;
//    }
//    public static void printLinkedList(Node head)
//    {
//        Node curr=head;
//        while(curr!=null){
//            System.out.println(curr.data+"--->");
//            curr=curr.next;
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        Node head=new Node(10);
//        Node.insertAtEnd(head,20);
//        Node.insertAtEnd(head,30);
//        Node.insertAtEnd(head,40);
//        Node.insertAtEnd(head,50);
//        printLinkedList(head);
//
//    }
//}
