
package manager;
import java.util.ArrayList;

import importGoods.ChiTietPhieuNhap;
import importGoods.PhieuNhap;
public class DSChiTietPN {
    private ArrayList<ChiTietPhieuNhap> chitietpn;

    public DSChiTietPN(ArrayList<ChiTietPhieuNhap> chitietpn) {
        this.chitietpn = chitietpn;
    }

    public DSChiTietPN() {
        this.chitietpn = new ArrayList<ChiTietPhieuNhap>();
    }

    //Thêm 
    public void addChiTietPN(ChiTietPhieuNhap chitietpn){
        this.chitietpn.add(chitietpn);
    }

    //Sửa
    public boolean fixChiTietPhieuNhap(PhieuNhap iDPhieuNhap1, PhieuNhap iDPhieuNhap2){
        ChiTietPhieuNhap ctpn = this.chitietpn.stream().filter(chitietpn -> chitietpn.getiDPhieuNhap().equals(iDPhieuNhap1)).findFirst().orElse(null);
        if (chitietpn == null )
            return false;
        ctpn.setiDPhieuNhap(iDPhieuNhap2);
            return true;
    }

    // xóa
    public boolean deleteChiTietPhieuNhap(String iDChiTietPhieuNhap){
        ChiTietPhieuNhap ctpn = this.chitietpn.stream().filter(chitietpn -> chitietpn.getiDPhieuNhap().equals(iDChiTietPhieuNhap)).findFirst().orElse(null);
        if(chitietpn == null )
            return false;   // xài chức năng fiter trng stream tìm theo ten
        this.chitietpn.remove(ctpn);
            return true;
    }
    
    // tìm kiếm 
    public boolean searchChiTietPhieuNhap(String id){
        ChiTietPhieuNhap ctpn = this.chitietpn.stream().filter // tìm tên
        (phieuxuat -> phieuxuat.getiDPhieuNhap().equals(id)).findFirst() // tim thấy đâu tiên
                .orElse(null); // nếu không tìm thấy trả về null
        if (chitietpn == null)
            return false;
        this.chitietpn.stream().filter(PS -> PS instanceof ChiTietPhieuNhap).forEach(PS -> System.out.println(PS.toString()));
            return true;
    }

    ChiTietPhieuNhap ctpn = this.chitietpn.stream().filter 
    (phieuxuat -> phieuxuat.getiDPhieuNhap().equals(id)).findFirst().orElse(null);
    if (chitietpn == null)
        return false;
    this.chitietpn.stream().filter(PS -> PS instanceof ChiTietPhieuNhap).forEach(PS -> System.out.println(PS.toString()));
        return true;

    //  in ds
    public void showChiTietPhieuNhap() {
        this.chitietpn.forEach(chitietpn -> System.out.println(chitietpn.toString()));
    }

    

    
}
