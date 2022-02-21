package model;

import java.io.Serializable;

public class TaiKhoanTien implements Serializable{
	private String maTaiKhoanTien;
	private double soDu;

	public TaiKhoanTien(String maTaiKhoanTien, double soDu) {
		super();
		this.maTaiKhoanTien = maTaiKhoanTien;
		this.soDu = soDu;
	}

	public TaiKhoanTien() {
		super();
	}

	public String getMaTaiKhoanTien() {
		return maTaiKhoanTien;
	}

	public void setMaTaiKhoanTien(String maTaiKhoanTien) {
		this.maTaiKhoanTien = maTaiKhoanTien;
	}

	public double getSoDu() {
		return soDu;
	}

	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maTaiKhoanTien == null) ? 0 : maTaiKhoanTien.hashCode());
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
		TaiKhoanTien other = (TaiKhoanTien) obj;
		if (maTaiKhoanTien == null) {
			if (other.maTaiKhoanTien != null)
				return false;
		} else if (!maTaiKhoanTien.equals(other.maTaiKhoanTien))
			return false;
		return true;
	}

}
