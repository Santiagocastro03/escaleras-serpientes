package Clases;
import Clases.*;
import Clases.Navegador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
public class paginaNombres extends javax.swing.JFrame {
    Navegador Nav;
    Jugador []jugador;
    String[] textos;
    Casilla[] casilla1;
    public paginaNombres(Navegador n) {
        initComponents();
        Nav = n;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPlayer4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtPlayer4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        panelPlayer3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtPlayer3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        panelPlayer2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtPlayer2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        panelPlayer1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtPlayer1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPlayer4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelPlayer4.setForeground(new java.awt.Color(255, 255, 255));
        panelPlayer4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Nombre");
        panelPlayer4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtPlayer4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPlayer4.setText("PLAYER 4");
        panelPlayer4.add(txtPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 390, 30));

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel9.setText("JUGADOR 4");
        panelPlayer4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 40));

        getContentPane().add(panelPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 470, 110));

        panelPlayer3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelPlayer3.setForeground(new java.awt.Color(255, 255, 255));
        panelPlayer3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Nombre");
        panelPlayer3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtPlayer3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPlayer3.setText("PLAYER 3");
        panelPlayer3.add(txtPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 390, 30));

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel8.setText("JUGADOR 3");
        panelPlayer3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 40));

        getContentPane().add(panelPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 470, 110));

        panelPlayer2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        panelPlayer2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Nombre");
        panelPlayer2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtPlayer2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPlayer2.setText("PLAYER 2");
        panelPlayer2.add(txtPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 390, 30));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel7.setText("JUGADOR 2");
        panelPlayer2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 40));

        getContentPane().add(panelPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 470, 110));

        panelPlayer1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        panelPlayer1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Nombre");
        panelPlayer1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtPlayer1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPlayer1.setText("PLAYER 1");
        panelPlayer1.add(txtPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 390, 30));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel6.setText("JUGADOR 1");
        panelPlayer1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 40));

        getContentPane().add(panelPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 480, 110));

        btnPlay.setBackground(new java.awt.Color(204, 0, 0));
        btnPlay.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        btnPlay.setText("EMPEZAR A JUGAR");
        btnPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 270, 70));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 300, 40, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        textos = new String[(int)Nav.info.getNumeroJugadores()+1];
        if ((int)Nav.info.getNumeroJugadores() == 1) {
            jugador = new Jugador[3];
        } else {
          jugador = new Jugador[(int)Nav.info.getNumeroJugadores()+1];
        }
        switch((int)Nav.info.getNumeroJugadores()){
            case 2 -> {
                textos[1] = txtPlayer1.getText();
                textos[2] = txtPlayer2.getText();
            }
            case 3 -> {
                textos[1] = txtPlayer1.getText();
                textos[2] = txtPlayer2.getText();
                textos[3] = txtPlayer3.getText();
            }
            case 4 -> {
                textos[1] = txtPlayer1.getText();
                textos[2] = txtPlayer2.getText();
                textos[3] = txtPlayer3.getText();
                textos[4] = txtPlayer4.getText();
            }
        }
            for(int cont = 1;cont<=(int)Nav.info.numeroJugadores;cont++){
                Color colorFicha = JColorChooser.showDialog(null,"Escoja el color", Color.RED);
                while (colorFicha == null)
                colorFicha = JColorChooser.showDialog(null,"Escoja el color", Color.RED);
                jugador[cont] = new Jugador();
                jugador[cont].setNombre(textos[cont]);
                jugador[cont].setColorFicha(colorFicha);
            }
        
        if ((int)Nav.info.numeroJugadores == 1){
             Nav.info.setNumeroJugadores(2);
             jugador[2] = new Jugador();
             jugador[2].setNombre("Computadora");
             jugador[2].setColorFicha(Color.BLACK);          
        }
        //arreglo de clase casilla
        casilla1 = new Casilla[(int)Nav.info.numeroCasillas+1];//se inicializa con el número de casillas +1
      
        //primero se agrega que todas las casillas son de tipo simple
        for (int cont = 1; cont<=(int)Nav.info.numeroCasillas;cont++){
            casilla1[cont] = new Casilla();
            casilla1[cont].setTipoCasilla("Simple");
            
            
            
        }
        Random aleatorio = new Random();
        for (int h = 1; h<=5;h++){
            int variable_aleatoria = aleatorio.nextInt((int)(Nav.info.numeroCasillas))+1; 
            while(true){
                if (variable_aleatoria == 1|| variable_aleatoria == Nav.info.numeroCasillas){ 
                    variable_aleatoria = aleatorio.nextInt((int)(Nav.info.numeroCasillas))+1; 
                    continue; 
                }
                break; 
            }
            casilla1[variable_aleatoria].setTipoCasilla("Pierde Turno");
       }
        int variable_avanza;
        for (int k = 1;k<=5;k++){
            int variable_aleatoria2 = aleatorio.nextInt((int)(Nav.info.numeroCasillas))+1; 
            
            do {
                    variable_avanza = aleatorio.nextInt(20)+1;
                    if (( variable_aleatoria2 + variable_avanza ) >= (int) Nav.info.numeroCasillas){
                        variable_aleatoria2 = aleatorio.nextInt((int)(Nav.info.numeroCasillas))+1;
                        continue; 
                    }
                    if (variable_aleatoria2 == 1){
                        variable_aleatoria2 = aleatorio.nextInt((int)(Nav.info.numeroCasillas))+1;
                        continue;  
                    }
                    if((variable_aleatoria2)== Nav.info.numeroCasillas){
                        variable_aleatoria2 = aleatorio.nextInt((int)Nav.info.numeroCasillas)+1;
                        continue; 
                    }
                    if (variable_avanza <= Math.sqrt((int)Nav.info.numeroCasillas)){
                        continue; 
                    }
                    break; 
            } while ( true ) ;
            casilla1[variable_aleatoria2].setTipoCasilla("Escalera");
            casilla1[variable_aleatoria2].setMovimientoN(variable_avanza);
           
             
        }
        for (int l = 1;l<=5;l++){
            int variable_aleatoria3 = aleatorio.nextInt((int)(Nav.info.numeroCasillas))+1; 
            do{
                variable_avanza = aleatorio.nextInt(20)+1; 
                variable_avanza= -variable_avanza; 
                if ((variable_avanza+variable_aleatoria3)<=1){ 
                    variable_aleatoria3 = aleatorio.nextInt((int)(Nav.info.numeroCasillas))+1; 
                    continue; 
                }    
                if (casilla1[variable_avanza+variable_aleatoria3].getTipoCasilla().equals("Escalera")){ 
                    variable_aleatoria3 = aleatorio.nextInt((int)(Nav.info.numeroCasillas))+1; 
                    continue; 
                }
                
                if (-variable_avanza <= Math.sqrt((int)Nav.info.numeroCasillas))
                    continue; 
               
                if (variable_aleatoria3 == Nav.info.numeroCasillas){
                    variable_aleatoria3 = aleatorio.nextInt((int)Nav.info.numeroCasillas)+1;
                    continue; 
                }
                    
                
                break; 
            }
            while(true);
            casilla1[variable_aleatoria3].setTipoCasilla("Serpiente");
            casilla1[variable_aleatoria3].setMovimientoN(variable_avanza);
        } 
        for (int m = 1;m<=5;m++){
            int variable_aleatoria4 = aleatorio.nextInt((int)(Nav.info.numeroCasillas))+1; 
            do{
                variable_avanza = aleatorio.nextInt(5)+1; 
                if ((variable_avanza+variable_aleatoria4) >(int)(Nav.info.numeroCasillas)){
                    variable_aleatoria4 = aleatorio.nextInt((int)(Nav.info.numeroCasillas))+1;
                    continue; 
                }
                 if (casilla1[variable_avanza+variable_aleatoria4].getTipoCasilla().equals("Serpiente")){ 
                     variable_aleatoria4 = aleatorio.nextInt((int)(Nav.info.numeroCasillas))+1;
                    continue; 
                }
                if (variable_aleatoria4==1){
                    variable_aleatoria4 = aleatorio.nextInt((int)(Nav.info.numeroCasillas))+1;
                    continue;
                } 
                break; 
                
            }while(true); 
                casilla1[variable_aleatoria4].setTipoCasilla("Avanza");
                casilla1[variable_aleatoria4].setMovimientoN(variable_avanza);
        }
                JFrame frameTablero = new JFrame();
                frameTablero.setLayout(new BorderLayout());

                TableroAvanzado tablero1 = new TableroAvanzado((int) (Nav.info.numeroCasillas), Nav.index.jugador, Nav.index.casilla1, (int) Nav.info.numeroJugadores);

                frameTablero.add(tablero1, BorderLayout.CENTER);

                frameTablero.setTitle("Tablero");
                frameTablero.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
                frameTablero.setResizable(false);
                frameTablero.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameTablero.setVisible(true);
                this.setVisible(false);
        
    }//GEN-LAST:event_btnPlayActionPerformed
    private Color seleccionarColor(int eleccion){
        switch(eleccion){
            case 0:
                return Color.orange;
            case 1:
                return Color.blue;
            case 2:
                return Color.white;
            case 4:
                return Color.red;
            default:
                return Color.black;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel panelPlayer1;
    public javax.swing.JPanel panelPlayer2;
    public javax.swing.JPanel panelPlayer3;
    public javax.swing.JPanel panelPlayer4;
    private javax.swing.JTextField txtPlayer1;
    private javax.swing.JTextField txtPlayer2;
    private javax.swing.JTextField txtPlayer3;
    private javax.swing.JTextField txtPlayer4;
    // End of variables declaration//GEN-END:variables
}
