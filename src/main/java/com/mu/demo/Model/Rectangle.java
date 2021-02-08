package com.mu.demo.Model;


import com.mu.demo.Aspect.MyLog;
import com.mu.demo.Observer.Observable;
import com.mu.demo.Observer.Parametrage;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Rectangle extends Figgur implements Serializable {

    public double L;
    public double H;

    public Rectangle(double l,double h,Point p) {
        super(p);
        this.L=l;
        this.H=h;
    }
    public Rectangle() {
        super(new Point(0,0));

    }

    @Override
    @MyLog
    public double surface() {
        return L*H;
    }

    @Override
    @MyLog
    public double piremiter() {
        return 2*(L+H);
    }

    @Override
    @MyLog
    public void draw() {
        System.out.println(L+"  "+H+"piremiter :"+piremiter()+
                "surface :"+surface());
    }

    @Override
    public void update(Observable o) {
        int colorc=((Parametrage) o).getColorC();
        int colors=((Parametrage) o).getColorS();
        int epaisseurCc=((Parametrage) o).getEpaisseurC();
        System.out.println("color conteur :"+colorc+
                " colore surface :"+colors+
                "Epaisseur Color"+epaisseurCc);
    }
}
