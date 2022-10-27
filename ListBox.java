// Program 20

import java.applet.*;
import java.awt.*; 
import java.awt.event.*;

public class ListBox extends Applet implements ActionListener{
    List l1;
    TextField t1;
    Button b1,b2;
    FlowLayout f1;
    public void init(){
        f1 = new FlowLayout();
        b1 = new Button("ADD");
        b2 = new Button("REMOVE");
        t1 = new TextField(30);
        l1 = new List();
        add(t1);
        add(l1);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            String s=t1.getText();
            l1.add(s);
            t1.setText("");
        }
        if(e.getSource()==b2){
            int i = l1.getSelectedIndex();
            l1.remove(i);
        }
    }
} 
