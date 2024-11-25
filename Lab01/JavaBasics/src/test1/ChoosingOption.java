//package test1;
//import javax.swing.JOptionPane;
//public class ChoosingOption {
//		    public static void main(String[] args) {
//			int option = JOptionPane.showConfirmDialog(null,
//					"Do you want to change to the first class ticket?");
//
//			 JOptionPane.showMessageDialog(null, "You've chosen: "
//				+ (option==JOptionPane.YES_OPTION?"Yes" : "No"));
//		        System.exit(0);
//		    }
//}
package test1;

import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        // Customize options
        Object[] options = {"Yes", "No"};
        
        int option = JOptionPane.showOptionDialog(null,
                "Do you want to change to the first class ticket?",
                "Choose an Option",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]); // Default option

        JOptionPane.showMessageDialog(null, "You've chosen: " +
                (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        
        System.exit(0);
    }
}