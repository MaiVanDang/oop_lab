package hust.soict.hedspi.aims.screen;

import javax.naming.LimitExceededException;
import javax.swing.*;
import java.awt.*;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.*;

public class MediaStore extends JPanel {
    public MediaStore(Media media, Cart cart) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);
        
        JLabel cost = new JLabel(String.format("%.2f$", media.getCost()));
        cost.setAlignmentX(CENTER_ALIGNMENT);
        
        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        // Add "Add to cart" button
        JButton addToCartButton = new JButton("Add to cart");
        addToCartButton.addActionListener(e -> {
            String message = cart.addMedia(media);
			JOptionPane.showMessageDialog(null, message);
        });
        container.add(addToCartButton);
        
        // Add "Play" button if media is playable
        if (media instanceof Playable) {
            JButton playButton = new JButton("Play");
            playButton.addActionListener(e -> {
                JDialog dialog = new JDialog();
                dialog.setTitle(media.getTitle());
                dialog.setSize(400, 300);
                dialog.setModal(true);
                
                // Media information
                String mediaInfo = "<html><h2>" + media.getTitle() + "</h2>" +
                                   "<p><strong>Genre:</strong> " + media.getCategory() + "</p>" +
                                   "<p><strong>Cost:</strong> " + String.format("%.2f$", media.getCost()) + "</p></html>";
                
                JLabel mediaLabel = new JLabel(mediaInfo);
                mediaLabel.setHorizontalAlignment(JLabel.CENTER);
                mediaLabel.setVerticalAlignment(JLabel.TOP);
                mediaLabel.setHorizontalAlignment(JLabel.LEFT);
                
                JButton closeButton = new JButton("Close");
                closeButton.addActionListener(closeEvent -> dialog.dispose());
                
                JPanel dialogPanel = new JPanel();
                dialogPanel.setLayout(new BorderLayout());
                dialogPanel.add(new JScrollPane(mediaLabel), BorderLayout.CENTER);
                dialogPanel.add(closeButton, BorderLayout.SOUTH);
                
                dialog.add(dialogPanel);
                dialog.setVisible(true);
            });
            container.add(playButton);
        }
        
        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);
        
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}