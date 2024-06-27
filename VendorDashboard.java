import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class VendorDashboard extends JFrame {
    private JTextArea textArea;

    public VendorDashboard() {
        setTitle("Vendor Dashboard");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setEditable(false);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel panel = new JPanel();
        JButton createButton = new JButton("Create Item");
        JButton readButton = new JButton("Read Items");
        JButton updateButton = new JButton("Update Item");
        JButton deleteButton = new JButton("Delete Item");

        panel.add(createButton);
        panel.add(readButton);
        panel.add(updateButton);
        panel.add(deleteButton);

        add(panel, BorderLayout.SOUTH);

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createItem();
            }
        });

        readButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                readItems();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateItem();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteItem();
            }
        });
    }

    private void createItem() {
        String itemName = JOptionPane.showInputDialog(this, "Enter item name:");
        if (itemName != null && !itemName.isEmpty()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("items.txt", true))) {
                writer.write(itemName);
                writer.newLine();
                JOptionPane.showMessageDialog(this, "Item created successfully.");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error creating item.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void readItems() {
        textArea.setText("");
        try (BufferedReader reader = new BufferedReader(new FileReader("items.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                textArea.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error reading items.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateItem() {
        String oldItem = JOptionPane.showInputDialog(this, "Enter item name to update:");
        if (oldItem != null && !oldItem.isEmpty()) {
            String newItem = JOptionPane.showInputDialog(this, "Enter new item name:");
            if (newItem != null && !newItem.isEmpty()) {
                try {
                    File inputFile = new File("items.txt");
                    File tempFile = new File("items_temp.txt");

                    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.trim().equals(oldItem)) {
                            line = newItem;
                        }
                        writer.write(line);
                        writer.newLine();
                    }
                    writer.close();
                    reader.close();

                    inputFile.delete();
                    tempFile.renameTo(inputFile);

                    JOptionPane.showMessageDialog(this, "Item updated successfully.");
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error updating item.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private void deleteItem() {
        String itemToDelete = JOptionPane.showInputDialog(this, "Enter item name to delete:");
        if (itemToDelete != null && !itemToDelete.isEmpty()) {
            try {
                File inputFile = new File("items.txt");
                File tempFile = new File("items_temp.txt");

                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

                String line;
                while ((line = reader.readLine()) != null) {
                    if (!line.trim().equals(itemToDelete)) {
                        writer.write(line);
                        writer.newLine();
                    }
                }
                writer.close();
                reader.close();

                inputFile.delete();
                tempFile.renameTo(inputFile);

                JOptionPane.showMessageDialog(this, "Item deleted successfully.");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error deleting item.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
