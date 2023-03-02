package manager;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import goods.HangHoa;
import goods.NhomHang;
import ui.HangHoaFile;
import ui.ScannerFactory;

public class DSHangHoa {

    private List<HangHoa> listHangHoa;
    private HangHoaFile hangHoaFile;
    NhomHang nhomHang = new NhomHang();
    HangHoa hangHoa = new HangHoa();
    Scanner sc = ScannerFactory.getScanner();
    Locale lc = new Locale("vi", "VN");
    NumberFormat numf = NumberFormat.getCurrencyInstance(lc);

    public DSHangHoa() {
        hangHoaFile = new HangHoaFile();
        listHangHoa = hangHoaFile.read();
    }

    // getter && setter
    public List<HangHoa> getListHangHoa() {
        return listHangHoa;
    }

    public void setStudentList(List<HangHoa> listHangHoa) {
        this.listHangHoa = listHangHoa;
    }

    // Hàm thêm hàng hóa
    public void insert() {
        String maHang = inputMaHang();
        String nhomHang = inputMaNhomHang();
        String tenHang = inputTenHang();
        String donViTinh = inputDVT();
        double donGia = inputDonGia();
        // double VAT = 0.8;
        HangHoa hh = new HangHoa(maHang, nhomHang, tenHang, donViTinh, donGia, 0.8);
        this.listHangHoa.add(hh);
        hangHoaFile.write(listHangHoa);
    }

    public void show() {
        for (HangHoa hangHoa : listHangHoa) {
            System.out.format("%10s | ", hangHoa.getMaHang());
            System.out.format("%20s | ", hangHoa.getMaNhomHang());
            System.out.format("%20s | ", hangHoa.getTenHang());
            System.out.format("%5s | ", hangHoa.getDonViTinh());
            System.out.format("%5s%n", numf.format(hangHoa.getDonGia()));
        }
    }

    // Hàm sửa hàng hóa
    public boolean fixGoods(String maHang1, String maHang2) {
        HangHoa hh = this.listHangHoa.stream().filter(listHangHoa -> listHangHoa.getMaHang().equals(maHang1))
                .findFirst().orElse(null);
        if (listHangHoa == null)
            return false;
        hh.setMaHang(maHang2);
        hangHoaFile.write(listHangHoa);
        return true;
    }

    // Hàm xóa hàng hóa
    // public void delete(HangHoa hangHoa)
    // {
    // this.listHangHoa.remove(hangHoa);
    // }
    public boolean deleteGoods(String maHang) {
        HangHoa hh = this.listHangHoa.stream().filter(listHangHoa -> listHangHoa.getMaHang().equals(maHang)).findFirst()
                .orElse(null);
        if (listHangHoa == null)
            return false;
        this.listHangHoa.remove(hh);
        hangHoaFile.write(listHangHoa);
        return true;
    }

    // Hàm tìm kiếm hàng hóa theo mã hàng hóa
    public void searchGoods(String maHang) {
        this.listHangHoa.stream().filter(l -> l.getMaHang().equals(maHang))
                .forEach(l -> show());
        hangHoaFile.write(listHangHoa);
    }

    // Hàm in ds
    public void showGoods() {
        show();
        // hangHoaFile.write(listHangHoa);
    }
    // public void showInfor() {
    // for(int i =0;i < listHangHoa.size()-1; i++){
    // System.out.println(listHangHoa.toString());
    // }
    // }

    private String inputMaNhomHang() {
        String maNhomHangInPut;
        System.out.print("Nhập mã nhóm hàng: ");
        while (true) {
            maNhomHangInPut = sc.nextLine();
            boolean check = nhomHang.setMaNhomHang(maNhomHangInPut);
            if (check) {
                return maNhomHangInPut;
            }
        }
    }

    /**
     * @return
     */
    private String inputMaHang() {
        String maHangInPut;
        System.out.print("Nhập mã hàng: ");
        while (true) {
            maHangInPut = sc.nextLine();
            boolean check = hangHoa.setMaHang(maHangInPut);
            if (check) {
                return maHangInPut;
            }
        }
    }

    private String inputTenHang() {
        String tenHangInPut;
        System.out.print("Nhập tên hàng: ");
        while (true) {
            tenHangInPut = sc.nextLine();
            boolean check = hangHoa.setTenHang(tenHangInPut);
            if (check) {
                return tenHangInPut;
            }
        }
    }

    private String inputDVT() {
        String dvtInPut;
        System.out.print("Nhập đơn vị tính: ");
        while (true) {
            dvtInPut = sc.nextLine();
            boolean check = hangHoa.setDonViTinh(dvtInPut);
            if (check) {
                return dvtInPut;
            }
        }
    }

    // private String inputDonGia() {
    //     String donGiaInPut;
    //     System.out.print("Nhập đơn giá: ");
    //     while (true) {
    //         donGiaInPut = sc.nextLine();
    //         boolean check = hangHoa.setDonGia(donGiaInPut);
    //         if (check) {
    //             return donGiaInPut;
    //         }
    //     }
    // }
    public double inputDonGia() {
        System.out.print("Nhập đơn giá: ");
        while (true) {
            try {
                double donGia = Double.parseDouble(sc.nextLine());
                return donGia;
            } catch (NumberFormatException ex) {
                System.out.print("Lỗi! Nhập lại đơn giá: ");
            }
        }
    }

}