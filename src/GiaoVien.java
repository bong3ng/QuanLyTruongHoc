import java.util.Scanner;

public class GiaoVien extends ThanhVien {
	
	final int namHienTai = 2022;
	
	private int namBatDauDay;
	private String chuyenMon;
	private int thamNien;
	

	public int getNamBatDauDay() {
		return namBatDauDay;
	}

	public void setNamBatDauDay(int namBatDauDay) {
		this.namBatDauDay = namBatDauDay;
	}

	public String getChuyenMon() {
		return chuyenMon;
	}

	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}

	public int getThamNien() {
		return thamNien;
	}

	public GiaoVien(String ten, int namSinh, String noiSinh, String diaChi, int namBatDauDay, String chuyenMon) {
		super(ten, namSinh, noiSinh, diaChi);
		this.chuyenMon = chuyenMon;
		this.namBatDauDay = namBatDauDay;
	}

	public GiaoVien() {
		thamNien = -1;
	}
	
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhập năm bắt đầu dạy: ");
		this.namBatDauDay = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập chuyên môn giảng dạy: ");
		this.chuyenMon = scan.nextLine();
		
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.print(" Năm bắt đầu dạy: " + namBatDauDay + " Chuyên môn: " + chuyenMon + " Thâm niên: " + thamNien);
		System.out.println();
	}
	
	public void tinhThamNien() {
		this.thamNien = namHienTai - this.namBatDauDay;
	}
	
}
