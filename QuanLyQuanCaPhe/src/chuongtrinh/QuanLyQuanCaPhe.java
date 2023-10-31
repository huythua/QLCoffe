package chuongtrinh;
import java.text.ParseException;

import chucnang.DoanhThu;
import chucnang.QuanLyBan;
import chucnang.QuanLyNhanVien;
import chucnang.QuanLySanPham;
import thanhphan.BoPhan;
import thanhphan.CauHinh;
import thanhphan.DanhSachBoPhan;
import thanhphan.DatBan;
import thanhphan.DatMon;
import thanhphan.HoaDon;
import thanhphan.NhanVien;
import thanhphan.SanPham;
import thanhphan.ThongTinBan;
import thanhphan.ThucAn;
import thanhphan.ThucUong;




public class QuanLyQuanCaPhe {
       	public static void main(String [] args) throws ParseException {
       	BoPhan bp1= new BoPhan("Pha che");
   		BoPhan bp2= new BoPhan("Phuc vu");
   		BoPhan bp3= new BoPhan("Tiep tan");
   		BoPhan bp4= new BoPhan("Thu ngan");
   		
   		DanhSachBoPhan dsBoPhan= new DanhSachBoPhan();
  		dsBoPhan.themBoPhan(bp1);
   		dsBoPhan.themBoPhan(bp2);
   		dsBoPhan.themBoPhan(bp3);
   		dsBoPhan.themBoPhan(bp4);
   		
       	NhanVien h1= new NhanVien("Tran Huy Thừa","Nam","Tay Ninh","12/12/2003","12/11/2022","Pha che");
		NhanVien h2= new NhanVien("Nguyen Thai Binh","Nam","Phu Yen","12/11/2003","12/11/2022","Phuc vu");
		NhanVien h3= new NhanVien("Dang Xuan Phat","Nam","Kien Giang","12/03/2003","12/11/2022","Tiep tan");
		NhanVien h4= new NhanVien("Nguyen Thi Yen Nhi","Nu","Tay Ninh","12/02/2003","12/11/2022","Thu ngan");
		NhanVien h5 =new NhanVien("Nguyễn Thị Thái Y","Nu","Vung Tau","12/04/2003","16/02/2021","Phuc vu");
		NhanVien h6 =new NhanVien("Nguyễn Văn Trỗi","Nam","Sai Gon","02/07/2002","16/09/2021","Phuc vu");
		NhanVien h7 =new NhanVien("Nguyễn Thị Thúy Hòa","Nu","Ha Noi","13/01/2003","16/02/2021","Phuc vu");
		NhanVien h8 =new NhanVien("Phan Thị Thùy Trang","Nu","Da Lat","02/06/2003","16/06/2021","Pha che");
		NhanVien h9 =new NhanVien("Trần Thị Mỹ Linh","Nu","Binh Dinh","10/09/2002","12/02/2021","Phuc vu");
				
		QuanLyNhanVien ql= new QuanLyNhanVien();
		ql.themNhanVien(h1);
		ql.themNhanVien(h2);
		ql.themNhanVien(h3);
		ql.themNhanVien(h4);
		ql.themNhanVien(h5);
		ql.themNhanVien(h6);
		ql.themNhanVien(h7);
		ql.themNhanVien(h8);
		ql.themNhanVien(h9);
			
				
				
		QuanLyBan qlBan= new QuanLyBan();
       	ThongTinBan b1= new ThongTinBan(4,true);
       	ThongTinBan b2= new ThongTinBan(8,true);
       	ThongTinBan b3= new ThongTinBan(12,true);
       	ThongTinBan b4= new ThongTinBan(6,true);
       	ThongTinBan b5= new ThongTinBan(10,true);
       	ThongTinBan b6= new ThongTinBan(9,true);
       	ThongTinBan b7= new ThongTinBan(7,true);
       	ThongTinBan b8= new ThongTinBan(10,true);
       	ThongTinBan b9= new ThongTinBan(8,true);
       	qlBan.themBan(b1);
       	qlBan.themBan(b2);
       	qlBan.themBan(b3);
       	qlBan.themBan(b4);
       	qlBan.themBan(b5);
       	qlBan.themBan(b6);		
       	qlBan.themBan(b7);
       	qlBan.themBan(b8);
       	qlBan.themBan(b9);
       		
				
       	SanPham a1= new ThucAn("Gà rán",100000,true,"trưa",false);
		SanPham a2= new ThucAn("Khoai tây chiên",20000,true,"cả ngày",false);
		SanPham a3= new ThucAn("Bánh hỏi cháo lòng",25000,true,"cả ngày",false);
		SanPham a4= new ThucAn("Bún đậu mắm tôm",150000,true,"cả ngày",false);
		SanPham a5= new ThucAn("Bánh mỳ chả lụa",25000,true,"cả ngày",false);
		SanPham a6= new ThucAn("Xôi gà",30000,true,"cả ngày",false);
		SanPham a7= new ThucAn("Sanwich",50000,true,"cả ngày",false);
		SanPham a8= new ThucUong("Trà dâu",50000,true,"cả ngày",true);
		SanPham a9= new ThucUong("Trà chanh",25000,true,"cả ngày",true);
		SanPham a10= new ThucUong("Sinh tố",30000,true,"cả ngày",true);
		SanPham a11= new ThucUong("Pessi",15000,true,"trưa và chiều",true);
		SanPham a12= new ThucUong("Coca Cola",15000,true,"cả ngày",true);
		SanPham a13= new ThucUong("Trà Sữa",35000,true,"Sáng và tối",true);
		QuanLySanPham qlSP= new QuanLySanPham();
		qlSP.themSanPham(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13);
			
			
		DatMon dm1 = new DatMon("Gà rán",10);
   		DatBan db1 = new DatBan("B001",dm1);
   		HoaDon hd1 = new HoaDon("01/11/2022",db1,qlSP);
   		DatMon dm2 = new DatMon("Gà rán",12);
   		DatBan db2 = new DatBan("B002",dm2);
   		HoaDon hd2 = new HoaDon("02/12/2022",db2,qlSP);
   		DatMon dm3 = new DatMon("Gà rán",5);
 		DatBan db3 = new DatBan("B003",dm3);
   		HoaDon hd3 = new HoaDon("05/12/2022",db3,qlSP);
   		DatMon dm4 = new DatMon("Gà rán",9);
   		DatBan db4 = new DatBan("B004",dm4);
   		HoaDon hd4 = new HoaDon("7/12/2022",db4,qlSP);
   			
   		DoanhThu dt= new DoanhThu();
   		dt.themHoaDon(hd1,hd2,hd3,hd4);
				
				
		int choose= 10;
       		do {
       			System.out.println("1.-------QUẢN LÝ NHÂN VIÊN--------");
       			System.out.println("2.-------QUẢN LÝ THÔNG TIN BÀN---------");
       			System.out.println("3.-------QUẢN LÝ THỨC ĂN HOẶC THỨC UỐNG---------");
       			System.out.println("4.-------XÁC ĐỊNH DANH SÁCH NHÂN VIÊN SINH TRONG THÁNG---------");
       			System.out.println("5.-------ĐẶT BÀN---------");
       			System.out.println("6.-------THỐNG KÊ DANH THU---------");
       			System.out.println("0.-------THOÁT---------");
       			System.out.println("--------MỜI BẠN CHỌN--------");
       			choose=CauHinh.sc.nextInt();
       			CauHinh.sc.nextLine();
       			switch(choose) {
       			case 1:
       			{
       				int i;
       					System.out.println("1.-----XEM DANH SÁCH NHÂN VIÊN-------");
       					System.out.println("2.-----TRA CỨU NHÂN VIÊN-------");
       					System.out.println("3.-----THÊM-CẬP NHẬT-XÓA NHÂN VIÊN-------");
       					System.out.println("0.-----QUAY LẠI QUẢN LÝ-------");
       					System.out.println("--------MỜI BẠN CHỌN--------");
       					i=CauHinh.sc.nextInt();
       					CauHinh.sc.nextLine();       				
       				switch(i)
       				{
       				case 1: 
       				{       						
       						ql.xuatDsNV();
       						break;
       				}
       				case 2:
       				{
       					int t;       	
       						System.out.println("1.THEO HỌ TÊN ");
           					System.out.println("2.THEO GIỚI TÍNH ");
           					System.out.println("3.THEO QUÊ QUÁN ");
           					System.out.println("0.QUAY LẠI QUẢN LÝ NHÂN VIÊN");
           					System.out.println("MỜI BẠN CHỌN ");
           					 t=CauHinh.sc.nextInt();
           					CauHinh.sc.nextLine();    					      					
       					if(t == 1)
       					{
       						System.out.println("nhập tên bạn muốn tra cứu: ");
       						String ten=CauHinh.sc.nextLine();
       						ql.traCuuTen(ten).forEach(h->h.xuatNv());
       					}
       					else if(t==2)
       					{
       						System.out.println("nhập giới tính bạn muốn tra cứu: ");
       						String gioitinh= CauHinh.sc.nextLine();
       						ql.traCuuGioiTinh(gioitinh).forEach(h->h.xuatNv());
       					}
       					else if(t==3)
       					{
       						System.out.println("nhập quê quán bạn muốn tra cứu: ");
       						String quequan=CauHinh.sc.nextLine();
       						ql.traCuuQueQuan(quequan).forEach(h->h.xuatNv());       						
       					}
       					break;
       				}
       				case 3:
       				{
       					System.out.println("1.THÊM");
       					System.out.println("2.CẬP NHẬT");
       					System.out.println("3.XÓA");
       					System.out.println("MỜI BẠN CHỌN ");
       					int r = CauHinh.sc.nextInt();
       					CauHinh.sc.nextLine();
       					if(r == 1)
       					{
       						NhanVien h= new NhanVien();
       						h.themNv();
       						ql.themNhanVien(h);
       						System.out.println("-----ĐÃ THÊM THÀNH CÔNG----- ");
       					}
       					else if(r==2)
       					{
       						System.out.println("-----Cập nhật lại----- ");
       						ql.capNhatNV();
       						System.out.println("-----Cập nhật thành công----- ");      						      						
       					}
       					else if(r==3)
       					{       						
       						ql.xoaNV();
       						System.out.println("------ĐÃ XÓA THÀNH CÔNG-----");
       						
       					}
       					break;
       				}
       				}
       				break;
       			}
       			case 2:
       			{
       				int d=0;
       				do {
       					System.out.println("1.-----XEM DANH SÁCH BÀN TRỐNG-------");
       					System.out.println("2.-----THÊM-CẬP NHẬT-XÓA THÔNG TIN BÀN-------");
       					System.out.println("3.-----TÌM KIẾM BÀN THEO SỨC CHỨA-------");
       					System.out.println("0.-----QUAY LẠI QUẢN LÝ-------");
       					System.out.println("--------MỜI BẠN CHỌN--------");
       					d=CauHinh.sc.nextInt();
       					CauHinh.sc.nextLine();  
       					switch(d)
           				{
           				case 1:
           				{
           					qlBan.xuatDanhSachBan();
           					break;
           				}
           				case 2:
           				{
           					System.out.println("1.THÊM");
           					System.out.println("2.CẬP NHẬT");
           					System.out.println("3.XÓA");
           					System.out.println("MỜI BẠN CHỌN ");
           					int z = CauHinh.sc.nextInt();
           					CauHinh.sc.nextLine();
           					if(z == 1)
           					{
           						ThongTinBan h= new ThongTinBan();
           						h.themThongTinBan();
           						qlBan.themBan(h);
           						System.out.println("-----ĐÃ THÊM THÀNH CÔNG----- ");           						
           					}
           					else if(z==2)
           					{
           						System.out.println("-----Cập nhật lại----- ");
           						qlBan.capNhatThongTinBan();
           						System.out.println("-----Cập nhật thành công----- ");           						                    						
           					}
           					else if(z==3)
           					{
           						qlBan.xoaThongTinBan();
           						System.out.println("------ĐÃ XÓA THÀNH CÔNG-----");           						
           					}
           					break;
           					}
          				
           					case 3:
           					{
           						qlBan.timTheoSucChua().forEach(h->h.xuatThongTinBan());        						           						
           						break;
           					}
           				}
       				}while(d==1 || d==2 || d==3);
       				break;	
       				}
       				
       			
       			case 3:
       			{
       				int g=0;
       				do {
       					System.out.println("1.-----THÊM-XÓA SẢN PHẨM-------");
       					System.out.println("2.-----TÌM KIẾM SẢN PHẨM-------");
       					System.out.println("3.-----SẮP XẾP DANH SÁCH SẢN PHẨM-------");
       					System.out.println("--------MỜI BẠN CHỌN--------");
       					g=CauHinh.sc.nextInt();
       					CauHinh.sc.nextLine();
       				}while(g==0);
       				switch(g)
       				{
       				case 1:
       				{
       					System.out.println("1.-----THÊM-------");
       					System.out.println("2.-----XOÁ-------");
       					System.out.println("--------MỜI BẠN CHỌN--------");
       					int v=CauHinh.sc.nextInt();
       					CauHinh.sc.nextLine();
       					if(v == 1)
       					{
       						System.out.println("1.THÊM MÓN ĂN ");
       						System.out.println("1.THÊM THỨC UỐNG ");
       						int x=CauHinh.sc.nextInt();
       						CauHinh.sc.nextLine();
       						if(x==1)
       						{
       							SanPham h=new ThucAn();
       							h.themSanPham();
       							qlSP.themSanPham(h);
       							System.out.println("-----ĐÃ THÊM THÀNH CÔNG----- ");
       							
       						}
       						else if(x==2)
       						{
       							SanPham m = new ThucUong();
       							m.themSanPham();
       							qlSP.themSanPham(m);
       							System.out.println("-----ĐÃ THÊM THÀNH CÔNG----- ");
       						}
       						qlSP.xuatDsSanPham();
       						
       						
       					}
       					else if(v==2)
       					{
       						qlSP.xoaSanPham();
       						System.out.println("------ĐÃ XÓA THÀNH CÔNG-----");
       						qlSP.xuatDsSanPham();
       	
       						
       					}
       				}
       				break;
       				case 2:
       				{
       					System.out.println("1.THEO TÊN ");
       					System.out.println("2.THEO GIÁ ");
       					int i=CauHinh.sc.nextInt();
       					CauHinh.sc.nextLine();
       					if(i==1)
       					{
       						System.out.println("Nhập tên bạn muốn tìm: ");
       						String y=CauHinh.sc.nextLine();
           					qlSP.timSanPham(y).forEach(h->h.xuatThongTinSanPham());
       					}
       					else if(i==2)
       					{
       						System.out.print("Nhập khoảng giá bạn muốn tìm: từ giá:" );
       						double f=CauHinh.sc.nextDouble();
       						CauHinh.sc.nextLine();
       						System.out.print("--->");
       						
       						double w=CauHinh.sc.nextDouble();
       						CauHinh.sc.nextLine();
       						qlSP.timSanPham(f, w).forEach(h->h.xuatThongTinSanPham());
       						
       					}
       					break;
       				}
       				
       				case 3:
       				{
       					System.out.println("1.giảm dần ");
       					System.out.println("2.Tăng dần ");
       					int r = CauHinh.sc.nextInt();
       					CauHinh.sc.nextLine();
       					if(r==1)
       					{
       						qlSP.sapXep();
       						qlSP.xuatDsSanPham();
       					}
       					else if(r==2) {
       						qlSP.sapXep();
       						System.out.println("nhập giá bạn muốn: ");
           					double z=CauHinh.sc.nextDouble();
           					
           					qlSP.timSanPham(0, z).forEach(h->h.xuatThongTinSanPham());
       					}
       					
       					break;
       				}
       				
       				}
  
       				break;
       			}
       			case 4:
       			{
       				
       				ql.traCuuNgaySinhNhat().forEach(h->h.xuatNv());
       				break;
       				
       			}
       			case 5:
       			{
       				DatBan db=new DatBan();
       				db.themDatBan();
       				System.out.println("ĐÃ ĐẶT BÀN THÀNH CÔNG");
       				
       				System.out.print("Bạn có muốn xuất hóa đơn không( c/k : có hoặc không ");
       				String v =CauHinh.sc.nextLine();
       				HoaDon hd=new HoaDon();
       				hd.themHoaDon(db, qlSP);
       				dt.themHoaDon(hd);
       				if(v.equals("c")==true ||v.equals("C")==true )
       				{      					
       					hd.xuatHoaDon();     					
       				}
       				
       				break;
       			}
       			
       			case 6:
       			{
       				int j;
       				
       					System.out.println("1.THỐNG KÊ THEO THÁNG ");
           				System.out.println("2.THỐNG KÊ THEO KHOẢNG THỜI GIAN CHỈ ĐỊNH ");
           				System.out.println("3.QUAY LẠI CÁC CHỨC NĂNG");
           				j=CauHinh.sc.nextInt();
           				CauHinh.sc.nextLine();
           				if(j==1)
           				{
           					System.out.printf("Doanh thu tháng này là: %.2f Vnd\n", dt.thongKe());
           					
           				}
           				if(j==2)
           				{
           					System.out.println(" từ ngày: ");
           					String tn=CauHinh.sc.nextLine();
           					System.out.println(" đến ngày: ");
           					String dn=CauHinh.sc.nextLine();
           					System.out.print("Doanh thu là: ");
           					System.out.println(dt.thongKe(tn, dn)); 
           				}
           				if(j==3)
           				{
           					
           				}
       				
       			
       				
       			
       				
       				
  
       				break;
       			}
       			
       			}
       			
       		}while(choose!=0);
       	}
//       		BoPhan bp1= new BoPhan("Pha che");
//       		BoPhan bp2= new BoPhan("Phuc vu");
//       		BoPhan bp3= new BoPhan("Tiep tan");
//       		BoPhan bp4= new BoPhan("Thu ngan");
//       		DanhSachBoPhan dsBoPhan= new DanhSachBoPhan();
//       		dsBoPhan.themBoPhan(bp1);
//       		dsBoPhan.themBoPhan(bp2);
//       		dsBoPhan.themBoPhan(bp3);
//       		dsBoPhan.themBoPhan(bp4);
//       		
//       		NhanVien h1= new NhanVien("Tran Huy Thừa","Nam","Tay Ninh","12/12/2003","12/11/2022","Pha che");
//       		NhanVien h2= new NhanVien("Nguyen Thai Binh","Nam","Phu Yen","12/11/2003","12/11/2022","Phuc vu");
//       		NhanVien h3= new NhanVien("Dang Xuan Phat","Nam","Kien Giang","12/03/2003","12/11/2022","Tiep tan");
//       		NhanVien h4= new NhanVien("Nguyen Thi Yen Nhi","Nu","Tay Ninh","12/02/2003","12/11/2022","Thu ngan");
//       		
//       		QuanLyNhanVien ql = new QuanLyNhanVien();
//       		ql.themNhanVien(h1);
//      		ql.themNhanVien(h2);
//      		ql.themNhanVien(h3);
//      		ql.themNhanVien(h4);
////      		ql.xuatDsNV();
////      		System.out.printlnln("======================+++++++++++++++++++++++=====================");
////      		ql.traCuuNgaySinh().forEach(h ->h.xuatNv());
////      		System.out.printlnln("======================+++++++++++++++++++++++=====================");
////      		ql.traCuuTen("Phat").forEach(h ->h.xuatNv());
////      		ql.traCuuGioiTinh("Nu").forEach(h ->h.xuatNv());
////      		ql.traCuuQueQuan("Phu Yen").forEach(h ->h.xuatNv());
////      		ql.traCuuNgaySinh("12/02/2003").forEach(h ->h.xuatNv());
////      		ql.xoaNV();
////      		ql.xuatDsNV();
////      		ql.capNhatNV();
////      		ql.xuatDsNV();
//       		QuanLyBan qlBan= new QuanLyBan();
//       		ThongTinBan b1= new ThongTinBan(4,true);
//       		ThongTinBan b2= new ThongTinBan(8,true);
//       		ThongTinBan b3= new ThongTinBan(12,true);
//       		qlBan.themBan(b1);
//       		qlBan.themBan(b2);
//       		qlBan.themBan(b3);
//       		ThongTinBan b4= new ThongTinBan(8,true);
//       		ThongTinBan b5= new ThongTinBan(8,true);
//       		ThongTinBan b6= new ThongTinBan(8,true);
//       		qlBan.themBan(b4);
//       		qlBan.themBan(b5);
//       		qlBan.themBan(b6);
//       		qlBan.xuatDanhSachBan();
////       		qlBan.xoaThongTinBan();
////       		qlBan.xuatDanhSachBan();
////       		qlBan.timTheoSucChua().forEach(h ->h.xuatThongTinBan());;
////       		
//       			SanPham a1= new ThucAn("Gà rán",100000,true,"trưa",false);
//       			SanPham a2= new ThucAn("Khoai tây chiên",10000,true,"cả ngày",false);
//       			SanPham a3= new ThucUong("Trà dâu",50000,true,"cả ngày",true);
//       			SanPham a4= new ThucUong("Trà chanh",25000,true,"cả ngày",true);
//       			QuanLySanPham qlSP= new QuanLySanPham();
//       			qlSP.themSanPham(a1,a2,a3,a4);
//       			
//       			qlSP.sapXep();
//       			qlSP.timSanPham(0,110000).forEach(h ->h.xuatThongTinSanPham());
////       			DatBanAn ban1= new DatBanAn();
////       			ban1.dat();
//       			
//       			 
//       			
//}	
}
