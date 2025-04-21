package Lab3;
import java.util.Scanner;

public class Bai02_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bai02_PhanSo p1 = new Bai02_PhanSo();
        System.out.print("Phan so p1 mac dinh: ");
        p1.xuatPhanSo();

        System.out.println("Nhap phan so p1:");
        p1.nhapPhanSo();
        System.out.print("Phan so p1 sau khi nhap: ");
        p1.xuatPhanSo();

        Bai02_PhanSo p2 = new Bai02_PhanSo(4, 16);
        System.out.print("Phan so p2 = 4/16 rut gon: ");
        p2.xuatPhanSo();

        System.out.println("Nhap phan so p3:");
        System.out.print("Tu: ");
        int tu = sc.nextInt();
        System.out.print("Mau: ");
        int mau = sc.nextInt();
        Bai02_PhanSo p3 = new Bai02_PhanSo(tu, mau);
        System.out.print("Phan so p3: ");
        p3.xuatPhanSo();

        Bai02_PhanSo ketQuaCong = p1.cong(p3);
        System.out.print("Ket qua p1 + p3: ");
        ketQuaCong.xuatPhanSo();

        Bai02_PhanSo p4 = new Bai02_PhanSo(ketQuaCong);
        System.out.print("Phan so p4 (sao chep tu ket qua cong): ");
        p4.xuatPhanSo();

        Bai02_PhanSo ketQuaNhan = p4.nhan(p2);
        System.out.print("Ket qua p4 * p2: ");
        ketQuaNhan.xuatPhanSo();
    }
}


