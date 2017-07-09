/*
Inheritance and FILE IO
Jerome Aganon
Yan Yu
CENG212
semjerome@hotmail.com
Project 6
*/ 
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import javax.swing.border.*;

public class BigCompany extends JApplet {
   //Data field
   private JTextArea jtaDisplay = new JTextArea();
   private JTextField jtfName = new JTextField();
  
   private JTextField jtfNumber = new JTextField();
   private JTextField jtfTarget = new JTextField();
   private JTextField jtfLevel = new JTextField();
   private JTextField jtfTerritory = new JTextField();
   private JTextField jtfDepartment = new JTextField(); 
   private TitledBorder titledBorder1;  
   private TitledBorder titledBorder2;
   
   private JRadioButton jrbSalesMan = new JRadioButton("SalesMan", null);
   private JRadioButton jrbTechnician = new JRadioButton("Technician", null);   
   
   private JButton jbtDisplay = new JButton("Display");
   private JButton jbtSort = new JButton("Sort");
   private JButton jbtAdd = new JButton("Add");
   private JButton jbtDelete = new JButton("Delete");
   private JButton jbtReset = new JButton("Reset");
      
   ButtonGroup btg = new ButtonGroup();
      
   //Constructor
   public BigCompany() { 
   LinkedList myCompany = EmployeeData.getData();
     LinkedList copy =(LinkedList)myCompany.clone();
      
      titledBorder1 = new TitledBorder("Display Window");
      this.setSize(new Dimension(300, 300));
 
      titledBorder2 = new TitledBorder("Control Panel");
      this.setSize(new Dimension(300, 300));
      
      //Bottom Button Area
      JPanel button = new JPanel();
      button.setLayout(new GridLayout(2, 3));
      button.add(jbtDisplay);
      button.add(jbtSort);
      button.add(jbtAdd);
      button.add(jbtDelete);
      button.add(jbtReset);            
      
      //Center area's RadioButton
      JPanel radio = new JPanel(new FlowLayout());
      radio.add(jrbSalesMan);
      radio.add(jrbTechnician);      
      
      //Add function to ratio
      jrbSalesMan.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           System.out.println("SalesMan");
        }
      });
      
      jrbTechnician.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           System.out.println("Technician");
        }
      });                  
      
      //Center Area of East Panel
      JPanel jpEnterText = new JPanel(new GridLayout(6, 1 ));
      //jtfName.setPreferredSize( new Dimension( 1, 1 ) );
      jpEnterText.add(new JLabel(" Name:"));
      jpEnterText.add(jtfName);
      jpEnterText.add(new JLabel(" Number:"));
      jpEnterText.add(jtfNumber);
      jpEnterText.add(new JLabel(" Target:"));
      jpEnterText.add(jtfTarget);
      jpEnterText.add(new JLabel(" Territory:"));
      jpEnterText.add(jtfTerritory);
      jpEnterText.add(new JLabel(" Level:"));
      jpEnterText.add(jtfLevel);
      //jpEnterText.add(new JLabel(" Department:"));
      //jpEnterText.add(jtfDepartment);      
      
      //East Panel      
      JPanel east = new JPanel(new BorderLayout());
      east.add(radio, BorderLayout.NORTH);
      east.add(jpEnterText, BorderLayout.CENTER);
      east.add(button, BorderLayout.SOUTH);
      east.setBorder(titledBorder2);
      
      //West Area
      JPanel showText = new JPanel(new BorderLayout());
      showText.add(jtaDisplay, BorderLayout.CENTER);
      showText.setBorder(titledBorder1);
            
      //Add to Panel
      add(showText, BorderLayout.CENTER);
      add(east, BorderLayout.EAST);
      
      //ButtonGroup
      btg.add(jrbSalesMan);
      btg.add(jrbTechnician);
      
      //Add function here
      jbtDisplay.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
        int count =0;
      String temp="";
      //for (Employee em : myCompany)
      for(int g = 0; g< myCompany.size(); g++)
      {
         temp= temp+myCompany.get(g)+"\n";
         jtaDisplay.setText(temp);
         System.out.println(myCompany.get(g));
      }
            
            System.out.println("Display");
         }
      });
      //Listener for Sort
      jbtSort.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
                 Company.sortList(myCompany);

         }
      });
      //Listener for Add button
      jbtAdd.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            System.out.println("Add");
        Employee employed[] = new Employee[1];          
      String toe="";
      if (jrbSalesMan.isSelected())
      {
      toe = "S";
      }
      if(jrbTechnician.isSelected())
      {
      toe = "T";
      }
            int eid = Integer.parseInt(jtfNumber.getText());
            int lvl = Integer.parseInt(jtfLevel.getText());
            double tar = Double.parseDouble(jtfTarget.getText());
           String name = jtfName.getText();
            String ter = jtfTerritory.getText();
      Company.addEmployee(toe, eid, name, ter, lvl, tar, myCompany);
           
         }
      });
      //Listener for Delete
      jbtDelete.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
          int eid = Integer.parseInt(jtfNumber.getText());
         Company.deleteEmployee(eid, myCompany);

            System.out.println("Delete");
         }
      });        
      //Listener for Reset
      jbtReset.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
           // myCompany = copy;
           Company.reset(myCompany, copy);
            System.out.println("Reset");
         }
      });      
   }
   
   public static void main(String[] args) {
      // Create a frame
      JFrame frame = new JFrame("BigCompany"); 
        
      // Create a instance of the applet
      BigCompany applet = new BigCompany();
      applet.init();
      
      frame.getContentPane().add(applet, BorderLayout.CENTER);      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
      frame.setSize(700, 600);
      frame.setVisible(true);
          
   }
}   