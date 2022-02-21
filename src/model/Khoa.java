package model;

import java.io.Serializable;

public class Khoa implements Serializable {
	private String maKhoa;
	private String tenKhoa;

	public String getMaKhoa() {
		return maKhoa;
	}

	public void setMaKhoa(String maKhoa) {
		this.maKhoa = maKhoa;
	}

	public String getTenKhoa() {
		return tenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

	public Khoa(String maKhoa, String tenKhoa) {
		this.maKhoa = maKhoa;
		this.tenKhoa = tenKhoa;
	}

	public Khoa() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maKhoa == null) ? 0 : maKhoa.hashCode());
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
		Khoa other = (Khoa) obj;
		if (maKhoa == null) {
			if (other.maKhoa != null)
				return false;
		} else if (!maKhoa.equals(other.maKhoa))
			return false;
		return true;
	}

}
