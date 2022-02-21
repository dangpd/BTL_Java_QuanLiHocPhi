package model;

import java.io.Serializable;
import java.util.Objects;

public class ThuTheoDangKy extends Thu implements Serializable {

    private LopHocPhan lopHocPhan;
    private int soDanhMaTuDong;

    /**
     *
     * @param maKhoanThu
     * @param tenKhoanThu
     * @param gia
     * @param lopHocPhan
     */
    public ThuTheoDangKy(int soDanhMaTuDong, LopHocPhan lopHocPhan) {
        this.lopHocPhan = lopHocPhan;
        this.soDanhMaTuDong = soDanhMaTuDong;
        System.out.println(this.soDanhMaTuDong);
        System.out.println(this.lopHocPhan.getHocPhan().getTenHocPhan());
        System.out.println(this.maKhoanThu);
        System.out.println(this.tenKhoanThu);
        System.out.println();
//        super("TTDk" + String.valueOf(soDanhMaTuDong),"Thu đăng ký học phần " + lopHocPhan.getHocPhan().getTenHocPhan(),lopHocPhan.getHocPhan().getGia());
    }

    public ThuTheoDangKy() {
    }

    public LopHocPhan getLopHocPhan() {
        return lopHocPhan;
    }

    public void setLopHocPhan(LopHocPhan lopHocPhan) {
        this.lopHocPhan = lopHocPhan;
    }

    public int getSoDanhMaTuDong() {
        return soDanhMaTuDong;
    }

    public void setSoDanhMaTuDong(int soDanhMaTuDong) {
        this.soDanhMaTuDong = soDanhMaTuDong;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.lopHocPhan);
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
        final ThuTheoDangKy other = (ThuTheoDangKy) obj;
        return Objects.equals(this.lopHocPhan, other.lopHocPhan);
    }
}
