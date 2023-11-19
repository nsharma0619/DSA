public class LinkedList {
    private ListNode head;
    private int length;
    public LinkedList(){
        this.length = 0;
        this.head = null;
    }

    public ListNode getHead() {
        return this.head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void insertAtBegging(ListNode listNode){
        if(head==null){
            head = listNode;
        }else{
            listNode.setNext(head);
            head = listNode;
            this.length++;
        }
    }

    public void insertAtEnd(ListNode listNode){
        if(head==null){
            head=listNode;
        }else{
            ListNode tmp = head;
            while(tmp.getNext()!=null){
                tmp = tmp.getNext();
            }
            tmp.setNext(listNode);
        }
        length++;
    }

    public void insert(ListNode listNode, int position){
        if(position<0){
            position = 0;
        }
        else if(position>length){
            position = length;
        }
        if(position==0){
            listNode.setNext(head);
            head = listNode;
        }
        else{
            ListNode tmp = head;
            for(int i=1;i<position;i++){
                tmp = tmp.getNext();
            }
            listNode.setNext(tmp.getNext());
            tmp.setNext(listNode);
        }
    }

    public void removeFromBegin(){
        ListNode listNode = head;
        if(head!=null){
            head = head.getNext();
            listNode.setNext(null);
        }
    }

    public void removeFromEnd(){
        ListNode tmp = head;
        if(head!=null){
            while(tmp.getNext()!=null)
        }
    }



    @Override
    public String toString(){
        String s = "";
        ListNode ls = head;
        while(ls.getNext()!=null){
            s += ls.getData() + "->";
            ls = ls.getNext();
        }
        s += ls.getData();
        return s;
    }
    
}
