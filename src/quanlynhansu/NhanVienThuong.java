package quanlynhansu;

public class NhanVienThuong extends TruongPhong{
	
		private String maTruongPhong;
		
		TruongPhong tp = new TruongPhong();
		

		public String getMaTruongPhong() {
			return maTruongPhong;
		}

		public void setMaTruongPhong(String maTruongPhong) {
			this.maTruongPhong = maTruongPhong;
		}
		@Override
	    public String toString() {
	        return super.toString() + "\n Tên trưởng phòng quản lý : " + this.maTruongPhong ;
	         
	    }
		
		@Override
		public double tinhLuong() {
			double tongLuongThang = this .getNgayLamViec() * this.getLuong();
	        return tongLuongThang;
	    }

		@Override
		public void Nhap() {
			// TODO Auto-generated method stub
			super.Nhap();
			this.setLuong(100);
	        System.out.print("Nhập mã trưởng phòng quản lý: ");
	        this.maTruongPhong = scanner.nextLine();
	        // kiểm tra mã trưởng phòng có tồn tại chưa 
	        TruongPhong tp = new TruongPhong();
	        if(this.maTruongPhong == tp.getMaSo()) {
	        	tp.setSoluongNV(getSoluongNV()+ 1);
	        }
		}
		
//		public void insertNVT() {
//			// TODO Auto-generated method stub
//			NhanSu ns = new NhanSu();
//			ns.Nhap();
//			this.setMaSo(ns.getMaSo());
//			this.setHoTen(ns.getHoTen());
//			this.setSdt(ns.getSdt());
//			this.setNgayLamViec(ns.getNgayLamViec());
//			this.setLuong(getLuong());
//	        System.out.print("Nhập mã trưởng phòng quản lý: ");
//	       // this.maTruongPhong =  tp.getMaSo(); //scanner.nextLine();
//	        this.maTruongPhong = scanner.nextLine();
//	        
//	       
//	      
//		}
		/*
		 * System.out.println("Nhập thông tin cho nhân viên thường"); NhanVienThuong[]
		 * nhanvt = new NhanVienThuong[soNhanVien]; for (int i = 0; i < soNhanVien; i++)
		 * { System.out.println("Nhập thông tin nhân viên thường thứ  " + (i + 1) +
		 * ":"); nhanvt[i] = new NhanVienThuong(); //nhanvt[i].Nhap();
		 * nhanvt[i].insertNVT(); }
		 */
}
