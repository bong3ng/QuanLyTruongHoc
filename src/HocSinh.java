import java.util.Scanner;

public class HocSinh extends ThanhVien {
	private float diemToan;
	private float diemVan;
	private float diemNgoaiNgu;
	private float diemTrungBinh;
	private String xepLoai;
	
	
	
	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemVan() {
		return diemVan;
	}

	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}

	public float getDiemNgoaiNgu() {
		return diemNgoaiNgu;
	}

	public void setDiemNgoaiNgu(float diemNgoaiNgu) {
		this.diemNgoaiNgu = diemNgoaiNgu;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}
	

	public String getXepLoai() {
		return xepLoai;
	}

	public HocSinh(String ten, int namSinh, String noiSinh, String diaChi, float diemToan, float diemVan, float diemNgoaiNgu) {
		super(ten, namSinh, noiSinh, diaChi);
		this.diemToan = diemToan;
		this.diemNgoaiNgu = diemNgoaiNgu;
		this.diemVan = diemVan;
		xepLoai = "Chưa có";
		diemTrungBinh = -1;
	}

	public HocSinh() {
		xepLoai = "Chưa có";
		diemTrungBinh = -1;
	}
	
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhập điểm toán: ");
		this.diemToan = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập điểm văn: ");
		this.diemVan = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập điểm ngoại ngữ: ");
		this.diemNgoaiNgu = Float.parseFloat(scan.nextLine());
	}
	
	
	@Override
	public void xuat() {
		super.xuat();
		
		System.out.print(" Điểm toán: " + diemToan + " Điểm văn: " + diemVan + " Điểm ngoại ngữ: " + diemNgoaiNgu + " DTB: "+ diemTrungBinh + " Xếp loại: " + xepLoai);
		System.out.println();
	}
	
	public void tinhDiemTrungBinh() {
		this.diemTrungBinh = (diemToan + diemVan + diemNgoaiNgu)/3.0f;
	}
	
	public void xepLoaiHocSinh() {
		if(diemTrungBinh < 5 ) {
			xepLoai = "Yếu";
		}else if(diemTrungBinh > 9) {
			xepLoai = "Xuất Sắc";
			
		}else if(diemTrungBinh >= 5 && diemTrungBinh < 7) {
			xepLoai = "Trung Bình";
		}else if(diemTrungBinh >=7 && diemTrungBinh < 8) {
			xepLoai = "Khá";
		}else {
			xepLoai = "Giỏi";
		}
	}
	
	
}
