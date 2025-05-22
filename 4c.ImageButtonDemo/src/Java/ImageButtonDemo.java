/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).*/
package Java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Button Example");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel messageLabel = new JLabel("Click an icon");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Load images from files
        ImageIcon digitalIcon = new ImageIcon("C:\\Users\\sudee\\OneDrive\\Desktop\\digital_clock.png");
        ImageIcon hourglassIcon = new ImageIcon("C:\\Users\\sudee\\OneDrive\\Desktop\\hour_glass.png");

        // Create buttons with images
        JButton digitalBtn = new JButton(digitalIcon);
        JButton hourglassBtn = new JButton(hourglassIcon);

        // Set tooltip texts (optional)
        digitalBtn.setToolTipText("Digital Clock");
        hourglassBtn.setToolTipText("Hour Glass");

        // Add action listeners
        digitalBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        hourglassBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Add components to frame
        frame.add(digitalBtn);
        frame.add(hourglassBtn);
        frame.add(messageLabel);

        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }
}
