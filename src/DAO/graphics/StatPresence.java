/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.graphics;

import DAO.implementation.GestionDePresenceDAO;
import entites.Presence;
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

public class StatPresence extends ApplicationFrame 
{
   
   //public StatPresence() {}

    public StatPresence( String title ) 
   {
      super( title ); 
      setContentPane(createDemoPanel( ));
   }
   private static PieDataset createDataset( ) 
   { 
      DefaultPieDataset dataset = new DefaultPieDataset();
        GestionDePresenceDAO g = new GestionDePresenceDAO();
      dataset.setValue( " Nombre des Absence   :  '"+g.countAbsent()+"'" ,g.countAbsent());  
      dataset.setValue( " Nombre des Presence  :  '"+g.countPresent()+"'"  ,g.countPresent() );   
      //dataset.setValue( "MotoG" , 4 );    
     // dataset.setValue( "Nokia Lumia" , 5 );  
      return dataset;         
   }
   private static JFreeChart createChart( PieDataset dataset )
   {
      JFreeChart chart = ChartFactory.createPieChart(      
         "PRESENCE",  // chart title 
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
      StatPresence demo = new StatPresence( "PRESENCE" );  
      demo.setSize( 560 , 367 );    
      RefineryUtilities.centerFrameOnScreen( demo );    
      demo.setVisible( true ); 
   }

    
    
}
