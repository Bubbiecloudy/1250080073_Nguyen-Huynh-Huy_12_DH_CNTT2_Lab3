package Lab3;
import java.util.Scanner;

public class Bai01_DSHocSinh {
    // các thuộc tính
    private Bai01_HocSinh[] ds;   // mảng chứa danh sách học sinh
    private int soLuong;    // số lượng học sinh

    // nhập danh sách
    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        soLuong = sc.nextInt();
        ds = new Bai01_HocSinh[soLuong];
        
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap thong tin hoc sinh thu " + (i + 1) + ":");
            ds[i] = new Bai01_HocSinh();
            ds[i].input();
        }
    }

    public void xuatDS() {
        System.out.println("\nDanh sach hoc sinh la:");
        for (int i = 0; i < soLuong; i++) {
            ds[i].output();
        }
    }

    public void sapXep() {
        for (int i = 0; i < soLuong - 1; i++) {
            for (int j = i + 1; j < soLuong; j++) {
                if (ds[i].getDtb() < ds[j].getDtb()) {
                    Bai01_HocSinh temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }
}
