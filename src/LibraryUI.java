/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcmaceac
 */
import java.net.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
public class LibraryUI extends JFrame {

    private static Connection conDB; 	//Connection to the database system.
    private static String url; 		//URL: Which database?
    
    private static int custID;
    private static String custName;
    private static String custCity;
    
    private static String category;
    private static String title;
    
    /**
     * Creates new form LibraryUI
     */
    public LibraryUI() {
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
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        catLabel = new javax.swing.JLabel();
        catComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        idErrorLabel = new javax.swing.JLabel();
        catErrorLabel = new javax.swing.JLabel();
        titleErrorLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("");

        idLabel.setText("Enter your customer ID:");

        catLabel.setText("Choose a category:");

        jLabel1.setText("Enter a book title:");

        idErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        catErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        titleErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        nextButton.setText("Search");
        nextButton.setMaximumSize(new java.awt.Dimension(75, 25));
        nextButton.setMinimumSize(new java.awt.Dimension(75, 25));
        nextButton.setPreferredSize(new java.awt.Dimension(75, 25));
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "Year", "Language", "Weight"
            }
        ));
        jScrollPane1.setViewportView(bookTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(idLabel)
                                .addGap(6, 6, 6)
                                .addComponent(idField, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42)
                                .addComponent(titleField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(catLabel)
                                .addGap(35, 35, 35)
                                .addComponent(catComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idErrorLabel)
                                    .addComponent(catErrorLabel)
                                    .addComponent(titleErrorLabel))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(idErrorLabel)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catLabel)
                    .addComponent(catComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(catErrorLabel)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleErrorLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        idErrorLabel.setText("");       //clearing possible previous errors
        catErrorLabel.setText("");
        titleErrorLabel.setText("");

        if (noErrorsFrame1()) {
            //All fields are good, display book in jtable
            
        }
        else {
            if (catComboBox.getSelectedIndex() <= 0) {
                catErrorLabel.setText("*Error! Please select a category.");
            }

            if (titleField.getText().trim().equals("")) {
                titleErrorLabel.setText("*Error! Title field is required.");
            }
            else if (!find_book(titleField.getText().trim())) {
                titleErrorLabel.setText("*Error! Book with that title for this category not found.");
            }

            if (idField.getText().trim().equals("")) {
                idErrorLabel.setText("*Error! ID field is required.");
            }
            else if (find_customer(Integer.parseInt(idField.getText())) == null) {
                idErrorLabel.setText("*Error! This ID was not found.");
            }
        }
    }//GEN-LAST:event_nextButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LibraryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //establishing the database connection
        try {
            Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance();
            url = "jdbc:db2:c3421m";
            conDB = DriverManager.getConnection(url);
        } 
        catch (Exception e) {
            System.out.println("main: " + e.toString());
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LibraryUI frame = new LibraryUI();
                frame.setVisible(true);
                frame.setTitle("EECS3421 Library");
                frame.fetch_categories();
            }
        });   
    }
    
    public void fetch_categories () {
        String queryText = "";
        PreparedStatement querySt = null;
        ResultSet answers = null;

        ArrayList<String> cats = new ArrayList<String>();

        queryText = 
                    "SELECT cat " +
                    "FROM yrb_category";

        try {
            querySt = conDB.prepareStatement (queryText);	
            answers = querySt.executeQuery();

            catComboBox.addItem("-- Select a Category --");
            while (answers.next()) {
                catComboBox.addItem(answers.getString("cat"));
            }
            answers.close();
            querySt.close();
        }
        catch (Exception e) {
            System.out.println("fetch_categories: " + e.toString());
        }
    }
    
    public boolean find_book (String t) {
        String queryText = "";
        PreparedStatement querySt = null;
        ResultSet answers = null;

        boolean inDB = false;

        String l_title;
        int year;
        String language;
        int weight;

        queryText = 
                    "SELECT title, year, language, weight " + 
                    "FROM yrb_book " + 
                    "WHERE cat = ? and title = ?";

        try {
            querySt = conDB.prepareStatement (queryText);
            querySt.setString(1, (String) catComboBox.getSelectedItem());
            querySt.setString(2, t);
            answers = querySt.executeQuery();

            while (answers.next()) {
                inDB = true;
                l_title = answers.getString("title");
                year = answers.getInt("year");
                language = answers.getString("language");
                weight = answers.getInt("weight");

                //System.out.println (l_title + " " + year + " " + language + " " + weight);
            }
            answers.close();
            querySt.close();
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        return inDB;
    }
    
    public Customer find_customer(int cid) {
        String queryText = "";
        PreparedStatement querySt = null;
        ResultSet answers = null;

        Customer c = null;

        queryText = 
                    "SELECT cid, name, city " +
                    "FROM yrb_customer " +
                    "WHERE cid = ?";

        try {
            querySt = conDB.prepareStatement (queryText);	
            querySt.setInt(1, cid);
            answers = querySt.executeQuery();

            if (answers.next()) {
                custID = answers.getInt("cid");
                custName = answers.getString("name");
                custCity = answers.getString("city");
                c = new Customer (custID, custName, custCity);
            }
            
            answers.close();
            querySt.close();
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        return c;
    }
    
    public boolean noErrorsFrame1() {
        //checks to see if there are errors in the first page
        boolean result = catComboBox.getSelectedIndex() > 0 &&
                         !titleField.getText().trim().equals("") &&
                         !idField.getText().trim().equals("") && 
                         find_customer(Integer.parseInt(idField.getText())) != null &&
                         find_book(titleField.getText());
                         
        return result;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookTable;
    private javax.swing.JComboBox catComboBox;
    private javax.swing.JLabel catErrorLabel;
    private javax.swing.JLabel catLabel;
    private javax.swing.JLabel idErrorLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel titleErrorLabel;
    private javax.swing.JTextField titleField;
    // End of variables declaration//GEN-END:variables
}
