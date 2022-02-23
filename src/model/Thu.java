package model;

import java.io.Serializable;
import java.util.Objects;

public abstract class Thu implements Serializable {

    protected String maSV;
    protected String maKhoanThu;
    protected String tenKhoanThu;
    protected double gia;

    public Thu(String maKhoanThu, String tenKhoanThu, double gia) {
        this.maKhoanThu = maKhoanThu;
        this.tenKhoanThu = tenKhoanThu;
        this.gia = gia;
    }

    public Thu() {
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
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.maKhoanThu);
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
        final Thu other = (Thu) obj;
        return Objects.equals(this.maKhoanThu, other.maKhoanThu);
    }

}
