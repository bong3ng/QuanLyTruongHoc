import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DanhSachHocSinh {
	private ArrayList<HocSinh> objDShocsinh;

	public ArrayList<HocSinh> getObjDShocsinh() {
		return objDShocsinh;
	}

	public void setObjDShocsinh(ArrayList<HocSinh> objDShocsinh) {
		this.objDShocsinh = objDShocsinh;
	}
	
	public DanhSachHocSinh() {
		objDShocsinh = new ArrayList<HocSinh>();
		
	}
	
	public void xuat() {
		for(HocSinh hs: objDShocsinh) {
			hs.xuat();
		}
	}
	
	public void tinhDiemTrungBinh() {
		for(HocSinh hs: objDShocsinh) {
			hs.tinhDiemTrungBinh();
		}
	}
	
	public void timTBcaoNhat() {
		tinhDiemTrungBinh();
		float max = -1;
		for (HocSinh hs: objDShocsinh) {
			if(max < hs.getDiemTrungBinh()) {
				max = hs.getDiemTrungBinh();
			}
		}
		if (max == -1) {
			System.out.println("Vui lòng nhập lại dữ liệu điểm học sinh.");
		}else {
			System.out.println("Danh sách học sinh có điểm trung bình cao nhất là: ");
			for(HocSinh hs: objDShocsinh) {
				if(max == hs.getDiemTrungBinh()) {
					hs.xuat();
				}
			}
		}
	}
	
	public void DSxepLoai() {
		tinhDiemTrungBinh();
		for(HocSinh hs: objDShocsinh) {
			hs.xepLoaiHocSinh();
		}
	}
	
	public void them(HocSinh hs) {
		objDShocsinh.add(hs);
	}
	
	public void sapXep() {
		for(int i = 0; i < objDShocsinh.size() - 1; i ++) {
			for(int j = i+1; j < objDShocsinh.size(); j++) {
				float hs1 = objDShocsinh.get(i).getDiemTrungBinh();
				float hs2 = objDShocsinh.get(j).getDiemTrungBinh();
				if(hs2 > hs1 ) {
					Collections.swap(objDShocsinh, i, j);
				}
			}
		}
	}
	
	public void sapXepTheoTen() {
		String temp;
		for (int j = 0; j < objDShocsinh.size()-1; j++) {
		   	   for (int i = j + 1; i < objDShocsinh.size(); i++) {
		   		   String ten1 = objDShocsinh.get(j).getTen();
		   		   String ten2 = objDShocsinh.get(i).getTen();
					if (ten1.compareTo(ten2) > 0) {
						Collections.swap(objDShocsinh, j, i);
					}
			   }
		}
		   	  
	}
}
