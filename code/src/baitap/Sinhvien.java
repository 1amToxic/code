package baitap;

public class Sinhvien {
    private int id;
    private String hoten,lop;

    public Sinhvien(int id, String hoten, String lop) {
        this.id = id;
        this.hoten = hoten;
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "id=" + id +
                ", hoten='" + hoten + '\'' +
                ", lop='" + lop + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
