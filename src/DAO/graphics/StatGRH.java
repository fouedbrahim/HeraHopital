/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.graphics;


import DAO.implementation.StatGrhDAO;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Foued ben brahim
 */
public class StatGRH extends ApplicationFrame  {
    
   
   //public StatPresence() {}

    public StatGRH( String title ) 
   {
      super( title ); 
      setContentPane(createDemoPanel( ));
   }
   private static PieDataset createDataset( ) 
   { 
      DefaultPieDataset dataset = new DefaultPieDataset();
        StatGrhDAO g = new StatGrhDAO();
      dataset.setValue( "  Medecins   :  '"+g.countMEd()+"'" ,g.countMEd());  
      dataset.setValue( " Secretaires   :  '"+g.countSEC()+"'"  ,g.countSEC() );   
      dataset.setValue( "  Directeurs   :  '"+g.countDirecteurs()+"'" ,g.countDirecteurs());  
      dataset.setValue( " Responsables Relations   :  '"+g.countResponsablesRelationEXT()+"'"  ,g.countResponsablesRelationEXT() );
      dataset.setValue( "  Stagiaires   :  '"+g.countStag()+"'" ,g.countStag());  
      dataset.setValue( " Patients   :  '"+g.countPatients()+"'"  ,g.countPatients() );
      //dataset.setValue( "MotoG" , 4 );    
     // dataset.setValue( "Nokia Lumia" , 5 );  
      return dataset;         
   }
   private static JFreeChart createChart( PieDataset dataset )
   {
      JFreeChart chart = ChartFactory.createPieChart(      
         "Ressouces humaines",  // chart title 
         dataset,        // data    
         true,           // include legend   
         true, 
         false);

      return chart;
   }
   public static JPanel createDemoPanel( )
   {
      JFreeChart chart = createChart(createDataset( ) );  
      return new ChartPanel( chart ); 
   }
   public static void main( String[ ] args )
   {
    StatGRH dem = new StatGRH( "Ressouces humaines" );  
      dem.setSize( 560 , 367 );    
      RefineryUtilities.centerFrameOnScreen( dem );    
      dem.setVisible( true ); 
   }

    
    
}