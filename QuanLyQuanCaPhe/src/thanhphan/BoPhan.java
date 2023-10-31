package thanhphan;

public class BoPhan {
	public static int dem;
	private int maBoPhan;
	private String tenBoPhan;
	
	{
		maBoPhan=++dem;
		
	}
	public BoPhan() {
			
	}
	public void themBoPhan() {
		System.out.print("Nhap ten bo phan: ");
		this.tenBoPhan=CauHinh.sc.nextLine();	
	}
	public BoPhan(String tenBoPhan) {
		this.tenBoPhan=tenBoPhan;
	}
	
	public int getMaBoPhan() {
		return maBoPhan;
	}
	public void setMaBoPhan(int maBoPhan) {
		this.maBoPhan = maBoPhan;
	}
	public String getTenBoPhan() {
		return tenBoPhan;
	}
	public void setTenBoPhan(String tenBoPhan) {
		this.tenBoPhan = tenBoPhan;
	}
	
	

}
