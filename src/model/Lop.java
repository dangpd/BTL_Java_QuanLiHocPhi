package model;

import java.io.Serializable;

public class Lop implements Serializable {
	private String maLop;
	private String tenLop;
	private int siSo;
	private Khoa khoa;

	public Lop(String maLop, String tenLop, int siSo, Khoa khoa) {
		super();
		this.maLop = maLop;
		this.tenLop = tenLop;
		this.siSo = siSo;
		this.khoa = khoa;
	}

	public Lop() {
		super();
	}

	public String getMaLop() {
		return maLop;
	}

	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public int getSiSo() {
		return siSo;
	}

	public void setSiSo(int siSo) {
		this.siSo = siSo;
	}

	public Khoa getKhoa() {
		return khoa;
	}

	public void setKhoa(Khoa khoa) {
		this.khoa = khoa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maLop == null) ? 0 : maLop.hashCode());
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
		Lop other = (Lop) obj;
		if (maLop == null) {
			if (other.maLop != null)
				return false;
		} else if (!maLop.equals(other.maLop))
			return false;
		return true;
	}

}
