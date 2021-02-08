package com.mu.demo.Observer;

import com.mu.demo.Model.Figgur;
import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Data @AllArgsConstructor
public class Parametrage implements Observable{
    public int colorC;
    public int colorS;
    public int epaisseurC;
    public ArrayList<Observer> figurs;

    public Parametrage(){
        figurs=new ArrayList<>();
    }

    @Override
    public void notif() {
        for(Observer o : figurs){
            o.update(this);
        }
    }


    @Override
    public void remove(Figgur f) {

        figurs.remove(f);
    }


    @Override
    public void add(Figgur f) {

        figurs.add(f);
    }
}
