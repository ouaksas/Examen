package com.mu.demo.Model;

import com.mu.demo.Observer.Observable;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;

@Component
public class Group extends Figgur implements Serializable {

    private ArrayList<Figgur> figgurs;

    public Group(Point p) {
        super(p);
        figgurs=new ArrayList<>();
    }
    public Group() {
        super(new Point(0,0));
    }


    @Override
    public double surface() {
        double sur=0;
        for(Figgur f:figgurs){
            sur+=f.surface();
        }
        return sur;
    }

    @Override
    public double piremiter() {
        double sur=0;
        for( Figgur figgur : figgurs){
            sur=figgur.piremiter();
        }

        return sur;
    }

    @Override
    public void draw() {
        for (Figgur figgur: figgurs){
            figgur.draw();
        }
    }

    public void addFigure(Figgur figgur){

        this.figgurs.add(figgur);
    }
    public void remove(Figgur f){

        figgurs.remove(f);
    }

    @Override
    public void update(Observable o) {
        for(Figgur figgur : figgurs){
            figgur.update(o);
        }
    }
}
