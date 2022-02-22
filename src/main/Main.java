/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import model.Khoa;
import model.Lop;
import model.SinhVien;
import controller.Controller;
import model.CongNo;
import model.HocPhan;
import model.LopHocPhan;
import model.QuanTri;
import model.TaiKhoan;
import model.TaiKhoanTien;
import model.Thu;
import model.ThuTheoDangKy;

/**
 *
 * @author Chien
 */
public class Main {

    public static void main(String[] args) {
        Controller con = new Controller();

        //Giao dich (SinhVien sinhVien, Thu thuTien, TaiKhoanTien napTien, Date ngayNop, float soTien)
        //HocPhan
        ArrayList<HocPhan> hocPhans = new ArrayList<HocPhan>();
        HocPhan hocPhan1 = new HocPhan("HP1", "Lap trinh C", 3, "TH");
        HocPhan hocPhan2 = new HocPhan("HP2", "Lap trinh Java", 3, "TH");
        HocPhan hocPhan3 = new HocPhan("HP3", "Tieng anh", 5, "LT");
        HocPhan hocPhan4 = new HocPhan("HP4", "Lap trinh php", 3, "TH");
        HocPhan hocPhan5 = new HocPhan("HP5", "Lap trinh C#", 3, "TH");
        hocPhans.add(hocPhan1);
        hocPhans.add(hocPhan2);
        hocPhans.add(hocPhan3);
        hocPhans.add(hocPhan4);
        hocPhans.add(hocPhan5);
        con.ghiFile(hocPhans, "src/TextJava/hocphan.txt");

        //Khoa
        ArrayList<Khoa> khoas = new ArrayList<Khoa>();
        Khoa khoa = new Khoa("CNTT", "Công nghệ thông tin");
        khoas.add(khoa);
        con.ghiFile(khoas, "src/TextJava/khoa.txt");

        //Lop
        ArrayList<Lop> lops = new ArrayList<Lop>();
        Lop lop1 = new Lop("L01", "KTPM2", 20, khoa);
        Lop lop2 = new Lop("L02", "HTTT2", 20, khoa);
        lops.add(lop1);
        lops.add(lop2);
        con.ghiFile(lops, "src/TextJava/lop.txt");

        //TaiKhoanTien
        ArrayList<TaiKhoanTien> taiKhoanTiens = new ArrayList<TaiKhoanTien>();
        TaiKhoanTien tktien1 = new TaiKhoanTien("tktien1", 100000000);
        TaiKhoanTien tktien2 = new TaiKhoanTien("tktien2", 100000000);
        TaiKhoanTien tktien3 = new TaiKhoanTien("tktien3", 100000000);
        TaiKhoanTien tktien4 = new TaiKhoanTien("tktien4", 100000000);
        TaiKhoanTien tktien5 = new TaiKhoanTien("tktien6", 100000000);
        taiKhoanTiens.add(tktien1);
        taiKhoanTiens.add(tktien2);
        taiKhoanTiens.add(tktien3);
        taiKhoanTiens.add(tktien4);
        taiKhoanTiens.add(tktien5);
        con.ghiFile(taiKhoanTiens, "src/TextJava/taikhoantien.txt");

        //SinhVien
        ArrayList<SinhVien> sinhViens = new ArrayList<SinhVien>();
        SinhVien sinhVien1 = new SinhVien("001", "Bang", lop1, 10000000, "ThaiBinh", tktien1);
        SinhVien sinhVien2 = new SinhVien("002", "Chien", lop1, 1000000, "ThaiBinh", tktien2);
        SinhVien sinhVien3 = new SinhVien("003", "Dang", lop1, 1000000, "ThaiBinh", tktien3);
        SinhVien sinhVien4 = new SinhVien("004", "Dai", lop2, 1000000, "ThaiBinh", tktien4);
        SinhVien sinhVien5 = new SinhVien("005", "Dung", lop1, 1000000, "ThaiBinh", tktien5);
        sinhViens.add(sinhVien1);
        sinhViens.add(sinhVien2);
        sinhViens.add(sinhVien3);
        sinhViens.add(sinhVien4);
        sinhViens.add(sinhVien5);
        con.ghiFile(sinhViens, "src/TextJava/sinhvien.txt");

        //LopHocPhan(SinhVien sinhVien, HocPhan hocPhan)
        ArrayList<LopHocPhan> lopHocPhans = new ArrayList<LopHocPhan>();
        LopHocPhan lopHocPhan1 = new LopHocPhan(sinhVien1, hocPhan1);
        LopHocPhan lopHocPhan2 = new LopHocPhan(sinhVien2, hocPhan3);
        LopHocPhan lopHocPhan3 = new LopHocPhan(sinhVien1, hocPhan5);
        LopHocPhan lopHocPhan4 = new LopHocPhan(sinhVien3, hocPhan2);
        lopHocPhans.add(lopHocPhan1);
        lopHocPhans.add(lopHocPhan2);
        lopHocPhans.add(lopHocPhan3);
        lopHocPhans.add(lopHocPhan4);
        con.ghiFile(lopHocPhans, "src/TextJava/lophocphan.txt");

        //QuanTri
        ArrayList<QuanTri> quanTris = new ArrayList<QuanTri>();
        QuanTri qt1 = new QuanTri("QT1", "Bang", "Ke toan");
        QuanTri qt2 = new QuanTri("QT2", "Chien", "Giang vien");
        QuanTri qt3 = new QuanTri("QT3", "Dang", "Giang vien");
        QuanTri qt4 = new QuanTri("QT4", "Dai", "Giang vien");
        QuanTri qt5 = new QuanTri("QT5", "Dung", "Ke toan");
        quanTris.add(qt1);
        quanTris.add(qt2);
        quanTris.add(qt3);
        quanTris.add(qt4);
        quanTris.add(qt5);
        con.ghiFile(quanTris, "src/TextJava/quantri.txt");

        //TaiKhoan
        ArrayList<TaiKhoan> taiKhoans = new ArrayList<TaiKhoan>();
        TaiKhoan tk1 = new TaiKhoan("QT1", "12345", "QT");
        TaiKhoan tk2 = new TaiKhoan("QT2", "12345", "QT");
        TaiKhoan tk3 = new TaiKhoan("QT3", "12345", "QT");
        TaiKhoan tk4 = new TaiKhoan("QT4", "12345", "QT");
        TaiKhoan tk5 = new TaiKhoan("QT5", "12345", "QT");
        TaiKhoan tk6 = new TaiKhoan("001", "12345", "SV");
        TaiKhoan tk7 = new TaiKhoan("002", "12345", "SV");
        TaiKhoan tk8 = new TaiKhoan("003", "12345", "SV");
        TaiKhoan tk9 = new TaiKhoan("004", "12345", "SV");
        TaiKhoan tk10 = new TaiKhoan("005", "12345", "SV");
        taiKhoans.add(tk1);
        taiKhoans.add(tk2);
        taiKhoans.add(tk3);
        taiKhoans.add(tk4);
        taiKhoans.add(tk5);
        taiKhoans.add(tk6);
        taiKhoans.add(tk7);
        taiKhoans.add(tk8);
        taiKhoans.add(tk9);
        taiKhoans.add(tk10);
        con.ghiFile(taiKhoans, "src/TextJava/taikhoan.txt");

        //Thu theo đăn ký
        ArrayList<Thu> thuTheoDangKy = new ArrayList<>();
        Thu thuTheoDangKy1 = new ThuTheoDangKy(1, lopHocPhan1);
        Thu thuTheoDangKy2 = new ThuTheoDangKy(2, lopHocPhan2);
        Thu thuTheoDangKy3 = new ThuTheoDangKy(3, lopHocPhan3);
        Thu thuTheoDangKy4 = new ThuTheoDangKy(4, lopHocPhan4);
        thuTheoDangKy.add(thuTheoDangKy1);
        thuTheoDangKy.add(thuTheoDangKy2);
        thuTheoDangKy.add(thuTheoDangKy3);
        thuTheoDangKy.add(thuTheoDangKy4);
        con.ghiFile(thuTheoDangKy, "src/TextJava/thutheodangky.txt");

        //Công nợ
        ArrayList<CongNo> congNos = new ArrayList<>();
        CongNo congNo1 = new CongNo(sinhVien1, thuTheoDangKy1, false);
        CongNo congNo2 = new CongNo(sinhVien2, thuTheoDangKy2, false);
        CongNo congNo3 = new CongNo(sinhVien1, thuTheoDangKy3, false);
        CongNo congNo4 = new CongNo(sinhVien3, thuTheoDangKy4, false);
        congNos.add(congNo1);
        congNos.add(congNo2);
        congNos.add(congNo3);
        congNos.add(congNo4);
        System.out.println(congNos.get(1).getSinhVien().getHoTen());
        con.ghiFile(congNos, "src/TextJava/congno.txt");

        ArrayList<ThuTheoDangKy> tks = con.docFile("src/TextJava/thutheodangky.txt");
        for (int i = 0; i < tks.size(); i++) {
            ThuTheoDangKy get = tks.get(i);
            System.out.println(get.getMaKhoanThu());
        }
        
    }
}
