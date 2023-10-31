package chucnang;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import thanhphan.CauHinh;
import thanhphan.ThongTinBan;
public class QuanLyBan {
	private List <ThongTinBan> dsBan = new ArrayList<>();

	
	public void themBan(ThongTinBan h) {
		dsBan.add(h);
	}
	public void xuatDanhSachBan() {
		for(ThongTinBan h: this.dsBan) {
			if(h.isTinhTrangBan()==true)
			h.xuatThongTinBan();
		}
	}
	public void capNhatThongTinBan() {
		System.out.print("Nhập mã bàn cần sữa(VD:B001):" );
		boolean set=true;
		do {
		String ma= CauHinh.sc.nextLine();
		for(ThongTinBan h: this.dsBan) {
			if(h.getMaBan().equals(ma)==true){
				set=false;
				System.out.println("Vui lòng nhập thông tin để cập nhật thông tin bàn" );
				System.out.print("Sức chứa của bàn: ");
				int a= CauHinh.sc.nextInt();
				CauHinh.sc.nextLine();
				h.setSucChua(a);
				
				System.out.print("Nhập tình trạng của bàn(Trống=true/Không=false): ");
				String s= CauHinh.sc.nextLine();	
				System.out.println(s);
				if(s.equals(ma)==true) {
				h.setTinhTrangBan(false);
					} 
					else {
						h.setTinhTrangBan(true);
					}
				break;
				}			
		} 
		if(set==true) {
			System.out.print("Nhập sai định dạng vui lòng nhập lại: ");
		}
		} while( set==true);
			
	}
	public void xoaThongTinBan() {
		System.out.print("Nhập mã bàn cần xóa(VD:B001):" );
		boolean set=true;
		do {
		String ma= CauHinh.sc.nextLine();
		for(ThongTinBan h: this.dsBan) {
			if(h.getMaBan().equals(ma)==true){
				set=false;
				dsBan.remove(h);
				break;
				}			
		} 
		if(set==true) {
			System.out.print("Nhập sai định dạng vui lòng nhập lại: ");
		}
		} while( set==true);
			
	}
	public List<ThongTinBan> timTheoSucChua(){
		System.out.print("Hãy nhập sức chứa của bàn mà bạn muốn tìm: ");
		int s= CauHinh.sc.nextInt();
		return this.dsBan.stream().filter(h ->h.getSucChua()==s).collect(Collectors.toList());
	}
	
	public ThongTinBan datBan() {
		System.out.print("Nhap mã bàn: ");
		String ma= CauHinh.sc.nextLine();
		for(ThongTinBan h: this.dsBan) {
			if(h.getMaBan().equals(ma)==true){
				return h;
			}
			} return null;			
	}
	
	public List<ThongTinBan> getDsBan() {
		return dsBan;
	}
	public void setDsBan(List<ThongTinBan> dsBan) {
		this.dsBan = dsBan;
	}
}
