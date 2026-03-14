package homework.prob4;
public class DoublyLinkedList {
    Node header;
    DoublyLinkedList(){
        header = new Node();
    }
    //1. adds to the end of the list
    public void addLast(String item){
     Node nn=header;
     Node newNode=new Node();
        while (nn.next!=null) {
            nn = nn.next;
        }
              newNode.value=item;
              nn.next=newNode;
              newNode.previous=nn;
    }
    // 2. Remove by passing object
    public boolean remove(String item){
        Node nn=header.next;
        while (nn!=null){
            if(item.equals(nn.value)){
                nn.previous.next = nn.next;
                if(nn.next!=null) {
                    nn.next.previous = nn.previous;
                }
                return true;
            }
            nn=nn.next;
        }
      return false;
    }

    // 3. Remove the First Node

    public boolean removeFirst() {
        if(header.next==null) return false;
        Node nn=header.next;
        header.next=nn.next;
        if(nn.next!=null) {
            nn.next.previous = header;
        }
        return true;
    }
    // 4. Prints the list from last to first
    public void printReverse() {
        Node nn=header;
        while(nn.next!=null){
            nn=nn.next;
        }
        while(nn!=header){
            System.out.print(nn.value+"-->");
            nn=nn.previous;
        }
        System.out.print("Null");
    }
    @Override
    public String toString(){
        StringBuilder ob=new StringBuilder("[");
        if(header.next==null){
            return "[Empty List]";
        }
        else{
             Node current=header.next;
            while (current!=null){
                ob.append(current.value);
                ob.append("-->");
                current=current.next;
            }
            ob.append("Null]");
        }
        return ob.toString();
    }
    private void toString(StringBuilder sb, Node n) {
        if(n==null) return;
        if(n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println(list);
        System.out.println(list.remove("Bob"));;
        System.out.println(list);
        list.addLast("Bob");
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list);
        list.addLast("Harry");
        System.out.println(list);
         list.printReverse();
        // Call all your implemented Methods
    }
}
