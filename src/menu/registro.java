package menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;
import javax.swing.JComboBox;

public class registro extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField_1;
    private JTextField textField;
    private JTextField textField_2;
    private JTextField textField_3;

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    registro frame = new registro();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public registro() {
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(registro.class.getResource("/Image/kenedi.jpg")));
        setTitle("APGE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 370, 521);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 20, 44));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Full Name:");
        lblNewLabel.setForeground(new Color(255, 182, 83));
        lblNewLabel.setFont(new Font("Yu Gothic Light", Font.BOLD, 17));
        lblNewLabel.setBounds(40, 103, 85, 27);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Email:");
        lblNewLabel_1.setForeground(new Color(255, 182, 83));
        lblNewLabel_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 17));
        lblNewLabel_1.setBounds(40, 173, 85, 25);
        contentPane.add(lblNewLabel_1);

        // Crear Border redondeado
        

        textField_1 = new JTextField();
        textField_1.setForeground(new Color(0, 0, 0));
        textField_1.setBounds(40, 200, 274, 34);

        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JButton btnNewButton = new JButton("SIGN UP");
        btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(255, 98, 99));
        btnNewButton.setBounds(219, 437, 125, 34);
        contentPane.add(btnNewButton);

       
        JLabel lblNewLabel_2 = new JLabel();
        ImageIcon imageIcon = new ImageIcon(registro.class.getResource("/Image/kenedi.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(130, 105, Image.SCALE_SMOOTH);
        lblNewLabel_2.setIcon(new ImageIcon(image));
        lblNewLabel_2.setBounds(10, 11, 98, 81);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("REGISTER");
        lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 36));
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setBounds(118, 29, 170, 37);
        contentPane.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("APGE ALWAYS FOR YOU");
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setBounds(10, 444, 146, 27);
        contentPane.add(lblNewLabel_4);
        
        textField = new JTextField();
        textField.setForeground(Color.BLACK);
        textField.setColumns(10);
        textField.setBounds(40, 128, 274, 34);
        contentPane.add(textField);
        
        JLabel lblNewLabel_1_1 = new JLabel("Password:");
        lblNewLabel_1_1.setForeground(new Color(255, 182, 83));
        lblNewLabel_1_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 17));
        lblNewLabel_1_1.setBounds(40, 245, 85, 25);
        contentPane.add(lblNewLabel_1_1);
        
        textField_2 = new JTextField();
        textField_2.setForeground(Color.BLACK);
        textField_2.setColumns(10);
        textField_2.setBounds(40, 268, 274, 34);
        contentPane.add(textField_2);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(10, 411, 140, 22);
        contentPane.add(comboBox);
        
        comboBox.addItem("Seleccionar Carrera");
        comboBox.addItem("Software");
        comboBox.addItem("Multimedia");
        comboBox.addItem("Seguridad Informatica");
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Confirm Password");
        lblNewLabel_1_1_1.setForeground(new Color(255, 182, 83));
        lblNewLabel_1_1_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 17));
        lblNewLabel_1_1_1.setBounds(40, 324, 146, 25);
        contentPane.add(lblNewLabel_1_1_1);
        
        textField_3 = new JTextField();
        textField_3.setForeground(Color.BLACK);
        textField_3.setColumns(10);
        textField_3.setBounds(40, 348, 274, 34);
        contentPane.add(textField_3);
        
    }
}