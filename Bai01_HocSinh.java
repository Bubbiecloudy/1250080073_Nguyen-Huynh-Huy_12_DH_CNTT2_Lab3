package Lab3;
import java.util.Scanner;

public class Bai01_HocSinh {
    private int maSo;
    private String hoTen;
    private float dtb;

public int getMaso(){
    return maSo;
}
public void setMaso(int maSo){
    this.maSo = maSo;
}
public String getHoten(){
    return hoTen;
}
public void setHoten(String hoTen){
    this.hoTen = hoTen;
}
public float getDtb(){
    return dtb;
}
public void setDtb(float dtb){
    this.dtb = dtb;
}
public Bai01_HocSinh(){
    this.maSo = 0;
    this.hoTen = null;
    this.dtb = 0f;
}
public Bai01_HocSinh(int maSo, String hoTen, float dtb){
    this.maSo = maSo;
    this.hoTen = hoTen;
    this.dtb = dtb;
}
public Bai01_HocSinh(Bai01_HocSinh tmp){
    this.maSo = tmp.maSo;
    this.hoTen = tmp.hoTen;
    this.dtb = tmp.dtb;
}
public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ma so: ");
    maSo = sc.nextInt();
    sc.nextLine();
    System.out.println("Nhap ho ten: ");
    hoTen = sc.nextLine();
    System.out.println("Nhap dtb: ");
    dtb = sc.nextFloat();
}
public void output(){
    System.out.println(maSo + "-" + hoTen + "-" + dtb);
}
public void rank(){
    if(dtb < 5){
        System.out.println("Xep loai yeu.");
    } else if (dtb >= 5 && dtb <= 7) {
        System.out.println("Xep loai trung binh.");
    } else if (dtb >= 7 && dtb < 8) {
        System.out.println("Xep loai kha.");
    } else if (dtb >= 8 && dtb < 9) {
        System.out.println("Xep loai gioi.");
    } else {
        System.out.println("Xep loai xuat sac.");
    }
    
}
}