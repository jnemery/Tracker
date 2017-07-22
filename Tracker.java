
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tracker extends javax.swing.JFrame {

    /**
     * Creates new form Tracker
     */
    public Tracker() {
        getBMR();
    }

    private void getBMR() {

        firstPanel = new javax.swing.JPanel();
        labelWeight = new javax.swing.JLabel();
        textWeight = new javax.swing.JTextField();
        labelHeight = new javax.swing.JLabel();
        textHeight = new javax.swing.JTextField();
        labelAge = new javax.swing.JLabel();
        textAge = new javax.swing.JTextField();
        bmrBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        labelWeight.setText("Weight (lb): ");

        labelHeight.setText("Height (in): ");

        labelAge.setText("Age (yr): ");

        bmrBtn.setText("Submit");
        bmrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmrBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout firstPanelLayout = new javax.swing.GroupLayout(firstPanel);
        firstPanel.setLayout(firstPanelLayout);
        firstPanelLayout.setHorizontalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelWeight)
                    .addComponent(labelHeight)
                    .addComponent(labelAge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textWeight)
                    .addComponent(textHeight)
                    .addComponent(textAge, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(bmrBtn)
                .addGap(0, 65, Short.MAX_VALUE))
        );
        firstPanelLayout.setVerticalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWeight)
                    .addComponent(textWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHeight)
                    .addComponent(textHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAge)
                    .addComponent(textAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bmrBtn))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }


    /**
    *   This is the method that is called when an action is performed.
    *   Over here I just simply show an error message if any of the text fields are empty or just show their names.
    */
    private void bmrBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String weight = textWeight.getText();
        String height = textHeight.getText();
        String age = textAge.getText();

        if("".equals(weight) || "".equals(height) || "".equals(age)){
            JOptionPane.showMessageDialog(this, "Fill all boxes out!", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Weight: "+ weight +"\nHeight: " + height + "\nAge: " + age , "Correct Input", JOptionPane.PLAIN_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tracker().setVisible(true);
            }
        });
    }

    private javax.swing.JButton bmrBtn;
    private javax.swing.JLabel labelHeight;
    private javax.swing.JLabel labelWeight;
    private javax.swing.JLabel labelAge;
    private javax.swing.JPanel firstPanel;
    private javax.swing.JTextField textWeight;
    private javax.swing.JTextField textHeight;
    private javax.swing.JTextField textAge;

}