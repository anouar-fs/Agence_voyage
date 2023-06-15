
package jvproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class offers extends javax.swing.JFrame implements MouseListener {
    String a;
    String b;
    String c;
    String d;
    String E;
    String arr_id[]= new String[10];
    
    public offers(String a,String b,String c,String d,String E) {
        initComponents();
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.E=E;
        PreparedStatement ps;
       String arr[] = a.split("-");
       this.a=arr[2]+"-"+arr[1]+"-"+arr[0];
        ResultSet rs;
            String query="SELECT * FROM jvproject.voyages WHERE ville_depart = '"+this.c+"' AND ville_arriv ='"+this.d+"' AND date_dep= '"+this.a+"'";
        try{
            ps = project_db.getConnectio().prepareStatement(query);
            rs = ps.executeQuery();
            int i=1;
            int k=1;
            JPanel arrjp[] = new JPanel[10];
            JPanel arrjp2[] = new JPanel[10];
            JPanel arrjp3[] = new JPanel[10];
            JLabel links[] =  new JLabel[10];
            
            links[1]=jLabel5;
            links[2]=jLabel6;
            links[3]=jLabel7;
            links[4]=jLabel8;
            links[5]=jLabel9;
            links[6]=jLabel10;
            links[7]=jLabel4;
            links[8]=jLabel13;
            links[9]=jLabel14;
            
            
            
            for(int j=0;j<10;j++){
                    arrjp[j]=new JPanel();
                    arrjp2[j]=new JPanel();
                    arrjp3[j]=new JPanel();  
                    
            }
  while(rs.next()){
               /* System.out.println(rs.getString(2));
               System.out.println(rs.getString(3));
               System.out.println(rs.getString(4));
               System.out.println(rs.getString(5));
               System.out.println(rs.getString(6));
               System.out.println(rs.getString(7));
               System.out.println(rs.getString(8));
               System.out.println(rs.getString(9));*/
                
     System.out.println(rs.getString(9));
     String arr2[] = (rs.getString(9)).split(",");
     if(arr2.length>=Integer.parseInt(this.E)){
        this.arr_id[i]=rs.getString(1);
        arrjp[i].setBackground(Color.WHITE);
        arrjp2[i].setBackground(Color.WHITE);
        arrjp3[i].setBackground(Color.white);
        
        JLabel picc = new JLabel();
        picc.setBounds(0, 0, 250, 150);
        
        PreparedStatement pss;
        ResultSet rss;
        String nq="select pic_car from car where num_car="+rs.getString(10);
        pss = project_db.getConnectio().prepareStatement(nq);
        rss = pss.executeQuery();
        rss.next();
        picc.setIcon(new ImageIcon(rss.getString(1)));
        
        arrjp[i].setBounds(400, i*100+(i-1)*100+20, 500, 165);
        arrjp2[i].setBounds(900, i*100+(i-1)*100+20, 150, 165);
        arrjp3[i].setBounds(150, i*100+(i-1)*100+20, 250, 165);
        arrjp3[i].add(picc);
        
        arrjp2[i].setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 0));
        arrjp[i].setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(153,153,153)));
        arrjp3[i].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 0, new Color(153,153,153)));
         arrjp2[i].setBorder(BorderFactory.createMatteBorder(1, 2, 1, 1, new Color(153,153,153)));
        links[i].setBounds(0, 0, 10, 10);
        
        arrjp3[i].add(links[i]);
        arrjp[i].setLayout(null);
        JLabel jlb=new JLabel(rs.getString(6));
        //System.out.println(rs.getString(6));
        JLabel jlb2=new JLabel("_______");
        JLabel jlb3=new JLabel("  "+rs.getString(11)+"  ");
        JLabel jlb4=new JLabel(rs.getString(7));
        //System.out.println(rs.getString(7));
        JLabel jlb6=new JLabel("_______");
        
        int val=150;
        jlb.setFont(new Font("Segoe UI", Font.BOLD, 23));
        jlb.setBounds(200-val, 10, 100, 100);
        jlb2.setBounds(280-val, 10, 100, 90);
        jlb3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jlb3.setBounds(330-val, 12, 100, 105);
        jlb4.setFont(new Font("Segoe UI", Font.BOLD, 23));
        jlb6.setBounds(400-val, 10, 100, 90);
        jlb4.setBounds(470-val, 10, 100, 100);
        
        arrjp[i].add(jlb);
        arrjp[i].add(jlb2);
        arrjp[i].add(jlb3);
        arrjp[i].add(jlb4);
        arrjp[i].add(jlb6);

        
        JLabel prx = new JLabel();
        JLabel monit = new JLabel();
        prx.setText(""+(Integer.parseInt(rs.getString(8)))*(Integer.parseInt(this.E)));
        monit.setText("DH");
        
        arrjp2[i].add(prx);
        arrjp2[i].add(monit);
        arrjp2[i].setLayout(null);
        prx.setFont(new Font("Segoe UI", Font.BOLD, 30));
        prx.setForeground(new Color(153,153,255));
        prx.setBounds(25, 55, 70, 30);
        monit.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        monit.setBounds(105, 55, 70, 40);
        monit.setForeground(new Color(153,153,255));
        
        JLabel dep = new JLabel(rs.getString(2));
        JLabel arrv = new JLabel(rs.getString(3));
        dep.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        dep.setBounds(200-val, 40, 100, 100);
        arrv.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        arrv.setBounds(460-val, 40, 100, 100);
        arrjp[i].add(dep);
        arrjp[i].add(arrv);
        
        
        links[i].setText("Reserver Siege");
        links[i].setBounds(0,125, 150, 40);
        links[i].setHorizontalAlignment(SwingConstants.CENTER);
        links[i].setVerticalAlignment(SwingConstants.CENTER);
        links[i].setBackground(new Color(153,153,255));
        links[i].setForeground(Color.white);
        links[i].setFont(new Font("Segoe UI", Font.BOLD, 17));
        links[i].setBorder(BorderFactory.createMatteBorder(0, 2, 1, 0, new Color(153,153,153)));
        links[i].addMouseListener(this);
        links[i].setOpaque(true);
        
        
        
        arrjp2[i].add(links[i]);
        jPanel1.add(arrjp[i]);
        jPanel1.add(arrjp2[i]);
        jPanel1.add(arrjp3[i]);       
              i++;  
            }
        }
       if(i>=3){
           jPanel1.setPreferredSize(new Dimension(1102, 180*i+150));
           JLabel fin = new JLabel("C'est tout pour le "+this.a);
           fin.setBounds(500, 180*i+70, 300, 30);
           JLabel pic = new JLabel();
           pic.setIcon(new ImageIcon(".\\pictures\\newg.png"));
           pic.setBounds(600, 180*i+30, 300, 30);
           
           fin.setFont(new Font("Segoe UI", Font.BOLD, 16));
           
           jPanel1.add(fin);
           jPanel1.add(pic);
           
           i--;
           jLabel3.setText(i+jLabel3.getText());
       }
       
            if(i==1){
                jLabel12.setText("");
                jLabel3.setText(jLabel3.getText()+" 0");
                JLabel all = new JLabel();
                all.setText("Désolé on'a rien touvé pour le "+this.a);
                all.setBounds(300, 200, 700, 40);
                all.setFont(new Font("Segoe UI", Font.PLAIN, 30));
                JLabel all2 = new JLabel();
                all2.setBounds(450, 260, 300, 300);
                all2.setIcon(new ImageIcon(".\\pictures\\search.gif"));
                jPanel1.add(all);
                jPanel1.add(all2);
                
            }
       
        }catch(Exception e){
            //System.out.println("connection errors");
            System.out.println(e.getMessage());
        }
        
   
        jLabel1.setText("TRAV");
        jLabel2.setText("GO");
        
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(249, 249, 249));
        setUndecorated(true);
        setResizable(false);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1064, 652));

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));
        jPanel1.setPreferredSize(new java.awt.Dimension(1162, 630));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Source Code Pro Black", 0, 36)); // NOI18N
        jLabel1.setText("TRAV");

        jLabel2.setFont(new java.awt.Font("Source Code Pro Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("GO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("  resultat trouvé");

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

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(1, 5, 118));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Mielleures offres disponible pour vous");

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(37, 37, 37)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        jPanel2.setBackground(new java.awt.Color(249, 249, 249));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvproject/close.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1173, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
   
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
      if(Integer.parseInt(this.E)>1){ 
            reservationPlus rsvp = new reservationPlus(this.arr_id[1],Integer.parseInt(this.E));
            rsvp.setVisible(true);
        }else{
          reservation rsv = new reservation(this.arr_id[1]);
            rsv.setVisible(true);
      }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       if(Integer.parseInt(this.E)>1){ 
            reservationPlus rsvp = new reservationPlus(this.arr_id[2],Integer.parseInt(this.E));
            rsvp.setVisible(true);
        }else{
          reservation rsv = new reservation(this.arr_id[2]);
            rsv.setVisible(true);
      }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        
        if(Integer.parseInt(this.E)>1){ 
            reservationPlus rsvp = new reservationPlus(this.arr_id[3],Integer.parseInt(this.E));
            rsvp.setVisible(true);
        }else{
          reservation rsv = new reservation(this.arr_id[3]);
            rsv.setVisible(true);
      }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        
        if(Integer.parseInt(this.E)>1){ 
            reservationPlus rsvp = new reservationPlus(this.arr_id[4],Integer.parseInt(this.E));
            rsvp.setVisible(true);
        }else{
          reservation rsv = new reservation(this.arr_id[4]);
            rsv.setVisible(true);
      }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        
        if(Integer.parseInt(this.E)>1){ 
            reservationPlus rsvp = new reservationPlus(this.arr_id[5],Integer.parseInt(this.E));
            rsvp.setVisible(true);
        }else{
          reservation rsv = new reservation(this.arr_id[5]);
            rsv.setVisible(true);
      }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        
        if(Integer.parseInt(this.E)>1){ 
            reservationPlus rsvp = new reservationPlus(this.arr_id[6],Integer.parseInt(this.E));
            rsvp.setVisible(true);
        }else{
          reservation rsv = new reservation(this.arr_id[6]);
            rsv.setVisible(true);
      }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if(Integer.parseInt(this.E)>1){ 
            reservationPlus rsvp = new reservationPlus(this.arr_id[7],Integer.parseInt(this.E));
            rsvp.setVisible(true);
        }else{
          reservation rsv = new reservation(this.arr_id[7]);
            rsv.setVisible(true);
      }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        if(Integer.parseInt(this.E)>1){ 
            reservationPlus rsvp = new reservationPlus(this.arr_id[8],Integer.parseInt(this.E));
            rsvp.setVisible(true);
        }else{
          reservation rsv = new reservation(this.arr_id[8]);
            rsv.setVisible(true);
      }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        if(Integer.parseInt(this.E)>1){ 
            reservationPlus rsvp = new reservationPlus(this.arr_id[9],Integer.parseInt(this.E));
            rsvp.setVisible(true);
        }else{
          reservation rsv = new reservation(this.arr_id[9]);
            rsv.setVisible(true);
      }
    }//GEN-LAST:event_jLabel14MouseClicked
    

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new offers("","","","","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
