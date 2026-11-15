public class Main {
    public static void main(String[] args) {
       SinglyLinkseList ds = new SinglyLinkseList();
       System.out.print("Danh sách rỗng: " + ds.isEmpty()); 
       ds.disPlay();
       System.out.print("Thêm vào cuối danh sách:");
       ds.addLast(10);
       ds.addLast(20);
       ds.addLast(30);
       ds.disPlay();
       //Thêm 5 vào đầu danh sách
       System.out.println("Thêm 5 vào đầu: ");
       ds.addFirst(5);
       ds.disPlay();
       //đếm số phần tử
       System.out.println("Đếm số phần tử: " + ds.size());
       //Tính tổng
       System.out.println("Tính tổng: " + ds.sum());
       //Tìm 20
       System.out.println("Tìm 20 :");
        if (ds.search(20) != null) {
            System.out.println("Tim thay 20");
        } else {
            System.out.println("Khong tim thay 20");
        }
        System.out.println("\nB7: Tim 99");
        //Tìm 99
        if (ds.search(99) != null) {
            System.out.println("Tim thay 99");
        } else {
            System.out.println("Khong tim thay 99");
        }

        //xóa 20
        System.out.println("Xoa 20");
        System.out.println("Ket qua: " + ds.remove(20));
        ds.disPlay();;
        //xóa đầu
         System.out.println("Xóa đầu");
        System.out.println("Ket qua: " + ds.removeFirst());
        ds.disPlay();
        //xoa cuối
         System.out.println("xóa cuối: ");
        System.out.println("Ket qua: " + ds.removeLast());
        ds.disPlay();
        // xóa cuối khi rỗng
        System.out.println("Xoa cuoi khi rong: ");
        System.out.println("Ket qua: " + ds.removeLast());

        // Thêm cuối 50
        System.out.println(" Them cuoi 50");
        ds.addLast(50);
        ds.disPlay();
        //xóa cuối khi rỗng
         System.out.println("\nB12: Xoa cuoi khi rong");
        System.out.println("Ket qua: " + ds.removeLast());

    }
}