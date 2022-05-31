//QUESTION: the difference in human impact score between bleached and unbleached corals. 
//

import core.data.*;
import java.util.Scanner;
import java.util.ArrayList;
public class CoralAnalyzer{
    
    
    public static void main(String[] args){
        //Scanner ds = new Scanner("NOAA_Reef_Check__Bleaching_Data .csv");
        DataSource ds = DataSource.connectAs("csv", "NOAA_Reef_Check__Bleaching_Data1 .csv");
        //ds.setOption("skip-rows", "1");
        ds.load();
        //ds.printUsageString();
        Coral[] Corals = ds.fetchArray("Coral", "Bleaching", "Ocean", "Year", "Depth", "Storms", "HumanImpact", "Siltation", "Dynamite", "Poison", "Sewage", "Industrial", "Commercial");
        // System.out.println(Corals[0]);
        // System.out.println(Corals.length);
        // System.out.println(Corals[3].getHuman());
        
        System.out.println("Question: Is there a relation between potential influencing factors and bleaching of corals?");
        System.out.println("\n");
        
        int bleachedct = 0;
        int bleachedHI = 0;
        int bleachedSilt = 0;
        int bleachedDyn = 0;
        int bleachedPoi = 0;
        int bleachedSew = 0;
        int bleachedInd = 0;
        int bleachedCom = 0;
       
        int unct = 0;
        int unHI = 0;
        int unSilt = 0;
        int unDyn = 0;
        int unPoi = 0;
        int unSew = 0;
        int unInd = 0;
        int unCom = 0;
        
        for(int i = 0; i < Corals.length; i++){
            if(Corals[i].getBleaching()){
                bleachedct++;
                
                bleachedHI += numerate(Corals[i].getHuman());
                bleachedSilt += numSilt(Corals[i].getSiltation());
                //System.out.println(bleachedct + " " + bleachedInd);
                bleachedDyn += numerate(Corals[i].getDynamite());
                bleachedPoi += numerate(Corals[i].getPoison());
                bleachedSew += numerate(Corals[i].getSewage());
                bleachedInd += numerate(Corals[i].getIndustrial());
                bleachedCom += numerate(Corals[i].getCommercial());
            }
            else {
                unct++;
                
                unHI += numerate(Corals[i].getHuman());
                unSilt += numSilt(Corals[i].getSiltation());
                unDyn += numerate(Corals[i].getDynamite());
                unPoi += numerate(Corals[i].getPoison());
                unSew += numerate(Corals[i].getSewage());
                unInd += numerate(Corals[i].getIndustrial());
                unCom += numerate(Corals[i].getCommercial());
            }
        }
        
        System.out.println("Bleached score: ");
        System.out.println("Human Impact: " + (double) bleachedHI/bleachedct);
        System.out.println("Siltation: " + (double)bleachedSilt/bleachedct);
        System.out.println("Dynamite: " + (double)bleachedDyn/bleachedct);
        System.out.println("Poison: " + (double)bleachedPoi/bleachedct);
        System.out.println("Sewage: " + (double)bleachedSew/bleachedct);
        System.out.println("Industrial: " + (double)bleachedInd/bleachedct);
        System.out.println("Commercial: " + (double)bleachedCom/bleachedct);
        
        System.out.println();
        System.out.println("Unbleached score: ");
        System.out.println("Human Impact: " + (double)unHI/unct);
        System.out.println("Siltation: " + (double)unSilt/unct);
        System.out.println("Dynamite: " + (double)unDyn/unct);
        System.out.println("Poison: " + (double)unPoi/unct);
        System.out.println("Sewage: " + (double)unSew/unct);
        System.out.println("Industrial: " + (double)unInd/unct);
        System.out.println("Commercial: " + (double)unCom/unct);
    
        System.out.println();
        System.out.println("Correlation: ");
        System.out.println("Human Impact: " + correlation((double) bleachedHI/bleachedct, (double)unHI/unct));
        System.out.println("Siltation: " + correlation((double) bleachedSilt/bleachedct, (double)unSilt/unct));
        System.out.println("Dynamite: " + correlation((double) bleachedDyn/bleachedct, (double)unDyn/unct));
        System.out.println("Poison: " + correlation((double) bleachedPoi/bleachedct, (double)unPoi/unct));
        System.out.println("Sewage: " + correlation((double) bleachedSew/bleachedct, (double)unSew/unct));
        System.out.println("Industrial: " + correlation((double) bleachedInd/bleachedct, (double)unInd/unct));
        System.out.println("Commercial: " + correlation((double) bleachedCom/bleachedct, (double)unCom/unct));
    } 
    
    public static int numerate(String st){
        if(st.equals("high")){
            return 3;
        }
        else if(st.equals("moderate")){
            return 2;
        }
        else if(st.equals("low")){
            return 1;
        }
        else{
            return 0;
        }
    }    
    
    public static int numSilt(String st){
        if(st.equals("always")){
            return 3;
        }
        else if(st.equals("often")){
            return 2;
        }
        else if(st.equals("occasionally")){
            return 1;
        }
        else{
            return 0;
        }
    }   
        
    public static boolean correlation(double d1, double d2){
        if(Math.abs(d1-d2)/(d1+d2) > 0.15){
            return true;
        }
        return false;
    }    
        // ArrayList<Coral> Corals = new ArrayList<Coral>(0);
        // ArrayList<String> temp = new ArrayList<String>(0);
        // int ln = 0;
        // while(ds.hasNextLine()){
        //     ln++;
        //     temp.add(ds.nextLine());
        // }
        // for(int i = 0; i < ln; i++){
        //     Scanner sc = new Scanner(temp[i]);
        //     Coral n = new Coral();
        //     Corals.add(n);
        // }
        
    
    ///*
    public static void Convert(){
        
    }
    //*/
    
}
