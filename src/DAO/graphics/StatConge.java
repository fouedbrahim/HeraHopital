/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.graphics;

import DAO.implementation.GestionConge;
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

    


public class  StatConge extends ApplicationFrame  {
    
   
   //public StatPresence() {}

    public StatConge( String title ) 
   {
      super( title ); 
      setContentPane(createDemoPanel( ));
   }
   private static PieDataset createDataset( ) 
   { 
      DefaultPieDataset dataset = new DefaultPieDataset();
        GestionConge g = new GestionConge();
      dataset.setValue( "  CONGE ACCEPTE   :  '"+g.countCongeAccpte()+"'" ,g.countCongeAccpte());  
      dataset.setValue( " CONGE REFUSE   :  '"+g.countCongeRefuse()+"'"  ,g.countCongeRefuse() );   
      dataset.setValue( "  CONGE SANS REPONSE   :  '"+g.countCongeSansRep()+"'" ,g.countCongeSansRep());  
    
      //dataset.setValue( "MotoG" , 4 );    
     // dataset.setValue( "Nokia Lumia" , 5 );  
      return dataset;         
   }
   private static JFreeChart createChart( PieDataset dataset )
   {
      JFreeChart chart = ChartFactory.createPieChart(      
         "Statistique conge",  // chart title 
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
   StatConge dem = new StatConge("Statistique conge" );  
      dem.setSize( 560 , 367 );    
      RefineryUtilities.centerFrameOnScreen( dem );    
      dem.setVisible( true ); 
   }

    
    
}