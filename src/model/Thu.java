package model;

public abstract class Thu {
	protected String maKhoanThu;
	protected String tenKhoanThu;
	protected double gia;

	public String getMaKhoanThu() {
		return maKhoanThu;
	}

	public void setMaKhoanThu(String maKhoanThu) {
		this.maKhoanThu = maKhoanThu;
	}

	public String getTenKhoanThu() {
		return tenKhoanThu;
	}

	public void setTenKhoanThu(String tenKhoanThu) {
		this.tenKhoanThu = tenKhoanThu;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}
}
