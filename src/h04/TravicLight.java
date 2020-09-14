package h04;

import java.awt.*;
import java.applet.*;



public class TravicLight extends Applet {


    public void paint(Graphics g) {
      
                                {

                                    g.setColor(Color.black);//pole top
                                    g.fillRect(150,150,50,150);
                                    g.drawRect(150,150,50,150);
                                    g.setColor(Color.black);//POLE UP
                                    g.fillRect(150,150,50,150);
                                    g.drawRect(150,150,50,150);
                                    g.setColor(Color.black);//POLE DOWN
                                    g.fillRect(165,300,20,155);
                                    g.drawRect(165,300,20,155);
                                    g.drawOval(150,150,50,50);//RED
                                    g.drawOval(150,200,50,50);//YELLOW
                                    g.drawOval(150,250,50,50);//GREEN
                                    g.setColor(Color.red);//COUNTDOWN STOP


                                    {
                                        g.setColor(Color.red);
                                        g.fillOval(150,150,50,50);
                                        g.drawOval(150,150,50,50);

                                    }

                                    {
                                        g.setColor(Color.yellow);
                                        g.fillOval(150,200,50,50);
                                        g.drawOval(150,200,50,50);

                                    }

                                    {
                                        g.setColor(Color.blue);
                                        g.setColor(Color.green);
                                        g.fillOval(150,250,50,50);
                                        g.drawOval(150,250,50,50);

                                    }
                                }
    }



                      





    }








