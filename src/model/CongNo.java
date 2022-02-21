/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Chien
 */
public class CongNo implements Serializable{
    private SinhVien sinhVien;
    private Thu khoanThu;
    private boolean kiemTraThu;

    public CongNo(SinhVien sinhVien, Thu khoanThu, boolean kiemTraThu) {
        this.sinhVien = sinhVien;
        this.khoanThu = khoanThu;
        this.kiemTraThu = kiemTraThu;
    }

    public CongNo() {
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public Thu getKhoanThu() {
        return khoanThu;
    }

    public void setKhoanThu(Thu khoanThu) {
        this.khoanThu = khoanThu;
    }

    public boolean isKiemTraThu() {
        return kiemTraThu;
    }

    public void setKiemTraThu(boolean kiemTraThu) {
        this.kiemTraThu = kiemTraThu;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.sinhVien);
        hash = 67 * hash + Objects.hashCode(this.khoanThu);
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
        final CongNo other = (CongNo) obj;
        if (!Objects.equals(this.sinhVien, other.sinhVien)) {
            return false;
        }
        return Objects.equals(this.khoanThu, other.khoanThu);
    }

      
}
