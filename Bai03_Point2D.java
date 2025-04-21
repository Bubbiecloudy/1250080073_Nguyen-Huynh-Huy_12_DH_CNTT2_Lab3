package Lab3;
public class Bai03_Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Bai03_Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Bai03_Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Bai03_Point2D cong(Bai03_Point2D p) {
        return new Bai03_Point2D(this.x + p.x, this.y + p.y);
    }

    public Bai03_Point2D doiXungQuaTrucHoanh() {
        return new Bai03_Point2D(this.x, -this.y);
    }

    public void inToaDo() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

