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

    // 2. Thêm phần tử vào cuối danh sách
    public void addLast(int data) {
    Node newNode = new Node(data);
    if (isEmpty())  {
        head = newNode;
        tail = newNode;
    } else {
        tail.next = newNode;
        tail = newNode;
    }
}

    //Thêm phần tử vào đầu danh sách
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // . Hiển thị danh sách
    public void hienThi() {
        Node current = head;
        while (current != null) {
            IO.print(current.data + " ");
            current = current.next;
        }
        IO.println();
    }

void main() {
    dsLKD List = new dsLKD();
    List.addLast(1); 
    List.addLast(9);
    List.addFirst(19);
    IO.print("DS sau khi thêm: ");
    List.hienThi();
}
}

