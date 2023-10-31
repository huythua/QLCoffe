package thanhphan;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import chucnang.QuanLySanPham;


public class HoaDon {
	private DatBan datBan;
	private Date ngayDat;
	private double thanhToan;
	private QuanLySanPham x;
	
	public HoaDon( String ngayDat,DatBan datBan, QuanLySanPham x) throws ParseException {
		this.setNgayDat(CauHinh.f.parse(ngayDat));
		this.datBan=datBan;
		List<DatMon> ds1=this.datBan.getDs();
		this.x=x;
		List<SanPham> ds2= this.x.getDs();
		double tien=0;
		for (DatMon h1: ds1) {
			for (SanPham h2: ds2 ) {
				if(h1.getTenSp().equals(h2.getTenSanPham())==true) {
					tien= tien+(h2.getGiaBan()*h1.getSoLuong());
				}				
			}
		}
		this.setThanhToan(tien);
	}
	
	
	public HoaDon() {
		
	}
	public void themHoaDon(DatBan datBan, QuanLySanPham x) {
		this.ngayDat= new Date();
		this.datBan=datBan;
		List<DatMon> ds1=this.datBan.getDs();
		this.x=x;
		List<SanPham> ds2= this.x.getDs();
		double tien=0;
		for (DatMon h1: ds1) {
			for (SanPham h2: ds2 ) {
				if(h1.getTenSp().equals(h2.getTenSanPham())==true) {
					tien= tien+(h2.getGiaBan()*h1.getSoLuong());
				}				
			}
		}
		this.thanhToan=tien;
		
	}
	public void xuatHoaDon() {
		this.datBan.xuatDatBan();
		System.out.printf("Ngày tạo hóa đơn %s\n",CauHinh.f.format(this.ngayDat));
		System.out.printf("Số tiền cần thanh toán: %s\t",this.thanhToan);
	}

	public double getThanhToan() {
		return thanhToan;
	}

	public void setThanhToan(double thanhToan) {
		this.thanhToan = thanhToan;
	}

	public Date getNgayDat() {
		return ngayDat;
	}

	public void setNgayDat(Date ngayDat) {
		this.ngayDat = ngayDat;
	}
	public String getNgay(){
		return CauHinh.j.format(this.ngayDat);
	}
}

