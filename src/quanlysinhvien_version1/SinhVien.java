package quanlysinhvien_version1;

public class SinhVien {
	 
	//khai báo thuộc tính
	 private String hoTen;
	 private String maSinhVien;
	 private double diemToan;
	 private double diemLy;
	 private double diemHoa;
	  
	  
	  public double tinhTrungBinh(SinhVien sv) {
		  double diemTrungBinh = (diemToan +diemHoa +diemLy)/3;
		  return diemTrungBinh;
	  }
	  public String xepLoaiSV(SinhVien sv) {
			String chuoiKetQua;
			if(tinhTrungBinh(sv) < 5) {
				chuoiKetQua="Yếu ";
			}else if(tinhTrungBinh(sv)>=5 && tinhTrungBinh(sv) <= 6) {
				chuoiKetQua="Trung bình ";
			}else if (tinhTrungBinh(sv)>=7 && tinhTrungBinh(sv) <= 8) {
				chuoiKetQua="Khá ";
			}else if(tinhTrungBinh(sv)>=9 && tinhTrungBinh(sv) <= 10) {
				chuoiKetQua="Giỏi";
			}else {
				chuoiKetQua="Không thể xếp loại";
			}
			return chuoiKetQua;
	  }
	  public void  inSV(SinhVien sv) {
	        System.out.printf("%6s %10s %20.2f %10s\n", maSinhVien,hoTen, tinhTrungBinh(sv) , xepLoaiSV(sv)); 
	    }
	
	 
	public SinhVien() {
		
	}
	public SinhVien(String hoTen, String maSinhVien, double diemToan, double diemLy, double diemHoa) {
		
		this.hoTen = hoTen;
		this.maSinhVien = maSinhVien;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public double getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}
	public double getDiemLy() {
		return diemLy;
	}
	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}
	public double getDiemHoa() {
		return diemHoa;
	}
	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}
	  
	  
	  
}
