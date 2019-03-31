/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author PhamDai
 */
public class ThemKhu_PhongGUI extends javax.swing.JFrame {

    /**
     * Creates new form ThemKhu_Phong
     */
    public ThemKhu_PhongGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txbMaKhu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txbTenKhu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txbSoTang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txbSoCanTT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txbDiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txbDienTich = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txbGia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txbSoPhong = new javax.swing.JTextField();
        btLuu = new javax.swing.JButton();
        btHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setText("Mã Khu");

        jLabel2.setText("Tên Khu");

        jLabel3.setText("Số Tầng");

        jLabel4.setText("Số căn/tầng");

        jLabel5.setText("Địa chỉ");

        jLabel6.setText("Diện Tích");

        jLabel7.setText("Giá");

        jLabel8.setText("Số Phòng");

        btLuu.setText("Lưu");
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
            }
        });

        btHuy.setText("Hủy");
        btHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(19, 19, 19))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txbSoCanTT, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(txbTenKhu)
                    .addComponent(txbMaKhu)
                    .addComponent(txbSoTang)
                    .addComponent(txbDiaChi))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)
                        .addComponent(txbDienTich))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(62, 62, 62)
                        .addComponent(txbGia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(btLuu))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(txbSoPhong))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btHuy)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txbSoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txbDienTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txbGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txbMaKhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txbTenKhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txbSoTang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txbSoCanTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txbDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLuu)
                    .addComponent(btHuy))
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyActionPerformed
       this.dispose();
    }//GEN-LAST:event_btHuyActionPerformed

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
 
        String maKhu;
        String tenKhu;
        int soTang;
        int soCanTT;
        String diaChi;
        float dienTich;
        long gia;
        int soPhong;
        
        //check mã khu
        if(txbMaKhu.getText().length()!=2){
            JOptionPane.showMessageDialog(null,"Mã khu 2 kí tự!");
        }else {
            maKhu = txbMaKhu.getText();
        }
        
        //check tên khu
        if(txbTenKhu.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Tên khu không được bỏ trống!");
        }else {
            tenKhu = txbTenKhu.getText();
        }
            
        //check địa chỉ   
        if(txbDiaChi.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Địa chỉ không được bỏ trống!");
        }else {
            diaChi = txbDiaChi.getText();
        }
        
        try{
            // check số tầng
            if(txbSoTang.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Số tầng không được bỏ trống!");
            }else{
                if(Integer.parseInt(txbSoTang.getText())<1){
                    JOptionPane.showMessageDialog(null,"Vui lòng nhập số tầng là số dương!");
                }else{
                    soTang = Integer.parseInt(txbSoTang.getText());
                }
            }
       
        // check số căn
            if(txbSoCanTT.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Số căn không được bỏ trống!");
            }else{
                 if(Integer.parseInt(txbSoCanTT.getText())<1){
                    JOptionPane.showMessageDialog(null,"Vui lòng nhập số căn là số dương!");
                }else{
                    soCanTT = Integer.parseInt(txbSoTang.getText());
                }
            }
        
        // check diện tích
            if(txbDienTich.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Diện tích không được bỏ trống!");
            }else{
                 if(Float.parseFloat(txbDienTich.getText())<1){
                    JOptionPane.showMessageDialog(null,"Vui lòng nhập diện tích là số dương!");
                }else{
                    dienTich = Float.parseFloat(txbDienTich.getText());
                }
            }

        //check giá
            if(txbGia.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Giá không được bỏ trống!");
            }else{
                 if(Long.parseLong(txbGia.getText())<1){
                    JOptionPane.showMessageDialog(null,"Vui lòng giá là số dương!");
                }else{
                    gia =  Long.parseLong(txbGia.getText());
                }
            }
        
        // check số phòng
            if(txbSoPhong.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Số phòng không được bỏ trống!");
            }else{
                 if( Integer.parseInt(txbSoPhong.getText())<1){
                    JOptionPane.showMessageDialog(null,"Vui lòng số phòng là số dương!");
                }else{
                    soPhong =  Integer.parseInt(txbSoPhong.getText());
                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Vui lòng nhập đúng định dạng số!");
        }
        
         //insert here
         
        
        
  
        
        
        
        
        
    }//GEN-LAST:event_btLuuActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThemKhu_PhongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemKhu_PhongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemKhu_PhongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemKhu_PhongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemKhu_PhongGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHuy;
    private javax.swing.JButton btLuu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txbDiaChi;
    private javax.swing.JTextField txbDienTich;
    private javax.swing.JTextField txbGia;
    private javax.swing.JTextField txbMaKhu;
    private javax.swing.JTextField txbSoCanTT;
    private javax.swing.JTextField txbSoPhong;
    private javax.swing.JTextField txbSoTang;
    private javax.swing.JTextField txbTenKhu;
    // End of variables declaration//GEN-END:variables
}
