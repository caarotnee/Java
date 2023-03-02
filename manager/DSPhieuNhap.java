
package manager;
import java.util.Scanner;

import importGoods.PhieuNhap;

import java.util.ArrayList;


public class DSPhieuNhap {
    private ArrayList <PhieuNhap> listPhieuNhap;

    public DSPhieuNhap (ArrayList <PhieuNhap> listPhieuNhap)
    {
        this.listPhieuNhap = listPhieuNhap;
    }

    public DSPhieuNhap()
    {
        this.listPhieuNhap = new ArrayList <PhieuNhap>();
    }

    // thêm phiếu nhập

    public void insertPN(PhieuNhap listPhieuNhap)
    {
        this.listPhieuNhap.add(listPhieuNhap);
    }

    // sửa phiếu nhập
    public boolean fixPN (String pn1, String pn2)
    {
        PhieuNhap pn = this.listPhieuNhap.stream().filter
        (listPhieuNhap -> listPhieuNhap.getiDPhieuNhap().equals(pn1)).findFirst().orElse(null);
        if (listPhieuNhap == null)
            return false;
        pn.setiDPhieuNhap(pn2);
            return true;
    }

    // hàm xóa
    public boolean deletePN(String id)
    {
        PhieuNhap pn = this.listPhieuNhap.stream().filter
        (listPhieuNhap -> listPhieuNhap.getiDPhieuNhap().equals(id)).findFirst().orElse(null);
        if (listPhieuNhap == null)
            return false;
        this.listPhieuNhap.remove(pn);
        return true;
    }

    // hàm tìm kiếm
    public void searchPN(String id)
    {
        this.listPhieuNhap.stream().filter(l -> l.getiDPhieuNhap().equals(id)).forEach(l -> System.out.println(l.toString()));
    }
    // hàm in 
    public void showPN()
    {
        this.listPhieuNhap.forEach(listPhieuNhap -> System.out.println(listPhieuNhap.toString()));
        // listPhieuNhap.toString();
    }
}


