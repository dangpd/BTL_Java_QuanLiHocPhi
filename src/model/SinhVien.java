package model;

import java.io.Serializable;

public class SinhVien implements Serializable {

    private String maSinhVien;
    private String hoTen;
    private Lop lop;
    private double soTienTK;
    private String diaChi;
    private TaiKhoanTien taiKhoanTien;

    public SinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    
    public SinhVien(String maSinhVien, String hoTen, Lop lop, double soTienTK, String diaChi, TaiKhoanTien taiKhoanTien) {
        super();
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.soTienTK = soTienTK;
        this.diaChi = diaChi;
        this.taiKhoanTien = taiKhoanTien;
    }

    public SinhVien() {
        super();
    }

    public TaiKhoanTien getTaiKhoanTien() {
        return taiKhoanTien;
    }

    public void setTaiKhoanTien(TaiKhoanTien taiKhoanTien) {
        this.taiKhoanTien = taiKhoanTien;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public double getSoTienTK() {
        return soTienTK;
    }

    public void setSoTienTK(double soTienTK) {
        this.soTienTK = soTienTK;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((maSinhVien == null) ? 0 : maSinhVien.hashCode());
        return result;
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
        SinhVien other = (SinhVien) obj;
        if (maSinhVien == null) {
            if (other.maSinhVien != null) {
                return false;
            }
        } else if (!maSinhVien.equals(other.maSinhVien)) {
            return false;
        }
        return true;
    }

}
