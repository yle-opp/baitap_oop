/**
 * 
 */
package quanlynhansu;

import java.util.ArrayList;
import java.util.Scanner;

/**
// * @author Lâm Yên học viên cysbersoft
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QLNhanSu ql   = new QLNhanSu();
		//Tạo menu 
		Scanner sc = new Scanner(System.in);
		int  luaChon;
		menu();
		do {
			System.out.println("Nhập vào lựa chọn (Số từ 0 -> 11): ");
			luaChon = sc.nextInt();
			if (luaChon < 0 || luaChon > 10) {
				System.out.println("Bạn phải nhập vào các số từ 0 -> 11!");
			}
			else {
				xuLyLuaChon(luaChon,ql);
			}
		}while(true);
	}
	public static void menu() {
		System.out.println("----------------Menu------------");
		System.out.println("1.Nhập thông tin công ty.");
		System.out.println("2.Phân bổ nhân viên vào trưởng phòng");
		System.out.println("3.Thêm, xóa nhân sự");
		System.out.println("4.Xuất ra toàn bộ thông tin người trong công ty");
		System.out.println("5.Tính và xuất tổng lương cho toàn công ty");
		System.out.println("6.Tìm nhân viên thường có lương cao nhất");
		System.out.println("7.Tìm trưởng phòng có số lượng nhân viên dưới quyền cao nhất");
		System.out.println("8.Sắp xếp nhân viên toàn công ty theo thứ tự abc");
		System.out.println("9.Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần");
		System.out.println("10.Tìm Giám Đốc có số lượng cổ phần nhiều nhất ");
		System.out.println("11.Tính và Xuất tổng THU NHẬP của từng Giám Đốc");
		System.out.println("0.Thoát chương trình ");
		
	}
	public static void xuLyLuaChon(int chon,QLNhanSu ql) {	
		switch (chon) {
		case 1:
		ql.NhapThongTinCT();
			break;
		case 2:
			ql.phanBoNhanVienVaoTruongPhong(ql.getNhansu());
			break;
		case 3:
			ql.themXoaThongTinNhanSu(ql.getNhansu());
			break;
		case 4:
			ql.xuatThongTinCT(ql.getNhansu());
			break;
		case 5:
			double tongLuongct = ql.tinhVaXuatLuongCT(ql.getNhansu());
			System.out.println("\n ==========Tổng lương cho toàn công ty ===========\n");
			System.out.println(tongLuongct);
			break;

		case 6:
			ql.timNhanVienThuong(ql.getNhansu());
			break;
		case 7:
			ql.truongPhongCoNhanVienNhieuNhat(ql.getNhansu());
			break;
		case 8:
			ql.sapXepNSHoTen(ql.getNhansu());
			break;
		case 9:
			ql.sapXepNSLuong(ql.getNhansu());
			break;
		case 10:
			ql.timGiamDoc(ql.getNhansu());
			break;
		case 11:
			ql.tongThuNhapGD(ql.getNhansu());
			break;
			
		default:
			System.exit(0);
		}
		
	}
	

}
