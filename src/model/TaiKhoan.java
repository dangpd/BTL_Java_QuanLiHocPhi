package model;

import java.io.Serializable;
import java.util.Objects;

public class TaiKhoan implements Serializable {

    private String maTaiKhoan;
    private String matKhau;
    private String quyen;

    public TaiKhoan(String maTaiKhoan, String matKhau) {
        this.maTaiKhoan = maTaiKhoan;
        this.matKhau = matKhau;
    }

    public TaiKhoan(String maTaiKhoan, String matKhau, String quyen) {
        super();
        this.maTaiKhoan = maTaiKhoan;
        this.matKhau = matKhau;
        this.quyen = quyen;
    }

    public TaiKhoan() {
        super();
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.maTaiKhoan);
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
        final TaiKhoan other = (TaiKhoan) obj;
        return Objects.equals(this.maTaiKhoan, other.maTaiKhoan);
    }


}
