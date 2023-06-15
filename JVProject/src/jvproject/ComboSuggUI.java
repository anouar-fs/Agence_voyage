
package jvproject;

import jvproject.myscroller;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Scrollbar;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


public class ComboSuggUI extends BasicComboBoxUI{
    public void installUI(JComponent jc){
        super.installUI(jc);
        Border border = new Border();
        AutoCompleteDecorator.decorate(comboBox);
        comboBox.setBackground(Color.WHITE);
        comboBox.setBorder(border);
    }

    @Override
    protected ComboPopup createPopup() {
        return new comboSuggpopup(comboBox);
    }
    
    protected ListCellRenderer createRender(){
        return new ListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                String text = value == null ? "" : value.toString();    
                JLabel lbl = new JLabel(text);
                Font f = new Font("Segoe UI", 1, 14);
                lbl.setFont(f);
                if(isSelected){
                    lbl.setOpaque(true);
                    lbl.setBackground(new Color(240,240,240));
                    lbl.setForeground(Color.red);
                }   
                return lbl;
            }
            
        };
    }

    
    
    @Override
    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
        
    }
    
    private class comboSuggpopup extends BasicComboPopup{
        public comboSuggpopup(JComboBox combo){
            super(combo);
            setBorder(new Border(1));
        }

        @Override
        protected JScrollPane createScroller() {
           JScrollPane jsp = super.createScroller();
           list.setBackground(Color.WHITE);
           myscroller ms = new myscroller();
           ms.setPreferredSize(new Dimension(12,70));
           jsp.setVerticalScrollBar(ms);
           list.addMouseListener(mouseListener);
           
           return jsp;
        }
        
        
        
        
        
        
    }
    
    
    private class Border extends EmptyBorder {
        private Color focusColor = new Color(128,189,255);
        private Color color = new Color(206,212,218);

        public Color getFocusColor() {
            return focusColor;
        }

        public Color getColor() {
            return color;
        }

        public void setFocusColor(Color focusColor) {
            this.focusColor = focusColor;
        }

        public void setColor(Color color) {
            this.color = color;
        }
        
        public Border(int border){
            super(border,border,border,border);
        }
        public Border(){
            this(5);
        }

       // @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 =(Graphics2D)g.create();
            //g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            if(c.isFocusOwner()){
                g2.setColor(focusColor);
            }else{
                g2.setColor(color);
            }
            g2.drawRect(x, y, width-1, height-1);
            g2.dispose();
        }
       
    
    }
}
