package thanhphan;

public class ThongTinBan {
	public static int dem;
	private String maBan;
	private int sucChua;
	private boolean tinhTrangBan;
	{
		maBan= String.format("B%03d",++dem);
	}
		
	
	public ThongTinBan(int sucChua, boolean tinhTrangBan) {
		getMaBan();
		this.sucChua = sucChua;
		this.tinhTrangBan = tinhTrangBan;
	}
	public ThongTinBan() {		
		
	}
	public void themThongTinBan() {
		getMaBan();
		System.out.print("Nhập sức chứa của bàn: ");
		this.sucChua = CauHinh.sc.nextInt();
		
		System.out.print("Nhập tình trạng của bàn(Trống=true/Không=false): ");
		this.tinhTrangBan = CauHinh.sc.nextBoolean();
		
	}
	public void xuatThongTinBan() {
		System.out.printf("Mã bàn: %s\n",this.maBan);
		System.out.printf("Sức chứa bàn: %s\n", this.sucChua);
		if(this.tinhTrangBan==true) {
			System.out.print("Tình trạng bàn: Trống\n\n");		
		} else	System.out.print("Tình trạng bàn: Không trống \n\n");		
	}
	
	public String getMaBan() {
		
		return maBan;
	}
	
	public void setMaBan(String maBan) {
		this.maBan= maBan;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public boolean isTinhTrangBan() {
		return tinhTrangBan;
	}
	public void setTinhTrangBan(boolean tinhTrangBan) {
		this.tinhTrangBan = tinhTrangBan;
		
	}
	
	
//	public String maBan() {
//		int so=++dem;
//		if(so>=0 && so<10) {
//			String ma="B00";
//			String maSo= Integer.toString(so);
//			return ma+maSo;
//		} else if(so>=10 && so<100) {
//			String ma="B0";
//			String maSo= Integer.toString(so);
//			return ma+maSo; 
//			}
//			else if(so>=100 && so<1000) {
//				String ma="B";
//				String maSo= Integer.toString(so);
//				return ma+maSo;
//				}
//			return maBan;
//		
//	}
}
