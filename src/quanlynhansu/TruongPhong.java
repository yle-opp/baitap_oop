package quanlynhansu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruongPhong extends NhanSu{
	//Thuộc tính này tăng lên khi có thêm 1 nhân viên thêm vào do trưởng phòng đó quản lý
	private int soluongNV;
	// list nhân viên
	List<NhanVienThuong> nhanVienThuong = new ArrayList<NhanVienThuong>();
	
	
	public TruongPhong() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getSoluongNV() {
		return soluongNV;
	}

	public void setSoluongNV(int soluongNV) {
		this.soluongNV = soluongNV;
	}
	
	public List<NhanVienThuong> getNhanVienThuong() {
		return nhanVienThuong;
	}

	public void setNhanVienThuong(List<NhanVienThuong> nhanVienThuong) {
		this.nhanVienThuong = nhanVienThuong;
	}

	@Override
    public String toString() {
        return super.toString() + "\n số lượng nhân viên: " + this.soluongNV;
         
    }
	
	@Override
	public double tinhLuong() {
		double tongLuongThang = (this .getNgayLamViec()  * this.getLuong()) + 100*this.soluongNV;
        return tongLuongThang;
    }

	@Override
	public void Nhap() {
		// TODO Auto-generated method stub
		super.Nhap();
		this.setLuong(200);
		//scanner = new Scanner(System.in);
		System.out.print("Số nhân viên thường được trưởng phòng quản lý: ");
		//this.soluongNV = scanner.nextInt();
		this.soluongNV = 0 ;
				
	}

}
