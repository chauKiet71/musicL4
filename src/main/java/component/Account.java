package component;

import entity.AccountData;
import entity.NguoiDung;
import form.Signup;
import javax.swing.ImageIcon;
import model.Model_Account;

public class Account extends javax.swing.JPanel {

    public Account() {
        initComponents();
        init();
    }

    public void init() {
        String name = AccountData.getTenTK();
        String link = AccountData.getLink();
        ImageIcon icon = new ImageIcon(link);
        listAccount1.addItem(new Model_Account(name, icon));
//        listAccount1.addItem(new Model_Account(name, new ImageIcon(getClass().getResource("/icon/avartar.jpg"))));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listAccount1 = new component.ListAccount<>();

        listAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listAccount1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(listAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(listAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listAccount1MouseClicked

    }//GEN-LAST:event_listAccount1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.ListAccount<String> listAccount1;
    // End of variables declaration//GEN-END:variables
}
