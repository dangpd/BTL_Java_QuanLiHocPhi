/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import controller.Controller;
import java.util.ArrayList;
import model.SinhVien;
import model.TaiKhoan;

/**
 *
 * @author DucDang
 */
public class DataManager {
    public static ArrayList<TaiKhoan> dsTaiKhoan;
    public static ArrayList<SinhVien> dsSV;
    
    private Controller controller = new Controller();
    
    public DataManager() {
        dsTaiKhoan = controller.docFile("src/data/taikhoan.txt");
        dsSV = controller.docFile("src/data/sinhvien.txt");
    }
}
