package model;

import java.io.Serializable;
import java.util.Objects;

public class LopHocPhan implements Serializable {

    private SinhVien sinhVien;
    private HocPhan hocPhan;

    public LopHocPhan(SinhVien sinhVien, HocPhan hocPhan) {
        super();
        this.sinhVien = sinhVien;
        this.hocPhan = hocPhan;
    }

    public LopHocPhan() {
        super();
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public HocPhan getHocPhan() {
        return hocPhan;
    }

    public void setHocPhan(HocPhan hocPhan) {
        this.hocPhan = hocPhan;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.sinhVien);
        hash = 97 * hash + Objects.hashCode(this.hocPhan);
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
        final LopHocPhan other = (LopHocPhan) obj;
        if (!Objects.equals(this.sinhVien, other.sinhVien)) {
            return false;
        }
        return Objects.equals(this.hocPhan, other.hocPhan);
    }

}
