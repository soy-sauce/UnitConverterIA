import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.lang.String;
import javax.swing.MutableComboBoxModel;

public class ConverterFrame extends JFrame{
  private static final int FRAME_WIDTH =600;
    private static final int FRAME_HEIGHT=400; 
    
  private JLabel inputLabel;
  private JLabel outputLabel;
  private JTextField inputField;
  private JTextField outputField;
  private JButton button;
  private JLabel resultLabel;
  private JComboBox subUnitCombo;
  private JRadioButton distButton;
  private JRadioButton measButton;
  private JRadioButton tempButton;
  private JRadioButton timeButton;
  private JRadioButton weightButton;
  private JButton calcButton;
  private int boxgroup;
  
  public ConverterFrame(){
      setSize(FRAME_WIDTH, FRAME_HEIGHT); 
      //@param FRAME_WIDTH
          //sets width of GUI frame
      //@param FRAME_HEIGHT
         //sets height of GUI frame
      createTextField();
      createControlPanel();
      //createComboBox();
      //makeComboBoxModel();
      createComboBox2();
      createButton();
      createPanel();
  }
  

 private void createTextField(){
     inputLabel = new JLabel("Input: ");

      final int FIELD_WIDTH = 10;
      inputField = new JTextField(FIELD_WIDTH);
          inputField.setText("0");
 }
 
 
   public void createControlPanel()
   {
      
      JPanel outUnitPanel = createComboBox2();
      JPanel unitPanel = createRadioButtons();


      JPanel controlPanel = new JPanel();
          controlPanel.setLayout(new GridLayout(4, 3));
          
      
          controlPanel.add(outUnitPanel);
          controlPanel.add(unitPanel);

      

          add(controlPanel, BorderLayout.SOUTH);
      //add(panel, BorderLayout.North);
   }
 

  

  
   public JPanel createRadioButtons()
   {
         distButton = new JRadioButton("Distance");
                   distButton.addActionListener(new ActionListener() {
                   public void actionPerformed(ActionEvent arg0) {
                   boxgroup=1;
                                                  }
                                         });
         measButton = new JRadioButton("Measurement");
                   measButton.addActionListener(new ActionListener() {
                   public void actionPerformed(ActionEvent arg0) {
                   boxgroup=2;
                   }
                                         });
         tempButton = new JRadioButton("Temperature");
                   tempButton.addActionListener(new ActionListener() {
                   public void actionPerformed(ActionEvent arg0) {
                   boxgroup=3;
                   }
                                         });
         timeButton = new JRadioButton("Time");
                   timeButton.addActionListener(new ActionListener() {
                   public void actionPerformed(ActionEvent arg0) {
                   boxgroup=4;
                   }
                                         });           
         weightButton = new JRadioButton("Weight");
                   weightButton.addActionListener(new ActionListener() {
                   public void actionPerformed(ActionEvent arg0) {
                   boxgroup=5;
                   }
                                         });           
                   

      ButtonGroup group = new ButtonGroup();
         group.add(distButton);
         group.add(measButton);
         group.add(tempButton);
         group.add(timeButton);
         group.add(weightButton);

      JPanel panel = new JPanel();
         panel.add(distButton);
         panel.add(measButton);
         panel.add(tempButton);
         panel.add(timeButton);
         panel.add(weightButton);
         panel.setBorder(new TitledBorder(new EtchedBorder(), "Select A Unit Group"));

      return panel;
   }
   
                   
                   
 /* public JPanel createComboBox()
   {
         subUnitCombo = new JComboBox();
         if (boxgroup == 1){
              subUnitCombo.addItem("Inch");
              subUnitCombo.addItem("Foot");
              subUnitCombo.addItem("Mile");
              subUnitCombo.addItem("Yard");
              subUnitCombo.addItem("Meter");
              subUnitCombo.addItem("Centimeter");
              subUnitCombo.addItem("Milimeter");
              subUnitCombo.addItem("Kilometer");
              subUnitCombo.setEditable(true);
         }
         else if (boxgroup == 2){
             subUnitCombo.addItem("Tsp");
              subUnitCombo.addItem("Tbsp");
              subUnitCombo.addItem("Cup");
              subUnitCombo.addItem("Oz");
              subUnitCombo.addItem("Pint");
              subUnitCombo.addItem("Quart");
              subUnitCombo.addItem("Gallon");
              subUnitCombo.addItem("Liter");
              subUnitCombo.addItem("Mililiter");
              subUnitCombo.setEditable(true);
         }
          else if (boxgroup == 3){
              subUnitCombo.addItem("Farenheit");
              subUnitCombo.addItem("Celcius");
              subUnitCombo.addItem("Kelvin");
              subUnitCombo.setEditable(true);
         }
           else if (boxgroup == 4){
               subUnitCombo.addItem("Second");
              subUnitCombo.addItem("Minute");
              subUnitCombo.addItem("Hour");
              subUnitCombo.addItem("Day");
              subUnitCombo.addItem("Week");
              subUnitCombo.addItem("Year");
              subUnitCombo.setEditable(true);
         }
            else if (boxgroup == 5){
                subUnitCombo.addItem("Ounce");
              subUnitCombo.addItem("Pound");
              subUnitCombo.addItem("Gram");
              subUnitCombo.addItem("Kilogram");
              subUnitCombo.addItem("Stone");
              subUnitCombo.setEditable(true);
         }

         JPanel panel = new JPanel();
         panel.add(subUnitCombo);
         return panel;
   }                   
          
  */

  /* public MutableComboBoxModel makeComboBoxModel(String[] boxgroup){
    MutableComboBoxModel subUnitCombo = new DefaultComboBoxModel();
    if (boxgroup == 1){
              subUnitCombo.addElement("Inch");
              subUnitCombo.addElement("Foot");
              subUnitCombo.addElement("Mile");
              subUnitCombo.addElement("Yard");
              subUnitCombo.addElement("Meter");
              subUnitCombo.addElement("Centimeter");
              subUnitCombo.addElement("Milimeter");
              subUnitCombo.addElement("Kilometer");
              subUnitCombo.setEditable(true);
         }
         else if (boxgroup == 2){
             subUnitCombo.addElement("Tsp");
              subUnitCombo.addElement("Tbsp");
              subUnitCombo.addElement("Cup");
              subUnitCombo.addElement("Oz");
              subUnitCombo.addElement("Pint");
              subUnitCombo.addElement("Quart");
              subUnitCombo.addElement("Gallon");
              subUnitCombo.addElement("Liter");
              subUnitCombo.addElement("Mililiter");
              subUnitCombo.setEditable(true);
         }
          else if (boxgroup == 3){
              subUnitCombo.addElement("Farenheit");
              subUnitCombo.addElement("Celcius");
              subUnitCombo.addElement("Kelvin");
              subUnitCombo.setEditable(true);
         }
           else if (boxgroup == 4){
               subUnitCombo.addElement("Second");
              subUnitCombo.addElement("Minute");
              subUnitCombo.addElement("Hour");
              subUnitCombo.addElement("Day");
              subUnitCombo.addElement("Week");
              subUnitCombo.addElement("Year");
              subUnitCombo.setEditable(true);
         }
            else if (boxgroup == 5){
                subUnitCombo.addElement("Ounce");
              subUnitCombo.addElement("Pound");
              subUnitCombo.addElement("Gram");
              subUnitCombo.addElement("Kilogram");
              subUnitCombo.addElement("Stone");
              subUnitCombo.setEditable(true);
         }
            return comboBox;
   }
   */
  
 public JPanel createComboBox2()
   {
         subUnitCombo = new JComboBox();
         if (boxgroup == 1){
              subUnitCombo.addItem("Inch");
              subUnitCombo.addItem("Foot");
              subUnitCombo.addItem("Mile");
              subUnitCombo.addItem("Yard");
              subUnitCombo.addItem("Meter");
              subUnitCombo.addItem("Centimeter");
              subUnitCombo.addItem("Milimeter");
              subUnitCombo.addItem("Kilometer");
              subUnitCombo.setEditable(true);
         }
         else if (boxgroup == 2){
             subUnitCombo.addItem("Tsp");
              subUnitCombo.addItem("Tbsp");
              subUnitCombo.addItem("Cup");
              subUnitCombo.addItem("Oz");
              subUnitCombo.addItem("Pint");
              subUnitCombo.addItem("Quart");
              subUnitCombo.addItem("Gallon");
              subUnitCombo.addItem("Liter");
              subUnitCombo.addItem("Mililiter");
              subUnitCombo.setEditable(true);
         }
          else if (boxgroup == 3){
              subUnitCombo.addItem("Farenheit");
              subUnitCombo.addItem("Celcius");
              subUnitCombo.addItem("Kelvin");
              subUnitCombo.setEditable(true);
         }
           else if (boxgroup == 4){
               subUnitCombo.addItem("Second");
              subUnitCombo.addItem("Minute");
              subUnitCombo.addItem("Hour");
              subUnitCombo.addItem("Day");
              subUnitCombo.addItem("Week");
              subUnitCombo.addItem("Year");
              subUnitCombo.setEditable(true);
         }
            else if (boxgroup == 5){
                subUnitCombo.addItem("Ounce");
              subUnitCombo.addItem("Pound");
              subUnitCombo.addItem("Gram");
              subUnitCombo.addItem("Kilogram");
              subUnitCombo.addItem("Stone");
              subUnitCombo.setEditable(true);
         }
    

         JPanel panel = new JPanel();
         panel.add(subUnitCombo);
              return panel;
   }
   
   private void createButton()
   {
      calcButton = new JButton("Calculate");
      calcButton.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent arg0) {
                    System.out.println("Ya Clicked me");
                                                  }
                                         });
                                    }
   
  private void createPanel()
   {
  //   JPanel subUnitPanel = createComboBox();
         JPanel panel = new JPanel();
         panel.setLayout(new GridLayout(3, 1));

   //      panel.add(subUnitPanel);
         panel.add(inputLabel);
         panel.add(inputField);
         panel.add(calcButton);
        //mustadd resultlabel here!!!!!::::  panel.add(resultLabel);      
        add(panel, BorderLayout.CENTER);
   } 
   
 

 
  
}
