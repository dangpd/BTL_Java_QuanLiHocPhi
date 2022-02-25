/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author DucDang
 */
public class ViDienTu implements Serializable{
    private String soDienThoai;
    private String matKhau;
    private double soDu;

    public ViDienTu(String soDienThoai, String matKhau, double soDu) {
        this.soDienThoai = soDienThoai;
        this.matKhau = matKhau;
        this.soDu = soDu;
    }

    public ViDienTu() {
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.soDienThoai);
        hash = 59 * hash + Objects.hashCode(this.matKhau);
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
        final ViDienTu other = (ViDienTu) obj;
        if (!Objects.equals(this.soDienThoai, other.soDienThoai)) {
            return false;
        }
        return Objects.equals(this.matKhau, other.matKhau);
    }
    
    
    
}