package com.mu.demo.Model;


import com.mu.demo.Aspect.MyLog;
import com.mu.demo.Aspect.SecuredByAspect;
import com.mu.demo.Observer.Observable;
import com.mu.demo.Observer.Parametrage;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Circle extends Figgur implements Serializable {

    public double rayon;

    public Circle() {
        super(new Point(0,0));
    }
    public Circle(double v, Point point) {
        super(point);
    }


    @MyLog
    @Override
    public double surface() {
        return Math.PI * Math.pow(rayon,2);
    }

    @Override
    public double piremiter() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public void draw() {
        System.out.println("rayen :"+rayon +
                "Surface : "+surface()+
                "piremitre :" +piremiter());
    }

    @Override
    @MyLog
    @SecuredByAspect(roles = {"ADMIN"})
    public void update(Observable o) {
        int colorc=((Parametrage) o).getColorC();
        int colors=((Parametrage) o).getColorS();
        int epaisseurCc=((Parametrage) o).getEpaisseurC();
        System.out.println("color conteur :"+colorc+
                " colore surface :"+colors+
                "Epaisseur Color"+epaisseurCc);
    }
}
