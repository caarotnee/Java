
import java.util.Scanner;
import goods.HangHoa;
import importGoods.ChiTietPhieuNhap;
import importGoods.PhieuNhap;
import manager.DSChiTietPN;
import manager.DSChiTietPX;
import manager.DSHangHoa;
import manager.DSPerson;
import manager.DSPhieuNhap;
import manager.DSPhieuXuat;
import person.KhachHang;
import person.NhanVien;
import person.Person;
import sell.ChiTietPhieuXuat;
import sell.PhieuXuat;
import ui.ScannerFactory;

public class text {
    public static void main(String[] args) {
        int luachon = 0;
        Scanner sc = ScannerFactory.getScanner();
        DSPerson p = new DSPerson();
        Person kh = new KhachHang();
        Person nv = new NhanVien();
        PhieuNhap pn = new PhieuNhap();
        DSPhieuNhap dspn = new DSPhieuNhap();
        HangHoa hh = new HangHoa();
        DSHangHoa dshh = new DSHangHoa();
        ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap();
        DSChiTietPN dsctpn = new DSChiTietPN();
        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("\n\n\n\t========== MENU ==========");
            System.out.println("1. Quản Lí. ");
            System.out.println("2. Nhập kho. ");
            System.out.println("3. Bán hàng. ");
            System.out.println("0. THOÁT");
            do {
                System.out.print("Nhập lựa chọn của bạn: ");
                luachon = Integer.parseInt(sc.nextLine());
            } while (luachon < 0 || luachon > 3);

            if (luachon == 1) {
                while (true) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\n\n\n\t======MENU======");
                    System.out.println("1. Quản lí nhân viên và khách hàng. ");
                    System.out.println("2. Quản lí hàng hóa. ");
                    System.out.println("0. Thoát. ");
                    System.out.println("======");

                    do {
                        System.out.print("Nhập lựa chọn của bạn: ");
                        luachon = Integer.parseInt(sc.nextLine());
                    } while (luachon < 0 || luachon > 2);

                    if (luachon == 1) {

                        while (true) {
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("\n\n\n\t========== MENU ==========");
                            System.out.println("1. Thêm nhân viên và khách hàng vào danh sách");
                            System.out.println("2. Xóa nhân viên và khách hàng khỏi danh sách");
                            System.out.println("3. Sửa nhân viên và khách hàng trong danh sách");
                            System.out.println("4. Tìm kiếm nhân viên và khách hàng trong danh sách");
                            System.out.println("5. In ra nhân viên và khách hàng trong danh sách");
                            System.out.println("0. THOÁT");
                            System.out.println("======");

                            do {
                                System.out.print("Nhập lựa chọn của bạn: ");
                                luachon = Integer.parseInt(sc.nextLine());
                            } while (luachon < 0 || luachon > 5);

                            if (luachon == 1) {
                                while (true) {
                                    System.out.println("1. Thêm nhân viên");
                                    System.out.println("2. Thêm khách hàng");
                                    System.out.println("0. THOÁT");
                                    System.out.println("======");

                                    System.out.println();
                                    do {
                                        System.out.print("\nNhập lựa chọn của bạn: ");
                                        luachon = Integer.parseInt(sc.nextLine());

                                    } while (luachon < 0 || luachon > 2);

                                    if (luachon == 1) {

                                        int n = 0;
                                        System.out.print("Nhập số nhân viên cần thêm: ");

                                        n = Integer.parseInt(sc.nextLine());
                                        for (int i = 0; i < n; i++) {

                                            nv.input();
                                            p.addPerson(nv);
                                            p.ghifile(nv);

                                        }
                                    } else if (luachon == 2) {
                                        int n = 0;
                                        System.out.print("Nhập số khách hàng cần thêm: ");

                                        n = Integer.parseInt(sc.nextLine());
                                        for (int i = 0; i < n; i++) {

                                            kh.input();
                                            p.addPerson(kh);
                                            p.ghifile(kh);
                                        }
                                    }

                                    else if (luachon == 0) {
                                        break;
                                    }
                                }
                            }

                            // xóa
                            else if (luachon == 2) {
                                while (true) {
                                    System.out.println("1. Xóa nhân viên");
                                    System.out.println("2. Xóa khách hàng");
                                    System.out.println("0. THOÁT");
                                    System.out.println("======");

                                    do {
                                        System.out.print("Nhập lựa chọn của bạn: ");
                                        luachon = Integer.parseInt(sc.nextLine());

                                    } while (luachon < 0 || luachon > 2);

                                    if (luachon == 1) {
                                        System.out.print("Nhập tên nhân viên cần xóa: ");
                                        String ten = sc.nextLine();
                                        System.out.println(p.deletePerson(ten));
                                    }

                                    else if (luachon == 2) {
                                        System.out.print("Nhập tên khách hàng cần xóa: ");
                                        String ten = sc.nextLine();
                                        System.out.println(p.deletePerson(ten));
                                        p.ghifile(kh);
                                    }

                                    else if (luachon == 0) {
                                        break;
                                    }
                                }
                            }

                            // sửa
                            else if (luachon == 3) {
                                while (true) {
                                    System.out.println("1. Sủa nhân viên");
                                    System.out.println("2. Sửa khách hàng");
                                    System.out.println("0. THOÁT");
                                    System.out.println("======");

                                    do {
                                        System.out.print("Nhập lựa chọn của bạn: ");
                                        luachon = Integer.parseInt(sc.nextLine());

                                    } while (luachon < 0 || luachon > 2);

                                    if (luachon == 1) {
                                        System.out.print("Nhập tên nhân viên muốn sửa: ");
                                        String name1 = sc.nextLine();
                                        System.out.print("Nhập tên mới: ");
                                        String name2 = sc.nextLine();
                                        System.out.println(p.fixPerson(name1, name2));
                                    }

                                    else if (luachon == 2) {
                                        System.out.print("Nhập tên khách hàng muốn sửa: ");
                                        String name1 = sc.nextLine();
                                        System.out.print("Nhập tên mới: ");
                                        String name2 = sc.nextLine();
                                        System.out.println(p.fixPerson(name1, name2));
                                    }

                                    else if (luachon == 0) {
                                        break;
                                    }
                                }
                            }

                            // tìm kiếm
                            else if (luachon == 4) {
                                while (true) {
                                    System.out.println("1. Tìm nhân viên");
                                    System.out.println("2. Tìm khách hàng");
                                    System.out.println("0. THOÁT");
                                    System.out.println("======");
                                    do {
                                        System.out.print("Nhập lựa chọn của bạn: ");
                                        luachon = Integer.parseInt(sc.nextLine());

                                    } while (luachon < 0 || luachon > 2);

                                    if (luachon == 1) {
                                        System.out.print("nhập tên cần tìm: ");
                                        String name = sc.nextLine();
                                        p.searchNhanVien(name);
                                    }

                                    else if (luachon == 2) {
                                        System.out.print("nhập tên cần tìm: ");
                                        String name = sc.nextLine();
                                        p.searchKhachHang(name);
                                    }

                                    else if (luachon == 0) {
                                        break;
                                    }
                                }
                            }

                            // in DS
                            else if (luachon == 5) {
                                while (true) {
                                    System.out.println("1. in DS nhân viên");
                                    System.out.println("2. in DS khách hàng");
                                    System.out.println("0. THOÁT");
                                    System.out.println("======");

                                    do {
                                        System.out.print("Nhập lựa chọn của bạn: ");
                                        luachon = Integer.parseInt(sc.nextLine());

                                    } while (luachon < 0 || luachon > 2);

                                    if (luachon == 1) {
                                        p.showInfor();
                                        p.docfile(nv);
                                    }

                                    else if (luachon == 2) {
                                        p.docfile(kh);
                                    }

                                    else if (luachon == 0) {
                                        break;
                                    }
                                }
                            }

                            else if (luachon == 0) {
                                break;
                            }
                        }
                    }

                    else if (luachon == 2) {
                        // qs hàng hóa
                        while (true) {
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("\n\n\n\t========== MENU ==========");
                            System.out.println("1. Thêm hàng hóa vào danh sách");
                            System.out.println("2. Xóa hàng hóa khỏi danh sách");
                            System.out.println("3. Sửa hàng hóa trong danh sách");
                            System.out.println("4. Tìm kiếm hàng hóa trong danh sách");
                            System.out.println("5. In ra hàng hóa trong danh sách");
                            System.out.println("0. THOÁT");
                            System.out.println("==========================");
                            do {
                                System.out.print("Nhập lựa chọn của bạn: ");
                                luachon = Integer.parseInt(sc.nextLine());
                            } while (luachon < 0 || luachon > 5);

                            if (luachon == 1) {
                                int n = 0;
                                System.out.print("Nhập số hàng hóa cần thêm: ");
                                n = Integer.parseInt(sc.nextLine());
                                for (int i = 0; i < n; i++) {
                                    dshh.insert();
                                }
                            } else if (luachon == 2) {
                                System.out.print("Nhập mã hàng hóa cần xóa : ");
                                String maHH = sc.nextLine();
                                System.out.println(dshh.deleteGoods(maHH) ? "Xóa thành công" : "Lỗi");
                                sc.nextLine();
                            } else if (luachon == 3) {
                                System.out.print("Nhập mã hàng muốn sửa : ");
                                String fixMH = sc.nextLine();
                                System.out.print("Nhập mã hàng mới : ");
                                String fixedMH = sc.nextLine();
                                System.out.println(dshh.fixGoods(fixMH, fixedMH) ? "Sửa thành công" : "Lỗi");
                                sc.nextLine();

                            } else if (luachon == 4) {
                                System.out.print("Nhập mã hàng muốn tìm : ");
                                String searchMH = sc.nextLine();

                                System.out.println("Kết quả tìm kiếm : ");
                                dshh.searchGoods(searchMH);
                                sc.nextLine();

                            } else if (luachon == 5) {
                                System.out.println("Danh sách hàng hóa : ");
                                dshh.showGoods();
                                sc.nextLine();
                            } else if (luachon == 0) {
                                break;
                            }

                        }
                    }

                    else if (luachon == 0) {
                        break;
                    }

                }

            }

            // nhập kho
            else if (luachon == 2) {
                while (true) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\n\n\n\t========== MENU ==========");
                    System.out.println("1. Thêm phiếu nhập vào danh sách");
                    System.out.println("2. Xóa phiếu nhập khỏi danh sách");
                    System.out.println("3. Sửa phiếu nhập trong danh sách");
                    System.out.println("4. Tìm kiếm phiếu nhập trong danh sách");
                    System.out.println("5. In ra phiếu nhập trong danh sách");
                    System.out.println("0. THOÁT");
                    System.out.println("==========================");
                    do {
                        System.out.print("Nhập lựa chọn của bạn: ");
                        luachon = Integer.parseInt(sc.nextLine());
                    } while (luachon < 0 || luachon > 5);

                    if (luachon == 1) {
                        int n = 0;
                        System.out.print("Nhập số phiếu nhập cần thêm: ");
                        n = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < n; i++) {
                            pn.inPutPN();
                            dspn.insertPN(pn);
                            System.out.println("\nnhập chi tiết phiếu nhập: ");
                            ctpn.input();
                            dsctpn.addChiTietPN(ctpn);
                            sc.nextLine();
                        }
                    } else if (luachon == 2) {
                        System.out.print("Nhập phiếu nhập cần xóa : ");
                        String iD = sc.nextLine();
                        System.out.println(dspn.deletePN(iD));
                        System.out.println(dsctpn.deleteChiTietPhieuNhap(iD));

                        sc.nextLine();
                    } else if (luachon == 3) {
                        System.out.print("Nhập id phiếu nhập muốn sửa : ");
                        String fixID = sc.nextLine();
                        System.out.print("Nhập id phiếu nhập mới : ");
                        String fixedID = sc.nextLine();
                        System.out.println(dspn.fixPN(fixID, fixedID));
                        sc.nextLine();
                    } else if (luachon == 4) {
                        System.out.print("Nhập id phiếu nhập muốn tìm : ");
                        String searchID = sc.nextLine();
                        System.out.println("Kết quả tìm kiếm : ");
                        dspn.searchPN(searchID);
                        dsctpn.searchChiTietPhieuNhap(searchID);
                        sc.nextLine();
                    } else if (luachon == 5) {
                        System.out.println("Danh sách phiếu nhập : ");
                        dspn.showPN();
                        sc.nextLine();
                        while (true) {
                            System.out.println("1. Xem chi tiết phiếu nhập.");
                            System.out.println("0. Thoát");

                            do {
                                System.out.print("Nhập lựa chọn của bạn: ");
                                luachon = Integer.parseInt(sc.nextLine());
                            } while (luachon < 0 || luachon > 1);

                            if (luachon == 1) {
                                dsctpn.showChiTietPhieuNhap();
                            }

                            else if (luachon == 0) {
                                break;
                            }
                        }

                    }

                    else if (luachon == 0) {
                        break;
                    }

                }

            }

            else if (luachon == 3) {
                while (true) {
                    PhieuXuat px = new PhieuXuat();
                    ChiTietPhieuXuat ctpx = new ChiTietPhieuXuat();
                    DSPhieuXuat dspx = new DSPhieuXuat();
                    DSChiTietPX dsctpx = new DSChiTietPX();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\n\n\n\t========== MENU ==========");
                    System.out.println("1. Thêm phiếu xuất vào danh sách");
                    System.out.println("2. Xóa phiếu xuất khỏi danh sách");
                    System.out.println("3. Sửa phiếu xuất trong danh sách");
                    System.out.println("4. Tìm kiếm phiếu xuất trong danh sách");
                    System.out.println("5. In ra phiếu xuất trong danh sách");
                    System.out.println("0. THOÁT");
                    System.out.println("======");

                    do {
                        System.out.print("Nhập lựa chọn của bạn: ");
                        luachon = Integer.parseInt(sc.nextLine());
                    } while (luachon < 0 || luachon > 5);

                    if (luachon == 1) {
                        int n = 0;
                        System.out.print("Nhập số phiếu xuất cần thêm: ");

                        n = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < n; i++) {
                            px.input();
                            System.out.println("\nnhập chi tiết phiếu xuất. ");
                            ctpx.input();
                            dspx.addPhieuXuat(px);
                            dspx.ghifile(px);

                            dsctpx.addChiTietPX(ctpx);
                            dsctpx.ghifile(ctpx);
                        }
                    }

                    else if (luachon == 2) {
                        System.out.print("Nhập id phiếu xuất cần xóa: ");
                        String id = sc.nextLine();
                        System.out.println(dspx.deletePhieuXuat(id));
                        System.out.println(dsctpx.deleteChitietPX(id));
                    }

                    else if (luachon == 3) {
                        System.out.print("Nhập id phiếu xuất muốn sửa: ");
                        String id1 = sc.nextLine();
                        System.out.print("Nhập id mới: ");
                        String id2 = sc.nextLine();
                        System.out.println(dspx.fixPhieuXuat(id1, id2));

                    }

                    else if (luachon == 4) {
                        System.out.print("nhập id muốn tìm: ");
                        String id = sc.nextLine();
                        dspx.searchPhieuXuat(id);
                        dsctpx.searchChiTietPX(id);
                    }

                    else if (luachon == 5) {
                        dspx.showPhieuXuat();
                        dspx.docfile(px);
                        while (true) {
                            System.out.println("=============");
                            System.out.println("1. xem chi tiết phiếu xuất. ");
                            System.out.println("0. Thoát. ");
                            System.out.println("======");

                            do {
                                System.out.print("Nhập lựa chọn của bạn: ");
                                luachon = Integer.parseInt(sc.nextLine());
                            } while (luachon < 0 || luachon > 1);

                            if (luachon == 1) {
                                dsctpx.docfile(ctpx);
                                dsctpx.showChiTietPX();
                            }

                            else if (luachon == 0) {
                                break;
                            }
                        }
                    }

                    else if (luachon == 0) {
                        break;
                    }

                }
            }

            else if (luachon == 0) {
                break;
            }
        }
    }
}
