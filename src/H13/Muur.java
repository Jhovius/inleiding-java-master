package H13;



import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Muur  extends Applet {
   Button button;
   Button knop;
   boolean drawWallBrick = false;
   boolean drawWallConcrete = false;

   public void init() {
      button = new Button();
      knop = new Button();
      add(button);
      add(knop);

      button.setLabel("grijs");
      knop.setLabel("rood");


      button.addActionListener(new knopListener());
      knop.addActionListener(new randomListener());


   }

   public void paint(Graphics g) {



     {
         if (drawWallBrick == true)
         tekenMuur(g, 15, 7);

        }

     {
         if (drawWallConcrete == true)
         tekenMuur2(g, 30, 10);
      }
   }


   public void tekenBaksteen(Graphics g, int x, int y, int width, int height) {
      g.setColor(Color.red);
      g.fillRect(x, y, width, height);
      g.drawRect(x, y, width, height);
   }

   public void tekenBetonblok(Graphics g, int x, int y, int width, int height) {

      g.fillRect(x, y, width, height);
      g.drawRect(x, y, width, height);
   }

   public void tekenMuur(Graphics g, int width, int height) {
      int x = 0;
      int y = 0;
      for (int row = 0; row < 500 / height; row++) {
         for (int column = 0; column < 500 / width; column++) {
            tekenBetonblok(g, x, y, width, height);
            x += width;
         }
         y += height;
         x = 0;
      }

   }

   public void tekenMuur2(Graphics g, int width, int height) {
      int x = 0;
      int y = 0;
      for (int row = 0; row < 500/ height; row++) {
         for (int column = 0; column < 500 / width; column++) {
            tekenBaksteen(g, x, y, width, height);
            x += width;
         }
         y += height;
         x = 0;
      }




   }

  class knopListener implements ActionListener {
     public void actionPerformed(ActionEvent e) {


        drawWallBrick = true;

        repaint();

     }
   }

    class randomListener implements ActionListener {
       public void actionPerformed(ActionEvent e) {
          drawWallConcrete = true;

          repaint();


       }
   }
}







