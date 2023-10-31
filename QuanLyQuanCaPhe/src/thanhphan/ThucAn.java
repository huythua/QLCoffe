package thanhphan;

public class ThucAn extends SanPham {
	private boolean anChay;

	public ThucAn(String tenSanPham, double giaBan, boolean tinhTrang, String thoiDiemBan, boolean anChay) {
		 super(tenSanPham, giaBan, tinhTrang, thoiDiemBan);
	        this.anChay = anChay;
	}
	
	public ThucAn() {
		
	}
	@Override
	public void themSanPham() {
		System.out.print("Nhập tên món ăn: ");
		setTenSanPham(CauHinh.sc.nextLine());
		System.out.print("Nhập giá bán: ");
		setGiaBan(CauHinh.sc.nextDouble());
		CauHinh.sc.nextLine();
		System.out.print("Vui lòng nhập tình trạng món ăn(Còn=true, hết=false )");
		String s=CauHinh.sc.nextLine();
		if(s.equals("true")==true || s.equals("con")==true || s.equals("Còn")==true || s.equals("còn")==true  ) {
			setTinhTrang(true);
		} else setTinhTrang(false);
		System.out.print("Nhập thời điểm bán(Sáng,trưa,chiều): ");
		setThoiDiemBan(CauHinh.sc.nextLine());
		System.out.print("Món ăn có thể ăn chay không(Có= true, không= false))");
		String a=CauHinh.sc.nextLine();
		if(a=="true" || a=="có" || a=="Có" || a=="có") {
			this.anChay=true;
		} else this.anChay=true;
		
		
	}
	@Override
	public void xuatThongTinSanPham() {
		System.out.printf("Tên thức ăn: %s\n", this.getTenSanPham());
		System.out.printf("Giá : %.2f\t\t\t", this.getGiaBan());
		if(isTinhTrang()==true) {
			System.out.print("Tình trạng: Còn\t\t\t");
		} else System.out.print("Tình trạng: Hết\t\t\t");
		System.out.printf("Thời điểm bán: %s\t\t\t", this.getThoiDiemBan());
		if(this.anChay==true) {
			System.out.println("Ăn chay: có\t\t\t");
		} else System.out.println("Ăn chay: Không\t\t\t");
		
	}
	
	public boolean isAnChay() {
		return anChay;
	}

	public void setAnChay(boolean anChay) {
		this.anChay = anChay;
	}
	
}

