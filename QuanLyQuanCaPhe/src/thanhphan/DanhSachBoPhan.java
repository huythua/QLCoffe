package thanhphan;

import java.util.ArrayList;
import java.util.List;

public class DanhSachBoPhan {
	private static List<BoPhan> ds= new ArrayList<>();
	public void themBoPhan(BoPhan x) {
		DanhSachBoPhan.ds.add(x);
	}
	
	public static BoPhan timBoPhan(BoPhan h) {
		
		for(BoPhan x : ds) {
			if(x.getTenBoPhan().contains(h.getTenBoPhan())==true)
				return x;
		}
		return null;		
	}

	public List<BoPhan> getDs() {
		return ds;
	}

	public void setDs(List<BoPhan> ds) {
		DanhSachBoPhan.ds = ds;
	}
}

