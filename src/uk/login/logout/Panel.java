package uk.login.logout;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.*;


public class Panel extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;
    private JTextField txtThemify;
    private DatabaseManager databaseManager;


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
        setBounds(100, 400, 350, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new LineBorder(UIManager.getColor("Button.darkShadow")));
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        panel.setForeground(new Color(255, 255, 255));
        panel.setBorder(new LineBorder(Color.BLACK, 2, true));
        panel.setBackground(Color.GRAY);
        contentPane.add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(Color.BLACK, 1, true));
        panel_1.setBackground(Color.WHITE);
        panel_1.setBounds(35, 138, 270, 37);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
                textField = new JTextField();
                textField.setBounds(6, 6, 177, 26);
                panel_1.add(textField);
                textField.setBorder(null);
                textField.setColumns(10);

        JPanel panel_1_1 = new JPanel();
        panel_1_1.setBorder(new LineBorder(Color.BLACK, 1, true));
        panel_1_1.setBackground(Color.WHITE);
        panel_1_1.setBounds(35, 211, 270, 36);
        panel.add(panel_1_1);
        panel_1_1.setLayout(null);
        
                passwordField = new JPasswordField();
                passwordField.setBounds(6, 6, 177, 26);
                panel_1_1.add(passwordField);
                passwordField.setBorder(null);
        

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.CYAN);
        panel_2.setBounds(198, 298, 107, 37);
        panel.add(panel_2);
        panel_2.setLayout(null);
        
                JButton loginButton = new JButton("LOG IN");
                loginButton.setBounds(25, 15, 61, 16);
                panel_2.add(loginButton);
                loginButton.setBorder(null);
                loginButton.setForeground(Color.WHITE);
                loginButton.setBackground(Color.CYAN);
                loginButton.setFont(new Font("SansSerif", Font.BOLD, 14));
                
                // Event listener for the login button
                loginButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String username = textField.getText();
                        char[] password = passwordField.getPassword();

                        if (databaseManager.validateUser(username, String.valueOf(password))) {
                            JOptionPane.showMessageDialog(Panel.this, "Login Successful");
                        } else {
                            JOptionPane.showMessageDialog(Panel.this, "Invalid username or password", "Login Failed",
                                    JOptionPane.ERROR_MESSAGE);
                        }

                        textField.setText("");
                        passwordField.setText("");
                    }
                });


        JLabel lblNewLabel_1 = new JLabel("Forgotten Password?");
        lblNewLabel_1.setForeground(Color.CYAN);
        lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 11));
        lblNewLabel_1.setBackground(new Color(0, 0, 0));
        lblNewLabel_1.setBounds(35, 247, 128, 16);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Password");
        lblNewLabel_2.setForeground(Color.WHITE);
        lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
        lblNewLabel_2.setBounds(35, 190, 61, 16);
        panel.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Username or Email");
        lblNewLabel_3.setForeground(Color.WHITE);
        lblNewLabel_3.setFont(new Font("SansSerif", lblNewLabel_3.getFont().getStyle(), lblNewLabel_3.getFont().getSize()));
        lblNewLabel_3.setBounds(35, 123, 129, 16);
        panel.add(lblNewLabel_3);
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("Remember me");
        rdbtnNewRadioButton.setForeground(Color.WHITE);
        rdbtnNewRadioButton.setHorizontalTextPosition(SwingConstants.RIGHT);
        rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnNewRadioButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
        rdbtnNewRadioButton.setBounds(23, 312, 141, 23);
        panel.add(rdbtnNewRadioButton);
        
        txtThemify = new JTextField();
        txtThemify.setDisabledTextColor(Color.GRAY);
        txtThemify.setSelectionColor(Color.GRAY);
        txtThemify.setFont(new Font("SignPainter", Font.PLAIN, 40));
        txtThemify.setText("Themify");
        txtThemify.setBorder(null);
        txtThemify.setBackground(Color.GRAY);
        txtThemify.setBounds(106, 32, 101, 62);
        panel.add(txtThemify);
        txtThemify.setColumns(10);
        
        setLocationRelativeTo(null);
    }

}
