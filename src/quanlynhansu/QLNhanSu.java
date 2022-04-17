package quanlynhansu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class QLNhanSu implements ActionNhanVien {
	Scanner scanner = new Scanner(System.in);
	private ArrayList<TruongPhong> listTruongPhong ; 
	private ArrayList<NhanVienThuong> listNhanVienThuong;
	private ArrayList<GiamDoc> listGiamDoc;
	private ArrayList<NhanSu> nhansu ;
	private HashMap<TruongPhong, List<NhanVienThuong>> hashMapTPVSNVT ;
	private double luongThangNVT = 0;
	private double luongThangGiamDoc = 0;
	private double luongTruongPhong = 0;
	//Tạo một HashMap	
	
	
	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub

	}

	public ArrayList<TruongPhong> getListTruongPhong() {
		return listTruongPhong;
	}

	public void setListTruongPhong(ArrayList<TruongPhong> listTruongPhong) {
		this.listTruongPhong = listTruongPhong;
	}

	public ArrayList<NhanSu> getNhansu() {
		return nhansu;
	}

	public void setNhansu(ArrayList<NhanSu> nhansu) {
		this.nhansu = nhansu;
	}

	public void  QLNhanSu() {
		nhansu = new ArrayList<>();
	    listTruongPhong = new ArrayList<TruongPhong>();
	    listNhanVienThuong = new ArrayList<NhanVienThuong>();
	    hashMapTPVSNVT = new HashMap<>();
	    listGiamDoc = new ArrayList<GiamDoc>();
	}
	

	

	public ArrayList<NhanVienThuong> getListNhanVienThuong() {
		return listNhanVienThuong;
	}

	public void setListNhanVienThuong(ArrayList<NhanVienThuong> listNhanVienThuong) {
		this.listNhanVienThuong = listNhanVienThuong;
	}

	@Override
	public void NhapThongTinCT() {
		nhansu = new ArrayList<NhanSu>();
		System.out.print("Nhập số nhân viên trong công ty: ");
		int soNhanVien = scanner.nextInt();
		NhanSu[] nhanSu = new NhanSu[soNhanVien];
		System.out.println("Nhập thông tin cho nhân viên");
		for (int i = 0; i < soNhanVien; i++) {
			System.out.println("Nhập thông tin nhân viên thứ  " + (i + 1) + ":");
			System.out.print("Chọn loại nhân viên (1 - Giám đốc, 2 - Trưởng phòng, 3 -Nhân viên thường không có trưởng phòng quản lý ): ");
			int choose = scanner.nextInt();
			if (choose == 1) {
				nhanSu[i] = new GiamDoc();
			} else if (choose == 2) {
				nhanSu[i] = new TruongPhong();
			} 
			else if (choose == 3) {
				nhanSu[i] = new NhanVienThuong();
			}
			
			nhanSu[i].Nhap();
			this.nhansu.add(nhanSu[i]);
		}

	}
	public void phanBoDoiTuong(ArrayList<NhanSu> nhansu) {
		listTruongPhong = new ArrayList<TruongPhong>();
		listNhanVienThuong = new ArrayList<NhanVienThuong>();
		listGiamDoc = new ArrayList<GiamDoc>();
		
		for (NhanSu nhansus : nhansu) {
			if (nhansus instanceof TruongPhong == true) {	
				listTruongPhong.add((TruongPhong) nhansus);
			}else if(nhansus instanceof NhanVienThuong == true){
				listNhanVienThuong.add((NhanVienThuong) nhansus);
			}else if(nhansus instanceof GiamDoc == true) {
				listGiamDoc.add((GiamDoc) nhansus);
			}
		}
	}
	@Override
	public void phanBoNhanVienVaoTruongPhong(ArrayList<NhanSu> nhansu) {
		// TODO Auto-generated method stub
		// get danh sách trưởng phòng
		phanBoDoiTuong(nhansu);
		hashMapTPVSNVT = new HashMap<>();
		List<NhanVienThuong> listNhanVienThuong2 = new ArrayList<NhanVienThuong>();
		if( listTruongPhong !=null) {
			// get mã trưởng phòng quản lý 
			for(TruongPhong tps : listTruongPhong) {
				if( listTruongPhong !=null) {
				for(NhanVienThuong nvt : listNhanVienThuong2) {
					if(nvt.getMaTruongPhong() == tps.getMaSo()) {
						listNhanVienThuong2.add(nvt);
					}else {
						System.out.println("Nhân Viên thường " + nvt.getHoTen() +" không có trưởng phòng quản lý");
					}
					//System.out.println("-- Danh sách nhân viên thường được phân bổ vào trường phòng: ");
					hashMapTPVSNVT.put(tps,listNhanVienThuong2);
				}
				}else {
					System.out.println("Trưởng phòng " + tps.getHoTen() +" không có quản lý bất kì nhân viên thường ");
				}
				
			}
			System.out.println("-- Danh sách nhân viên thường được phân bổ vào trường phòng: ");
			
			System.out.println(hashMapTPVSNVT);
		}else {
			System.out.println("KHÔNG CÓ TRƯỞNG PHÒNG NÀO TỒN TẠI CẢ!!!");
		}
			
 }



	@Override
	public void xuatThongTinCT(ArrayList<NhanSu> nhansu) {
		// TODO Auto-generated method stub
		System.out.println("Thông tin của các nhân viên trong công ty: ");
        for (NhanSu ns : nhansu) {
            System.out.println(ns.toString());
        }
	}

	@Override
	public void themXoaThongTinNhanSu(ArrayList<NhanSu> nhansu) {
		
		System.out.print("Chọn loại hành động a - Thêm thông tin nhân sự,  b - Xóa thông tin Nhân Sự : ");
		String choose1 = scanner.nextLine();
		if (choose1 == "a") {
			// 1. thên thông tin nhân sự
			 System.out.print("Nhập số nhân viên bạn muốn thêm: ");
			 int soNhanVien = scanner.nextInt();
			 soNhanVien += nhansu.size() ;
			 NhanSu[] nhanSu = new NhanSu[soNhanVien];
			System.out.println("Nhập thông tin cho nhân viên bạn muốn thêm");
			 for (int i = nhansu.size(); i < soNhanVien; i++) {
			 System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
			System.out.print(
					"Chọn loại nhân viên (1 - Giám đốc, 2 - Truỏng phòng, 3 -Nhân viên thường không có trưởng phòng quản lý ): ");
			int choose = scanner.nextInt();
			if (choose == 1) {
				 nhanSu[i] = new GiamDoc();
				//nhanSu = new GiamDoc();
			} else if (choose == 2) {
				 nhanSu[i] = new TruongPhong();
				//nhanSu = new TruongPhong();
			} else if (choose == 3) {
				 nhanSu[i] = new NhanVienThuong();
				//nhanSu = new NhanVienThuong();
			}
			nhanSu[i].Nhap();
			nhansu.add(nhanSu[i]);
		}
			System.out.println("==== Danh sách nhân sự sau khi thêm vào =====");
			xuatThongTinCT(nhansu);

		} else if (choose1 == "b") {
			// Xóa thông tin nhân sự
			System.out.print("Nhập mã số nhân viên mà bạn muốn xóa: ");
			String maSoNVX = scanner.nextLine();
			// b2 Kiểm tra nó có tồn tại hay không
			for (NhanSu ns : nhansu) {
				if (maSoNVX == ns.getMaSo()) {
					if (ns instanceof TruongPhong == true) {
						TruongPhong tp = (TruongPhong) ns;
						// xóa tất cả các nhân viên thường thuộc quản lý của trưởng phòng
						System.out.println("xóa thành công tất cả các nhân viên thường thuộc quản lý của trưởng phòng");
						hashMapTPVSNVT.remove(tp);
						// xóa trưởng phòng khỏi list nhân sự
						System.out.println("xóa thành công trưởng phòng khỏi danh sách nhân sự");
						nhansu.remove((TruongPhong) ns);

					} else if (ns instanceof NhanVienThuong == true) {
						// kiểm tra nhân viên thường có mã trưởng phòng ko
						NhanVienThuong nvt = (NhanVienThuong) ns;
						if (nvt.getMaTruongPhong() == null) {
							System.out.println("xóa thành công nhân viên thường khỏi danh sách nhân sự");
							nhansu.remove(nvt);
						} else {
							// duyệt danh sách trưởng phòng
							for(TruongPhong tp : listTruongPhong) {
								if(nvt.getMaTruongPhong() == tp.getMaSo()) {
									int temp = tp.getSoluongNV() -1;
									tp.setSoluongNV(temp);
								}else {
									break;
								}
							}
							
						}
					} else if (ns instanceof GiamDoc) {
						nhansu.remove((GiamDoc) ns);
					}
				}
			}
			System.out.println("==== Danh sách nhân sự sau khi xóa =====");
			xuatThongTinCT(nhansu);
		}
		
	}
	//Tính và xuất tổng lương cho toàn công ty

	@Override
	public double tinhVaXuatLuongCT(ArrayList<NhanSu> nhansu) {
		// TODO Auto-generated method stub
		double tongLuongCT = 0;
		 for(int i = 0; i < nhansu.size(); i++) {
			 if (nhansu.get(i) instanceof TruongPhong == true) {	
					TruongPhong tp =  (TruongPhong)nhansu.get(i);
					luongTruongPhong += tp.tinhLuong();
				}else if(nhansu.get(i) instanceof NhanVienThuong == true){
					NhanVienThuong nvt =  (NhanVienThuong)nhansu.get(i);
					luongThangNVT  += nvt.tinhLuong();
				}else if(nhansu.get(i) instanceof GiamDoc == true) {
					GiamDoc gd = (GiamDoc) nhansu.get(i);
					luongThangGiamDoc += gd.tinhLuong();
				}
	          
	        }
		  tongLuongCT = luongTruongPhong + luongThangNVT + luongThangGiamDoc;
		  return tongLuongCT;
		
	}

	@Override
	public void truongPhongCoNhanVienNhieuNhat(ArrayList<NhanSu> nhansu) {
		// TODO Auto-generated method stub
		phanBoDoiTuong(nhansu);
		TruongPhong  tpmax = listTruongPhong.get(0);
		for(int i = 0; i < listTruongPhong.size(); i++) {
			if(listTruongPhong.get(i).getSoluongNV() > tpmax.getSoluongNV()) {
				tpmax = listTruongPhong.get(i);
			}
		}
		System.out.println("\n ==========Trưởng phỏng có số lượng quản lý nhân viên thường nhiều nhất ===========\n");
		System.out.println(tpmax.toString());
	}

	@Override
	public void timNhanVienThuong(ArrayList<NhanSu> nhansu) {
		// TODO Auto-generated method stub
		//Tìm Nhân viên thường có lương cao nhất
		//b1: tính lương tháng cho tưng nhân viên thường
		// set nhân viên thương có lương cao nhất
		phanBoDoiTuong(nhansu);
		double luongMax = listNhanVienThuong.get(0).tinhLuong();
		NhanVienThuong nVT = listNhanVienThuong.get(0);
		for(int i = 0; i < listNhanVienThuong.size(); i++) {
			if(listTruongPhong.get(i).tinhLuong() > luongMax) {
				luongMax = listNhanVienThuong.get(i).tinhLuong();
				nVT = listNhanVienThuong.get(i);
			}
		}
		System.out.println("\n ========== Nhân viên thường có lương cao nhất ===========\n");
		System.out.println(nVT.toString());
		System.out.println("Lương tháng là : " + luongMax);
	}

	@Override
	public void sapXepNSHoTen(ArrayList<NhanSu> nhansu) {
		// TODO Auto-generated method stub
		String temp;
		   //Sắp xếp danh sách theo theo thứ tự a b c!
        Collections.sort(nhansu, new Comparator<NhanSu>() {
            @Override
            public int compare(NhanSu ns1, NhanSu ns2) {
                return (ns1.getHoTen().compareTo(ns2.getHoTen()));
                // Muốn đảo danh sách các bạn đối thành
                //return (sv2.hoTen.compareTo(sv1.hoTen));
            }
        });
    	System.out.println("==========Danh sách sắp xếp nhân viên toàn công ty theo thứ tự abc========== ");
        for (int i = 0; i < nhansu.size(); i++) {
            System.out.println(nhansu.toString());
        }
	}
	
	@Override
	public void sapXepNSLuong(ArrayList<NhanSu> nhansu) {
		 Collections.sort(nhansu, new Comparator<NhanSu>() {
	            @Override
	            public int compare(NhanSu ns1, NhanSu ns2) {
	                if (ns1.getLuongThang() < ns2.getLuongThang()) {
	                    return 1;
	                } else {
	                    if (ns1.getLuongThang() == ns2.getLuongThang()) {
	                        return 0;
	                    } else {
	                        return -1;
	                    }
	                }
	            }
	        });
		 System.out.println("======Danh sách sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần ========");
	        for (int i = 0; i < nhansu.size(); i++) {
	            System.out.println(nhansu.toString());
	        }
		 //b1 : tính lương cho từng nhan su
//		 double tongLuongCT = 0;
//		 for(int i = 0; i < nhansu.size(); i++) {
//			 if (nhansu.get(i) instanceof TruongPhong == true) {	
//					  (TruongPhong)nhansu.get(i).ti;
//					
//				}else if(nhansu.get(i) instanceof NhanVienThuong == true){
//					NhanVienThuong nvt =  (NhanVienThuong)nhansu.get(i);
//					luongThangNVT  += nvt.tinhLuong();
//				}else if(nhansu.get(i) instanceof GiamDoc == true) {
//					GiamDoc gd = (GiamDoc) nhansu.get(i);
//					luongThangGiamDoc += gd.tinhLuong();
//				}
//	          
//	        }
		
	}
	@Override
	public void timGiamDoc(ArrayList<NhanSu> nhansu) {
		// TODO Auto-generated method stub
		phanBoDoiTuong(nhansu);
		GiamDoc gd  = listGiamDoc.get(0);
		for(int i = 0; i < listGiamDoc.size(); i++) {
			if(listGiamDoc.get(i).getCoPhan() > gd.getCoPhan()) {
				gd = listGiamDoc.get(i);
				
			}
		}
		System.out.println("\n ========== Giám đốc có cổ phần cao nhất là ===========\n");
		System.out.println(gd.toString());
		
	}

	@Override
	public void tongThuNhapGD(ArrayList<NhanSu> nhansu) {
		// TODO Auto-generated method stub
		double loiNhuanCT = 0, thuNhap = 0, doanThu; 
		// vì đề bài không cho doanh thu của công ty nên ta nhập 
		System.out.print("Nhập doanh thu trong tháng của công ty: ");
		doanThu = scanner.nextDouble();
		// tính lợi nhuận công ty 
		loiNhuanCT = doanThu - tinhVaXuatLuongCT(nhansu);
		phanBoDoiTuong(nhansu);

		for(int i = 0; i < listGiamDoc.size(); i++) {
			thuNhap = (listGiamDoc.get(i).getLuongThang() +(listGiamDoc.get(i).getCoPhan() *loiNhuanCT));
			System.out.print("Tổng thu nhập của giám đốc: " + listGiamDoc.get(i).getHoTen() + " là: " + thuNhap);
			
		}
	}
	
}
