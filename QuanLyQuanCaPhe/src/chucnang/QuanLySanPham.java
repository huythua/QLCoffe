package chucnang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import thanhphan.CauHinh;
import thanhphan.SanPham;

public class QuanLySanPham {
	private  List<SanPham> ds = new ArrayList<>();
	
	
	public void themSanPham(SanPham h) {
		this.ds.add(h);
	}
	public void themSanPham(SanPham... h) {
		this.ds.addAll(Arrays.asList(h));
	}
	
	public void xuatDsSanPham() {
		for (SanPham h : this.ds) {
			h.xuatThongTinSanPham();
		}
	}
	public void xoaSanPham() {
		System.out.print("Nhập tên món ăn/thức uống cần xóa: ");
		String s=CauHinh.sc.nextLine();
		for( SanPham h: this.ds) {
			if(h.getTenSanPham().equals(s)==true) {
				this.ds.remove(h);
				break;
			}
		}
	}
	public List<SanPham> timSanPham(String ten){
		return this.ds.stream().filter(h ->h.getTenSanPham().contains(ten)).collect(Collectors.toList());		
	}
	public List<SanPham> timSanPham(double tuGia, double denGia){
		return this.ds.stream().filter(h ->h.getGiaBan() >= tuGia && h.getGiaBan() <= denGia).collect(Collectors.toList());
	}
	public void sapXep() {
		this.ds.sort((s1, s2) -> {
            double g1 = s1.getGiaBan();
            double g2 = s2.getGiaBan();

            return -(g1 > g2 ? 1 : (g1 < g2 ? -1 : 0));
        });		
	}
	public SanPham DatSanPhamMoi() {
		System.out.print("Nhập tên thức ăn/thức uống: ");			
		String s=CauHinh.sc.nextLine();
		for(SanPham h : this.ds) {
			if(s.equals(h.getTenSanPham())==true) {
				return h;
			}
		}
		return null;
	
		
	}
	public  List<SanPham> getDs() {
		return ds;
	}
	public void setDs(List<SanPham> ds) {
		this.ds = ds;
	}
	
}
