package thanhphan;

public class DatMon {
	private String tenSp;
	private int soLuong;
	public DatMon() {
		
	}
	public DatMon(String tenSp, int soLuong) {
		this.tenSp = tenSp;
		this.soLuong = soLuong;
	}
	public void themDatMon() {
		System.out.print("Nhập tên sản phẩm: ");
		this.tenSp=CauHinh.sc.nextLine();
		System.out.print("Số lượng: ");
		this.soLuong=CauHinh.sc.nextInt();
		CauHinh.sc.nextLine();
	}
	
	public void xuatDatMon() {
		System.out.printf("Tên: %s\t",this.tenSp);
		System.out.printf("Số lượng: %d\t\n",this.soLuong);
	}

	public String getTenSp() {
		return tenSp;
	}
	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	
}
