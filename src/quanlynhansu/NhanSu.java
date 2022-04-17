package quanlynhansu;

import java.util.Scanner;

public class NhanSu { // implements ActionNhanVien

	Scanner scanner = new Scanner(System.in);

	private String maSo;
	private String hoTen;
	private String sdt;
	private int ngayLamViec;
	private double luong;
	private double luongThang = 0;

	public NhanSu() {

	}



	public NhanSu(Scanner scanner, String maSo, String hoTen, String sdt, int ngayLamViec, double luong,
			double luongThang) {
		super();
		this.scanner = scanner;
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.sdt = sdt;
		this.ngayLamViec = ngayLamViec;
		this.luong = luong;
		this.luongThang = luongThang;
	}



	public double getLuongThang() {
		return this.luongThang = tinhLuong();
	}



	public void setLuongThang(double luongThang) {
		this.luongThang = 0;
	}



	public void xuatThongTinCongTy() {
		System.out.println();
	}

	
	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public int getNgayLamViec() {
		return ngayLamViec;
	}

	public void setNgayLamViec(int ngayLamViec) {
		this.ngayLamViec = ngayLamViec;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}
	
	public void Nhap() {
		System.out.print("Nhập mã nhân viên: ");
		maSo = scanner.nextLine();
		System.out.print("Nhập họ tên nhân viên: ");
		hoTen = scanner.nextLine();
		System.out.print("Nhập số điện thoại: ");
		sdt = scanner.nextLine();
		System.out.print("Nhập số ngày làm việc: ");
		ngayLamViec = scanner.nextInt();
		luong = 0;
		System.out.print("Tiền lương trong 1 ngày là: " +luong);
		
	}
	
	@Override
    public String toString() {
		this.luongThang = this.tinhLuong();
        return "Mã nhân viên: " + this.maSo + ":\nhọ tên nhân viên: " + this.hoTen + 
            "\n số điện thoại: " + this.sdt + "\n số ngày làm việc: " + this.ngayLamViec + 
             "\n lương trong 1 ngày: " + this.luong + "\n Lương 1 tháng: " + this.luongThang  ;
	}
	
	public double tinhLuong() {
        return  0;
    }
}
