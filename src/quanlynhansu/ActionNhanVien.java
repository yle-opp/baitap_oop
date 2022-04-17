package quanlynhansu;

import java.util.ArrayList;

public interface ActionNhanVien {
	
	void tinhLuong();
	void NhapThongTinCT();
	void xuatThongTinCT(ArrayList<NhanSu> nhansu);
	void phanBoNhanVienVaoTruongPhong(ArrayList<NhanSu> nhansu);
	void themXoaThongTinNhanSu(ArrayList<NhanSu> nhansu);
	double tinhVaXuatLuongCT(ArrayList<NhanSu> nhansu);
	void truongPhongCoNhanVienNhieuNhat(ArrayList<NhanSu> nhansu);
	void timNhanVienThuong(ArrayList<NhanSu> nhansu);
	void sapXepNSHoTen(ArrayList<NhanSu> nhansu);
	void sapXepNSLuong(ArrayList<NhanSu> nhansu);
	void timGiamDoc(ArrayList<NhanSu> nhansu);
	void tongThuNhapGD(ArrayList<NhanSu> nhansu);
}
