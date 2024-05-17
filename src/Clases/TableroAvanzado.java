package Clases;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JOptionPane;



public class TableroAvanzado extends Tablero{
    public TableroAvanzado(int numeroCasillas, Jugador[] jugador, Casilla[] casilla, int numerojugadores) {
       super(numeroCasillas, jugador, casilla, numerojugadores);
    }
    @Override
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
               if (casilla[jugador[jugadorActual].getCasillaActual()].getTipoCasilla().equals("Cambia Tablero")){
                  
                  for (int cont = 1; cont<=(int)numeroCasillas;cont++){
                      casilla[cont].setTipoCasilla("Simple");
                  }
                   Random aleatorio = new Random();
                  for (int h = 1; h<=5;h++){
                      int variable_aleatoria = aleatorio.nextInt((int)(numeroCasillas))+1; 
                       while(true){
                            if (variable_aleatoria == 1|| variable_aleatoria ==numeroCasillas){ 
                                variable_aleatoria = aleatorio.nextInt((int)(numeroCasillas))+1; 
                                continue; 
                            }
                            break; 
                        }
                        casilla[variable_aleatoria].setTipoCasilla("Pierde Turno");
                   } 



                    for (int a=1;a<=5;a++){
                        int variable_aleatoria = aleatorio.nextInt((int)numeroCasillas)+1; 
                        while(true) 
                        { 
                            if(variable_aleatoria==1||variable_aleatoria==numeroCasillas)
                            {
                                variable_aleatoria = aleatorio.nextInt((int)(numeroCasillas))+1; 
                                continue;
                            }
                            break; 
                        }
                        casilla[variable_aleatoria].setTipoCasilla("Tira de Nuevo"); 
                    }
                    for (int i =1;i<=5;i++)
                    {
                        int variable_aleatoria=aleatorio.nextInt((int)numeroCasillas)+1;
                        while(true)
                        { 
                            if(variable_aleatoria==1||variable_aleatoria==numeroCasillas)
                            {
                                variable_aleatoria = aleatorio.nextInt((int)(numeroCasillas))+1; 
                                continue;
                            }
                            break; 
                        }
                        casilla[variable_aleatoria].setTipoCasilla("Cambia Tablero"); 

                    }
                    int variable_avanza;
                    for (int k = 1;k<=5;k++){
                        int variable_aleatoria2 = aleatorio.nextInt((int)(numeroCasillas))+1; 

                        do {
                                variable_avanza = aleatorio.nextInt(20)+1;
                                if (( variable_aleatoria2 + variable_avanza ) >= (int) numeroCasillas){
                                    variable_aleatoria2 = aleatorio.nextInt((int)(numeroCasillas))+1;
                                    continue; 
                                }
                                if (variable_aleatoria2 == 1){
                                    variable_aleatoria2 = aleatorio.nextInt((int)(numeroCasillas))+1;
                                    continue; 
                                }
                                if((variable_aleatoria2)== numeroCasillas){
                                    variable_aleatoria2 = aleatorio.nextInt((int)numeroCasillas)+1;
                                    continue; 
                                }
                                if (variable_avanza <= Math.sqrt((int)numeroCasillas)){
                                    continue; 
                                }
                                break; 
                        } while ( true ) ;
                        casilla[variable_aleatoria2].setTipoCasilla("Escalera");
                        casilla[variable_aleatoria2].setMovimientoN(variable_avanza);
                    } 
                    for (int l = 1;l<=5;l++){
                        int variable_aleatoria3 = aleatorio.nextInt((int)(numeroCasillas))+1; 
                        do{

                            variable_avanza = aleatorio.nextInt(20)+1; 
                            variable_avanza= -variable_avanza; 
                            if ((variable_avanza+variable_aleatoria3)<=1){ 
                                variable_aleatoria3 = aleatorio.nextInt((int)(numeroCasillas))+1; 
                                continue; 
                            }    
                            if (casilla[variable_avanza+variable_aleatoria3].getTipoCasilla().equals("Escalera")){ 
                                variable_aleatoria3 = aleatorio.nextInt((int)(numeroCasillas))+1; 
                                continue; 
                            }
                            if (-variable_avanza <= Math.sqrt((int)numeroCasillas))
                                continue; 
                            if (variable_aleatoria3 == numeroCasillas){
                                variable_aleatoria3 = aleatorio.nextInt((int)numeroCasillas)+1;
                                continue; 
                            }
                            break; 
                        }
                        while(true);
                        casilla[variable_aleatoria3].setTipoCasilla("Serpiente");
                        casilla[variable_aleatoria3].setMovimientoN(variable_avanza);
                    } 
                    for (int m = 1;m<=5;m++){
                        int variable_aleatoria4 = aleatorio.nextInt((int)(numeroCasillas))+1; 
                        do{
                            variable_avanza = aleatorio.nextInt(5)+1; 
                            if ((variable_avanza+variable_aleatoria4) >(int)(numeroCasillas)){
                                variable_aleatoria4 = aleatorio.nextInt((int)(numeroCasillas))+1;
                                continue; 
                            }
                             if (casilla[variable_avanza+variable_aleatoria4].getTipoCasilla().equals("Serpiente")){ 
                                 variable_aleatoria4 = aleatorio.nextInt((int)(numeroCasillas))+1;
                                continue; 
                            }
                            if (variable_aleatoria4==1){
                                variable_aleatoria4 = aleatorio.nextInt((int)(numeroCasillas))+1;
                                continue;
                            } 
                            break; 
                        }while(true); 
                            casilla[variable_aleatoria4].setTipoCasilla("Avanza");
                            casilla[variable_aleatoria4].setMovimientoN(variable_avanza);
                    } 
                    super.casillaActual=1;
                    super.posX = 0;
                    super.posY = tamanoPanelY-tamanoCasillaY;
                    super.anadirCasillas(filas, columnas);
            }       
                break;
            }   
            if (dador1==1&&dador2==1){
                jugador[jugadorActual].setTurnoPerdido(jugador[jugadorActual].getTurnoPerdido()+1);
            }
            repaint(); 
            if ( jugador[jugadorActual].getCasillaActual() == (int) numeroCasillas){
                JOptionPane.showMessageDialog(null, "\n=====\nGANADOR " + " Jugador # "+ jugadorActual + "\n" +jugador[jugadorActual].getNombre());
                tirarDados.setEnabled(false);//cuando gana el juego ya no se puede seguir tirando
            }
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
} 