package thanhphan;

public abstract class SanPham {
	private String tenSanPham;
	private double giaBan;
	private boolean tinhTrang;
	private String thoiDiemBan;
	
	public SanPham(String tenSanPham, double giaBan, boolean tinhTrang,String thoiDiemBan ) {
		this.tenSanPham= tenSanPham;
		this.giaBan= giaBan;
		this.tinhTrang= tinhTrang;
		this.thoiDiemBan= thoiDiemBan;
	}
	public SanPham() {
		
	}
	public abstract void themSanPham();
		
	
	public abstract void xuatThongTinSanPham();
	
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public boolean isTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public String getThoiDiemBan() {
		return thoiDiemBan;
	}
	public void setThoiDiemBan(String thoiDiemBan) {
		this.thoiDiemBan = thoiDiemBan;
	}
}
