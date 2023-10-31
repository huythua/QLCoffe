package thanhphan;

public class ThucUong extends SanPham {
	private boolean coDa;

	public ThucUong(String tenSanPham, double giaBan, boolean tinhTrang, String thoiDiemBan, boolean coDa) {
		 super(tenSanPham, giaBan, tinhTrang, thoiDiemBan);
	     this.coDa =coDa;
	}
	public ThucUong() {
		
	}
	@Override
	public void themSanPham() {
		System.out.print("Nhập tên thức uống: ");
		setTenSanPham(CauHinh.sc.nextLine());
		System.out.print("Nhập giá bán: ");
		setGiaBan(CauHinh.sc.nextDouble());
		CauHinh.sc.nextLine();
		System.out.print("Vui lòng nhập tình trạng thức uống(Còn=true, hết=false )");
		String s=CauHinh.sc.nextLine();
		if(s.equals("true")==true || s.equals("con")==true || s.equals("Còn")==true || s.equals("còn")==true  ) {
			setTinhTrang(true);
		} else setTinhTrang(false);
		System.out.print("Nhập thời điểm bán(Sáng,trưa,chiều): ");
		setThoiDiemBan(CauHinh.sc.nextLine());
		System.out.print("Thức uống có đá hay không (Có= true, không= false))");
		String a=CauHinh.sc.nextLine();
		if(a=="true" || a=="có" || a=="Có" || a=="có") {
			this.coDa=true;
		} else this.coDa=false;		
	}
	@Override
	public void xuatThongTinSanPham() {
		System.out.printf("Tên thức uống: %s\n", this.getTenSanPham());
		System.out.printf("Giá : %.2f\t\t\t", this.getGiaBan());
		if(isTinhTrang()==true) {
			System.out.print("Tình trạng: Còn\t\t\t");
		} else System.out.print("Tình trạng: Hết\t\t\t");
		System.out.printf("Thời điểm bán: %s\t\t\t", this.getThoiDiemBan());
		if(this.coDa==true) {
			System.out.println("Có Đá: có\t\t\t");
		} else System.out.println("Có Đá: Không\t\t\t");
		
	}
	public boolean isCoDa() {
		return coDa;
	}

	public void setCoDa(boolean coDa) {
		this.coDa = coDa;
	}
	
}
