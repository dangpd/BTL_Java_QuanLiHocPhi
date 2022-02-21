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
public class QuanTri implements Serializable{
    private String maQuanTri;
    private String tenQuanTri;
    private String chucVu;

    public QuanTri(String maQuanTri, String tenQuanTri, String chucVu) {
        this.maQuanTri = maQuanTri;
        this.tenQuanTri = tenQuanTri;
        this.chucVu = chucVu;
    }

    public QuanTri() {
    }

    public String getMaQuanTri() {
        return maQuanTri;
    }

    public void setMaQuanTri(String maQuanTri) {
        this.maQuanTri = maQuanTri;
    }

    public String getTenQuanTri() {
        return tenQuanTri;
    }

    public void setTenQuanTri(String tenQuanTri) {
        this.tenQuanTri = tenQuanTri;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.maQuanTri);
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
        final QuanTri other = (QuanTri) obj;
        return Objects.equals(this.maQuanTri, other.maQuanTri);
    }
    
    
}
