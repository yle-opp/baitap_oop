package quanlynhansu;

public class GiamDoc extends NhanSu{
	
	private int coPhan;
	
	

	public GiamDoc(int coPhan) {
		super();
		this.coPhan = coPhan;
	}

	public GiamDoc() {
		super();
		
	}

	
	public int getCoPhan() {
		return coPhan;
	}
	
	public void setCoPhan(int coPhan) {
		this.coPhan = coPhan;
	}

	

	@Override
    public String toString() {
        return super.toString() + "\n số cổ phần: " + this.coPhan ;
         
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
		this.setLuong(300);
        	System.out.print("Nhập số cố phần : ");
            coPhan = scanner.nextInt();
            if (coPhan < 0 || coPhan > 100) {
				System.out.println("Cổ phân giám đốc không vượt quá 100% (1-100)");
				System.out.print("Nhập lại số cố phần : ");
	            coPhan = scanner.nextInt();
			}
        
	}
	
}
