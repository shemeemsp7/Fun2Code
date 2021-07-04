
 class MyNode {
    int data;
    MyNode next;

    public MyNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {
    
   
    //head of the list
    MyNode head;
    MyLinkedList(MyNode head){
        this.head = head;
    }
    public static void main(String[] args) {
        
        MyNode head = new MyNode(1);
        MyLinkedList list = new MyLinkedList(head);

        list.head.next = new MyNode(2);

        list.head.next.next = new MyNode(3);

        list.head.next.next.next = new MyNode(4);

        //printLinkedList(list.head);
        //printLLwithLoop(list.head);
        printLinkedList(reverseLinkedList(head));
    }

    static void printLLwithLoop(MyNode head){
        MyNode current = head;
        while(current !=null){
            System.out.print(current.data+ " ");
            current = current.next;
        }
    }
    static void printLinkedList(MyNode head) {
        
        if (head != null ) {
             System.out.print(head.data + "-->");
        }
        if(head.next == null) {
            System.out.print("null");
            return;
        }
        printLinkedList(head.next);
    }

    static MyNode reverseLinkedList(MyNode head){
        //1 -> 2 -> 3 -> 4 -> null
        MyNode previous = null;
        MyNode current = head;
        MyNode temp = null;
        while(current != null) {
            //next - 2
            temp = current.next;
            //head.next - null
            current.next = previous;
            // previous - head
            previous = current;
            //curre
            current = temp;
        }
        head = previous;
        return head;
    }

    static MyNode  reverse(MyNode node)
    {
        MyNode prev = null;
        MyNode current = node;
        MyNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}
