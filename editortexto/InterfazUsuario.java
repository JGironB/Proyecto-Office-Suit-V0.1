package editortexto;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class InterfazUsuario implements Runnable
{
	private AreaPersonalizada area;
	
	private JFrame frame;
	
	@Override
	public void run() 
	{
		frame = new JFrame();
		
		int anchoPantalla = Toolkit.getDefaultToolkit().getScreenSize().width;
		int largoPantalla = Toolkit.getDefaultToolkit().getScreenSize().height;
				
        frame.setPreferredSize(new Dimension(800, 700));
        frame.setLocation(anchoPantalla/2-400, largoPantalla/2-350);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        URL rutaLogo = InterfazUsuario.class.getResource("Logo.png");
        
        frame.setTitle("Editor de Texto");
        
        createComponents(frame.getContentPane());
        
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(rutaLogo));
        
        frame.pack();
        frame.setVisible(true);
	}
	
	private void createComponents(Container container) 
    {
		area = new AreaPersonalizada();
    	Lamina laminaEditorTexto = new Lamina(area);
    	
    	container.add(laminaEditorTexto);
    }
	
	public JFrame getFrame() 
	{
		return frame;
	}

}
