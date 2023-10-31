package thanhphan;


import java.text.ParseException;

import java.util.Date;



public class NhanVien {
	
	public static int dem;
	private int maNV;
	private String hoTen;
	private String gioiTinh;
	private String queQuan;
	private Date ngaySinh;
	private Date ngayVaoLam;
	private BoPhan boPhan;
	
	public NhanVien(String hoTen, String gioiTinh,String queQuan, Date ngaySinh, Date ngayVaoLam, String boPhan){
		this.hoTen=hoTen;
		this.gioiTinh=gioiTinh;
		this.queQuan=queQuan;
		this.ngaySinh=ngaySinh;
		this.ngayVaoLam=ngayVaoLam;
		setBoPhan(boPhan);
	}
	public NhanVien(String hoTen, String gioiTinh,String queQuan, String ngaySinh, String ngayVaoLam,String boPhan) throws ParseException{
		this.hoTen=hoTen;
		this.gioiTinh=gioiTinh;
		this.queQuan=queQuan;
		this.ngaySinh=CauHinh.f.parse(ngaySinh);
		this.ngayVaoLam=CauHinh.f.parse(ngayVaoLam);
		setBoPhan(boPhan);
	}
	public NhanVien() {
		
	}
	public void themNv()
		throws ParseException {
			System.out.print("Ho ten: ");
			this.hoTen=CauHinh.sc.nextLine();
			System.out.print("Gioi tinh: ");
			this.gioiTinh=CauHinh.sc.nextLine();
			System.out.print("Que quan: ");
			this.queQuan=CauHinh.sc.nextLine();
			System.out.print("Ngay Sinh: ");
			this.ngaySinh=CauHinh.f.parse(CauHinh.sc.nextLine());
			System.out.print("Ngay vao lam: ");
			this.ngayVaoLam=CauHinh.f.parse(CauHinh.sc.nextLine());
			BoPhan x = new BoPhan();
			setBoPhan(x);
	}
	public void xuatNv(){
		System.out.printf("Ma Nhan Vien: %d\n",this.maNV);
		System.out.printf("Ho va Ten: %s\n", this.hoTen);
		System.out.printf("Gioi tinh: %s\n", this.gioiTinh);
		System.out.printf("Que quan: %s\n", this.queQuan);
		System.out.printf("Ngay sinh: %s\n", CauHinh.f.format(this.ngaySinh));
		System.out.printf("Ngay vao lam: %s\n", CauHinh.f.format(this.ngayVaoLam));
		System.out.printf("Ma bo phan: %s\n",this.boPhan.getMaBoPhan() );
		System.out.printf("Ten bo phan: %s\n\n",this.boPhan.getTenBoPhan() );		
	}
	{
		maNV=++dem;
	}
	
	public String getNgay(){
		return CauHinh.j.format(this.ngaySinh);
	}
	public int getMaNV() {
		return maNV;
	}
	public void setMaNV(int maNV) {
		this.maNV=maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen=hoTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh=gioiTinh;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh=ngaySinh;
	}
	public Date getNgayVaoLam() {
		return ngayVaoLam;
	}
	public void setNgayVaoLam(Date ngayVaoLam) {
		this.ngayVaoLam=ngayVaoLam;
	}
	public BoPhan getBoPhan() {
		return boPhan;
	}
	public void setBoPhan(BoPhan boPhan) {
		
		boPhan=DanhSachBoPhan.timBoPhan(boPhan);
		this.boPhan = boPhan;
	}
	public void setBoPhan(String tenboPhan) {
		BoPhan h = new BoPhan(tenboPhan);
		h=DanhSachBoPhan.timBoPhan(h);
		this.boPhan=h;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
}

