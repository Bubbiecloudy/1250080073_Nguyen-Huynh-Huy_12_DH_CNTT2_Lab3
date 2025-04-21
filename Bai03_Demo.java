package Lab3;
public class Bai03_Demo {
    public static void main(String[] args) {
        Bai03_Point2D A = new Bai03_Point2D(1.5f, 2.0f);
        Bai03_Point2D B = new Bai03_Point2D(4.0f, 3.0f);

        System.out.print("Toa do diem A: ");
        A.inToaDo();

        System.out.print("Toa do diem B: ");
        B.inToaDo();

        Bai03_Point2D tong = A.cong(B);
        System.out.print("Tong A + B: ");
        tong.inToaDo();

        Bai03_Point2D doiXungA = A.doiXungQuaTrucHoanh();
        System.out.print("Diem doi xung cua A qua truc hoanh: ");
        doiXungA.inToaDo();
    }
}

