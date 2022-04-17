/**
 * 
 */
package quanlysinhvien_version1;

import java.util.Scanner;

/**
 * @author T470S
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //khởi tạo và nhập giá trị cho các thuộc tính thuôc lớp SinhVien
        //Tạo 2 sinh viên,
 
        //-------------------sinh viên 1-------------------
 
        SinhVien sv1 = new SinhVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên 1: ");
        sv1.setMaSinhVien(sc.nextLine());
        System.out.println("Nhập tên sinh viên 1: ");
        sv1.setHoTen(sc.nextLine());
        System.out.println("Nhập điểm môn toán: ");
        sv1.setDiemToan(sc.nextDouble());
        System.out.println("Nhập điểm môn hóa: ");
        sv1.setDiemHoa(sc.nextDouble());
        System.out.println("Nhập điểm môn lý: ");
        sv1.setDiemLy(sc.nextDouble());
 
        //-------------------sinh viên 2----------------------
 
        SinhVien sv2 = new SinhVien();
        sc.nextLine();
        System.out.println("Nhập mã sinh viên 2: ");
        sv2.setMaSinhVien(sc.nextLine());
        System.out.println("Nhập tên sinh viên 2: ");
        sv2.setHoTen(sc.nextLine());
        System.out.println("Nhập điểm môn toán: ");
        sv2.setDiemToan(sc.nextDouble());
        System.out.println("Nhập điểm môn hóa: ");
        sv2.setDiemHoa(sc.nextDouble());
        System.out.println("Nhập điểm môn lý: ");
        sv2.setDiemLy(sc.nextDouble());
 

        //gọi phương thức in đã được viết ở class SinhVien cho các sinh viên để hiển thị kết quả đã nhập
        System.out.printf("%6s %10s %20s %10s  \n","Mã sinh viên","Họ tên","Điểm trung bình","Xếp Loại ");
        sv1.inSV(sv1);
        sv2.inSV(sv2);
 
	}

}
