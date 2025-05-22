/*4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
event handling mechanism with addActionListener( ).*/
package Java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Country Button Press Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create a label to display the message
        JLabel messageLabel = new JLabel("Press a country button");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Create buttons
        JButton indiaButton = new JButton("India");
        JButton srilankaButton = new JButton("Srilanka");

        // Add action listeners
        indiaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("India is pressed");
            }
        });

        srilankaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Srilanka is pressed");
            }
        });

        // Add components to frame
        frame.add(indiaButton);
        frame.add(srilankaButton);
        frame.add(messageLabel);

        // Make frame visible
        frame.setLocationRelativeTo(null); // Center on screen
        frame.setVisible(true);
    }
}

