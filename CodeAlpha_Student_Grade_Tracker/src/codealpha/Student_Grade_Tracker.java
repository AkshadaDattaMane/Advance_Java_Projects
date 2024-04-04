package codealpha;

import java.sql.*;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Student_Grade_Tracker {

    private JFrame frmStudentGradeTracker;
    private JTextField name;
    private JTextField roll_no;
    private JTextField prn;
    private JLabel lblPs;
    private JLabel lblAds;
    private JLabel lblRollNo_3;
    private JTextField ps;
    private JTextField ads;
    private JTextField toc;
    private JTextField dbms;
    private JTextField os;
    private JTextField itw;
    private JLabel lblDbms;
    private JLabel lblOs;
    private JLabel lblItw;
    private JLabel lblNewLabel_1;
    private JLabel lblTotalMarks;
    private JTextField total;
    private JLabel lblGrade;
    private JTextField grade;
    private JLabel lblPercentage;
    private JTextField percentage;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Student_Grade_Tracker window = new Student_Grade_Tracker();
                    window.frmStudentGradeTracker.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    
    public Student_Grade_Tracker() {
        initialize();
    }

    
    private void initialize() {
        frmStudentGradeTracker = new JFrame();
        frmStudentGradeTracker.setTitle("Student Grade Tracker");
        frmStudentGradeTracker.setBounds(100, 100, 847, 692);
        frmStudentGradeTracker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmStudentGradeTracker.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.setBounds(10, 10, 813, 635);
        frmStudentGradeTracker.getContentPane().add(panel);
        panel.setLayout(null);

        name = new JTextField();
        name.setBounds(171, 32, 524, 31);
        panel.add(name);
        name.setColumns(10);

        JLabel lblNewLabel = new JLabel("Name :");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel.setBounds(43, 31, 167, 31);
        panel.add(lblNewLabel);

        JLabel lblRollNo = new JLabel("Roll no  :");
        lblRollNo.setVerticalAlignment(SwingConstants.TOP);
        lblRollNo.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblRollNo.setBounds(43, 86, 167, 31);
        panel.add(lblRollNo);

        roll_no = new JTextField();
        roll_no.setColumns(10);
        roll_no.setBounds(171, 87, 167, 31);
        panel.add(roll_no);

        JLabel lblPrn = new JLabel("Prn  :");
        lblPrn.setVerticalAlignment(SwingConstants.TOP);
        lblPrn.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblPrn.setBounds(417, 86, 72, 31);
        panel.add(lblPrn);

        prn = new JTextField();
        prn.setColumns(10);
        prn.setBounds(528, 87, 167, 31);
        panel.add(prn);

        lblPs = new JLabel("PS :");
        lblPs.setVerticalAlignment(SwingConstants.TOP);
        lblPs.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblPs.setBounds(43, 200, 83, 31);
        panel.add(lblPs);

        lblAds = new JLabel("ADS :");
        lblAds.setVerticalAlignment(SwingConstants.TOP);
        lblAds.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblAds.setBounds(43, 265, 83, 31);
        panel.add(lblAds);

        lblRollNo_3 = new JLabel("TOC :");
        lblRollNo_3.setVerticalAlignment(SwingConstants.TOP);
        lblRollNo_3.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblRollNo_3.setBounds(43, 333, 83, 31);
        panel.add(lblRollNo_3);

        ps = new JTextField();
        ps.setColumns(10);
        ps.setBounds(171, 201, 167, 31);
        panel.add(ps);

        ads = new JTextField();
        ads.setColumns(10);
        ads.setBounds(171, 266, 167, 31);
        panel.add(ads);

        toc = new JTextField();
        toc.setColumns(10);
        toc.setBounds(171, 334, 167, 31);
        panel.add(toc);

        dbms = new JTextField();
        dbms.setColumns(10);
        dbms.setBounds(528, 201, 167, 31);
        panel.add(dbms);

        os = new JTextField();
        os.setColumns(10);
        os.setBounds(528, 266, 167, 31);
        panel.add(os);

        itw = new JTextField();
        itw.setColumns(10);
        itw.setBounds(528, 334, 167, 31);
        panel.add(itw);

        lblDbms = new JLabel("DBMS :");
        lblDbms.setVerticalAlignment(SwingConstants.TOP);
        lblDbms.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblDbms.setBounds(417, 200, 94, 31);
        panel.add(lblDbms);

        lblOs = new JLabel("OS :");
        lblOs.setHorizontalAlignment(SwingConstants.LEFT);
        lblOs.setVerticalAlignment(SwingConstants.TOP);
        lblOs.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblOs.setBounds(417, 265, 94, 31);
        panel.add(lblOs);

        lblItw = new JLabel("ITW :");
        lblItw.setVerticalAlignment(SwingConstants.TOP);
        lblItw.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblItw.setBounds(417, 333, 94, 31);
        panel.add(lblItw);

        lblNewLabel_1 = new JLabel("Student Grade Calculator");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1.setBounds(0, 137, 813, 40);
        panel.add(lblNewLabel_1);

        lblTotalMarks = new JLabel("Total marks :");
        lblTotalMarks.setHorizontalAlignment(SwingConstants.CENTER);
        lblTotalMarks.setVerticalAlignment(SwingConstants.TOP);
        lblTotalMarks.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblTotalMarks.setBounds(171, 404, 160, 31);
        panel.add(lblTotalMarks);

        total = new JTextField();
        total.setHorizontalAlignment(SwingConstants.CENTER);
        total.setColumns(10);
        total.setBounds(364, 405, 167, 31);
        panel.add(total);

        lblGrade = new JLabel("Grade :");
        lblGrade.setVerticalAlignment(SwingConstants.TOP);
        lblGrade.setHorizontalAlignment(SwingConstants.CENTER);
        lblGrade.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblGrade.setBounds(171, 486, 160, 31);
        panel.add(lblGrade);

        grade = new JTextField();
        grade.setHorizontalAlignment(SwingConstants.CENTER);
        grade.setColumns(10);
        grade.setBounds(364, 487, 167, 31);
        panel.add(grade);

        JButton btnNewButton = new JButton("Calculate");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String studentName = name.getText();
                String rollNumber = roll_no.getText();
                String prnNumber = prn.getText();

                try {
                    // Establish a connection to the database
                    String jdbcUrl = "jdbc:mysql://localhost:3306/student_grade_calculator";
                    String username = "root";
                    String password = "Renuka@76#";
                    Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

                    // Prepare SQL statement for inserting data
                    String sql = "INSERT INTO grades (name, roll_no, prn, ps_marks, toc_marks, ads_marks, dbms_marks, itw_marks, os_marks, total_marks, grade, percentage) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement statement = connection.prepareStatement(sql);
                    statement.setString(1, studentName);
                    statement.setString(2, rollNumber);
                    statement.setString(3, prnNumber);
                    statement.setInt(4, Integer.parseInt(ps.getText()));
                    statement.setInt(5, Integer.parseInt(toc.getText()));
                    statement.setInt(6, Integer.parseInt(ads.getText()));
                    statement.setInt(7, Integer.parseInt(dbms.getText()));
                    statement.setInt(8, Integer.parseInt(itw.getText()));
                    statement.setInt(9, Integer.parseInt(os.getText()));

                    int total1 = Integer.parseInt(ps.getText()) + Integer.parseInt(toc.getText()) +
                            Integer.parseInt(ads.getText()) + Integer.parseInt(dbms.getText()) +
                            Integer.parseInt(itw.getText()) + Integer.parseInt(os.getText());

                    statement.setInt(10, total1);

                    int avg = total1 / 6;

                    statement.setString(11, (avg >= 35) ? (avg >= 85) ? "A" : (avg >= 70) ? "B" : (avg >= 55) ? "C" : "D" : "Fail");
                    statement.setDouble(12, avg);

                    // Execute the insert statement
                    statement.executeUpdate();

                    // Close the connection and statement
                    statement.close();
                    connection.close();

                    // Display a success message
                    JOptionPane.showMessageDialog(null, "Data inserted successfully.");

                    // Update the GUI fields with calculated values
                    total.setText(String.valueOf(total1));
                    grade.setText((avg >= 35) ? (avg >= 85) ? "A" : (avg >= 70) ? "B" : (avg >= 55) ? "C" : "D" : "Fail");
                    percentage.setText(String.valueOf(avg));

                } catch (SQLException ex) {
                    // Handle any SQL exceptions
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error: Unable to insert data into the database.");
                }
            }
        });
        btnNewButton.setBackground(new Color(192, 192, 192));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton.setBounds(109, 569, 134, 40);
        panel.add(btnNewButton);

        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ps.setText("");
                toc.setText("");
                ads.setText("");
                dbms.setText("");
                itw.setText("");
                os.setText("");
                total.setText("");
                grade.setText("");
                percentage.setText("");
                name.setText("");
                prn.setText("");
                roll_no.setText("");
                name.requestFocus();
            }
        });
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnClear.setBackground(new Color(192, 192, 192));
        btnClear.setBounds(344, 569, 125, 40);
        panel.add(btnClear);

        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnExit.setBackground(new Color(192, 192, 192));
        btnExit.setBounds(570, 569, 125, 40);
        panel.add(btnExit);

        lblPercentage = new JLabel("Percentage :");
        lblPercentage.setVerticalAlignment(SwingConstants.TOP);
        lblPercentage.setHorizontalAlignment(SwingConstants.CENTER);
        lblPercentage.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblPercentage.setBounds(171, 445, 160, 31);
        panel.add(lblPercentage);

        percentage = new JTextField();
        percentage.setHorizontalAlignment(SwingConstants.CENTER);
        percentage.setColumns(10);
        percentage.setBounds(364, 446, 167, 31);
        panel.add(percentage);
    }
}
