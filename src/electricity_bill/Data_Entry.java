/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricity_bill;
import javax.swing.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.print.Printable;



/**
 *
 * @author hanesh
 */
public class Data_Entry extends javax.swing.JFrame {

    /**
     * Creates new form Data_Entry
     */

    
   

    
    int totalunitfare;
    void perunitfare(){
        int perunitcharge;
        int prevunit;
        int currentunit;
        //
        perunitcharge=Integer.parseInt(jperunitchar.getText());
        prevunit=Integer.parseInt(jpreunit.getText());
        currentunit=Integer.parseInt(jcurunit.getText());
        
        totalunitfare=(currentunit-prevunit)*perunitcharge;
    }
    

    
    void totalamount(){
        int perunitcharge;
        int prevunit;
        int currentunit;
        //
        perunitcharge=Integer.parseInt(jperunitchar.getText());
        prevunit=Integer.parseInt(jpreunit.getText());
        currentunit=Integer.parseInt(jcurunit.getText());
        int additionalfare;
        additionalfare=Integer.parseInt(jadditionalchr.getText());
        int total=additionalfare+totalunitfare;
      
        String total1=""+total;
        jtotalfare.setText(total1);
       
    }
    
    void date(){
         DateFormat datef=new SimpleDateFormat("dd-MM-YYYY");
         Date date=new Date();
         Calendar cal=Calendar.getInstance();
         jLabel12.setText(datef.format(date));
    }
    
    public void Cid(){
       Connection conn;
        try{
            String url="jdbc:mysql://localhost:3306/electricity_bill";
            String user="root";
            String pass="hanesh@iyer555";
            conn=DriverManager.getConnection(url,user,pass);
            String sql="SELECT MAX(id) FROM rent_details";
            Statement stm = conn.createStatement();
            ResultSet rs=stm.executeQuery(sql);
            rs.next();
            rs.getString("MAX(id)");
            if (rs.getString("MAX(id)") == null) {
                txtid.setText("C-0000001");    
            } else {
                long id = Long.parseLong(rs.getString("MAX(id)").substring(2, rs.getString("MAX(id)").length()));
                id++;
                txtid.setText("C-" + String.format("%07d", id));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }     
    
    }
    
    public void Bid(){
       Connection conn;
        try{
            String url="jdbc:mysql://localhost:3306/electricity_bill";
            String user="root";
            String pass="hanesh@iyer555";
            conn=DriverManager.getConnection(url,user,pass);
            String sql="SELECT MAX(B_id) FROM bill_details";
            Statement stm = conn.createStatement();
            ResultSet rs=stm.executeQuery(sql);
            rs.next();
            rs.getString("MAX(B_id)");
            if (rs.getString("MAX(B_id)") == null) {
                txtbid.setText("B-0000001");    
            } else {
                long bid = Long.parseLong(rs.getString("MAX(B_id)").substring(2, rs.getString("MAX(B_id)").length()));
                bid++;
                txtbid.setText("B-" + String.format("%07d", bid));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }     
    
    }
    
    
    public Data_Entry() {
        initComponents();
        date();   
        Cid();
        Bid();
       
    }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcname = new javax.swing.JTextField();
        jaddress = new javax.swing.JTextField();
        jpreunit = new javax.swing.JTextField();
        jcurunit = new javax.swing.JTextField();
        jperunitchar = new javax.swing.JTextField();
        jtotalunitfare = new javax.swing.JTextField();
        jadditionalchr = new javax.swing.JTextField();
        jphone = new javax.swing.JFormattedTextField();
        jtotalfare = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabelID = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtid = new javax.swing.JLabel();
        txtbid = new javax.swing.JLabel();
        jLabelID1 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JLabel();
        jLabelID2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(171, 219, 227));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Data Entry");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(230, 249, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jLabel2.setText("Customer Name");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jLabel3.setText("Address");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jLabel4.setText("Previous Unit");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jLabel5.setText("Current Unit");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jLabel6.setText("Per Unit Charge (Rs.)*");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jLabel7.setText("Unit Fare (Rs.)");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jLabel8.setText("Additional Charges (Rs.)*");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jLabel9.setText("Phone No.");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jLabel10.setText("Total Charge (All Include in Rs.)");

        jcname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcnameActionPerformed(evt);
            }
        });

        jaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddressActionPerformed(evt);
            }
        });

        jperunitchar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jperunitcharActionPerformed(evt);
            }
        });

        jtotalunitfare.setEditable(false);
        jtotalunitfare.setBackground(new java.awt.Color(255, 255, 255));
        jtotalunitfare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtotalunitfareActionPerformed(evt);
            }
        });

        try {
            jphone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jtotalfare.setEditable(false);
        jtotalfare.setBackground(new java.awt.Color(255, 255, 255));
        jtotalfare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtotalfareActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Show");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Generate Bill");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabelID.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabelID.setText("ID :");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));

        jButton6.setText("Calculate");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Calcuate");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel15.setText("Date");

        txtid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtid.setForeground(new java.awt.Color(51, 51, 255));
        txtid.setText("id");

        txtbid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbid.setForeground(new java.awt.Color(51, 51, 255));
        txtbid.setText("bid");

        jLabelID1.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabelID1.setText("BID :");

        txtstatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtstatus.setForeground(new java.awt.Color(51, 51, 255));
        txtstatus.setText("Pending");

        jLabelID2.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabelID2.setText("Status");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35)
                        .addComponent(jButton2)
                        .addGap(38, 38, 38)
                        .addComponent(jButton3)))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton5)
                        .addGap(41, 41, 41)
                        .addComponent(jButton4)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jphone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jadditionalchr, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtotalunitfare, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jperunitchar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcurunit, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpreunit, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jaddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtotalfare))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(146, 146, 146))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton6)
                                            .addComponent(jButton7)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabelID1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtbid))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtid)))))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabelID2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtstatus)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jcname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel14)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jpreunit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcurunit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jperunitchar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelID1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelID2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtstatus))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtotalunitfare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jadditionalchr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtotalfare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jButton3))
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(230, 249, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("ELECTRICITY BILL");

        jButton9.setText("PRINT");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(243, 243, 243))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jperunitcharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jperunitcharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jperunitcharActionPerformed

    private void jtotalunitfareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtotalunitfareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtotalunitfareActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Search_In_Table shobj=new Search_In_Table();
        shobj.setVisible(true);
        shobj.setDefaultCloseOperation(HIDE_ON_CLOSE);
        //dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setBackground(new Color(255,0,4));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jButton3.setBackground(Color.white);
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jcname.setText(null);
        jaddress.setText(null);
        jtotalfare.setText(null);
        jpreunit.setText(null);
        jcurunit.setText(null);
        jperunitchar.setText(null);
        jtotalunitfare.setText(null);
        jadditionalchr.setText(null);
        jphone.setText(null);
        jtotalfare.setText(null);
                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(new Color(0,117,255));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(Color.white);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        jButton4.setBackground(new Color(0,82,179));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        jButton4.setBackground(Color.white);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
        jButton5.setBackground(new Color(0, 153, 0));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
         jButton5.setBackground(Color.white);
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
         jButton2.setBackground(Color.white);
    }//GEN-LAST:event_jButton2MouseExited

    private void jtotalfareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtotalfareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtotalfareActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         // TODO add your handling code here:
//        Generate_Slip gsobj=new Generate_Slip();
//        JLabel jb=new JLabel("Your Electricity Bill");
           String id =txtid.getText();
           String bid=txtbid.getText();
           String datesq=jLabel12.getText();
           String cname=jcname.getText();
           String address=jaddress.getText();
           String previousu=jpreunit.getText();
           String currentu=jcurunit.getText();
           String prunch=jperunitchar.getText();
           String totalunfare=jtotalunitfare.getText();
           String addchar=jadditionalchr.getText();
           String phone=jphone.getText();
           String totalamount=jtotalfare.getText();
           jTextArea1.append("\nCustomer ID:"+id+"\nBill ID:"+bid+"\nCustomer Name:"+cname+"\nDate:"+datesq+"\nAddress:"+address+"\nPrev Unit:"+previousu+"\nCurr Unit:"+currentu+"\nUnit Fare:"+prunch+"\nTotal U.F:"+totalunfare+"\nAdd Chrgs:"+addchar+"\nTotal Bill:"
                +totalamount+"\nP.No:"+phone);
          
//        jb.setBounds(30, 50, 200, 50);
//        gsobj.setTitle("Generate Slip");
//        gsobj.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        gsobj.getContentPane().setBackground(Color.white);
//        gsobj.add(jb);
//        gsobj.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection conn;
        PreparedStatement stm;
        try{
            String url="jdbc:mysql://localhost:3306/electricity_bill";
            String user="root";
            String pass="hanesh@iyer555";
            conn=DriverManager.getConnection(url,user,pass);
           String id =txtid.getText();
           String datesq=jLabel12.getText();
           String cname=jcname.getText();
           String address=jaddress.getText();
           String previousu=jpreunit.getText();
           String currentu=jcurunit.getText();
           String prunch=jperunitchar.getText();
           String totalunfare=jtotalunitfare.getText();
           String addchar=jadditionalchr.getText();
           String phone=jphone.getText();
           String totalamount=jtotalfare.getText();
           String sql="INSERT INTO rent_details VALUES (?,?,?,?,?,?,?,?,?,?,?)";
           stm=conn.prepareStatement(sql);
           stm.setString(1, datesq);
           stm.setString(2, cname);
           stm.setString(3, address);
           stm.setString(4, previousu);
           stm.setString(5, currentu);
           stm.setString(6, prunch);
           stm.setString(7, totalunfare);
           stm.setString(8, addchar);
           stm.setString(9, totalamount);
           stm.setString(10, phone);
           stm.setString(11, id);
           if(stm.executeUpdate()>0){
           JOptionPane.showMessageDialog(this, "Update Sucess");
           } 
           else{
               JOptionPane.showMessageDialog(this, "Something went wrong");
           }
        }catch(Exception ex){
            System.out.println("Error is "+ex.getMessage());
        }
        
        
        
        try{
            String url="jdbc:mysql://localhost:3306/electricity_bill";
            String user="root";
            String pass="hanesh@iyer555";
            conn=DriverManager.getConnection(url,user,pass);
           String bid =txtbid.getText();
           String totalamount=jtotalfare.getText();
           String status=txtstatus.getText();
           String sql="INSERT INTO bill_details VALUES (?,?,?)";
           stm=conn.prepareStatement(sql);
           stm.setString(1, bid);
           stm.setString(2, totalamount);
           stm.setString(3, status);
           
           if(stm.executeUpdate()>0){
           JOptionPane.showMessageDialog(this, "Update Sucess");
           } 
           else{
               JOptionPane.showMessageDialog(this, "Something went wrong");
           }
        }catch(Exception ex){
            System.out.println("Error is "+ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setBackground(new Color(179, 119, 0));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(jperunitchar.equals(null) && jpreunit.equals(null) && jcurunit.equals(null)){
            JOptionPane.showMessageDialog(this, "Fill the Essential Field first");
        }
        else{int perunitcharge;
        int prevunit;
        int currentunit;
        perunitcharge=Integer.parseInt(jperunitchar.getText());
        prevunit=Integer.parseInt(jpreunit.getText());
        currentunit=Integer.parseInt(jcurunit.getText());
        totalunitfare=(currentunit-prevunit)*perunitcharge;
        jtotalunitfare.setText(" "+totalunitfare+" Rs.");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int perunitcharge;
        int prevunit;
        int currentunit;
        //
        perunitcharge=Integer.parseInt(jperunitchar.getText());
        prevunit=Integer.parseInt(jpreunit.getText());
        currentunit=Integer.parseInt(jcurunit.getText());
        int additionalfare;
        additionalfare=Integer.parseInt(jadditionalchr.getText());
        int total=additionalfare+totalunitfare;
        //parseInt(jtotalfare.setText(total));Integer.
        //String total1=""+total;
        jtotalfare.setText(total+" Rs."); 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jaddressActionPerformed

    private void jcnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcnameActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        String printData=jTextArea1.getText();
        PrinterJob job=PrinterJob.getPrinterJob();
        boolean doPrint=job.printDialog();
        if (doPrint)
        {
            try{
                job.print();
            }
            
            catch (PrinterException e)
            {
                //print job not complete
            }
        }
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Data_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Entry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelID1;
    private javax.swing.JLabel jLabelID2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jadditionalchr;
    private javax.swing.JTextField jaddress;
    private javax.swing.JTextField jcname;
    private javax.swing.JTextField jcurunit;
    private javax.swing.JTextField jperunitchar;
    private javax.swing.JFormattedTextField jphone;
    private javax.swing.JTextField jpreunit;
    private javax.swing.JTextField jtotalfare;
    private javax.swing.JTextField jtotalunitfare;
    private javax.swing.JLabel txtbid;
    private javax.swing.JLabel txtid;
    private javax.swing.JLabel txtstatus;
    // End of variables declaration//GEN-END:variables
}
