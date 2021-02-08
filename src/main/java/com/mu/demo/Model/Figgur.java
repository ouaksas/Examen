package com.mu.demo.Model;


import com.mu.demo.Aspect.MyLog;
import com.mu.demo.Observer.Observer;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public abstract class Figgur implements Observer, Serializable {

    public Point p;

    public Figgur(Point p ){
        this.p=p;
    }
    @MyLog
    public abstract double surface();
    @MyLog
    public abstract double piremiter();
    @MyLog
    public abstract void draw();

}
