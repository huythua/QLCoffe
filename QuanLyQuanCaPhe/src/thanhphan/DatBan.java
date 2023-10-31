package thanhphan;

import java.util.ArrayList;
import java.util.List;

public class DatBan {
	private String maBan;
	private List<DatMon> ds= new ArrayList<>();	
	public DatBan(String maBan, DatMon dm1) {
		this.maBan = maBan;
		this.ds.add(dm1);
	}
	public DatBan() {
		
	}
	
	public void xuatDatBan() {
		System.out.printf("Mã bàn: %s\n",this.maBan);
		for (DatMon h: this.ds) {
			h.xuatDatMon();
		}
	}
	public void themDatBan() {
		System.out.print("Nhập mã bàn: ");
		this.maBan=CauHinh.sc.nextLine();
		String s;
		do {
			DatMon x= new DatMon();
			x.themDatMon();
			this.ds.add(x);
			System.out.print("Bạn có muốn tiếp tục(c/k): ");
			s=CauHinh.sc.nextLine();
		} while (s.equals("c")==true);
}
	public String getMaBan() {
		return maBan;
	}
	public void setMaBan(String maBan) {
		this.maBan = maBan;
	}
	public List<DatMon> getDs() {
		return ds;
	}
	public void setDs(List<DatMon> ds) {
		this.ds = ds;
	}
	
}
