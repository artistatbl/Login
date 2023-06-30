package uk.login.logout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.prefs.Preferences;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;

public class Panel extends JFrame {

    private JPanel contentPane;
    private DatabaseManager databaseManager;
    
 // Preferences key for storing the username
    private static final String USERNAME_PREF_KEY = "username";
    private JTextField textField;
    private JPasswordField passwordField;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Panel frame = new Panel();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Panel() {

        databaseManager = new DatabaseManager();

        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 400, 850, 425);
        contentPane = new JPanel();
        contentPane.setBorder(new LineBorder(UIManager.getColor("Button.darkShadow")));
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
        setContentPane(contentPane);
        
       
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 0, 390, 423);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Welcome Back");
        lblNewLabel.setFont(new Font("Lahore Gurmukhi", Font.BOLD, 20));
        lblNewLabel.setBounds(98, 40, 161, 16);
        panel_1.add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Log in with Google");
        btnNewButton.setBounds(38, 99, 294, 35);
        panel_1.add(btnNewButton);
        
        textField = new JTextField();
        textField.setBounds(38, 182, 294, 35);
        panel_1.add(textField);
        textField.setColumns(10);
        
        JButton btnNewButton_1 = new JButton("LOG IN");
        btnNewButton_1.setBounds(38, 313, 294, 44);
        panel_1.add(btnNewButton_1);
        
        JLabel lblNewLabel_1 = new JLabel("Email Address ");
        lblNewLabel_1.setBounds(42, 168, 110, 16);
        panel_1.add(lblNewLabel_1);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(38, 241, 289, 35);
        panel_1.add(passwordField);
        
        JLabel lblNewLabel_2 = new JLabel("Password");
        lblNewLabel_2.setBounds(42, 229, 61, 16);
        panel_1.add(lblNewLabel_2);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Remember me");
        chckbxNewCheckBox.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        chckbxNewCheckBox.setBounds(38, 275, 128, 23);
        panel_1.add(chckbxNewCheckBox);
        
        JLabel lblNewLabel_3 = new JLabel("Forget password?");
        lblNewLabel_3.setForeground(new Color(255, 70, 6));
        lblNewLabel_3.setBounds(213, 279, 110, 16);
        panel_1.add(lblNewLabel_3);
        
        JLabel lblNewLabel_5 = new JLabel("Don't have an account yet? Sign up.");
        lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

        lblNewLabel_5.setBounds(98, 369, 197, 16);
        panel_1.add(lblNewLabel_5);
        
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("/Users/dalyjean/Downloads/bg.png"));
        lblNewLabel_4.setBounds(430, 29, 400, 333);
        panel.add(lblNewLabel_4);
       

        setLocationRelativeTo(null);

        // Retrieve stored username if exists
     
        
    }
}
