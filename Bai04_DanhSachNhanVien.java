package Lab3;
import java.util.Scanner;

public class Bai04_DanhSachNhanVien {
    private Bai04_NhanVien[] ds;
    private int soLuong;

    public void nhapDanhSach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        soLuong = sc.nextInt();
        sc.nextLine(); // Xoa bo dong

        ds = new Bai04_NhanVien[soLuong];

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap nhan vien thu " + (i + 1));
            ds[i] = new Bai04_NhanVien();
            ds[i].nhap();
        }
    }

    public void xuatDanhSach() {
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhan vien thu " + (i + 1) + ":");
            ds[i].xuat();
        }
    }

    public void inSoLuongNhanVien() {
        Bai04_NhanVien.inSoLuongNhanVien();
    }
}

