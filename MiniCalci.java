import java.awt.*;
import java.awt.event.*;
public class MiniCalci extends Frame {
    Button b1,b2,b3,b4,b5,b6;
    Label l1,l2,l3,l4;
    TextField t1, t2;
    Panel p;
    MiniCalci()
    {
        setTitle("MiniCalci");
        setBackground(Color.WHITE);
        setLayout(null);
        setSize(400,400);
        p=new Panel();
        p.setBackground(Color.GRAY);
        p.setBounds(20,50,300,300);
        p.setLayout(null);
        add(p);
        addWindowListener(new Demo());
        l1=new Label("Enter 1st No.:");
        l1.setBounds(50,20,80,20);
        l1.setBackground(Color.GREEN);
        p.add(l1);
        t1=new TextField();
        t1.setBounds(150,20,100,20);
        t1.setForeground(Color.BLACK);
        p.add(t1);
        l2=new Label("Ënter 2nd No.:");
        l2.setBounds(50,60,80,20);
        l2.setBackground(Color.GREEN);
        p.add(l2);
        t2=new TextField();
        t2.setForeground(Color.BLACK);
        t2.setBounds(150,60,100,20);
        p.add(t2);
        b5=new Button("%");
        b5.addActionListener(new A());
        b5.setBackground(Color.DARK_GRAY);
        b5.setForeground(Color.WHITE);
        b5.setBounds(50,100,28,30);
        p.add(b5);
        b1=new Button("+");
        b1.addActionListener(new B());
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.WHITE);
        b1.setBounds(93,100,28,30);
        p.add(b1);
        b2=new Button("-");       
        b2.addActionListener(new C());
        b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.WHITE);
        b2.setBounds(136,100,28,30);
        p.add(b2);
        b3=new Button("*");
        b3.addActionListener(new D());
        b3.setBackground(Color.DARK_GRAY);
        b3.setForeground(Color.WHITE);
        b3.setBounds(179,100,28,30);
        p.add(b3);
        b4=new Button("/");
        b4.addActionListener(new E());
        b4.setBackground(Color.DARK_GRAY);
        b4.setForeground(Color.WHITE);
        b4.setBounds(222,100,28,30);
        p.add(b4);
        l3=new Label("Answer=");
        l3.setBackground(Color.GREEN);
        l3.setBounds(50,150,80,20);
        p.add(l3);
        l4=new Label("_____________");
        l4.setBounds(150,150,100,20);
        l4.setForeground(Color.WHITE);
        p.add(l4);
        b6=new Button("CLEAR");
        b6.addActionListener(new F());
        b6.setBounds(50,180,200,30);
        b6.setBackground(Color.DARK_GRAY);
        b6.setForeground(Color.WHITE);
        p.add(b6);
        
        
        }
     class A implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            String s1=t1.getText();
            String s2=t2.getText();
            try{
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                int n3=n1%n2;
                String s3=String.valueOf(n3);
                l4.setText(s3);
            }
            catch(Exception ex)
            {
                l4.setText(ex.getMessage());
            }
        }
    }
     class B implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            String s1=t1.getText();
            String s2=t2.getText();
            try{
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                int n3=n1+n2;
                String s3=String.valueOf(n3);
                l4.setText(s3);
            }
            catch(Exception ex)
            {
                l4.setText(ex.getMessage());
            }
        }
    }
     class C implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            String s1=t1.getText();
            String s2=t2.getText();
            try{
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                int n3=n1-n2;
                String s3=String.valueOf(n3);
                l4.setText(s3);
            }
            catch(Exception ex)
            {
                l4.setText(ex.getMessage());
            }
        }
    }
     class D implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            String s1=t1.getText();
            String s2=t2.getText();
            try{
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                int n3=n1*n2;
                String s3=String.valueOf(n3);
                l4.setText(s3);
            }
            catch(Exception ex)
            {
                l4.setText(ex.getMessage());
            }
        }
    }
     class E implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            String s1=t1.getText();
            String s2=t2.getText();
            try{
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                int n3=n1/n2;
                String s3=String.valueOf(n3);
                l4.setText(s3);
            }
            catch(Exception ex)
            {
                l4.setText(ex.getMessage());
            }
        }
    }
      class Demo implements WindowListener{
         
         
         
         public void WindowClosing(WindowEvent e)
         {
             dispose();
         }

        @Override
        public void windowOpened(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosing(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosed(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowIconified(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowActivated(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
     }
     class F implements ActionListener{
         public void actionPerformed(ActionEvent e)
         {
             t1.setText("");
             t2.setText("");
             l4.setText(null);
         }
     }
     
    
    public static void main(String...s)
    {
        new MiniCalci().setVisible(true);;
    }
}
