
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

    /*public void initList() {
        head = new Node(10);
        head.next = new Node(11);
        head.next.next = new Node(12);
        head.next.next.next = new Node(13);
        head.next.next.next.next = new Node(14);
    } */

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

    //3. Thêm phần tử vào đầu danh sách
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

    // 4. Xóa phần tử cuối danh sách
    public void removeLast() {

        if (head == null) {
            return;
        }

        if (isEmpty()) {
            head = null;
            tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
    }

    // 5. Xóa phần tử đầu danh sách
   public void removeFirst() {
        if (isEmpty()) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
    }
    //  6. In danh sách LKD
    public void printList() {
        Node current = head;
        while (current != null) {
            IO.print(current.data + " ");
            current = current.next;
        }
        IO.println();
    }

    //7. Thêm  môt phần tử vào giữa hai phần tử
    public void insertAfter(int key, int data) {
        Node current = head;
        // Tìm node có giá trị bằng key
        while (current != null && current.data != key) {
            current = current.next;
        }
        
        if (current != null) {
            Node newNode = new Node(data);
            newNode.next = current.next;
            current.next = newNode;
            // Nếu node tìm thấy đang là tail thì cập nhật lại tail mới
            if (current == tail) {
                tail = newNode;
            }
            IO.println("Đã thêm " + data + " sau " + key);
        } else {
            IO.println("Không tìm thấy giá trị " + key + " trong danh sách!");
        }
    }

    //8. Tìm kiếm một phần tử trong danh sách
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true; // Tìm thấy phần tử
            }
            current = current.next;
        }
        return false; // Không tìm thấy phần tử
     // Hiển thị danh sách
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
    List.addLast(2);
    List.addFirst(3);
    IO.print("DS sau khi thêm: ");
    List.hienThi();
    IO.print("Danh sách sau khi xóa cuối: ");
    List.removeLast();
    List.hienThi();
    IO.println("Danh sách sau khi xóa đầu: ");
    List.removeFirst();
    List.hienThi();
}
}

