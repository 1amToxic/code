package baitap;

public class Baitap {
    private int idBT,thoihan;
    private String tenBT;

    public Baitap(int idBT, int thoihan, String tenBT) {
        this.idBT = idBT;
        this.thoihan = thoihan;
        this.tenBT = tenBT;
    }

    public int getIdBT() {
        return idBT;
    }

    public void setIdBT(int idBT) {
        this.idBT = idBT;
    }

    public int getThoihan() {
        return thoihan;
    }

    public void setThoihan(int thoihan) {
        this.thoihan = thoihan;
    }

    public String getTenBT() {
        return tenBT;
    }

    public void setTenBT(String tenBT) {
        this.tenBT = tenBT;
    }

    @Override
    public String toString() {
        return "Baitap{" +
                "idBT=" + idBT +
                ", thoihan=" + thoihan +
                ", tenBT='" + tenBT + '\'' +
                '}';
    }
}
