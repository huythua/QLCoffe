package chucnang;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import thanhphan.CauHinh;
import thanhphan.NhanVien;

public class QuanLyNhanVien {
	
	private List<NhanVien> ds= new ArrayList<>();
	
	public void themNhanVien(NhanVien h) {
		this.ds.add(h);
	}
	public void xuatDsNV() {
		for(NhanVien h : this.ds) {
			h.xuatNv();
		}
	}
	public List<NhanVien> traCuuTen(String ten) {
		return this.ds.stream().filter(h ->h.getHoTen().contains(ten)).collect(Collectors.toList());	
	}
	public List<NhanVien> traCuuGioiTinh(String gioiTinh) {
		return this.ds.stream().filter(h ->h.getGioiTinh().contains(gioiTinh)).collect(Collectors.toList());
	}
	public List<NhanVien> traCuuQueQuan(String queQuan) {
		return this.ds.stream().filter(h ->h.getQueQuan().contains(queQuan)).collect(Collectors.toList());
	}
	public List<NhanVien> traCuuNgaySinh(String ngaySinh) throws ParseException  {
		Date date=CauHinh.f.parse(ngaySinh);
		return this.ds.stream().filter(h ->h.getNgaySinh().equals(date)).collect(Collectors.toList());
	}
	public List<NhanVien> traCuuNgaySinhNhat(){
		Date date= new Date();
		String x= CauHinh.j.format(date);
		return this.ds.stream().filter(h ->h.getNgay().contains(x)).collect(Collectors.toList());
	}
	
	public void xoaNV() {
		System.out.print("Nhap ma nhan vien can xoa: ");
		int ma= CauHinh.sc.nextInt();
		for (NhanVien h: this.ds) {
			if(h.getMaNV()==ma) {
				ds.remove(h);
				break;
			}
		}
	}
	public void capNhatNV() throws ParseException {
		System.out.print("Nhap ma nhan vien can cap nhat: ");
		int ma= CauHinh.sc.nextInt();
		for (NhanVien h: this.ds) {
			if(h.getMaNV()==ma) {
				System.out.println("==========================\nVui long nhap thong tin de cap nhat nhan vien:");
				CauHinh.sc.nextLine();
				System.out.print("Ho ten: ");
				String name= CauHinh.sc.nextLine();
				h.setHoTen(name);
				System.out.print("Gioi tinh: ");
				String gioiTinh= CauHinh.sc.nextLine();
				h.setGioiTinh(gioiTinh);
				System.out.print("Que quan: ");
				String queQuan= CauHinh.sc.nextLine();
				h.setQueQuan(queQuan);
				System.out.print("Ngay sinh: ");
				Date ngaySinh= CauHinh.f.parse(CauHinh.sc.nextLine());				
				h.setNgaySinh(ngaySinh);
				System.out.print("Ngay vao lam: ");
				Date ngayVaoLam= CauHinh.f.parse(CauHinh.sc.nextLine());				
				h.setNgayVaoLam(ngayVaoLam);
				System.out.print("Bo phan: ");
				String boPhan = CauHinh.sc.nextLine();				
				h.setBoPhan(boPhan);
			}
		}
	}
	
	public List<NhanVien> getDs() {
		return ds;
	}

	public void setDs(List<NhanVien> ds) {
		this.ds = ds;
	}
	
}

