import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JComboBox<String> roleComboBox;
    private JButton loginButton;

    public LoginGUI() {
        setTitle("Login");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(mainPanel, BorderLayout.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(usernameLabel, gbc);

        usernameField = new JTextField(15);
        gbc.gridx = 1;
        mainPanel.add(usernameField, gbc);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridy = 1;
        gbc.gridx = 0;
        mainPanel.add(passwordLabel, gbc);

        passwordField = new JPasswordField(15);
        gbc.gridx = 1;
        mainPanel.add(passwordField, gbc);

        JLabel roleLabel = new JLabel("Role:");
        roleLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridy = 2;
        gbc.gridx = 0;
        mainPanel.add(roleLabel, gbc);

        String[] roles = {"Vendor", "Customer", "Delivery Runner", "Administration"};
        roleComboBox = new JComboBox<>(roles);
        gbc.gridx = 1;
        mainPanel.add(roleComboBox, gbc);

        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(loginButton, gbc);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogin();
            }
        });

        JPanel footerPanel = new JPanel();
        footerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        footerPanel.setBackground(Color.LIGHT_GRAY);
        add(footerPanel, BorderLayout.SOUTH);

        JLabel footerLabel = new JLabel("© 2024 Company Name");
        footerLabel.setFont(new Font("Arial", Font.ITALIC, 12));
        footerPanel.add(footerLabel);
    }

    private void handleLogin() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String role = (String) roleComboBox.getSelectedItem();

        if (authenticate(username, password, role)) {
            JOptionPane.showMessageDialog(this, "Login successful as " + role);
            redirectToDashboard(role);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean authenticate(String username, String password, String role) {
        // Replace this with your actual authentication logic
        return true;
    }

    private void redirectToDashboard(String role) {
        switch (role) {
            case "Vendor":
                new VendorDashboard().setVisible(true);
                break;
            // case "Customer":
            //     new CustomerDashboard().setVisible(true);
            //     break;
            // case "Delivery Runner":
            //     new RunnerDashboard().setVisible(true);
            //     break;
            // case "Administration":
            //     new AdminDashboard().setVisible(true);
            //     break;
        }
        dispose();
    }
}
