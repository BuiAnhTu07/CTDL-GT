public class SinglyLinkseList {
    private Node head;
    private Node tail;


//1. khởi tạo danh sách 
public SinglyLinkseList() {
    head = null;
    tail = null;
}
//2. kiểm tra danh sách rỗng
public boolean isEmpty() {
    return  head == null && tail == null;
}

//3. Thêm vào đầu danh sách
public void addFirst(int value) {
    Node newNode = new Node(value);
    if (isEmpty()) {
        head = newNode;
        tail = newNode;
    } else {
        head.next = newNode;
        head = newNode;
       
    }

}
//4. Thêm một phần tử vào cuối danh sách
public void addLast(int value) {
    Node newNode = new Node(value);
    if (isEmpty()) {
        head = newNode;
        tail = newNode;
    } else {
        tail.next = newNode;
        tail = newNode;
    }
}
//5. Hiện thị danh sách
public void disPlay() {
    if (isEmpty()) {
        System.out.println("Danh sách rỗng!");
        return ;
    }
    Node current = head;
    while ( current != null ) {
        System.out.println(current.data + "");
        current = current.next;
    }
}

//6. tìm kiếm một phần tử trong danh sách
public Node search(int value) {
    Node current = head;
    while (current != null) {
        if (current.data == value) {
            return current;
        }
        current = current.next;
    }
    return null;
}

//7 đếm số phần tử trong danh sách
public int size() {
    int count = 0;
    Node current = head;
    while (current != null) {
        count++;
        current = current.next;
    }
    return count;
}

//8. Tính tổng các phần tử
public int sum() {
    int total = 0;
    Node current = head;
    while (current != null) {
        total += current.data;
        current = current.next;
    }
    return total;
}

//9. Xóa phần tử đầu danh sách
public boolean removeFirst() {
    if (isEmpty()) {
        return false;
    } else {
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return true;
    }
}
//10. Xóa phân tử cuối danh sách
public boolean removeLast() {
if (isEmpty()) {
    return false;
} if (head == tail) {
    head = null;
    tail = null;
    return true;
}
  Node current = head;
  while (current.next != tail) {
    current = current.next;
  }
    current.next = null;
    tail = current;
    return true;
}

//11. xóa nút có giá trị value
public boolean remove(int value) {
    if (isEmpty()) {
        return false;
    }
    if (head.data == value) {
        removeFirst();
        return true;
    } 
    if (tail.data == value) {
        removeLast();
        return true;
    }
    Node current = head;
    while (current.next != null) {
        if (current.next.data == value) {
            current.next = current.next.next;
            return true;
        }
        current = current.next;
    }
    return false;
}
}

//xóa phần tử đầu danh sách