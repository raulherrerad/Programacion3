package prueba;



	import java.awt.EventQueue;
	 
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;
	import javax.swing.JButton;
	import java.awt.Color;
	import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.awt.event.ActionEvent;
	import javax.swing.JTextField;
	import javax.swing.JLabel;
	import javax.swing.JTextArea;
	import javax.swing.JRadioButton;
	import javax.swing.JToggleButton;
	import javax.swing.JScrollBar;
	import javax.swing.JComboBox;
	import javax.swing.JCheckBox;

	 
	public class Swing {
	 
	    private JFrame frame;
	    private JTextField textField;
	    private JTextField textField_1;
	    private JTextField textField_2;
	 
	    int cantidad;
	    char posicion;
	    String nombreUsuario;
	    int vector[];
	    
	    /**
	     * Launch the application.
	     */
	    public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                	Swing window = new Swing();
	                    window.frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }
	 
	    /**
	     * Create the application.
	     */
	    public Swing() {
	        initialize();
	        
	        nombreUsuario= "pedro";
	        
	        try {
				FileReader file = new FileReader("ejemplo.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	    }
	 
	    /**
	     * Initialize the contents of the frame.
	     */
	    private void initialize() {
	        frame = new JFrame();
	        frame.setBounds(100, 100, 730, 489);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().setLayout(null);
	 
	       }
	 
}