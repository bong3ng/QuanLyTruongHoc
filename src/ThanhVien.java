import java.util.Scanner;

public class ThanhVien {
	protected String ten;
	protected int namSinh;
	protected String noiSinh;
	protected String diaChi;
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getNoiSinh() {
		return noiSinh;
	}
	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public ThanhVien(String ten, int namSinh, String noiSinh, String diaChi) {
		this.ten = ten;
		this.namSinh = namSinh;
		this.noiSinh = noiSinh;
		this.diaChi = diaChi;
	}
	
	public ThanhVien() {
		
	}
	
	public void nhap(Scanner scan) {
		System.out.println("Nhập thông tin thành viên");
		System.out.println("Nhập tên: ");
		this.ten = scan.nextLine();
		System.out.println("Nhập năm sinh: ");
		this.namSinh = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập nơi sinh: ");
		this.noiSinh = scan.nextLine();
		System.out.println("Nhập địa chỉ hiện tại: ");
		this.diaChi = scan.nextLine();
		
		
	}
	
	public void xuat() {
		System.out.print("Tên: " + ten + " Năm sinh: " + namSinh + " Nơi sinh: "+ noiSinh + " Địa chỉ: " + diaChi);
	}
	
	
}
