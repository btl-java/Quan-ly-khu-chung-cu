/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import BLL.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author PhamDai
 */
public final class QuanLyGUI extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyGUI
     */
    
    public static QuanLyGUI it;
            
    public QuanLyGUI() {
        
        initComponents();
        
        it = this; //Sử dụng đối tượng static trỏ đến đối tượng của QuanLyGUI
        //Đây là cách làm có tính linh động, nó phù hợp với việc MainFrame chỉ được tạo ra một đối tượng duy nhất
        show_KhuCanHo();
        show_CanHo();
        show_TaiKhoan();
    }
    
    public void enabledFrame(){
        this.setEnabled(true);
    }// hàm cho phép thao tác trên frame này
    
    public void show_KhuCanHo(){
        tbKhu.setModel(KhuCanHoBLL.show()); // load data for table
        cbbMaKhu.setModel(KhuCanHoBLL.cbb_show()); //load data for combobox
    }
    
    public void show_CanHo(){
        tbCanHo.setModel(CanHoBLL.show());
        cbbMaCanHo.setModel(CanHoBLL.cbb_show());
    }
    
    private void show_TaiKhoan(){
        tbTaiKhoan.setModel(TaiKhoanBLL.show());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btDangXuat = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txbTenKhu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txbSoTang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txbSoCanTT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txbDiaChi = new javax.swing.JTextField();
        btThem_Khu = new javax.swing.JButton();
        btSua_Khu = new javax.swing.JButton();
        btXoa_Khu = new javax.swing.JButton();
        txbTimKiem1 = new javax.swing.JTextField();
        cbbMaKhu = new javax.swing.JComboBox<>();
        btTim_Khu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbKhu = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCanHo = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        txbTimKiem2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbbMaCanHo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txbDienTich = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txbGia = new javax.swing.JTextField();
        cbTrangThai = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        txbMaCuDan = new javax.swing.JTextField();
        txbMaKhu = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txbSoPhong = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btSua_CanHo = new javax.swing.JButton();
        btTim_CanHo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        btThem_NV = new javax.swing.JButton();
        btXoa_NV = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txbTenTK_NV = new javax.swing.JTextField();
        txbMK_NV = new javax.swing.JTextField();
        btSua_NV = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        txbTenTK_QL = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txbMK_QL = new javax.swing.JTextField();
        btSua_QL = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbTaiKhoan = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Quản Lý");

        btDangXuat.setText("Đăng Xuất");
        btDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(511, 511, 511)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btDangXuat)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btDangXuat))
                .addGap(17, 17, 17))
        );

        jLabel2.setText("Mã Khu");

        jLabel3.setText("Tên Khu");

        txbSoTang.setEditable(false);

        jLabel4.setText("Số Tầng");

        txbSoCanTT.setEditable(false);

        jLabel5.setText("Số căn/tầng");

        jLabel6.setText("Địa Chỉ");

        btThem_Khu.setText("Thêm");
        btThem_Khu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThem_KhuActionPerformed(evt);
            }
        });

        btSua_Khu.setText("Sửa");
        btSua_Khu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSua_KhuActionPerformed(evt);
            }
        });

        btXoa_Khu.setText("Xóa");
        btXoa_Khu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoa_KhuActionPerformed(evt);
            }
        });

        txbTimKiem1.setText("Tìm kiếm...");
        txbTimKiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbTimKiem1ActionPerformed(evt);
            }
        });

        cbbMaKhu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AA", "CE", "TS", " " }));

        btTim_Khu.setText("Tìm");
        btTim_Khu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTim_KhuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(txbTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btTim_Khu)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(28, 28, 28)
                                .addComponent(txbSoTang))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txbTenKhu, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbMaKhu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(28, 28, 28)
                                .addComponent(txbSoCanTT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txbDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSua_Khu, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(btXoa_Khu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btThem_Khu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(217, 217, 217))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTim_Khu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbMaKhu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txbSoCanTT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btThem_Khu))
                    .addComponent(jLabel2))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txbTenKhu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txbDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btSua_Khu)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txbSoTang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btXoa_Khu)
                        .addGap(0, 44, Short.MAX_VALUE))))
        );

        tbKhu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Khu", "Tên Khu", "Số Tầng", "Số căn/tầng", "Địa Chỉ"
            }
        ));
        tbKhu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKhuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbKhu);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Khu Căn Hộ", jPanel2);

        tbCanHo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Căn Hộ", "Diện Tích", "Giá", "Trạng Thái", "Số Phòng", "Mã Cư Dân", "Mã Khu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbCanHo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCanHoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCanHo);

        txbTimKiem2.setText("Tìm kiếm...");
        txbTimKiem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbTimKiem2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Mã Căn Hộ");

        cbbMaCanHo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Diện Tích");

        txbDienTich.setEditable(false);

        jLabel9.setText("Giá");

        cbTrangThai.setText("Trạng Thái");

        jLabel10.setText("Mã Cư Dân");

        txbMaCuDan.setEditable(false);

        txbMaKhu.setEditable(false);

        jLabel11.setText("Mã Khu");

        jLabel12.setText("Số Phòng");

        btSua_CanHo.setText("Sửa");
        btSua_CanHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSua_CanHoActionPerformed(evt);
            }
        });

        btTim_CanHo.setText("Tìm");
        btTim_CanHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTim_CanHoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(40, 40, 40))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txbGia, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txbSoPhong)
                        .addComponent(cbbMaCanHo, 0, 123, Short.MAX_VALUE)))
                .addGap(53, 53, 53)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8))
                .addGap(70, 70, 70)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txbDienTich)
                        .addGap(36, 36, 36)
                        .addComponent(cbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(326, 326, 326))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(txbMaKhu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txbMaCuDan, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txbTimKiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSua_CanHo)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btTim_CanHo)))
                        .addGap(186, 186, 186))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbTimKiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTim_CanHo))
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbbMaCanHo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txbDienTich, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(txbMaCuDan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txbGia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSua_CanHo)
                        .addGap(54, 54, 54)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txbMaKhu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txbSoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Căn Hộ", jPanel3);

        btThem_NV.setText("Thêm");
        btThem_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThem_NVActionPerformed(evt);
            }
        });

        btXoa_NV.setText("Xóa");
        btXoa_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoa_NVActionPerformed(evt);
            }
        });

        jLabel19.setText("Tên Tài Khoản");

        jLabel20.setText("Mật Khẩu");

        btSua_NV.setText("Sửa");
        btSua_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSua_NVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btXoa_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txbMK_NV)
                            .addComponent(txbTenTK_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btThem_NV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSua_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(330, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btXoa_NV)
                .addGap(72, 72, 72)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txbTenTK_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txbMK_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSua_NV)
                    .addComponent(btThem_NV))
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Nhân Viên", jPanel10);

        txbTenTK_QL.setEditable(false);
        txbTenTK_QL.setText("Admin");

        jLabel15.setText("Tên Tài Khoản");

        jLabel16.setText("Mật Khẩu");

        btSua_QL.setText("Sửa");
        btSua_QL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSua_QLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txbMK_QL)
                            .addComponent(txbTenTK_QL, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btSua_QL, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txbTenTK_QL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txbMK_QL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btSua_QL)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Quản Lý", jPanel11);

        tbTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên Tài Khoản", "Mật Khẩu", "Vai Trò"
            }
        ));
        tbTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTaiKhoanMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbTaiKhoan);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tài Khoản", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Thông Tin Mua Bán", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Thông Tin Cư Dân", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Thống Kê Doanh Thu", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangXuatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btDangXuatActionPerformed

    private void btThem_KhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThem_KhuActionPerformed
       ThemKhu_PhongGUI fr = new ThemKhu_PhongGUI();
       fr.setVisible(true);
       this.setEnabled(false);
    }//GEN-LAST:event_btThem_KhuActionPerformed

    private void tbKhuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhuMouseClicked
       
        cbbMaKhu.setSelectedItem(tbKhu.getValueAt(tbKhu.getSelectedRow(),0).toString()); // Dữ liệu trong combobox phải có trước
        txbTenKhu.setText(tbKhu.getValueAt(tbKhu.getSelectedRow(),1).toString());
        txbSoTang.setText(tbKhu.getValueAt(tbKhu.getSelectedRow(),2).toString());
        txbSoCanTT.setText(tbKhu.getValueAt(tbKhu.getSelectedRow(),3).toString());
        txbDiaChi.setText(tbKhu.getValueAt(tbKhu.getSelectedRow(),4).toString());
        
    }//GEN-LAST:event_tbKhuMouseClicked

    private void btSua_KhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSua_KhuActionPerformed
        
        if(txbTenKhu.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Tên khu không được bỏ trống!");
        }else if(txbDiaChi.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Địa chỉ không được bỏ trống!");
        }else{
            if(KhuCanHoBLL.update(cbbMaKhu.getSelectedItem().toString(),txbTenKhu.getText(),txbDiaChi.getText())){
                show_KhuCanHo();
                JOptionPane.showMessageDialog(null,"Sửa thành công!");
            }else{
                JOptionPane.showMessageDialog(null,"Không sửa được!");
            }
        }
  
    }//GEN-LAST:event_btSua_KhuActionPerformed

    private void btXoa_KhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoa_KhuActionPerformed
        
        Object[] items = {"Có, tôi muốn xóa!","Không!"};
        int rs = JOptionPane.showOptionDialog(null,"Xóa khu và tất cả thông tin có liên quan?","Xóa khu",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, items,items[0]);
        if(rs==JOptionPane.YES_OPTION){
            
            if(KhuCanHoBLL.delete(cbbMaKhu.getSelectedItem().toString())){
                show_KhuCanHo();
                show_CanHo();
                JOptionPane.showMessageDialog(null, "Xóa thành công!");
            }else{
                JOptionPane.showMessageDialog(null, "Không xóa được!");
            }
        }
        
    }//GEN-LAST:event_btXoa_KhuActionPerformed

    private void tbCanHoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCanHoMouseClicked
       
        cbbMaCanHo.setSelectedItem(tbCanHo.getValueAt(tbCanHo.getSelectedRow(), 0));
        txbDienTich.setText((tbCanHo.getValueAt(tbCanHo.getSelectedRow(), 1).toString()));
        txbGia.setText((tbCanHo.getValueAt(tbCanHo.getSelectedRow(), 2).toString()));
        txbSoPhong.setText((tbCanHo.getValueAt(tbCanHo.getSelectedRow(), 4).toString()));
        if((tbCanHo.getValueAt(tbCanHo.getSelectedRow(), 5))==null){
            txbMaCuDan.setText("**********");
        }else{
            txbMaCuDan.setText((tbCanHo.getValueAt(tbCanHo.getSelectedRow(), 5).toString()));
        }
        txbMaKhu.setText((tbCanHo.getValueAt(tbCanHo.getSelectedRow(), 6).toString()));
        
    }//GEN-LAST:event_tbCanHoMouseClicked

    private void btSua_CanHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSua_CanHoActionPerformed
        
 
        try{
            
            if(txbGia.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Giá không được bỏ trống!");
            }else if(Long.parseLong(txbGia.getText())<1){
                JOptionPane.showMessageDialog(null,"Vui lòng giá là số dương!");
            }else if(txbSoPhong.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Số phòng không được bỏ trống");
            }else if(Integer.parseInt(txbSoPhong.getText())<1){
                JOptionPane.showMessageDialog(null,"Vui lòng số phòng là số dương!");
            }else{
                 boolean check = CanHoBLL.update(cbbMaCanHo.getSelectedItem().toString(),Long.parseLong(txbGia.getText()),Integer.parseInt(txbSoPhong.getText()));
        
                if(check){
                    show_CanHo();
                    JOptionPane.showMessageDialog(null,"Sửa thành công!");
                }else{
                    JOptionPane.showMessageDialog(null, "Không sửa được!");
                }
            }
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Vui lòng nhập đúng định dạng số");
        }
         
        
    }//GEN-LAST:event_btSua_CanHoActionPerformed

    private void txbTimKiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbTimKiem1ActionPerformed
       //JOptionPane.showMessageDialog(rootPane,"Changed!");//khi nhấn enter
        try {
            tbKhu.setModel(KhuCanHoBLL.search(txbTimKiem1.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txbTimKiem1ActionPerformed

    private void btTim_KhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTim_KhuActionPerformed
       //JOptionPane.showMessageDialog(rootPane,"Changed!");//khi nhấn enter
        try {
            tbKhu.setModel(KhuCanHoBLL.search(txbTimKiem1.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btTim_KhuActionPerformed

    private void btTim_CanHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTim_CanHoActionPerformed
        tbCanHo.setModel(CanHoBLL.search(txbTimKiem2.getText()));
    }//GEN-LAST:event_btTim_CanHoActionPerformed

    private void txbTimKiem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbTimKiem2ActionPerformed
        tbCanHo.setModel(CanHoBLL.search(txbTimKiem2.getText()));
    }//GEN-LAST:event_txbTimKiem2ActionPerformed

    private void tbTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTaiKhoanMouseClicked

        txbTenTK_NV.setText((tbTaiKhoan.getValueAt(tbTaiKhoan.getSelectedRow(),0)).toString());
        txbMK_NV.setText((tbTaiKhoan.getValueAt(tbTaiKhoan.getSelectedRow(),1)).toString());

    }//GEN-LAST:event_tbTaiKhoanMouseClicked

    private void btXoa_NVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoa_NVActionPerformed
       if(txbTenTK_NV.getText().length()>25 && txbTenTK_NV.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Chọn dòng trước khi xóa!");
        }else{
            if(TaiKhoanBLL.delete(txbTenTK_NV.getText())){
               show_TaiKhoan();
               JOptionPane.showMessageDialog(null,"Xóa thành công!");
            }else{
                JOptionPane.showMessageDialog(null,"Không xóađược!");
            }
        }
    }//GEN-LAST:event_btXoa_NVActionPerformed

    private void btSua_NVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSua_NVActionPerformed
        if(txbTenTK_NV.getText().length()>25){
            JOptionPane.showMessageDialog(null,"Tên tài khoản quá dài!");
        }else if(txbTenTK_NV.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Tên tài khoản trống!");
        }else if(txbMK_NV.getText().length()>16){
            JOptionPane.showMessageDialog(null,"Mật khẩu quá dài!");
        }else if(txbMK_NV.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Mật khẩu trống!");
        }else{
            if(TaiKhoanBLL.update(txbTenTK_NV.getText(),txbMK_NV.getText())){
                  show_TaiKhoan();
                  JOptionPane.showMessageDialog(null,"Sửa thành công!");
            }else{
                JOptionPane.showMessageDialog(null,"Không sửa được!");
            }
        }
    }//GEN-LAST:event_btSua_NVActionPerformed

    private void btSua_QLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSua_QLActionPerformed
        if(txbMK_QL.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Mật khẩu trống!");
        }else if(txbMK_QL.getText().length()>16){
            JOptionPane.showMessageDialog(null,"Mật khẩu quá dài");
        }else{
            if(TaiKhoanBLL.update(txbTenTK_QL.getText(),txbMK_QL.getText())){
                JOptionPane.showMessageDialog(null,"Sửa thành công!");
            }else{
                JOptionPane.showMessageDialog(null,"Không sửa được!");
            }
        }
    }//GEN-LAST:event_btSua_QLActionPerformed

    private void btThem_NVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThem_NVActionPerformed
        
        try{
            if(txbTenTK_NV.getText().length()>25){
                JOptionPane.showMessageDialog(null,"Tên tài khoản quá dài!");
            }else if(txbTenTK_NV.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Tên tài khoản trống!");
            }else if(txbMK_NV.getText().length()>16){
                JOptionPane.showMessageDialog(null,"Mật khẩu quá dài!");
            }else if(txbMK_NV.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Mật khẩu trống!");
            }else{
            if(TaiKhoanBLL.insert(txbTenTK_NV.getText(),txbMK_NV.getText())){
                  show_TaiKhoan();
                  JOptionPane.showMessageDialog(null,"Thêm thành công!");
            }else{
                  JOptionPane.showMessageDialog(null,"Không thêm được!");
            }
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Vui lòng không nhập mã trùng!");
        }
        
          
    }//GEN-LAST:event_btThem_NVActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new QuanLyGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDangXuat;
    private javax.swing.JButton btSua_CanHo;
    private javax.swing.JButton btSua_Khu;
    private javax.swing.JButton btSua_NV;
    private javax.swing.JButton btSua_QL;
    private javax.swing.JButton btThem_Khu;
    private javax.swing.JButton btThem_NV;
    private javax.swing.JButton btTim_CanHo;
    private javax.swing.JButton btTim_Khu;
    private javax.swing.JButton btXoa_Khu;
    private javax.swing.JButton btXoa_NV;
    private javax.swing.JCheckBox cbTrangThai;
    private javax.swing.JComboBox<String> cbbMaCanHo;
    private javax.swing.JComboBox<String> cbbMaKhu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tbCanHo;
    private javax.swing.JTable tbKhu;
    private javax.swing.JTable tbTaiKhoan;
    private javax.swing.JTextField txbDiaChi;
    private javax.swing.JTextField txbDienTich;
    private javax.swing.JTextField txbGia;
    private javax.swing.JTextField txbMK_NV;
    private javax.swing.JTextField txbMK_QL;
    private javax.swing.JTextField txbMaCuDan;
    private javax.swing.JTextField txbMaKhu;
    private javax.swing.JTextField txbSoCanTT;
    private javax.swing.JTextField txbSoPhong;
    private javax.swing.JTextField txbSoTang;
    private javax.swing.JTextField txbTenKhu;
    private javax.swing.JTextField txbTenTK_NV;
    private javax.swing.JTextField txbTenTK_QL;
    private javax.swing.JTextField txbTimKiem1;
    private javax.swing.JTextField txbTimKiem2;
    // End of variables declaration//GEN-END:variables
}
