package library;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author AMIT TIWARI
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
        forgetpass.setVisible(false);
        change.setVisible(false);
        jLabel13.setVisible(false);
        im.setVisible(true);
        ImageIcon img = new ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\adminlogin.JPG");
        Image img2 = img.getImage().getScaledInstance(l1.getWidth(), l1.getHeight(), 1);
        ImageIcon img3 = new ImageIcon(img2);
        l1.setIcon(img3);
       
        ImageIcon img11 = new ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\ccc.png");
        Image img22 = img11.getImage().getScaledInstance(l1.getWidth(), l1.getHeight(), 1);
        ImageIcon img33 = new ImageIcon(img22);
        im.setIcon(img33);
       
        
        
        setIcon();
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
        jLabel10 = new javax.swing.JLabel();
        adminlogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JPasswordField();
        forgetpass = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        adminlogin1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        im = new javax.swing.JLabel();
        change = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ct1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ct2 = new javax.swing.JPasswordField();
        ct3 = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ans = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Goverment Polytechnic Saharanpur");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(62, 178, 159));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 0));
        jLabel10.setText("Admin Login & Librarian Login");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 510, 40));

        adminlogin.setBackground(new java.awt.Color(255, 255, 255));
        adminlogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Librarian Login", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        adminlogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Username");
        adminlogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 20));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Password");
        adminlogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 20));

        t1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        adminlogin.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 200, 40));

        t2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2KeyPressed(evt);
            }
        });
        adminlogin.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 200, 40));

        forgetpass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        forgetpass.setText("Forget Password");
        forgetpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgetpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgetpassMouseClicked(evt);
            }
        });
        adminlogin.add(forgetpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\gifbook.gif")); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 70, 50));

        adminlogin.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 70, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\login.png")); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        adminlogin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 100, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\Reset.png")); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        adminlogin.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 100, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\back.png")); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        adminlogin.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 50, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\lib.jpg")); // NOI18N
        adminlogin.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 130));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Librarian Login");
        adminlogin.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 250, 50));

        jPanel1.add(adminlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 410, 400));

        adminlogin1.setBackground(new java.awt.Color(255, 255, 255));
        adminlogin1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin Login", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        adminlogin1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Username");
        adminlogin1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        adminlogin1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 390, 150));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Password");
        adminlogin1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\gifbook.gif")); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 70, 50));

        adminlogin1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 70, 50));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\login.png")); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        adminlogin1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 100, 40));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\Reset.png")); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        adminlogin1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 100, 30));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMIT TIWARI\\Documents\\NetBeansProjects\\gpslib\\src\\library\\back.png")); // NOI18N
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setFocusPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        adminlogin1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 50, 50));
        adminlogin1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 390, 120));

        t3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        adminlogin1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 200, 40));

        t4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        adminlogin1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 200, 40));

        jPanel1.add(adminlogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 170, 410, 400));

        jLabel13.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Change Password");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        jLabel14.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("LIBRARIAN LOGIN");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ADMIN LOGIN");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 100, -1, -1));
        jPanel1.add(im, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 420, 280));

        change.setBackground(new java.awt.Color(0, 153, 153));
        change.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change Password", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N
        change.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        change.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        close.setForeground(new java.awt.Color(255, 51, 51));
        close.setText("X");
        close.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                closeMouseDragged(evt);
            }
        });
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
        });
        change.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 20, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Answer");
        change.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        ct1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        change.add(ct1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 200, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("New Password");
        change.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Conform Password");
        change.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        ct2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        change.add(ct2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 200, 40));

        ct3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        change.add(ct3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 200, 40));

        jButton4.setBackground(new java.awt.Color(102, 204, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Submit");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        change.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 100, 40));

        jButton5.setBackground(new java.awt.Color(255, 51, 0));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Clear");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        change.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 90, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Security Question");
        change.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        ans.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "What is Your Middle Name", "What is your first school name", "What is your mother name", "What is your  nike name" }));
        change.add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 200, 40));

        jPanel1.add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 430, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        t1.setText("");
        t2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username=t1.getText();
        String password=t2.getText();
        try
        {

            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try
        {
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","amit","54321");
            ps=con.prepareStatement("select libusername,password from adminreg where libusername='"+username+"' and password='"+password+"'");
            rs=ps.executeQuery();
            if(rs.next())

            {
                new gpslib3().setVisible(true);
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"wrong username or password !\n Please enter right username and password");
                t1.setText("");
                t2.setText("");
                forgetpass.setVisible(true);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new lib1().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
      change.setVisible(false);
      jLabel13.setVisible(false);
      im.setVisible(true);
    }//GEN-LAST:event_closeMouseClicked

    private void forgetpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetpassMouseClicked
         change.setVisible(true);
         jLabel13.setVisible(true);
         im.setVisible(false);
    }//GEN-LAST:event_forgetpassMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered

    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_closeMouseDragged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ct1.setText("");
        ct2.setText("");
        ct3.setText("");
        ans.setSelectedIndex(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
             String answer=ct1.getText();
             String pass=ct2.getText();
             String conpass=ct3.getText();
             int secqure=ans.getSelectedIndex();
        try
        {

            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        Connection con1=null;
        PreparedStatement ps1=null;
        ResultSet rs1=null;
        try
        {
             con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","amit","54321");
             ps1=con1.prepareStatement("update adminreg set password='"+pass+"' where secqure='"+secqure+"' and ans='"+answer+"'");
             rs1=ps1.executeQuery();
            if(rs1.next())
            {
                JOptionPane.showMessageDialog(null,"Password Changed Successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"wrong Secqurity Answer \n Please enter correct answer");
               ct1.setText("");
               ct2.setText("");
               ct3.setText("");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        
        }
                                          
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
         String username=t1.getText();
        String password=t2.getText();
        try
        {

            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try
        {
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","amit","54321");
            ps=con.prepareStatement("select libusername,password from adminreg where libusername='"+username+"' and password='"+password+"'");
            rs=ps.executeQuery();
            if(rs.next())

            {
                new gpslib3().setVisible(true);
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"wrong username or password !\n Please enter right username and password");
                t1.setText("");
                t2.setText("");
                forgetpass.setVisible(true);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_t2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String username=t3.getText();
        String password=t4.getText();
        if(username.equals("gps@123") && password.equals("gps247001$"))
        {
           new libadmin().setVisible(true);
           this.setVisible(false);
        }
        else
        {
         JOptionPane.showMessageDialog(null,"Username or Password are incorrect.\n please enter correct username and password!");
         t3.setText("");
         t4.setText("");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        t3.setText("");
        t4.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        new lib1().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
         String username=t3.getText();
        String password=t4.getText();
        if(username.equals("gps@123") && password.equals("gps247001$"))
        {
           new libadmin().setVisible(true);
           this.setVisible(false);
        }
        else
        {
         JOptionPane.showMessageDialog(null,"Username or Password are incorrect.\n please enter correct username and password!");
         t3.setText("");
         t4.setText("");
        }
    }//GEN-LAST:event_t4ActionPerformed

    private void t2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2KeyPressed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminlogin;
    private javax.swing.JPanel adminlogin1;
    private javax.swing.JComboBox<String> ans;
    private javax.swing.JPanel change;
    private javax.swing.JLabel close;
    private javax.swing.JTextField ct1;
    private javax.swing.JPasswordField ct2;
    private javax.swing.JPasswordField ct3;
    private javax.swing.JLabel forgetpass;
    private javax.swing.JLabel im;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JPasswordField t4;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("gpslogo.gif")));
    }
}
