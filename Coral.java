public class Coral {
    private boolean bleaching;
    private String ocean;
    private int year;
    private double depth;
    private boolean storms;
    private String humanImpact;
    private String siltation;
    private String dynamite;
    private String poison;
    private String sewage;
    private String industrial;
    private String commercial;
    
    
    public Coral(boolean b, String o, int yr, double d, boolean st, String hI, String silt, String dyn, String poi, String sew, String ind, String com){
        bleaching = b;
        ocean = o;
        year = yr;
        depth = d;
        storms = st;
        humanImpact = hI;
        siltation = silt;
        dynamite = dyn;
        poison = poi;
        sewage = sew;
        industrial = ind;
        commercial = com;
    }
    
    public boolean getBleaching(){
        return bleaching;
    }
    
    public String getOcean(){
        return ocean;
    }
    
    public int getYear(){
        return year;
    }
    
    public double getDepth(){
        return depth;
    }
    public boolean getStorms(){
        return storms;
    }
    
    public String getHuman(){
        return humanImpact;
    }
    
    public String getSiltation(){
        return siltation;
    }
    
    public String getDynamite(){
        return dynamite;
    }
    
    public String getPoison(){
        return poison;
    }
    
    public String getSewage(){
        return sewage;
    }
    
    public String getIndustrial(){
        return industrial;
    }
    
    public String getCommercial(){
        return commercial;
    }
    
    
    public String toString(){
        return "" + bleaching + depth + humanImpact + siltation;
    }
    
    
    
}
