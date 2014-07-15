import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraficoRadio extends JFrame {
    private JPanel contentPane;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10,btn11, btn12, btnEstado, btnanterior, btnsiguiente;
    private JLabel lblEmisora, lblEstacion;
    private Radio miRadio;
    private JLabel lblEmisora_1;
    private JLabel lblFrecuencia;
    private JButton btnCambiar;

    public GraficoRadio(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 300);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
   
        miRadio = new RadioG2();
        
        btn1 = new JButton("1");
	btn1.setBounds(51, 172, 46, 29);
	btn1.addActionListener(new ButtonListener());
	contentPane.add(btn1);
		
	btn2 = new JButton("2");
	btn2.setBounds(109, 172, 46, 29);
	btn2.addActionListener(new ButtonListener());
	contentPane.add(btn2);
		
	btn3 = new JButton("3");
	btn3.setBounds(167, 172, 46, 29);
	btn3.addActionListener(new ButtonListener());
	contentPane.add(btn3);
		
	btn4 = new JButton("4");
	btn4.setBounds(225, 172, 46, 29);
	btn4.addActionListener(new ButtonListener());
	contentPane.add(btn4);
		
	btn5 = new JButton("5");
	btn5.setBounds(283, 172, 46, 29);
	btn5.addActionListener(new ButtonListener());
	contentPane.add(btn5);
		
	btn6 = new JButton("6");
	btn6.setBounds(341, 172, 46, 29);
	btn6.addActionListener(new ButtonListener());
	contentPane.add(btn6);
		
	btn7 = new JButton("7");
	btn7.setBounds(51, 214, 46, 29);
	btn7.addActionListener(new ButtonListener());
	contentPane.add(btn7);
		
	btn8 = new JButton("8");
	btn8.setBounds(109, 214, 46, 29);
	btn8.addActionListener(new ButtonListener());
	contentPane.add(btn8);
		
	btn9 = new JButton("9");
	btn9.setBounds(167, 214, 46, 29);
	btn9.addActionListener(new ButtonListener());
	contentPane.add(btn9);
		
	btn10 = new JButton("10");
	btn10.setBounds(225, 213, 46, 29);
	btn10.addActionListener(new ButtonListener());
	contentPane.add(btn10);
		
	btn11 = new JButton("11");
	btn11.setBounds(283, 214, 46, 29);
	btn11.addActionListener(new ButtonListener());
	contentPane.add(btn11);
		
	btn12 = new JButton("12");
	btn12.setBounds(341, 214, 46, 29);
	btn12.addActionListener(new ButtonListener());
	contentPane.add(btn12);
		
	btnEstado = new JButton("Encendido");
	btnEstado.setBounds(167, 16, 107, 29);
	btnEstado.addActionListener(new ButtonListener());
	contentPane.add(btnEstado);
		
	lblEstacion = new JLabel(""+miRadio.getEstacion());
	lblEstacion.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
	lblEstacion.setBounds(242, 57, 134, 29);
	contentPane.add(lblEstacion);
		
	lblEmisora = new JLabel("FM");
	lblEmisora.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
	lblEmisora.setBounds(252, 93, 56, 29);
	contentPane.add(lblEmisora);
		
	btnanterior = new JButton("<<");
	btnanterior.setBounds(152, 131, 75, 29);
	btnanterior.addActionListener(new ButtonListener());
	contentPane.add(btnanterior);
		
	btnsiguiente = new JButton(">>");
	btnsiguiente.setBounds(242, 131, 75, 29);
	btnsiguiente.addActionListener(new ButtonListener());
	contentPane.add(btnsiguiente);
		
	lblEmisora_1 = new JLabel("Emisora");
	lblEmisora_1.setBounds(152, 67, 61, 16);
	contentPane.add(lblEmisora_1);
		
	lblFrecuencia = new JLabel("Frecuencia");
	lblFrecuencia.setBounds(152, 103, 75, 16);
	contentPane.add(lblFrecuencia);
		
	btnCambiar = new JButton("Cambiar ");
	btnCambiar.setBounds(51, 98, 93, 29);
	btnCambiar.addActionListener(new ButtonListener());
	contentPane.add(btnCambiar);
    
    }
   
    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            Object fuente = event.getSource();
			
                if(fuente == btnCambiar){
                    if(miRadio.getFrecuencia()){
                        miRadio.cambiarFrecuencia(miRadio.getFrecuencia());
                        lblEmisora.setText("AM");
                    }else{
			miRadio.cambiarFrecuencia(miRadio.getFrecuencia());
			lblEmisora.setText("FM");
                    }
                    lblEstacion.setText(miRadio.getEstacion()+"");
		}
                
               if (fuente == btnanterior){
                    miRadio.bajarEstacion(miRadio.getEstacion());
                    lblEstacion.setText(""+miRadio.getEstacion());
                }
               
               if(fuente == btnsiguiente){
                    miRadio.subirEstacion(miRadio.getEstacion());
                    lblEstacion.setText(""+miRadio.getEstacion());
		}
               
               if(fuente == btnEstado){
                    miRadio.cambiarEstado(miRadio.getEstado());
                    if(miRadio.getEstado()){
			btnEstado.setText("Encendido");
			btn1.setEnabled(true);
			btn2.setEnabled(true);
			btn3.setEnabled(true);
                        btn4.setEnabled(true);
			btn5.setEnabled(true);
			btn6.setEnabled(true);
			btn7.setEnabled(true);
			btn8.setEnabled(true);
			btn9.setEnabled(true);
			btn10.setEnabled(true);
			btn11.setEnabled(true);
			btn12.setEnabled(true);
			btnsiguiente.setEnabled(true);
			btnanterior.setEnabled(true);
			btnCambiar.setEnabled(true);
                    }else{
			btnEstado.setText("Apagado");
			btn1.setEnabled(false);
			btn2.setEnabled(false);
			btn3.setEnabled(false);
			btn4.setEnabled(false);
			btn5.setEnabled(false);
			btn6.setEnabled(false);
			btn7.setEnabled(false);
			btn8.setEnabled(false);
			btn9.setEnabled(false);
			btn10.setEnabled(false);
			btn11.setEnabled(false);
			btn12.setEnabled(false);
			btnsiguiente.setEnabled(false);
			btnanterior.setEnabled(false);
			btnCambiar.setEnabled(false);
		}
            }
               
               
            if(fuente == btn1){
                miRadio.sintonizar(0);
                lblEstacion.setText("" + miRadio.sintonizar(0));
                if((miRadio.sintonizar(0))<=107.9 && (miRadio.sintonizar(0))>=57.9){
                    lblEmisora.setText("FM");
                 }
                  else{
                   lblEmisora.setText("AM");
                  }
            }
            
            if(fuente == btn2){
                 miRadio.sintonizar(1);
                lblEstacion.setText("" + miRadio.sintonizar(1));
                if((miRadio.sintonizar(1))<=107.9 && (miRadio.sintonizar(1))>=57.9){
                    lblEmisora.setText("FM");
                 }
                  else{
                   lblEmisora.setText("AM");
                  }
            }
            
            if(fuente == btn3){
                 miRadio.sintonizar(2);
                lblEstacion.setText("" + miRadio.sintonizar(2));
                if((miRadio.sintonizar(2))<=107.9 && (miRadio.sintonizar(2))>=57.9){
                    lblEmisora.setText("FM");
                 }
                  else{
                   lblEmisora.setText("AM");
                  }
            }
            
            if(fuente == btn4){
                 miRadio.sintonizar(3);
                lblEstacion.setText("" + miRadio.sintonizar(3));
                if((miRadio.sintonizar(3))<=107.9 && (miRadio.sintonizar(3))>=57.9){
                    lblEmisora.setText("FM");
                 }
                  else{
                   lblEmisora.setText("AM");
                  }
            }
            
            if(fuente == btn5){
                 miRadio.sintonizar(4);
                lblEstacion.setText("" + miRadio.sintonizar(4));
                if((miRadio.sintonizar(4))<=107.9 && (miRadio.sintonizar(4))>=57.9){
                    lblEmisora.setText("FM");
                 }
                  else{
                   lblEmisora.setText("AM");
                  }
            }
            
            if(fuente == btn6){
                 miRadio.sintonizar(5);
                lblEstacion.setText("" + miRadio.sintonizar(5));
                if((miRadio.sintonizar(5))<=107.9 && (miRadio.sintonizar(5))>=57.9){
                    lblEmisora.setText("FM");
                 }
                  else{
                   lblEmisora.setText("AM");
                  }
            }
            
            if(fuente == btn7){
                 miRadio.sintonizar(6);
                lblEstacion.setText("" + miRadio.sintonizar(6));
                if((miRadio.sintonizar(6))<=107.9 && (miRadio.sintonizar(6))>=57.9){
                    lblEmisora.setText("FM");
                 }
                  else{
                   lblEmisora.setText("AM");
                  }
            }
            
            if(fuente == btn8){
                miRadio.sintonizar(7);
                lblEstacion.setText("" + miRadio.sintonizar(7));
                if((miRadio.sintonizar(7))<=107.9 && (miRadio.sintonizar(7))>=57.9){
                    lblEmisora.setText("FM");
                 }
                  else{
                   lblEmisora.setText("AM");
                  }
            }
            
            if(fuente == btn9){
                miRadio.sintonizar(8);
                lblEstacion.setText("" + miRadio.sintonizar(8));
                if((miRadio.sintonizar(8))<=107.9 && (miRadio.sintonizar(8))>=57.9){
                    lblEmisora.setText("FM");
                 }
                  else{
                   lblEmisora.setText("AM");
                  }
            }
            
            if(fuente == btn10){
                miRadio.sintonizar(9);
                lblEstacion.setText("" + miRadio.sintonizar(9));
                if((miRadio.sintonizar(9))<=107.9 && (miRadio.sintonizar(9))>=57.9){
                    lblEmisora.setText("FM");
                 }
                  else{
                   lblEmisora.setText("AM");
                  }
            }
           
            if(fuente == btn11){
                miRadio.sintonizar(10);
                lblEstacion.setText("" + miRadio.sintonizar(10));
                if((miRadio.sintonizar(10))<=107.9 && (miRadio.sintonizar(10))>=57.9){
                    lblEmisora.setText("FM");
                 }
                  else{
                   lblEmisora.setText("AM");
                  }
            }
            
            if(fuente == btn12){
                 miRadio.sintonizar(11);
                lblEstacion.setText("" + miRadio.sintonizar(11));
                if((miRadio.sintonizar(11))<=107.9 && (miRadio.sintonizar(11))>=57.9){
                    lblEmisora.setText("FM");
                 }
                  else{
                   lblEmisora.setText("AM");
                  }
            }
            
        }
    }
}

