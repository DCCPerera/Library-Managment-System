/* 
    GROUP MEMBERS

    PS/2017/208
    PS/2017/186
    PS/2017/173
    PS/2017/143
    PS/2017/070

*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoshitha
 */
public class RecieveBook extends javax.swing.JFrame {

    /**
     * Creates new form RecieveBook
     */
    public RecieveBook() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RStuno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Rbookno = new javax.swing.JTextField();
        rduedate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Recievebook = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Return Books");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 13, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 84, -1, -1));
        jPanel1.add(RStuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 81, 293, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Serial Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 129, -1, -1));
        jPanel1.add(Rbookno, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 129, 293, -1));
        jPanel1.add(rduedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 178, 293, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Return Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 181, -1, -1));

        Recievebook.setText("Recieve");
        Recievebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecievebookActionPerformed(evt);
            }
        });
        jPanel1.add(Recievebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 245, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WhatsApp Image 2021-02-05 at 13.26.53.jpeg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 610, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
        public Scanner y;
    public Scanner stu;
    public String serialNumber;
    public String title;
    public String author;
    public String genre;
    public String placement;
    public int borrowed;
    public String borrower;
    public String dueDate;
    public String userName;
    public String id;
    public String userPass;
    public String email;
    public String changedSerial;
    public String changedTitle;
    public String changedAuthor;
    public String changedGenre;
    public String changedPlacement;
    public String changedBorrower;
    public String changedDate;
    public String bookBorrowed;
    public String updatedID;
    public String updatedUserPass;
    public String updatedEmail;
    public String updatedName;
    public String serialIssue;

    public void AssigningTheBookRecords()
    {
        try {
            y = new Scanner(new File("book.txt"));
        }
        catch (FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"An error occurred");
        }

        while (y.hasNext()) {
            serialNumber = y.next();
            title=y.next();
            author = y.next();
            genre=y.next();
            placement=y.next();
            borrowed=y.nextInt();
            borrower=y.next();
            dueDate=y.next();

            if ( serialNumber.equals(serialIssue))
            {
                changedSerial=serialNumber;
                changedTitle=title;
                changedAuthor=author;
                changedGenre=genre;
                changedPlacement=placement;
                break;
            }
        }
        if("NA".equals(borrower))
        {
            JOptionPane.showMessageDialog(null,"The book hasn't been borrowed. Please check again.");
            System.exit(1);
            // Exit from the rest
        }
        //System.out.println(changedSerial+"\t"+changedTitle+"\t"+changedAuthor+"\t"+changedGenre+"\t"+changedPlacement);

    }


    public void closeFile ()
    {
        y.close();
    }

    public void AssigningTheStudentRecords()
    {
        try {
            stu = new Scanner(new File("student.txt"));
        }
        catch (FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"An error occurred");
        }

        while (stu.hasNext()) {
            id = stu.next();
            userPass=stu.next();
            email = stu.next();
            userName=stu.next();
            bookBorrowed=stu.next();

            if ( id.equals(changedBorrower))
            {
                updatedID=id;
                updatedUserPass=userPass;
                updatedEmail=email;
                updatedName=userName;
                break;
            }
        }
        //System.out.println(updatedID+"\t"+updatedUserPass+"\t"+updatedEmail+"\t"+updatedName);
    if("NA".equals(bookBorrowed))
    {
        JOptionPane.showMessageDialog(null,"The student has not borrowed a book.");
        System.exit(1);
        //Exit from the rest
    }
    }
    
    public void closeStuFile ()
    {
        stu.close();
    }

    public void DeleteEntry(String file,String removeTerm)
    {
        try {
            File inputFile = new File(file);
            File tempFile = new File("myTempFile.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            String lineToRemove = removeTerm;
           // System.out.println(removeTerm);
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                String trimmedLine = currentLine.trim();
                if (trimmedLine.contains(lineToRemove)) continue;
                writer.write(currentLine + System.getProperty("line.separator"));
            }

            writer.close();
            reader.close();
            boolean del=inputFile.delete();
           // System.out.println(del);
            boolean successful=tempFile.renameTo(inputFile);
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null,"An error occurred.");
            e.printStackTrace();
        }
    }
    public void reWriteRecord()
    {
        try{
            File file=new File("book.txt");
            FileWriter fileWriter=new FileWriter(file,true);
            fileWriter.write(changedSerial+"\t"+changedTitle+"\t"+changedAuthor+"\t"+changedGenre+"\t"+changedPlacement+"\t"+0+"\t"+"NA"+"\t"+"NA");
            fileWriter.close();}
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null,"An error occurred.");
            e.printStackTrace();
        }
    }
    public void reWriteStuRecord()
    {
        try{
            File f1=new File("student.txt");
            FileWriter fileWriter=new FileWriter(f1,true);
            fileWriter.write(updatedID+"\t"+updatedUserPass+"\t"+updatedEmail+"\t"+updatedName+"\t"+"NA");
            fileWriter.close();}
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null,"An error occurred.");
            e.printStackTrace();
        }
    }
    

    
    
    private void RecievebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecievebookActionPerformed
        // TODO add your handling code here:
        
        RecieveBook RB = new RecieveBook();
        RB.changedBorrower = RStuno.getText();
        RB.serialIssue = Rbookno.getText();
        RB.changedDate = rduedate.getText();
        
            RB.AssigningTheBookRecords();
            RB.closeFile();
            RB.DeleteEntry("book.txt",RB.serialIssue);
            RB.reWriteRecord();
            RB.AssigningTheStudentRecords();
            RB.closeStuFile();
            RB.DeleteEntry("student.txt",RB.changedBorrower);
            RB.reWriteStuRecord();
    }//GEN-LAST:event_RecievebookActionPerformed

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
            java.util.logging.Logger.getLogger(RecieveBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecieveBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecieveBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecieveBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecieveBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RStuno;
    private javax.swing.JTextField Rbookno;
    private javax.swing.JButton Recievebook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField rduedate;
    // End of variables declaration//GEN-END:variables
}
