package chucnang;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import thanhphan.CauHinh;
import thanhphan.HoaDon;

public class DoanhThu {
 private List<HoaDon> ds = new ArrayList<>();

 public void themHoaDon(HoaDon h) {
	 this.ds.add(h);
 }
 public void themHoaDon(HoaDon... h) {
	 this.ds.addAll(Arrays.asList(h));
 }
 public double thongKe() {
	double tien =0;
	Date date= new Date();
	String x= CauHinh.j.format(date);
	for (HoaDon hd: this.ds) {
		if(hd.getNgay().equals(x)==true) {
			tien += hd.getThanhToan();
		}
	}
	return tien;
	 
 }
 public double thongKe(String tuNgay, String denNgay) throws ParseException {
	 	Date date1 =CauHinh.f.parse(tuNgay);
	 	Date date2= CauHinh.f.parse(denNgay);	 	
		double tien =0;		
		for (HoaDon hd: this.ds) {
			if(hd.getNgayDat().compareTo(date1)>=0 && hd.getNgayDat().compareTo(date2)<=0) {
				tien += hd.getThanhToan();
			}
		}
		return tien;
		 
	 }
 
public List<HoaDon> getDs() {
	return ds;
}

public void setDs(List<HoaDon> ds) {
	this.ds = ds;
}
 
}

