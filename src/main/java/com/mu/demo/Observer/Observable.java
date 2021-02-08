package com.mu.demo.Observer;



import com.mu.demo.Model.Figgur;

public interface Observable {

    void notif();
    void remove(Figgur f);
    void add(Figgur f);

}
