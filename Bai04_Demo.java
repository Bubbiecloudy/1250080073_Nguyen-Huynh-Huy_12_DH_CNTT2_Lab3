package Lab3;
public class Bai04_Demo {
    public static void main(String[] args) {

        Bai04_NhanVien nv1 = new Bai04_NhanVien();
        Bai04_NhanVien nv2 = new Bai04_NhanVien("NV02", "Nguyen Van B", 5000, 2.0);
        Bai04_NhanVien nv3 = new Bai04_NhanVien(nv2);

        System.out.println("Nhap nhan vien 1:");
        nv1.nhap();

        System.out.println("\nXuat nhan vien 1:");
        nv1.xuat();
        System.out.println("\nXuat nhan vien 2:");
        nv2.xuat();
        System.out.println("\nXuat nhan vien 3 (sao chep):");
        nv3.xuat();

        nv1.setHoTen("Tran Thi A");
        System.out.println("\nNhan vien 1 sau khi thay doi ten:");
        nv1.xuat();

        Bai04_NhanVien max = nv1;
        if (nv2.getHeSoLuong() > max.getHeSoLuong()) max = nv2;
        if (nv3.getHeSoLuong() > max.getHeSoLuong()) max = nv3;

        System.out.println("\nNhan vien co he so luong cao nhat:");
        max.xuat();

        System.out.println("\nNhap danh sach nhan vien:");
        Bai04_DanhSachNhanVien ds = new Bai04_DanhSachNhanVien();
        ds.nhapDanhSach();

        System.out.println("\nDanh sach nhan vien:");
        ds.xuatDanhSach();

        System.out.println("\nTong so nhan vien:");
        ds.inSoLuongNhanVien();
    }
}

