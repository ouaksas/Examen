package com.mu.demo.stratgy;






import com.mu.demo.Model.Group;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Dessin {
    ArrayList<Group> groups;
    Traiter t;

    public Dessin(){
        groups=new ArrayList<>();
    }
    public void traier(){
        t.traiter();
    }


    public void add(Group g){
        groups.add(g);
    }

    public void remove(Group g){
        groups.remove(g);
    }

    public void afficherDessin(){
        for(Group g:groups){
            g.draw();
        }
    }
    public void serialiser() throws Exception {
        File file=new File("Path");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

        for(Group g : groups){
            objectOutputStream.writeObject(g);
        }
    }


}
