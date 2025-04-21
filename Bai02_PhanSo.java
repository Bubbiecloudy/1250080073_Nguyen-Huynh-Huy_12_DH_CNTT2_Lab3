package Lab3;
import java.util.Scanner;

public class Bai02_PhanSo {
    private int tu;
    private int mau;

    public Bai02_PhanSo() {
        tu = 0;
        mau = 1;
    }

    public Bai02_PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = (mau == 0) ? 1 : mau;
        rutGon();
    }

    public Bai02_PhanSo(Bai02_PhanSo p) {
        this.tu = p.tu;
        this.mau = p.mau;
    }

    public void nhapPhanSo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        tu = sc.nextInt();
        do {
            System.out.print("Nhap mau so (khac 0): ");
            mau = sc.nextInt();
        } while (mau == 0);
        rutGon();
    }

    public void xuatPhanSo() {
        System.out.println(tu + "/" + mau);
    }

    private int USCLN() {
        int a = Math.abs(tu);
        int b = Math.abs(mau);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private void rutGon() {
        int gcd = USCLN();
        tu /= gcd;
        mau /= gcd;
        if (mau < 0) {
            tu = -tu;
            mau = -mau;
        }
    }

    public Bai02_PhanSo cong(Bai02_PhanSo p) {
        int tuMoi = this.tu * p.mau + p.tu * this.mau;
        int mauMoi = this.mau * p.mau;
        return new Bai02_PhanSo(tuMoi, mauMoi);
    }

    public Bai02_PhanSo tru(Bai02_PhanSo p) {
        int tuMoi = this.tu * p.mau - p.tu * this.mau;
        int mauMoi = this.mau * p.mau;
        return new Bai02_PhanSo(tuMoi, mauMoi);
    }

    public Bai02_PhanSo nhan(Bai02_PhanSo p) {
        return new Bai02_PhanSo(this.tu * p.tu, this.mau * p.mau);
    }

    public Bai02_PhanSo chia(Bai02_PhanSo p) {
        return new Bai02_PhanSo(this.tu * p.mau, this.mau * p.tu);
    }
}
