package Clases;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.util.Random;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.border.*;


public class Tablero extends JPanel implements ActionListener{
    protected int tamanoPanelX = 1000 ; 
    protected int tamanoPanelY = 600; 
    protected int tamanoCasillaX, tamanoCasillaY; 
    protected int posX, posY; 
    protected int casillaActual = 1; 
    protected int filas, columnas; 
    protected Casilla[] casilla; 
    protected Jugador[] jugador; 
    protected int numerojugadores; 
    protected int numeroCasillas; 
    protected int dador1, dador2, saltor; 
    protected int jugadorActual = 1; 
    protected JLabel label1;  
    protected JButton tirarDados, salir; 
    protected Border  raisedbevel; 
    protected JLabel mostrarD1, mostrarD2; 
    protected JTextArea mostrarTurnoActual; 
    int turno = 1;
    public Tablero(){}
    public Tablero(int numeroCasillas, Jugador[] jugador, Casilla[] casilla, int numerojugadores){
        super();
        this.filas = (int) Math.sqrt (numeroCasillas);
        this.columnas = filas;
        this.tamanoCasillaX = this.tamanoPanelX/filas;
        this.tamanoCasillaY = this.tamanoPanelY/columnas;
        this.posX = 0;
        this.posY = tamanoPanelY-tamanoCasillaY;
        this.numerojugadores = numerojugadores;
        this.numeroCasillas = numeroCasillas;
        this.jugador = jugador;
        setLayout(null);
        setSize(tamanoPanelX,tamanoPanelY);
        this.casilla = casilla;
        anadirCasillas(filas,columnas); 
        anadirDatosAuxiliares(); 
        
    }
    public void anadirCasillas(int Filas, int Columnas){
        for ( int y = 1; y<=Filas;y++){
            for (int x = 1; x<=Columnas;x++){
                label1 = new JLabel(""+ casillaActual);
                label1.setBounds(posX, posY, tamanoCasillaX,tamanoCasillaY); 
                Border border = BorderFactory.createLineBorder(Color.gray);
                label1.setOpaque(true);
                String texto = casilla[casillaActual].getTipoCasilla();
                if (!(texto.equals("Simple"))){ 
                   texto = " "+texto + " " + casilla[casillaActual].getMovimientoN() + " ";
                    label1.setText(label1.getText() + texto);
                }
                if(texto.equals("Escalera")){
                    ImageIcon imagen = new ImageIcon(getClass().getResource("escalera.gif"));
                    JLabel imageLabel = new JLabel(imagen);
                    imageLabel.setBounds(0, 525, 97, 50);
                    label1.add(imageLabel);
                }
                if(Filas%2==0){
                    if (x%2 != 0){
                            label1.setBackground(new Color(0, 102, 255));
                    }
                }
                else{
                    if (x%2!=0 && y%2 !=0){
                        label1.setBackground(new Color(0, 102, 255));
                    }
                } 
                label1.setBorder(border);
                add(label1);
                casilla[casillaActual].setPosGraficaX(posX); 
                casilla[casillaActual].setPosGraficaY(posY);
                if (y%2 != 0){
                    posX = posX + tamanoCasillaX;
                }
                else
                    posX = posX - tamanoCasillaX;
            casillaActual++;
            } 
            posY = posY-tamanoCasillaY;
            if (y%2 != 0){
                    posX = posX - tamanoCasillaX;
                }
            else {
                    posX = posX + tamanoCasillaX;
            }
        }
   }
    public void anadirDatosAuxiliares(){
        raisedbevel = BorderFactory.createRaisedSoftBevelBorder();
        Border border = LineBorder.createGrayLineBorder(); 
        Border redline = BorderFactory.createLineBorder(Color.yellow,1);
        Border compound = BorderFactory.createCompoundBorder(raisedbevel,redline );
        mostrarTurnoActual = new JTextArea(6,2);
        mostrarTurnoActual.setBorder(border);
        mostrarTurnoActual.setBounds(800,650,215,40);
        mostrarTurnoActual.setEditable(false);
        mostrarTurnoActual.setBackground(new Color(0, 255, 0));
        mostrarTurnoActual.setForeground(new Color(0, 0, 0));
        mostrarTurnoActual.setFont(new Font("Arial", Font.BOLD, 14));
        tirarDados = new JButton(); 
        tirarDados.setBounds(1100, 0, 100, 45); 
        tirarDados.setText("TIRAR");
        tirarDados.setActionCommand("tirar");
        salir = new JButton("Salir");
        salir.setActionCommand("salir");
        tirarDados.setBorder(compound);
        tirarDados.setBackground(new Color(0, 255, 0));
        tirarDados.setForeground(new Color(255,255,255));
        tirarDados.setBounds(1100, 0, 200, 95); 
        salir.setBackground(new Color(0, 255, 0));
        salir.setForeground(Color.white);
        salir.setBounds(1100,280,200,40); 
        add(tirarDados);
        tirarDados.addActionListener(this); 
        salir.addActionListener(this);
        add(salir);
        mostrarD1 = new JLabel();
        mostrarD2 = new JLabel();
        mostrarD1.setBounds(1100, 210,240, 80); 
        mostrarD2.setBounds(1200,210,240,80); 
        add(mostrarD1);
        add(mostrarD2);
        add(mostrarTurnoActual);
       
    }
    public void agregarDados(){
        Random aleatorio = new Random();
        String dado1 = "MUMERO 1";
        String dado2 = "NUMERO 2";
        String dado3 = "NUMERO 3";
        String dado4 = "NUMERO 4";
        String dado5 = "NUMERO 5";
        String dado6 = "NUMERO 6";
            
        dador1 = aleatorio.nextInt(6)+1;
        dador2 = aleatorio.nextInt(6)+1;
        saltor = dador1 + dador2;  
        switch(dador1){
             case 1: mostrarD1.setText(dado1);break;
             case 2: mostrarD1.setText(dado2);break;
             case 3: mostrarD1.setText(dado3);break;
             case 4: mostrarD1.setText(dado4);break;
             case 5: mostrarD1.setText(dado5);break;
             case 6: mostrarD1.setText(dado6);break;
         }

         switch(dador2){
             case 1: mostrarD2.setText(dado1);break;
             case 2: mostrarD2.setText(dado2);break;
             case 3: mostrarD2.setText(dado3);break;
             case 4: mostrarD2.setText(dado4);break;
             case 5: mostrarD2.setText(dado5);break;
             case 6: mostrarD2.setText(dado6);break;
         }
    }
    public void parteLogicaJuego(){
        if((jugador[jugadorActual].getCasillaActual()+saltor)>=numeroCasillas)
        {
            saltor = numeroCasillas - jugador[jugadorActual].getCasillaActual(); 
                                                                                     
        }
        jugador[jugadorActual].setCasillaActual(jugador[jugadorActual].getCasillaActual()+saltor);             
        while (true) {
            if (casilla[jugador[jugadorActual].getCasillaActual()].getTipoCasilla().equals("Simple") )
            {
                   break; 
            }
            if ( casilla[jugador[jugadorActual].getCasillaActual()].getTipoCasilla().equals( "Pierde Turno") ){   
                  jugador[jugadorActual].setTurnoPerdido(jugador[jugadorActual].getTurnoPerdido()+1);
                  break;
            }     
            if ( 
                casilla[jugador[jugadorActual].getCasillaActual()].getTipoCasilla().equals("Escalera")
                ||
                casilla[jugador[jugadorActual].getCasillaActual()].getTipoCasilla().equals("Avanza")
                ) 
                { 
                     if (casilla[jugador[jugadorActual].getCasillaActual()].getMovimientoN()+jugador[jugadorActual].getCasillaActual()>=numeroCasillas){
                            jugador[jugadorActual].setCasillaActual(numeroCasillas); 
                        }
                     else{ 
                         jugador[jugadorActual].setCasillaActual( casilla[jugador[jugadorActual].getCasillaActual()].getMovimientoN()
                         +jugador[jugadorActual].getCasillaActual());
                        }
                    repaint(); 
                    continue;  
                } 
           if(casilla[jugador[jugadorActual].getCasillaActual()].getTipoCasilla().equals("Serpiente")){
                 if(jugador[jugadorActual].getCasillaActual()+casilla[jugador[jugadorActual].getCasillaActual()].getMovimientoN()<=1){
                          jugador[jugadorActual].setCasillaActual(1); 
                  }
                  else{ 
                     jugador[jugadorActual].setCasillaActual(jugador[jugadorActual].getCasillaActual()+ casilla[jugador[jugadorActual].getCasillaActual()].getMovimientoN());
                     }
                     repaint(); 
                     continue;    
            } 
            break;
            }  
            repaint(); 
            if ( jugador[jugadorActual].getCasillaActual() == (int) numeroCasillas){
                JOptionPane.showMessageDialog(null, "\n=====\nGANADOR " + " Jugador # "+ jugadorActual + "\n" +jugador[jugadorActual].getNombre());
                tirarDados.setEnabled(false); 
                
            }
    } 
    public void controlDeTurnos(){ 
                  mostrarTurnoActual.setText("Turno número: " + turno);
                  turno++;
    }
   @Override
    public void actionPerformed(ActionEvent evento){
        String accion = evento.getActionCommand();
        if (accion.equals("tirar")){
            agregarDados();
            parteLogicaJuego();
            controlDeTurnos();
       } 
    if(accion.equals("salir")){
       int confirmado = JOptionPane.showConfirmDialog(null,"¿Desea Salir del juego?");
       if (JOptionPane.OK_OPTION == confirmado)
           System.exit(0);
       }     
   } 
    @Override
   public void paint(Graphics g){
       super.paint(g);
       Graphics2D g2d = (Graphics2D) g; 
       int correcionPosicion=0;
       int correccionNumero=15;
       int correcionPosY=0; 
       for (int p=1;p<=numerojugadores;p++){
           if (p>3){
               correcionPosicion -=30;
               correcionPosY=30;
               
           }
           Object color1 = this.jugador[p].getColorFicha(); 
           g2d.setColor((Color)color1); 
           g2d.fillOval(casilla[jugador[p].getCasillaActual()].getPosGraficaX()+correcionPosicion,
                casilla[jugador[p].getCasillaActual()].getPosGraficaY()+ correcionPosY, 30, 30); 
           g2d.setColor(Color.white); 
           
           g2d.drawString(String.valueOf(p),casilla[jugador[p].getCasillaActual()].getPosGraficaX()+correccionNumero ,
                casilla[jugador[p].getCasillaActual()].getPosGraficaY()+15 + correcionPosY); 
           correcionPosicion+=30; 
           correccionNumero +=30; 
                 
            
         }
        for ( int y = 1; y<=numeroCasillas;y++){
            String texto = casilla[y].getTipoCasilla();
            if ((texto.equals("Escalera"))){
                 AffineTransform at = new AffineTransform();
                 at.translate(casilla[casilla[y].getMovimientoN()+y].getPosGraficaX(),casilla[casilla[y].getMovimientoN()+y].getPosGraficaY());
                 if (casilla[casilla[y].getMovimientoN()+y].getPosGraficaX()<casilla[y].getPosGraficaX()){
                     if (casilla[casilla[y].getMovimientoN()+y].getPosGraficaX()-casilla[y].getPosGraficaX()>375){
                         at.rotate(-Math.toRadians(15));
                     }
                     else
                     at.rotate(-Math.toRadians(45));
                 }
                 if(casilla[casilla[y].getMovimientoN()+y].getPosGraficaX()>casilla[y].getPosGraficaX()){
                    if (casilla[casilla[y].getMovimientoN()+y].getPosGraficaX()-casilla[y].getPosGraficaX()>375){
                        if(casilla[casilla[y].getMovimientoN()+y].getPosGraficaX()-casilla[y].getPosGraficaX()>500){
                            at.rotate(Math.toRadians(90));
                        }
                        else
                            at.rotate(Math.toRadians(75));
                     }
                     else
                     at.rotate(Math.toRadians(45));
                 }
                 if(casilla[casilla[y].getMovimientoN()+y].getPosGraficaX()==casilla[y].getPosGraficaX()){
                      at.rotate(Math.toRadians(10));
                 }
                if (casilla[casilla[y].getMovimientoN()+y].getPosGraficaY()-casilla[y].getPosGraficaY()<2*tamanoCasillaY){
                 at.scale(1,1.2); 
                }
                if(casilla[casilla[y].getMovimientoN()+y].getPosGraficaY()-casilla[y].getPosGraficaY()>tamanoCasillaY*2)
                   at.scale(1,1.5); 
                 if(casilla[casilla[y].getMovimientoN()+y].getPosGraficaX()-casilla[y].getPosGraficaX()>tamanoCasillaX*2)
                     at.scale(1,1.7); 
               }
            else if (texto.equals("Serpiente")){
                AffineTransform at2 = new AffineTransform();
                at2.translate((casilla[y].getPosGraficaX()-tamanoCasillaX),(casilla[y].getPosGraficaY()+2*tamanoCasillaY));
                at2.rotate(Math.toRadians(-45));
               if (casilla[casilla[y].getMovimientoN()+y].getPosGraficaX()<casilla[y].getPosGraficaX()){
                     if (casilla[casilla[y].getMovimientoN()+y].getPosGraficaX()-casilla[y].getPosGraficaX()>375){
                         at2.rotate(Math.toRadians(15));
                     }
                     else
                     at2.rotate(Math.toRadians(30));
                 }
                 if(casilla[casilla[y].getMovimientoN()+y].getPosGraficaX()>casilla[y].getPosGraficaX()){
                    if (casilla[casilla[y].getMovimientoN()+y].getPosGraficaX()-casilla[y].getPosGraficaX()>375){
                        if(casilla[casilla[y].getMovimientoN()+y].getPosGraficaX()-casilla[y].getPosGraficaX()>500){
                            at2.rotate(Math.toRadians(-80));
                        }
                        else
                            at2.rotate(Math.toRadians(-60));
                     }
                     else
                     at2.rotate(Math.toRadians(-20));
                 }
                if (casilla[casilla[y].getMovimientoN()+y].getPosGraficaY()-casilla[y].getPosGraficaY()>tamanoCasillaY){
                 at2.scale(1,1.1); 
                } 
                if(casilla[casilla[y].getMovimientoN()+y].getPosGraficaY()-casilla[y].getPosGraficaY()>tamanoCasillaY*2)
                   at2.scale(1,1.3); 
                 if(casilla[casilla[y].getMovimientoN()+y].getPosGraficaX()-casilla[y].getPosGraficaX()>tamanoCasillaX*2)
                     at2.scale(1,1.3); 
            } 
           } 
    } 
} 
    
