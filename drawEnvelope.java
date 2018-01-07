package envelope;

public class drawEnvelope  extends dxf12objects {
    // start attributes

    public double[] dataArray = {0,0,0,0,0,0,0,0,0,0,0,0};

    public double length = 0;
    public double width = 0;
    public double depth = 0;
    public String style = "DSSOGS";
    public String unit = "m";
    public String flute = "E";

    public double inrAlw = 0;
    public double inrWidth = 0; // ***************
    public double glFlp = 0; // Glue Flap
    public double mainGhstCre = 0;
    public double mainCutBk = 0; // Cut in for the Inner section
    public double inrGhstCre = 0;
    public double dblTopBend = 0;
    public double topN2Cre = 0;
    public double psSec = 0;
    public double rippaTab = 0; 
    public double rippaTabL = 0; 
    public double topCutBk = 0; 
    public double toRippa = 0;
    public double topFlpY = 0;
    public double creGap = 0;
    
    public double blks1; 
    public double blkn2;
    public double interlockblks1; 
    public double interlockblkn2;

    public double eliteFlexoS1 = 1055;
    public double eliteFlexoN2 = 1575;
    public int noUpS1 = 0;
    public int noUpN2 = 0;

    public String cutlay = "CUT";
    public String crelay = "CREASE";
    public int col = 1; // Line Colour
    public String ltype = "CONTINUOUS"; // Line Type
    // end attributes

    public String drawDSSOGS() {
        dxf += dxf_header12();

        // Start Top Right of Main Body
       // Line(-dblTopBend, 0, cutlay);  
        Line(-topCutBk, 0, cutlay); 
        Line(-glFlp, glFlp, cutlay);
        Line(-(width - (glFlp*2) - topCutBk), 0, cutlay);
        Line(-(glFlp + mainCutBk), -(glFlp + mainCutBk), cutlay);
        Line(-(inrWidth - mainCutBk), 0, cutlay); 
        
        Line(0, -(length - (mainCutBk * 2)), cutlay);
        
        Line(inrWidth - mainCutBk, 0, cutlay); 
        Line(glFlp + mainCutBk, -(glFlp + mainCutBk), cutlay);
        Line(width - (glFlp*2) - topCutBk, 0, cutlay);
        Line(glFlp, glFlp, cutlay);
        Line(topCutBk, 0, cutlay);
        //Line(dblTopBend, 0, cutlay);
        
        // Main Body Creasses
        this.absMove(-topCutBk, 0);
        Line(-(width-topCutBk), 0, crelay);
        Line(0, -length, crelay);
        Line(width-topCutBk, 0, crelay);
        this.relMove(topCutBk, 0);
        Line(0, length, crelay);
        // Main Body Iner Ghost creases
        Line(-mainGhstCre, -mainGhstCre, crelay);
        Line(-(width - (mainGhstCre*2)), 0, crelay);
        Line(-mainGhstCre, mainGhstCre, crelay);
        this.relMove(mainGhstCre, -mainGhstCre);
        Line(0,-(length-(mainGhstCre*2)), crelay);
        Line(-mainGhstCre, -mainGhstCre, crelay);
        this.relMove(mainGhstCre, mainGhstCre);
        Line(width - (mainGhstCre*2), 0, crelay);
        Line(mainGhstCre, -mainGhstCre, crelay);
        this.relMove(-mainGhstCre, mainGhstCre);
        Line(0,length-(mainGhstCre*2), crelay);
        
        // Inner Main Body Creases
        this.absMove(-(width + mainCutBk + creGap), -(mainCutBk + creGap));
        Line(-(mainGhstCre - mainCutBk - creGap), -(mainGhstCre - mainCutBk - creGap), crelay);
        Line(-(width - (glFlp*2) - topCutBk - creGap), 0, crelay);
        
        Line(-(mainGhstCre - mainCutBk), (mainGhstCre - mainCutBk), crelay);
        this.relMove((mainGhstCre - mainCutBk), -(mainGhstCre - mainCutBk));
                    
        Line(0,-(length-(mainGhstCre*2)), crelay);
        
        Line(-(mainGhstCre - mainCutBk), -(mainGhstCre - mainCutBk), crelay);
        this.relMove((mainGhstCre - mainCutBk), (mainGhstCre - mainCutBk));
        
        Line(width - (glFlp*2) - topCutBk - creGap, 0, crelay);
        Line((mainGhstCre - mainCutBk - creGap), -(mainGhstCre - mainCutBk - creGap), crelay);
        
        this.relMove(-(mainGhstCre - mainCutBk - creGap), (mainGhstCre - mainCutBk - creGap));
        Line(0, (length-(mainGhstCre*2)), crelay);
         
        // Top Flap Seal
        //this.absMove(dblTopBend + topN2Cre + toRippa + rippaTab + psSec, -topFlpY);
        this.absMove(0, 0);
            
        this.envelopePSflap();
        
         
        dxf +="  0\r\n";
        dxf +="ENDSEC\r\n";
        dxf +="  0\r\n";
        dxf +="EOF\r\n";
        return dxf;
    }
      

    private void envelopePSflapOLD() {
        // this.relMove(57, 37.367);
        Line(0, 5.367, cutlay);
        Line(-20, 0, cutlay);
        this.relMove(0, -24.026);
        Line(0, 34.026 - 3, cutlay);
        this.arc2(this.xabs - 3, this.yabs, 3, 0, 90, -3, 3, cutlay);
        Line(-(12.9773 - (3 * 2)), 0, cutlay);
        
        
    } // envelopePSflap
    
    
    private void envelopePSflap() {
      double tmpX = this.xabs;
      double tmpY = this.yabs;
      
      Line(4, 0, cutlay);
      Line(20.0227, -19.5737 ,cutlay);
      Line(1.287, -2.026 ,cutlay);
      this.absMove(tmpX + 27, tmpY - 56);
      // tab
      Line(-3, 34 ,cutlay);
      Line(13, 0 ,cutlay);
      Line(0, -34 ,cutlay);
      this.relMove(0, 24);
      Line(20, 0 ,cutlay);
      
      Line(0, -length + (32 * 2) ,cutlay); // Front Edge
      
      Line(-20, 0 ,cutlay);
      this.relMove(0, 24);
      Line(0, -34 ,cutlay); // Tab
      Line(-13, 0 ,cutlay);
      Line(3, 34 ,cutlay);
      
      this.absMove(tmpX, tmpY - length);
      Line(4, 0, cutlay);
      Line(20.0227, 19.5737 ,cutlay);
      Line(1.287, 2.026 ,cutlay); 
      
      // Creases
      this.absMove(tmpX + 4, tmpY);
      Line(0, -length ,crelay);
      this.relMove(10, 10);
      Line(0, length - (10 * 2) ,crelay);
      
      
    } // envelopePSflap
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
public void allowanceSetup() {
    // System.exit(0);
    // JOptionPane.showMessageDialog(null, "Saved: " );
    
    if (this.flute == "E") {
    }
    else if (this.flute == "C") {
    }   
    else { // "B"
    }   
    
    inrAlw = -4;
    inrWidth = this.width + inrAlw; // ***************
    glFlp = 28; // Glue Flap
    mainGhstCre = 30;
    mainCutBk = 5; // Cut in for the Inner section
    inrGhstCre = mainGhstCre - mainCutBk;
    dblTopBend = 4;
    topN2Cre = 23;
    psSec = 20;
    rippaTab = 13;
    rippaTabL = 34;
    toRippa = 10;
    topFlpY = 37.367;
    topCutBk = 1;  
    creGap = 3;
    // Machine Size
    this.eliteFlexoS1 = 1055 - 25;
    this.eliteFlexoN2 = 1575 - 20;
    
//    this.blks1 = this.dinr + this.winner + this.dmain + this.wouter + this.frontFlap;
//    this.blkn2 = this.toeflap + this.dblbend + this.dside + this.lmain + this.dside + this.dblbend + this.toeflap;
//    double rrs1 = this.blks1;
//    double rrn2 = (this.toeflap + this.dblbend + this.dside + this.lmain + this.lidOffset + this.lidtabD); // this.blkn2 * 2;
    
//    this.noUpS1 = (int) (this.eliteFlexoS1 / this.blks1);
//  this.noUpN2 = 1;
//    if (this.eliteFlexoN2 - this.blkn2 > 0) {
//      double tmp = (this.eliteFlexoN2 - this.blkn2);
//      while (tmp >= rrn2) {
//        //System.out.println(rrn2 + " " + this.noUpN2 + " " + tmp);
//        tmp = tmp - rrn2;
//        this.noUpN2++;
//      } //while
//    } // if   
    
//    this.interlockblks1 = this.blks1 * this.noUpS1;
//    this.interlockblkn2 = this.blkn2 + (rrn2 * (this.noUpN2 - 1));  // (this.toeflap + this.dblbend + this.dside + this.lmain + this.lidOffset + this.lidtabD) + blkn2; 
  
  }
    
    
    
} //class
