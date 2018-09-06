package maks;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

//@Service
public class ColorFrame extends JFrame {

//    @Autowired
//    private Color color;

    public ColorFrame() {
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    @Autowired
    ObjectFactory<Color> colorObjectFactory;

    public void showOnRandomPlace() {
        Random random = new Random();
        setLocation(random.nextInt(1200), random.nextInt(600));
//        getContentPane().setBackground(color);
        getContentPane().setBackground(colorObjectFactory.getObject());
        repaint();
    }

//    @Lookup
//    public Color getColor() {
//        return color;
//    }


}
