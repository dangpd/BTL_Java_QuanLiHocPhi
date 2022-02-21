package model;

import java.io.Serializable;

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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hocPhan == null) ? 0 : hocPhan.hashCode());
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
		LopHocPhan other = (LopHocPhan) obj;
		if (hocPhan == null) {
			if (other.hocPhan != null)
				return false;
		} else if (!hocPhan.equals(other.hocPhan))
			return false;
		if (sinhVien == null) {
			if (other.sinhVien != null)
				return false;
		} else if (!sinhVien.equals(other.sinhVien))
			return false;
		return true;
	}

}
