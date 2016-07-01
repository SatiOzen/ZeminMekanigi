/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbuproje3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author SATI
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private TextField txt_yuknoktasal;
    @FXML
    private TextField txt_derinliknoktasal;
    @FXML
    private Button btn_nokta;
    @FXML
    private TextField txt_uzakliknoktasal;
    @FXML
    private Label lbl_noktasalsonuc;
    @FXML
    private TextField txt_yukcizgisel;
    @FXML
    private TextField txt_derinlikcizgisel;
    @FXML
    private TextField txt_uzaklikcizgisel;
    @FXML
    private Button btn_cizgi;
    @FXML
    private Label lbl_sonuccizgisel;
    @FXML
    private TextField txt_yukserit;
    @FXML
    private TextField txt_aciAserit;
    @FXML
    private TextField txt_aciBserit;
    @FXML
    private Button btn_serit;
    @FXML
    private Label lbl_sonucserit;
    @FXML
    private TextField txt_yukucgenserit;
    @FXML
    private TextField txt_enucgenserit;
    @FXML
    private TextField txt_uzaklikucgenserit;
    @FXML
    private TextField txt_aciAucgenserit;
    @FXML
    private TextField txt_aciBucgenserit;
    @FXML
    private Button btn_ucgen;
    @FXML
    private Label lbl_sonucucgen;
    @FXML
    private TextField txt_yukdaire;
    @FXML
    private TextField txt_yaricapdaire;
    @FXML
    private TextField txt_derinlikdaire;
    @FXML
    private Button btn_daire;
    @FXML
    private Label lbl_sonucdaire;
    @FXML
    private LineChart<Double, Double> noktasalgrfkyuk;
    @FXML
    private LineChart<Double, Double> noktasalgrfkuzaklik;
    @FXML
    private LineChart<Double, Double> noktasalgrfkderinlik;
    @FXML
    private LineChart<Double, Double> cizgiselgrfkyuk;
    @FXML
    private LineChart<Double, Double> cizgiselgrfkderinlik;
    @FXML
    private LineChart<Double, Double> cizgiselgrfkuzaklik;
    @FXML
    private AnchorPane pencere;
    @FXML
    private LineChart<Double, Double> seritgrfkyuk;
    @FXML
    private LineChart<Double, Double> seritgrfkAcia;
    @FXML
    private LineChart<Double, Double> seritgrfkAcib;
    @FXML
    private Button btn_dikdortgen;
    @FXML
    private Label lbl_dikdortgensonuc;
    @FXML
    private TextField txt_yukdikdortgen;
    @FXML
    private TextField txt_dikdortgenB;
    @FXML
    private TextField txt_dikdortgenA;
    @FXML
    private TextField txt_dikdortgenZ;
    @FXML
    private LineChart<Double, Double> ucgengrfkyuk;
    @FXML
    private LineChart<Double, Double> ucgengrfkuzaklik;
    @FXML
    private LineChart<Double, Double> ucgengrfken;
    @FXML
    private LineChart<Double, Double> dairegrfkyuk;
    @FXML
    private LineChart<Double, Double> dairegrfkyaricap;
    @FXML
    private LineChart<Double, Double> dairegrfkderinlik;
    @FXML
    private LineChart<Double, Double> dikdortgengrfkyuk;
    @FXML
    private LineChart<Double, Double> dikdortgengrfkB;
    @FXML
    private LineChart<Double, Double> dikdortgengrfkA;
   
   
    public void initialize(URL url, ResourceBundle rb) {
        
        
        noktasalgrfkyuk.setVisible(false);
        noktasalgrfkuzaklik.setVisible(false);
        noktasalgrfkderinlik.setVisible(false);
        cizgiselgrfkyuk.setVisible(false);
        cizgiselgrfkuzaklik.setVisible(false);
        cizgiselgrfkderinlik.setVisible(false);
        seritgrfkyuk.setVisible(false);
        seritgrfkAcia.setVisible(false);
        seritgrfkAcib.setVisible(false);
        ucgengrfkyuk.setVisible(false);
        ucgengrfken.setVisible(false);
        ucgengrfkuzaklik.setVisible(false);
        dairegrfkyuk.setVisible(false);
        dairegrfkyaricap.setVisible(false);
        dairegrfkderinlik.setVisible(false);
        dikdortgengrfkyuk.setVisible(false);
        dikdortgengrfkB.setVisible(false);
        dikdortgengrfkA.setVisible(false);
    }    

    
    public double noktasakYukHesapla(double agirlik,double uzaklik,double derinlik)
    {
        double sonuc1,sonuc2,sonuc3,anasonuc;
        sonuc1=3/(2*Math.PI);
        sonuc2=Math.pow((1/(1+Math.pow((uzaklik/derinlik),2))), (5/2));
        sonuc3=agirlik/Math.pow(derinlik,2);
        
        anasonuc=sonuc1*sonuc2*sonuc3;
        
       return anasonuc;
    }
    
    public double cizgiselYukHesapla (double q,double z,double x)
    {
        double anasonuc,sonuc1,sonuc2;
        sonuc1=(2*q)/(Math.PI*z);
        sonuc2=Math.pow((1/(1+Math.pow((x/z),2))), 2);
        
        
        anasonuc=sonuc1*sonuc2;
        return anasonuc;
    }
    
    public double seritYukHesapla(double q, double a, double b)
    {
        double sonuc,radyanA,radyanB;
        radyanA=Math.toRadians(a);
        radyanB=Math.toRadians(b);
        sonuc=(q/Math.PI)*((a+Math.sin(radyanA)*Math.cos(radyanA+2*radyanB))/Math.PI);
        return sonuc;
    }
    
    public double ucgenSeritYukHesapla(double q,double x,double B,double a,double b)
    {
        double anasonuc,sonuc1,sonuc2, radyanA,radyanB;
        radyanA=Math.toRadians(a);
        radyanB=Math.toRadians(b);
        sonuc1=q/Math.PI;
        sonuc2=(((x/B)*radyanA)-((1/2)*Math.sin(2*b)));
        anasonuc=sonuc1*sonuc2;
        
        return anasonuc;
    }
    
    public double uniformYukluDaireAlanHesapla(double q,double r,double z)
    {
        double sonuc;
        sonuc=(1-Math.pow(1/(1+Math.pow(r/z, 2)),3/2))*q;
        return sonuc;
    }
    
    public double uniformYukluDikdortgenAlanHesapla (double q,double b,double a,double z)
    {
        double m=b/z;
        double n=a/z;
        double anasonuc,sonuc1,sonuc2,sonuc3,sonuc4,tanjant;
        sonuc1=q/(4*Math.PI);
        sonuc2=(2*m*n*Math.sqrt(m*m+n*n+1))/(m*m+n*n+m*m*n*n+1);
        sonuc3=(m*m+n*n+2)/(m*m+n*n+1);
        tanjant=(2*m*n*Math.sqrt(m*m+n*n+1))/(m*m+n*n-m*m*n*n+1);
        sonuc4=Math.atan(tanjant);
        anasonuc=sonuc1*((sonuc2*sonuc3)+sonuc4);
        
        if(anasonuc>=0)
            return anasonuc;
        
        else
        {
            sonuc4=sonuc4+Math.PI;
            anasonuc=sonuc1*((sonuc2*sonuc3)+sonuc4);
            return anasonuc;
        }
            
    }
       

    @FXML
    private void btn_hesaplanoktasal(ActionEvent event) {
      
        double yuk,derinlik,uzaklik;
        yuk=Double.parseDouble(txt_yuknoktasal.getText());
        derinlik=Double.parseDouble(txt_derinliknoktasal.getText());
        uzaklik=Double.parseDouble(txt_uzakliknoktasal.getText());
        
        lbl_noktasalsonuc.setText(String.valueOf(noktasakYukHesapla(yuk, uzaklik, derinlik)));
        
       
        noktasalgrfkyuk.getXAxis().setLabel("Yük");
        noktasalgrfkyuk.getYAxis().setLabel("Gerilme Kuvveti");
        
        XYChart.Series series =new XYChart.Series<>();
         for(double i=10;i<=60;i=i+10)
           series.getData().add(new XYChart.Data(i,noktasakYukHesapla(i, Double.parseDouble(txt_uzakliknoktasal.getText()),Double.parseDouble(txt_derinliknoktasal.getText()) )));
         
         noktasalgrfkyuk.getData().add(series);
         noktasalgrfkyuk.setVisible(true);
         
         
         noktasalgrfkuzaklik.getXAxis().setLabel("Uzaklık");
         noktasalgrfkuzaklik.getYAxis().setLabel("Gerilme Kuvveti");
         
         XYChart.Series veri =new XYChart.Series<>();
         for(double i=10;i<=60;i=i+10)
             veri.getData().add(new XYChart.Data(i, noktasakYukHesapla(Double.parseDouble(txt_yuknoktasal.getText()), i, Double.parseDouble(txt_derinliknoktasal.getText()))));
         
         noktasalgrfkuzaklik.getData().add(veri);
         noktasalgrfkuzaklik.setVisible(true);
         
         noktasalgrfkderinlik.getXAxis().setLabel("Derinlik");
         noktasalgrfkderinlik.getYAxis().setLabel("Gerilme Kuvveti");
         
         XYChart.Series verii =new XYChart.Series<>();
          for(double i=10;i<=60;i=i+10)
             verii.getData().add(new XYChart.Data(i, noktasakYukHesapla(Double.parseDouble(txt_yuknoktasal.getText()),Double.parseDouble(txt_uzakliknoktasal.getText()) ,i )));
         
          noktasalgrfkderinlik.getData().add(verii);
          noktasalgrfkderinlik.setVisible(true);
          
          
    }

    @FXML
    private void btn_hesaplacizgisel(ActionEvent event) {
        
        double yuk,derinlik,uzaklik;
        yuk=Double.parseDouble(txt_yukcizgisel.getText());
        derinlik=Double.parseDouble(txt_derinlikcizgisel.getText());
        uzaklik=Double.parseDouble(txt_uzaklikcizgisel.getText());
        
        lbl_sonuccizgisel.setText(String.valueOf(cizgiselYukHesapla(yuk, derinlik,uzaklik)));
        
        cizgiselgrfkyuk.getXAxis().setLabel("Yük");
        cizgiselgrfkyuk.getYAxis().setLabel("Gerilme Kuvveti");
        
        XYChart.Series series =new XYChart.Series<>();
        for(double i=10;i<=60;i=i+10)
            series.getData().add(new XYChart.Data(i,cizgiselYukHesapla(i, Double.parseDouble(txt_derinlikcizgisel.getText()), Double.parseDouble(txt_uzaklikcizgisel.getText()))));
        
        cizgiselgrfkyuk.getData().add(series);
        cizgiselgrfkyuk.setVisible(true);
        
        cizgiselgrfkderinlik.getXAxis().setLabel("Derinlik");
        cizgiselgrfkderinlik.getYAxis().setLabel("Gerilme Kuvveti"); 
        
        XYChart.Series veri =new XYChart.Series<>();
        for(double i=10;i<=60;i=i+10)
            veri.getData().add(new XYChart.Data(i,cizgiselYukHesapla(Double.parseDouble(txt_yukcizgisel.getText()), i, Double.parseDouble(txt_uzaklikcizgisel.getText()))));
    
        cizgiselgrfkderinlik.getData().add(veri);
        cizgiselgrfkderinlik.setVisible(true);
        
        cizgiselgrfkuzaklik.getXAxis().setLabel("Uzaklık");
        cizgiselgrfkuzaklik.getYAxis().setLabel("Gerilme Kuvveti");
        
        XYChart.Series verii =new XYChart.Series<>();
        for(double i=10;i<=60;i=i+10)
             verii.getData().add(new XYChart.Data(i,cizgiselYukHesapla(Double.parseDouble(txt_yukcizgisel.getText()), Double.parseDouble(txt_derinlikcizgisel.getText()),i )));
        
        cizgiselgrfkuzaklik.getData().add(verii);
        cizgiselgrfkuzaklik.setVisible(true);
    }

    @FXML
    private void btn_hesaplaserit(ActionEvent event) {
        
        double yuk,aciA,aciB;
        yuk=Double.parseDouble(txt_yukserit.getText());
        aciA=Double.parseDouble(txt_aciAserit.getText());
        aciB=Double.parseDouble(txt_aciBserit.getText());
        
        lbl_sonucserit.setText(String.valueOf(seritYukHesapla(yuk, aciA, aciB)));
        
        seritgrfkyuk.getXAxis().setLabel("Yük");
        seritgrfkyuk.getYAxis().setLabel("Gerime Kuvveti");
        
        XYChart.Series series =new XYChart.Series<>();
        for(double i=10;i<=60;i=i+10)
            series.getData().add(new XYChart.Data(i,seritYukHesapla(i, Double.parseDouble(txt_aciAserit.getText()), Double.parseDouble(txt_aciBserit.getText()))));
        
        seritgrfkyuk.getData().add(series);
        seritgrfkyuk.setVisible(true);
        
        seritgrfkAcia.getXAxis().setLabel("Alfa Açısı");
        seritgrfkAcia.getYAxis().setLabel("Gerime Kuvveti");
        
        XYChart.Series veri =new XYChart.Series<>();
        for(double i=10;i<=60;i=i+10)
            veri.getData().add(new XYChart.Data(i,seritYukHesapla(Double.parseDouble(txt_yukserit.getText()), i, Double.parseDouble(txt_aciBserit.getText()))));
        seritgrfkAcia.getData().add(veri);
        seritgrfkAcia.setVisible(true);
        
        seritgrfkAcib.getXAxis().setLabel("Beta Açısı");
        seritgrfkAcib.getYAxis().setLabel("Gerime Kuvveti");
        
        XYChart.Series verii =new XYChart.Series<>();
        for(double i=10;i<=60;i=i+10)
            verii.getData().add(new XYChart.Data(i,seritYukHesapla(Double.parseDouble(txt_yukserit.getText()), Double.parseDouble(txt_aciAserit.getText()),i )));
        
        seritgrfkAcib.getData().add(verii);
        seritgrfkAcib.setVisible(true);
        
   }

    @FXML
    private void btn_hesaplaucgen(ActionEvent event) {
        
        double yuk,enB,uzaklik,aciA, aciB;
        yuk=Double.parseDouble(txt_yukucgenserit.getText());
        enB=Double.parseDouble(txt_enucgenserit.getText());
        uzaklik=Double.parseDouble(txt_uzaklikucgenserit.getText());
        aciA=Double.parseDouble(txt_aciAucgenserit.getText());
        aciB=Double.parseDouble(txt_aciBucgenserit.getText());
        
        lbl_sonucucgen.setText(String.valueOf(ucgenSeritYukHesapla(yuk, uzaklik, enB, aciA, aciB)));
        
        ucgengrfkyuk.getXAxis().setLabel("Yük");
        ucgengrfkyuk.getYAxis().setLabel("Gerilme Kuvveti");
        
        XYChart.Series series =new XYChart.Series<>();
        for(double i=10;i<=60;i=i+10)
            series.getData().add(new XYChart.Data(i,ucgenSeritYukHesapla(i, Double.parseDouble(txt_uzaklikucgenserit.getText()),Double.parseDouble(txt_enucgenserit.getText()),Double.parseDouble(txt_aciAucgenserit.getText()),Double.parseDouble(txt_aciBucgenserit.getText()))));
        
        ucgengrfkyuk.getData().add(series);
        ucgengrfkyuk.setVisible(true);
        
        ucgengrfken.getXAxis().setLabel("En (B)");
        ucgengrfken.getYAxis().setLabel("Gerilme Kuvveti");
        
        XYChart.Series veri =new XYChart.Series<>();
        for(double i=10;i<=60;i=i+10)
            veri.getData().add(new XYChart.Data(i,ucgenSeritYukHesapla(Double.parseDouble(txt_yukucgenserit.getText()) ,Double.parseDouble(txt_uzaklikucgenserit.getText()),i,Double.parseDouble(txt_aciAucgenserit.getText()),Double.parseDouble(txt_aciBucgenserit.getText()))));
        
        ucgengrfken.getData().add(veri);
        ucgengrfken.setVisible(true);
        
        ucgengrfkuzaklik.getXAxis().setLabel("Uzaklık (x)");
        ucgengrfkuzaklik.getYAxis().setLabel("Gerilme Kuvveti");
        
        XYChart.Series verii =new XYChart.Series<>();
        for(double i=10;i<=60;i=i+10)
            verii.getData().add(new XYChart.Data(i,ucgenSeritYukHesapla(Double.parseDouble(txt_yukucgenserit.getText()) ,i,Double.parseDouble(txt_enucgenserit.getText()),Double.parseDouble(txt_aciAucgenserit.getText()),Double.parseDouble(txt_aciBucgenserit.getText()))));
        
        ucgengrfkuzaklik.getData().add(verii);
        ucgengrfkuzaklik.setVisible(true);
        
    }

    @FXML
    private void btn_hesapladaire(ActionEvent event) {
        
        double yuk,yaricap,derinlik;
        yuk=Double.parseDouble(txt_yukdaire.getText());
        yaricap=Double.parseDouble(txt_yaricapdaire.getText());
        derinlik=Double.parseDouble(txt_derinlikdaire.getText());
        
        lbl_sonucdaire.setText(String.valueOf(uniformYukluDaireAlanHesapla(yuk, yaricap, derinlik)));
        
        dairegrfkyuk.getXAxis().setLabel("Yük");
        dairegrfkyuk.getYAxis().setLabel("Gerilme Kuvveti");
        
        XYChart.Series series =new XYChart.Series<>();
        for(double i=10;i<=60;i=i+10)
            series.getData().add(new XYChart.Data(i,uniformYukluDaireAlanHesapla(i, Double.parseDouble(txt_yaricapdaire.getText()),Double.parseDouble(txt_derinlikdaire.getText()))));
        
        dairegrfkyuk.getData().add(series);
        dairegrfkyuk.setVisible(true);
        
        dairegrfkyaricap.getXAxis().setLabel("Yarıçap");
        dairegrfkyaricap.getYAxis().setLabel("Gerilme Kuvveti");
        
        XYChart.Series veri=new XYChart.Series<>();
        for(double i=10;i<=60;i=i+10)
            veri.getData().add(new XYChart.Data(i,uniformYukluDaireAlanHesapla(Double.parseDouble(txt_yukdaire.getText()), i,Double.parseDouble(txt_derinlikdaire.getText()))));
        
        dairegrfkyaricap.getData().add(veri);
        dairegrfkyaricap.setVisible(true);
        
        dairegrfkderinlik.getXAxis().setLabel("Derinlik");
        dairegrfkderinlik.getYAxis().setLabel("Gerilme Kuvveti");
        
        XYChart.Series verii=new XYChart.Series<>();
        for(double i=10;i<=60;i=i+10)
            verii.getData().add(new XYChart.Data(i,uniformYukluDaireAlanHesapla(Double.parseDouble(txt_yukdaire.getText()),Double.parseDouble(txt_yaricapdaire.getText()),i)));
        
        dairegrfkderinlik.getData().add(verii);
        dairegrfkderinlik.setVisible(true);
    }

    @FXML
    private void btn_hesapdikdortgen(ActionEvent event) {
        
        double yuk,B,A,Z;
        yuk=Double.parseDouble(txt_yukdikdortgen.getText());
        B=Double.parseDouble(txt_dikdortgenB.getText());
        A=Double.parseDouble(txt_dikdortgenA.getText());
        Z=Double.parseDouble(txt_dikdortgenZ.getText());
        lbl_dikdortgensonuc.setText(String.valueOf(uniformYukluDikdortgenAlanHesapla(yuk, B, A,Z)));
        
        dikdortgengrfkyuk.getXAxis().setLabel("Yük");
        dikdortgengrfkyuk.getYAxis().setLabel("Gerime Kuvveti");
        
        XYChart.Series series =new XYChart.Series<>();
        for(double i=10;i<=60;i=i+10)
            series.getData().add(new XYChart.Data(i,uniformYukluDikdortgenAlanHesapla(i, Double.parseDouble(txt_dikdortgenB.getText()),Double.parseDouble(txt_dikdortgenA.getText()), Double.parseDouble(txt_dikdortgenZ.getText()))));
        
        dikdortgengrfkyuk.getData().add(series);
        dikdortgengrfkyuk.setVisible(true);
        
        dikdortgengrfkB.getXAxis().setLabel("B");
        dikdortgengrfkB.getYAxis().setLabel("Gerilme Kuvveti");
        
        XYChart.Series veri =new XYChart.Series<>();
        for(double i=10;i<=60;i=i+10)
            veri.getData().add(new XYChart.Data(i,uniformYukluDikdortgenAlanHesapla(Double.parseDouble(txt_yukdikdortgen.getText()),i,Double.parseDouble(txt_dikdortgenA.getText()), Double.parseDouble(txt_dikdortgenZ.getText()))));
        
        dikdortgengrfkB.getData().add(veri);
        dikdortgengrfkB.setVisible(true);
        
        dikdortgengrfkA.getXAxis().setLabel("A");
        dikdortgengrfkA.getYAxis().setLabel("Gerilme Kuvveti");
        
        XYChart.Series verii =new XYChart.Series<>();
        for(double i=10;i<=60;i=i+10)
            verii.getData().add(new XYChart.Data(i,uniformYukluDikdortgenAlanHesapla(Double.parseDouble(txt_yukdikdortgen.getText()),Double.parseDouble(txt_dikdortgenB.getText()),i, Double.parseDouble(txt_dikdortgenZ.getText()))));
        
        dikdortgengrfkA.getData().add(verii);
        dikdortgengrfkA.setVisible(true);
    }
    
}
