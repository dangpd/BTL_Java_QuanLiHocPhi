package model;

import java.io.Serializable;

public class HocPhan implements Serializable {
	private String maHocPhan;
	private String tenHocPhan;
	private int tinChi;
	private String loai;
        private double gia;
        private final double giaGoc = 350000;

	public HocPhan(String maHocPhan, String tenHocPhan, int tinChi, String loai) {
		this.maHocPhan = maHocPhan;
		this.tenHocPhan = tenHocPhan;
		this.tinChi = tinChi;
		this.loai = loai;
                if(this.loai == "LT")
                    this.gia = giaGoc*tinChi;
                if(this.loai == "TH")
                    this.gia = giaGoc*tinChi*1.2;
	}

	public HocPhan() {
	}

	public String getMaHocPhan() {
		return maHocPhan;
	}

	public void setMaHocPhan(String maHocPhan) {
		this.maHocPhan = maHocPhan;
	}

	public String getTenHocPhan() {
		return tenHocPhan;
	}

	public void setTenHocPhan(String tenHocPhan) {
		this.tenHocPhan = tenHocPhan;
	}

	public int getTinChi() {
		return tinChi;
	}

	public void setTinChi(int tinChi) {
		this.tinChi = tinChi;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maHocPhan == null) ? 0 : maHocPhan.hashCode());
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
		HocPhan other = (HocPhan) obj;
		if (maHocPhan == null) {
			if (other.maHocPhan != null)
				return false;
		} else if (!maHocPhan.equals(other.maHocPhan))
			return false;
		return true;
	}

}
