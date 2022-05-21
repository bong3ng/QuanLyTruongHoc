import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DanhSachHocSinh listHS = new DanhSachHocSinh();
		DanhSachGiaoVien listGV = new DanhSachGiaoVien();
		
		boolean flag = true;
		do {
			inMenu();
			int chon = Integer.parseInt(scan.nextLine());
			switch(chon) {
			case 1:
				try {
					FileReader reader = new FileReader("src/hocsinh");
					BufferedReader bufferedReader = new BufferedReader(reader);
					String line;
					while((line = bufferedReader.readLine()) != null) {
						String[] listInfo = line.split(" # ");
						HocSinh hs = new HocSinh(listInfo[0],Integer.parseInt(listInfo[1]),listInfo[2],listInfo[3],Float.parseFloat(listInfo[4]),Float.parseFloat(listInfo[5]),Float.parseFloat(listInfo[6]));
						listHS.them(hs);
						//reader.close();
					}
				}catch (IOException e) {
					e.printStackTrace();
				}
				
				try {
					FileReader reader = new FileReader("src/giaovien");
					BufferedReader bufferedReader = new BufferedReader(reader);
					String line;
					while((line = bufferedReader.readLine()) != null) {
						String[] listInfo = line.split(" # ");
						GiaoVien gv = new GiaoVien(listInfo[0],Integer.parseInt(listInfo[1]),listInfo[2],listInfo[3],Integer.parseInt(listInfo[4]),listInfo[5]);
						listGV.them(gv);
						//reader.close();
					}
				}catch (IOException e) {
					e.printStackTrace();
				}

				break;
			case 2:
				int number;
				System.out.println("Chọn 1 để nhập giáo viên, chọn 2 để nhập học sinh.");
				number = Integer.parseInt(scan.nextLine());
				if (number == 2) {
					HocSinh hs = new HocSinh();
					hs.nhap(scan);
					listHS.them(hs);	
				}else if(number == 1) {
					GiaoVien gv = new GiaoVien();
					gv.nhap(scan);
					listGV.them(gv);
				}
				break;
			case 3:
				listHS.xuat();
				break;
			case 4:
				listGV.xuat();
				break;
			case 5:
				listHS.xuat();
				listGV.xuat();
				break;
			case 6:
				listGV.tinhThamNien();
				break;
			case 7:
				listGV.thamNienTuNhien();
				break;
			case 8:
				listGV.thamNienCaoNhat();
				break;
			case 9:
				listHS.tinhDiemTrungBinh();
				break;
			case 10:
				listHS.timTBcaoNhat();
				break;
			case 11:
				listHS.DSxepLoai();
				break;
			case 12:
				listHS.sapXep();
				break;
			case 13:
				listHS.sapXepTheoTen();
				break;
			
				
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Vui lòng nhập từ 0 đến 13.");
			}
		}while(flag);
	}
	
	public static void inMenu() {
		System.out.println("***************** Quản Lý Trường Học *********************");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Vui lòng chọn chức năng: ");
		System.out.println("1.Tạo dữ liệu giáo viên và học sinh theo data có sẵn.");
		System.out.println("2. Nhập thông tin cho thành viên trong trường.");
		System.out.println("3. Xuất danh sách học sinh: ");
		System.out.println("4. Xuất danh sách giáo viên: ");
		System.out.println("5. Xuất danh sách tất cả thành viên: ");
		System.out.println("6. Tính thâm niên giáo viên");
		System.out.println("7. Xuất danh sách giáo viên có thâm niên trên 5 năm và chuyên môn thuộc khối tự nhiên");
		System.out.println("8. Xuất giáo viên có thâm niên cao nhất");
		System.out.println("9. Tính điểm trung bình của học sinh");
		System.out.println("10. Xuất học sinh có điểm trung bình cao nhất");
		System.out.println("11. Xếp loại cho học sinh.");
		System.out.println("12. Sắp xếp học sinh theo ĐTB giảm dần");
		System.out.println("13. Sắp xếp tên học sinh theo thứ tự ABC.");

		System.out.println("0. Thoát");
	}
}
