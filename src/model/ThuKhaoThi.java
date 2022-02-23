package model;

import java.io.Serializable;

public class ThuKhaoThi extends Thu implements Serializable {

    private Khoa khoa;
    private int soDanhMaTuDong;

    public ThuKhaoThi(Khoa khoa, int soDanhMaTuDong, String tenKhoanThu, double gia) {
        super("TCDN" + String.valueOf(soDanhMaTuDong), tenKhoanThu, gia);
        this.khoa = khoa;
        this.soDanhMaTuDong = soDanhMaTuDong;
    }

    public ThuKhaoThi(String maKhoanThu, String tenKhoanThu, double gia) {
        super(maKhoanThu, tenKhoanThu, gia);
    }

    public ThuKhaoThi(Khoa khoa, int soDanhMaTuDong) {
        this.khoa = khoa;
        this.soDanhMaTuDong = soDanhMaTuDong;
    }

    public Khoa getKhoa() {
        return khoa;
    }

    public void setKhoa(Khoa khoa) {
        this.khoa = khoa;
    }

    public int getSoDanhMaTuDong() {
        return soDanhMaTuDong;
    }

    public void setSoDanhMaTuDong(int soDanhMaTuDong) {
        this.soDanhMaTuDong = soDanhMaTuDong;
    }

    public String getMaKhoanThu() {
        return maKhoanThu;
    }

    public void setMaKhoanThu(String maKhoanThu) {
        this.maKhoanThu = maKhoanThu;
    }

    public String getTenKhoanThu() {
        return tenKhoanThu;
    }

    public void setTenKhoanThu(String tenKhoanThu) {
        this.tenKhoanThu = tenKhoanThu;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.soDanhMaTuDong;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ThuChiDauNam other = (ThuChiDauNam) obj;
        return this.maKhoanThu.equals(other.maKhoanThu);
    }
}
