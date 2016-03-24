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
  
  public ConverterFrame(){
      setSize(FRAME_WIDTH, FRAME_HEIGHT); 
      //@param FRAME_WIDTH
          //sets width of GUI frame
      //@param FRAME_HEIGHT
         //sets height of GUI frame
      createTextField();
      createControlPanel();
      createComboBox();
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
 
  public JPanel createComboBox()
   {
         subUnitCombo = new JComboBox();
         subUnitCombo.addItem("Farenheit");
         subUnitCombo.addItem("Celcius");
         subUnitCombo.addItem("Kelvin");
         subUnitCombo.setEditable(true);
    //  subUnitCombo.addActionListener(listener);

         JPanel panel = new JPanel();
         panel.add(subUnitCombo);
         return panel;
   }
  
  public JPanel createComboBox2()
   {
         subUnitCombo = new JComboBox();
         subUnitCombo.addItem("Farenheit");
         subUnitCombo.addItem("Celcius");
         subUnitCombo.addItem("Kelvin");
         subUnitCombo.setEditable(true);
    //  subUnitCombo.addActionListener(listener);

         JPanel panel = new JPanel();
         panel.add(subUnitCombo);
              return panel;
   }
  
   public JPanel createRadioButtons()
   {
         distButton = new JRadioButton("Distance");
         // smallButton.addActionListener(listener);

         measButton = new JRadioButton("Measurement");
        //  mediumButton.addActionListener(listener);

         tempButton = new JRadioButton("Temperature");
        //   largeButton.addActionListener(listener);
       //  largeButton.setSelected(true);
         timeButton = new JRadioButton("Time");
      
         weightButton = new JRadioButton("Weight");

        // Add radio buttons to button group

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
     JPanel subUnitPanel = createComboBox();
         JPanel panel = new JPanel();
         panel.setLayout(new GridLayout(3, 1));

         panel.add(subUnitPanel);
         panel.add(inputLabel);
         panel.add(inputField);
         panel.add(calcButton);
        //mustadd resultlabel here!!!!!::::  panel.add(resultLabel);      
        add(panel, BorderLayout.CENTER);
   } 
   
 

 
  
}