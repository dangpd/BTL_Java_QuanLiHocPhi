/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author DucDang
 */
public class LichSuGD implements Serializable{
    private int maGiaoDich;
    private String tenGiaoDich;
    private long ngayGiaoDich;
    private double soTien;

    public LichSuGD() {
    }

    public LichSuGD(int maGiaoDich, String tenGiaoDich, long ngayGiaoDich, double soTien) {
        this.maGiaoDich = maGiaoDich;
        this.tenGiaoDich = tenGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.soTien = soTien;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getTenGiaoDich() {
        return tenGiaoDich;
    }

    public void setTenGiaoDich(String tenGiaoDich) {
        this.tenGiaoDich = tenGiaoDich;
    }

    public long getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(long ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    @Override
    public String toString() {
        return "LichSuGiaoDich{" + "maGiaoDich=" + maGiaoDich + ", tenGiaoDich=" + tenGiaoDich + ", ngayGiaoDich=" + ngayGiaoDich + ", soTien=" + soTien + '}';
    }
    
    
}
