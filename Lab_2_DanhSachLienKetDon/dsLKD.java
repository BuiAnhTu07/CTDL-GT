class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
// 1. Khởi tạo danh sách
class dsLKD {
    private Node head;
    private Node tail;
    public dsLKD() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
}

// 2. Thêm phần tử vào cuối danh sách



