package Lab3;
import java.util.Scanner;

public class Bai04_NhanVien {
    private String maSo;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;
    private static int soLuongNhanVien = 0;

    public Bai04_NhanVien() {
        maSo = "";
        hoTen = "";
        luongCoBan = 0.0;
        heSoLuong = 1.0;
        soLuongNhanVien++;
    }

    public Bai04_NhanVien(String maSo, String hoTen, double luongCoBan, double heSoLuong) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        soLuongNhanVien++;
    }

    public Bai04_NhanVien(Bai04_NhanVien nv) {
        this.maSo = nv.maSo;
        this.hoTen = nv.hoTen;
        this.luongCoBan = nv.luongCoBan;
        this.heSoLuong = nv.heSoLuong;
        soLuongNhanVien++;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        maSo = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap luong co ban: ");
        luongCoBan = sc.nextDouble();
        System.out.print("Nhap he so luong: ");
        heSoLuong = sc.nextDouble();
    }

    public void xuat() {
        System.out.println("Ma so: " + maSo);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Luong co ban: " + luongCoBan);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Luong: " + tinhLuong());
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public static void inSoLuongNhanVien() {
        System.out.println("So luong nhan vien: " + soLuongNhanVien);
    }
}
