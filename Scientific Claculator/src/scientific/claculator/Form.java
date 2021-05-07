package scientific.claculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;  
import javax.swing.*;   
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
public class Form implements ActionListener
{ 
    JFrame frame,frame2;
    JTextField textfield1, textfield2;
    JLabel label1, label2,label3,labelreg,label4,label5,label6,label7;
    JButton button;
    JPasswordField passwordfield;
    JCheckBox checkbox;
    JRadioButton radiobutton;
    JMenuItem menubutton;
    JRadioButtonMenuItem togglebutton,togglebutton2;
    JComboBox Combobox1,Combobox2,Combobox3;
    ButtonGroup bg;
    

    
    Form()
    {
        frame=new JFrame("Registration Form");
        frame.setSize(1200,1100);  
        frame.setLayout(null); 
        //frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\Dexter Sam\\Downloads\\bat.png")));
        frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\Dexter Sam\\Documents\\NetBeansProjects\\Reg\\src\\bat.png")));
        //frame.setContentPane(new JLabel(new ImageIcon("D:\\Wallpapers\\colorlib-regform-7\\colorlib-regform-7\\images\\signup-image.jpg")));
        //frame.getContentPane().setBackground(Color.darkGray);
        //frame.getContentPane().setBackground(new java.awt.Color(33, 37,46));
        
        labelreg =new JLabel("Register");
        labelreg.setFont(new Font("Sofia", Font.BOLD | Font.PLAIN, 50));
        labelreg.setBounds(780,2, 300,100); 
        labelreg.setForeground(new java.awt.Color(109, 119,129));
       
        label1=new JLabel("Username : ");  
        label1.setFont(new Font("Serif", Font.BOLD, 20));
        label1.setBounds(600,60,200,100); 
        //label1.setForeground(new java.awt.Color(255, 255,255));
        label1.setForeground(new java.awt.Color(45, 76,96));
        //label1.setOpaque(true);
        //label1.setBackground(new java.awt.Color(50, 51,59));
        
        
        

        label2=new JLabel("E-Mail     : ");  
        label2.setBounds(600,112, 200,100); 
        //label2.setForeground(new java.awt.Color(255, 255,255));
        label2.setForeground(new java.awt.Color(45, 75,96));
        label2.setFont(new Font("Serif", Font.BOLD, 20));
        
        label3=new JLabel("Password : ");  
        label3.setBounds(600,162, 200,100); 
        //label3.setForeground(new java.awt.Color(255, 255,255));
        label3.setForeground(new java.awt.Color(45, 75,96));
        label3.setFont(new Font("Serif", Font.BOLD, 20));
        
        label4=new JLabel("BirthDate : ");  
        label4.setBounds(600,212, 200,100); 
        //label4.setForeground(new java.awt.Color(255, 255,255));
        label4.setForeground(new java.awt.Color(45, 75,96));
        label4.setFont(new Font("Serif", Font.BOLD, 20));
        
        label5=new JLabel("Gender     : ");  
        label5.setBounds(600,262, 200,100); 
        //label5.setForeground(new java.awt.Color(255, 255,255));
        label5.setForeground(new java.awt.Color(45, 75,96));
        label5.setFont(new Font("Serif", Font.BOLD, 20));
        
        textfield1=new JTextField();  
        textfield1.setBounds(700,100, 350,30);
        textfield1.setForeground(new java.awt.Color(133, 137,146));
        textfield1.setBackground(new java.awt.Color(19, 22,27));
        textfield1.setBorder(new LineBorder(Color.gray,1));
        
        
        textfield2=new JTextField();  
        textfield2.setBounds(700,150, 350,30);
        textfield2.setBorder(new LineBorder(Color.gray,1));
        textfield2.setForeground(new java.awt.Color(133, 137,146));
        textfield2.setBackground(new java.awt.Color(19, 22,27));
        //textfield2.setEditable(false);
        
        passwordfield=new JPasswordField();  
        passwordfield.setBounds(700,200, 350,30);
        passwordfield.setBorder(new LineBorder(Color.gray,1));
        passwordfield.setForeground(new java.awt.Color(133, 137,146));
        passwordfield.setBackground(new java.awt.Color(19, 22,27));
        //passwordfield.setEditable(false);
        
        
        String[] options = { "Date", "1","2", "3", "4", "5","6","7","8","9","10","11","12","13","14","15" };
        Combobox1= new JComboBox(options);
        Combobox1.setBounds(700,250,117,30);
        Combobox1.setEditable(true);
        Combobox1.getEditor().getEditorComponent().setBackground(new java.awt.Color(19, 22,27));
        Combobox1.getEditor().getEditorComponent().setForeground(new java.awt.Color(113,138,146));
        
        String[] optionssss = { "Year", "2017", "2016", "2015", "2014","2013","2012","2011","2010","2009","2008","2007" };
        Combobox2= new JComboBox(optionssss);
        Combobox2.setBounds(934,250,117,30);
        Combobox2.setEditable(true);
        Combobox2.getEditor().getEditorComponent().setBackground(new java.awt.Color(19, 22,27));
        Combobox2.getEditor().getEditorComponent().setForeground(new java.awt.Color(113,138,146));
        
        String[] optionss = { "Month", "January", "February", "March", "April","May","June","July","August","September","October","November","December"};
        Combobox3= new JComboBox(optionss);
        Combobox3.setBounds(817,250,117,30);
        Combobox3.setEditable(true);
        Combobox3.getEditor().getEditorComponent().setBackground(new java.awt.Color(19, 22,27));
        Combobox3.getEditor().getEditorComponent().setForeground(new java.awt.Color(113,138,146));
        
        
        
        
        checkbox= new JCheckBox("I agree to the terms and condtitions");
        checkbox.setBounds(700,350,350,30);
        checkbox.setBackground(new java.awt.Color(33, 37,46));
        checkbox.setForeground(new java.awt.Color(233, 237,246));
        
        radiobutton= new JRadioButton();
        radiobutton.setBounds(700,350,50,50);
        radiobutton.setBackground(new java.awt.Color(33, 37,46));
        
        ButtonGroup bg=new ButtonGroup();
        togglebutton=new JRadioButtonMenuItem("Male");
        togglebutton.setBounds(700,300,175,30);
        togglebutton.setForeground(new java.awt.Color(133, 137,146));
        togglebutton.setBackground(new java.awt.Color(19, 22,27));
        bg.add(togglebutton);
        
        togglebutton2=new JRadioButtonMenuItem("Female");
        togglebutton2.setBounds(874,300,175,30);
        togglebutton2.setForeground(new java.awt.Color(133, 137,146));
        togglebutton2.setBackground(new java.awt.Color(19, 22,27));
        bg.add(togglebutton2);
        
        button=new JButton("Register");  
        button.setBounds(780,400,200,50);  
        button.setBackground(new java.awt.Color(31, 206,109));
        button.setForeground(new java.awt.Color(246, 255,255));
        button.addActionListener(this);  
        
        frame.add(new JLabel(new ImageIcon("D:\\Wallpapers\\colorlib-regform-7\\colorlib-regform-7\\images\\signup-image.jpg")));
        frame.add(label1); 
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(labelreg);
        frame.add(button);
        frame.add(textfield1);
        frame.add(textfield2);
        frame.add(passwordfield);
        frame.add(checkbox);
        //frame.add(radiobutton);
        frame.add(togglebutton);
        frame.add(togglebutton2);
        frame.add(Combobox1);
        frame.add(Combobox2);
        frame.add(Combobox3);
        
        frame.setVisible(true); 
        Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getWidth()/2, dim.height/2-frame.getHeight()/2);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {  
        Login logged = new Login();
        logged.setVisible(true);
        WindowEvent closed = new WindowEvent(frame,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closed);
             
    }  
     
    public static void main(String[] args) 
    {  
           new Form();
    }  
}  

