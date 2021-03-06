/*
 * Nicole Tao
 * FastFood.java
 * This program will calculate the price and change at a fast food restaurant
 * March 18th, 2018
 */
package FastFood;

/**
 *
 * @author Nicole
 */
import java.text.DecimalFormat;
public class FastFood extends javax.swing.JFrame {

    /**
     * Creates new form FastFood
     */
    public FastFood() {
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

        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelBurger = new javax.swing.JLabel();
        textBurgers = new javax.swing.JTextField();
        labelFries = new javax.swing.JLabel();
        textFries = new javax.swing.JTextField();
        labelDrinks = new javax.swing.JLabel();
        textDrink = new javax.swing.JTextField();
        labelBefore = new javax.swing.JLabel();
        labelBefore2 = new javax.swing.JLabel();
        labelTax = new javax.swing.JLabel();
        labelTax2 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        labelTotal2 = new javax.swing.JLabel();
        labelTendered = new javax.swing.JLabel();
        textMoney = new javax.swing.JTextField();
        labelChange = new javax.swing.JLabel();
        labelChange2 = new javax.swing.JLabel();
        buttonCalc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTitle.setText("Order Application");

        labelBurger.setText("Enter the number of burgers:");

        textBurgers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBurgersActionPerformed(evt);
            }
        });

        labelFries.setText("Enter the number of fries:");

        labelDrinks.setText("Enter the number of soft drinks:");

        labelBefore.setText("Total before taxes:");

        labelBefore2.setBackground(new java.awt.Color(255, 255, 255));
        labelBefore2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelBefore2.setOpaque(true);

        labelTax.setText("Tax:");

        labelTax2.setBackground(new java.awt.Color(255, 255, 255));
        labelTax2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelTax2.setOpaque(true);

        labelTotal.setText("Total:");

        labelTotal2.setBackground(new java.awt.Color(255, 255, 255));
        labelTotal2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelTotal2.setOpaque(true);

        labelTendered.setText("Enter amount tendered:");

        labelChange.setText("Change:");

        labelChange2.setBackground(new java.awt.Color(255, 255, 255));
        labelChange2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelChange2.setOpaque(true);

        buttonCalc.setText("Calculate");
        buttonCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(labelTitle)
                        .addGap(31, 31, 31)
                        .addComponent(buttonCalc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelBurger)
                            .addComponent(labelFries)
                            .addComponent(labelDrinks)
                            .addComponent(labelBefore)
                            .addComponent(labelTax)
                            .addComponent(labelTotal)
                            .addComponent(labelTendered)
                            .addComponent(labelChange))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textBurgers, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(textFries)
                            .addComponent(textDrink)
                            .addComponent(labelBefore2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTax2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTotal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textMoney)
                            .addComponent(labelChange2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitle)
                    .addComponent(buttonCalc))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBurger)
                    .addComponent(textBurgers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFries)
                    .addComponent(textFries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDrinks)
                    .addComponent(textDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBefore)
                    .addComponent(labelBefore2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTax)
                    .addComponent(labelTax2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotal)
                    .addComponent(labelTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(labelTendered))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelChange)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(labelChange2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textBurgersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBurgersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBurgersActionPerformed

    private void buttonCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcActionPerformed
        double burgers, fries, drinks, money, totalBefore, tax, total, change;
        
        //This converts String values to Double values
        burgers = Double.parseDouble(textBurgers.getText());
        fries = Double.parseDouble(textFries.getText());
        drinks = Double.parseDouble(textDrink.getText());
        money = Double.parseDouble(textMoney.getText());
        
        //This calculate the price of each item
        totalBefore = burgers*2.49 + fries*1.89 + drinks*0.99;
        tax = totalBefore*0.13;
        total = totalBefore + tax;
        change = money - total;
        
        //Decimal format for the prices
        DecimalFormat x = new DecimalFormat ("$###.00");
        
        //This codes what will apprear on the output labels, calclations will display in decimal format
        labelBefore2.setText(x.format(totalBefore));
        labelTax2.setText(x.format (tax));
        labelTotal2.setText(x.format(total));
        labelChange2.setText(x.format(change));
    }//GEN-LAST:event_buttonCalcActionPerformed

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
            java.util.logging.Logger.getLogger(FastFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBefore;
    private javax.swing.JLabel labelBefore2;
    private javax.swing.JLabel labelBurger;
    private javax.swing.JLabel labelChange;
    private javax.swing.JLabel labelChange2;
    private javax.swing.JLabel labelDrinks;
    private javax.swing.JLabel labelFries;
    private javax.swing.JLabel labelTax;
    private javax.swing.JLabel labelTax2;
    private javax.swing.JLabel labelTendered;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelTotal2;
    private javax.swing.JTextField textBurgers;
    private javax.swing.JTextField textDrink;
    private javax.swing.JTextField textFries;
    private javax.swing.JTextField textMoney;
    // End of variables declaration//GEN-END:variables
}
