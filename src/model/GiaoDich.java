package model;

import java.io.Serializable;
import java.util.Date;

public class GiaoDich implements Serializable {
	private SinhVien sinhVien;
	private Thu thuTien;
	private TaiKhoanTien napTien;
	private Date ngayNop;
	private float soTien;

	public GiaoDich(SinhVien sinhVien, Thu thuTien, TaiKhoanTien napTien, Date ngayNop, float soTien) {
		this.sinhVien = sinhVien;
		this.thuTien = thuTien;
		this.napTien = napTien;
		this.ngayNop = ngayNop;
		this.soTien = soTien;
	}

	public GiaoDich() {
	}

	public SinhVien getSinhVien() {
		return sinhVien;
	}

	public void setSinhVien(SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}

	public Thu getThuTien() {
		return thuTien;
	}

	public void setThuTien(Thu thuTien) {
		this.thuTien = thuTien;
	}

	public TaiKhoanTien getNapTien() {
		return napTien;
	}

	public void setNapTien(TaiKhoanTien napTien) {
		this.napTien = napTien;
	}

	public Date getNgayNop() {
		return ngayNop;
	}

	public void setNgayNop(Date ngayNop) {
		this.ngayNop = ngayNop;
	}

	public float getSoTien() {
		return soTien;
	}

	public void setSoTien(float soTien) {
		this.soTien = soTien;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sinhVien == null) ? 0 : sinhVien.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GiaoDich other = (GiaoDich) obj;
		if (sinhVien == null) {
			if (other.sinhVien != null)
				return false;
		} else if (!sinhVien.equals(other.sinhVien))
			return false;
		return true;
	}

}
