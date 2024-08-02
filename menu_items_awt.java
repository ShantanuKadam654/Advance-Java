import java.awt.*;
import java.lang.*;

class demo1 extends Frame
{
   public demo1()
   {
       MenuBar mb;
       Menu f,e,s;
       MenuItem n,o,c;
       MenuItem u,ct,p;
       MenuItem fnd;

       mb=new MenuBar();
       setMenuBar(mb);

       f=new Menu("File");
       e=new Menu("Edit");
       s=new Menu("Search");

       mb.add(f);
       mb.add(e);
       mb.add(s);

       n=new MenuItem("New");
       o=new MenuItem("Open");
       c=new MenuItem("Copy");

       f.add(n);
       f.add(o);
       f.add(c);

       u=new MenuItem("Undo");
       ct=new MenuItem("Cut");
       p=new MenuItem("Paste");

       e.add(u);
       e.add(ct);
       e.add(p);

       fnd=new MenuItem("Find");

       s.add(fnd);

       setSize(400,400);
       setVisible(true);
   }
}

class menu_items_awt
{
   public static void main(String args[])
   {
       demo1 d=new demo1();
   }
}

