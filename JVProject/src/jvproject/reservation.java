/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jvproject;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author as
 */
public class reservation extends javax.swing.JFrame {
    int num_siege=0;
    JLabel sieges[] =  new JLabel[20];
    String plcs;
    String idv;
    String plein="";
    String vd="";
    String va="";
    String da="";
    int pr;
    public reservation(String idv) {
        initComponents();
        
        
        
        
        
        
        
        
        this.idv=idv;
        boolean exist=false;
        
        PreparedStatement ps;
       
        ResultSet rs;
            String query="SELECT * FROM jvproject.voyages WHERE id_voy="+this.idv;
            
        try{
            ps = project_db.getConnectio().prepareStatement(query);
            rs = ps.executeQuery(); 
            if(rs.next()){
                pr=Integer.parseInt(rs.getString(8));
                jLabel24.setText(rs.getString(8)+" DH");
                this.plcs=rs.getString(9);
                this.vd=rs.getString(2);
                this.va=rs.getString(3);
                this.da=rs.getString(4);
                jLabel32.setText(this.vd+" > "+this.va);
                
                PreparedStatement pss;
                ResultSet rss;
                String nq="select photo from car where num_car="+rs.getString(10);
                pss = project_db.getConnectio().prepareStatement(nq);
                rss = pss.executeQuery();
                rss.next();
                jLabel21.setIcon(new ImageIcon(rss.getString(1)));
            }
        }catch(Exception e){
            //System.out.println("connection errors");
            System.out.println(e.getMessage());
        }
        
        
        
        int mesure[]={80,130,230,280};
        sieges[0]=jLabel1;
        sieges[1]=jLabel2;
        sieges[2]=jLabel3;
        sieges[3]=jLabel4;
        sieges[4]=jLabel5;
        sieges[5]=jLabel6;
        sieges[6]=jLabel7;
        sieges[7]=jLabel8;
        sieges[8]=jLabel9;
        sieges[9]=jLabel10;
        sieges[10]=jLabel11;
        sieges[11]=jLabel12;
        sieges[12]=jLabel13;
        sieges[13]=jLabel14;
        sieges[14]=jLabel15;
        sieges[15]=jLabel16;
        sieges[16]=jLabel17;
        sieges[17]=jLabel18;
        sieges[18]=jLabel19;
        sieges[19]=jLabel20;
        
        int k=0;
        int t=0;
        int gap=0;
        
        String arr2[] = (this.plcs).split(",");
        
        
            sieges[0].setBounds(80+t, 170+(k*50), 45, 45);
            if(!arr2[0].equals("1")){
                System.out.println(arr2[0]);
                sieges[0].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }else{
                sieges[0].setIcon(new ImageIcon(".\\pictures\\sieges\\s1.PNG"));
            }
            sieges[0].setOpaque(true);
            jPanel1.add(sieges[0]);
        if(!arr2[0].equals("1")){
            this.plein+="1-";
        }
        for(int i=1;i<20;i++){
            exist=false;
            if(i%4==0){
                t=0;
                k=k+1;
                gap=0;
            }
            else{
                t+=50;
            }
            for(int z=0;z<arr2.length;z++){
                if(arr2[z].equals(((i+1)+""))){
                    exist=true;
                    break;
                }
                
            }
            
            if(exist){
              sieges[i].setBounds(80+t+gap, 170+(k*50), 45, 45);
              sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));
              sieges[i].setOpaque(true);
              jPanel1.add(sieges[i]);
            
            }else{
                
                sieges[i].setBounds(80+t+gap, 170+(k*50), 45, 45);
                sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
                sieges[i].setOpaque(true);
                jPanel1.add(sieges[i]);
                this.plein+=((i+1)+"-");
            }
            if(i==((k*4)+1)){
                gap=50;
            }
            
        }
        
        
           for(int i=20;i<48;i++){
            if(i%4==0){
                t=0;
                k=k+1;
                gap=0;
            }
            else{
                t+=50;
            }
            if(i==22 || i==23){
                System.out.println("");
            }else{
            JLabel x = new JLabel();
            x.setBounds(80+t+gap, 170+(k*50), 45, 45);
            x.setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            x.setOpaque(true);
            jPanel1.add(x);
            if(i==((k*4)+1)){
                gap=50;
            }
            }
        }
          
       
        
        
        
        
        
        
       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        cond = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jPanel1.setPreferredSize(new java.awt.Dimension(839, 800));

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvproject/close.png"))); // NOI18N
        exit.setOpaque(true);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        cond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvproject/steering-wheel (1).png"))); // NOI18N

        jLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel1FocusGained(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(238, 238, 238));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvproject/ghazal.jpg"))); // NOI18N

        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setText("________________________________________________________________________");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Siége N°");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("100 DH");

        jLabel25.setBackground(new java.awt.Color(153, 153, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Acheter");
        jLabel25.setOpaque(true);
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvproject/zayd.png"))); // NOI18N
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("0");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvproject/nona9is.png"))); // NOI18N
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("Reduction par points :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvproject/lgnd1.PNG"))); // NOI18N

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvproject/lgnd2.PNG"))); // NOI18N

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvproject/lgndx.PNG"))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setText("Siége Libre");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setText("Siége Séléctioné");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setText("Siége non disponible");

        jLabel32.setBackground(new java.awt.Color(153, 153, 255));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setOpaque(true);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(153, 153, 255));
        jLabel33.setText("Séléctionner votre siége");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(cond))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(cond)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(204, 204, 204)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel15)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel16)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addComponent(jLabel20)
                .addGap(128, 128, 128))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("1")){
                   f_test=true;
                   break;
               }
            }
        System.out.println(this.plein);
        System.out.println(arr[0]);
        System.out.println(f_test);
       if(!f_test){ 
        boolean test=false;
        
        jLabel1.setIcon(new ImageIcon(".\\pictures\\sieges\\sb1.PNG"));
        for(int i=1;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));
            }
        }
        this.num_siege=1;
        jLabel23.setText("Siége N°"+" 1");
       }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel1FocusGained
        
    }//GEN-LAST:event_jLabel1FocusGained

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
      boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("2")){
                   f_test=true;
                   break;
               }
            }
        
       if(!f_test){ 
        
           boolean test=false; 
        
        jLabel2.setIcon(new ImageIcon(".\\pictures\\sieges\\sb2.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==1){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=2;
        jLabel23.setText("Siége N°"+" 2");
       }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("3")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel3.setIcon(new ImageIcon(".\\pictures\\sieges\\sb3.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==2){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=3;
        jLabel23.setText("Siége N°"+" 3");
      }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("4")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel4.setIcon(new ImageIcon(".\\pictures\\sieges\\sb4.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==3){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=4;
        jLabel23.setText("Siége N°"+" 4");
      }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("5")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel5.setIcon(new ImageIcon(".\\pictures\\sieges\\sb5.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==4){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=5;
        jLabel23.setText("Siége N°"+" 5");
      }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("6")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel6.setIcon(new ImageIcon(".\\pictures\\sieges\\sb6.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==5){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=6;
        jLabel23.setText("Siége N°"+" 6");
    }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("7")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel7.setIcon(new ImageIcon(".\\pictures\\sieges\\sb7.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==6){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=7;
        jLabel23.setText("Siége N°"+" 7");
    }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("8")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel8.setIcon(new ImageIcon(".\\pictures\\sieges\\sb8.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==7){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=8;
        jLabel23.setText("Siége N°"+" 8");
    }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("9")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel9.setIcon(new ImageIcon(".\\pictures\\sieges\\sb9.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==8){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=9;
        jLabel23.setText("Siége N°"+" 9");
    }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("10")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel10.setIcon(new ImageIcon(".\\pictures\\sieges\\sb10.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==9){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=10;
        jLabel23.setText("Siége N°"+" 10");
    }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("11")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel11.setIcon(new ImageIcon(".\\pictures\\sieges\\sb11.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==10){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=11;
        jLabel23.setText("Siége N°"+" 11");
    }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("12")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel12.setIcon(new ImageIcon(".\\pictures\\sieges\\sb12.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==11){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=12;
        jLabel23.setText("Siége N°"+" 12");
      }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("13")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel13.setIcon(new ImageIcon(".\\pictures\\sieges\\sb13.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==12){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=13;
        jLabel23.setText("Siége N°"+" 13");
    }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("14")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel14.setIcon(new ImageIcon(".\\pictures\\sieges\\sb14.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==13){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=14;
        jLabel23.setText("Siége N°"+" 14");
    }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("15")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel15.setIcon(new ImageIcon(".\\pictures\\sieges\\sb15.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==14){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=15;
        jLabel23.setText("Siége N°"+" 15");
    }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("16")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel16.setIcon(new ImageIcon(".\\pictures\\sieges\\sb16.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==15){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=16;
        jLabel23.setText("Siége N°"+" 16");
      }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("17")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel17.setIcon(new ImageIcon(".\\pictures\\sieges\\sb17.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==16){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=17;
        jLabel23.setText("Siége N°"+" 17");
    }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("18")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel18.setIcon(new ImageIcon(".\\pictures\\sieges\\sb18.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==17){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=18;
        jLabel23.setText("Siége N°"+" 18");
    }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("19")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel19.setIcon(new ImageIcon(".\\pictures\\sieges\\sb19.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==18){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=19;
        jLabel23.setText("Siége N°"+" 19");
    }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        boolean f_test=false;
      String arr[] = (this.plein).split("-");
      for(int x=0;x<arr.length;x++){
               if(arr[x].equals("20")){
                   f_test=true;
                   break;
               }
            }
      if(!f_test){ 
        
           boolean test=false; 
           
        jLabel20.setIcon(new ImageIcon(".\\pictures\\sieges\\sb20.PNG"));
        for(int i=0;i<20;i++){
            test=false;
            for(int x=0;x<arr.length;x++){
               if(arr[x].equals((i+1)+"")){
                   test=true;
                   break;
               }
            }
            if(test){
                this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\sX.PNG"));
            }
            else{
                if(i==19){System.out.println("");}
                else{this.sieges[i].setIcon(new ImageIcon(".\\pictures\\sieges\\s"+(i+1)+".PNG"));}
            }
        }
        this.num_siege=20;
        jLabel23.setText("Siége N°"+" 20");
    }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked

    String pnts="";
        PreparedStatement ps22;
       
        ResultSet rs22;
            String query22="SELECT * FROM jvproject.project_users WHERE user_id=7";
        try{
            ps22 = project_db.getConnectio().prepareStatement(query22);
            rs22 = ps22.executeQuery();
            if(rs22.next()){
                pnts=rs22.getString(10);
         }else{
                System.out.println("jvproject.reservationPlus.jLabel25MouseClicked()");
            }
        }
        catch(Exception e){
            //System.out.println("connection errors");
            System.out.println(e.getMessage());
        }
        
      if(Integer.parseInt(pnts)>=Integer.parseInt(jLabel36.getText())){    
        
        
        
        if(this.num_siege!=0){
         
        String tmp[] = (this.plcs).split(",");
        String vall="";
        for(int a=0;a<tmp.length;a++){
          if(tmp[a].equals(this.num_siege+"")){
              System.out.println("");
          }else{  
            if(a==(tmp.length-1)){
                vall+=tmp[a];
            }else{
                vall+=(tmp[a])+",";
            }
          }
        }
        System.out.println(vall);
         PreparedStatement ps;
                ResultSet rs;
                String query="update jvproject.voyages set list_place='"+vall+"' where id_voy="+this.idv+";";
                try{
                   ps = project_db.getConnectio().prepareStatement(query);
                   if(ps.executeUpdate()!=0){
                       success succ = new success();
                       succ.setVisible(true);
                       
                }else{
                    JOptionPane.showMessageDialog(null, "we cannot create your account  ");
                }
                }catch(Exception e){
            
                    err r = new err(e.getMessage());
                    r.setVisible(true);
                    }
                
                PreparedStatement Ps;
                ResultSet Rs;
                String new_query="insert into jvproject.reservation (us_ID,ville_depart,ville_destination,date_depart,num_car,num_place) values(7,'"+this.vd+"','"+this.va+"','"+this.da+"','"+this.idv+"','"+this.num_siege+"')";
             
                try{
                    System.out.println(new_query);
                   Ps = project_db.getConnectio().prepareStatement(new_query);
                   if(Ps.executeUpdate()!=0){
                       
                       System.out.println("");
                }else{
                    JOptionPane.showMessageDialog(null, "we cannot create your account  ");
                }
                }catch(Exception e){
            
                    err r = new err(e.getMessage());
                    r.setVisible(true);
                    }
                PreparedStatement Ps2;
                String new_query2="update jvproject.project_users set points = (points+10-"+jLabel36.getText()+")where user_id=7";
                
                try{
                    System.out.println(new_query2);
                   Ps2 = project_db.getConnectio().prepareStatement(new_query2);
                   if(Ps2.executeUpdate()!=0){
                       
                       this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "we cannot create your account  ");
                }
                }catch(Exception e){
            
                    err r = new err(e.getMessage());
                    r.setVisible(true);
                    }
          }
      }else{
                    caution cn=new caution("vous avez pas assez de points ");
                    cn.setVisible(true);
          
      }
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        int v = Integer.parseInt(jLabel36.getText());
        if(((this.pr)-(this.pr*(v/10))/100)>0){
            v+=100;
            jLabel37.setText("Reduction par points :"+" "+(v/10)+"%");
            jLabel36.setText(v+"");
            jLabel35.setIcon(new ImageIcon(".\\pictures\\tesing\\naqis.png"));
            int x=Integer.parseInt(jLabel36.getText());

            int vl = ((this.pr)-(this.pr*(v/10))/100);
            jLabel24.setText(vl+" DH");
        }
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        int v = Integer.parseInt(jLabel36.getText());
        if(v!=0){
            v-=100;
            jLabel37.setText("Reduction par points :"+" "+(v/10)+"%");
            if(v==0){
                jLabel35.setIcon(new ImageIcon(".\\pictures\\tesing\\nona9is.png"));
            }else{
                jLabel35.setIcon(new ImageIcon(".\\pictures\\tesing\\naqis.png"));
            }
            jLabel36.setText(v+"");
            int vl = ((this.pr)-(this.pr*(v/10))/100);

            jLabel24.setText(vl+" DH");
        }
    }//GEN-LAST:event_jLabel35MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reservation("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cond;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
