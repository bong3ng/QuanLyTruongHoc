import java.util.ArrayList;

public class DanhSachGiaoVien {
	
	
	private ArrayList<GiaoVien> objGiaoVien;

	public ArrayList<GiaoVien> getObjGiaoVien() {
		return objGiaoVien;
	}

	public void setObjGiaoVien(ArrayList<GiaoVien> objGiaoVien) {
		this.objGiaoVien = objGiaoVien;
	}
	
	public DanhSachGiaoVien() {
		objGiaoVien = new ArrayList<GiaoVien>();
	}
	
	public void xuat() {
		for(GiaoVien gv: objGiaoVien) {
			gv.xuat();
		}	
	}
	public void tinhThamNien() {
		for(GiaoVien gv: objGiaoVien) {
			gv.tinhThamNien();
		}
	}
	
	
	
	public void thamNienCaoNhat() {
		int max = -1;
		for(GiaoVien gv: objGiaoVien) {
			gv.tinhThamNien();
			if (max < gv.getThamNien()) {
				max = gv.getThamNien();
			}
		}
		if(max == -1) {
			System.out.println("Sai dữ liệu giáo viên hoặc chưa có thông tin");
		}
		else {
			System.out.println("Giáo viên có thâm niên cao nhất là: ");
			for(GiaoVien gv: objGiaoVien) {
				if(gv.getThamNien() == max) {
					gv.xuat();
				}
			}
		}	
	}
	
	public void thamNienTuNhien() {
		System.out.println("Giáo viên có thâm niên trên 5 năm có chuyên môn tự nhiên là: ");
		for(GiaoVien gv: objGiaoVien) {
			gv.tinhThamNien();
			if(gv.getThamNien() > 5) {
				if(gv.getChuyenMon().equalsIgnoreCase("tự nhiên")) {
					gv.xuat();
				}
			}
		}
	}
	
	public void them(GiaoVien gv) {
		objGiaoVien.add(gv);
	}
	
}
