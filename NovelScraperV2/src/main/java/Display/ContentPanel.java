/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;

import NovelScraperV2.Novel;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author super
 */
public class ContentPanel extends javax.swing.JPanel {

    /**
     * Creates new form ContentPanel
     */
    public ContentPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wuxiaWorldNovelCover = new javax.swing.JLabel();
        wuxiaWorldNovelName = new javax.swing.JLabel();
        wuxiaWorldLatestChapterName = new javax.swing.JLabel();
        wuxiaWorldLatestChapterLabel = new javax.swing.JLabel();
        wuxiaWorldTranslatorLabel = new javax.swing.JLabel();
        wuxiaWorldUpdateTimeLabel = new javax.swing.JLabel();
        wuxiaWorldTranslatorName = new javax.swing.JLabel();
        wuxiaWorldUpdateTime = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);

        wuxiaWorldNovelCover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/missing-image.png"))); // NOI18N
        wuxiaWorldNovelCover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        wuxiaWorldNovelName.setBackground(new java.awt.Color(2, 39, 87));
        wuxiaWorldNovelName.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        wuxiaWorldNovelName.setForeground(new java.awt.Color(2, 39, 87));
        wuxiaWorldNovelName.setText("Novel Name");

        wuxiaWorldLatestChapterName.setBackground(new java.awt.Color(2, 39, 87));
        wuxiaWorldLatestChapterName.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        wuxiaWorldLatestChapterName.setForeground(new java.awt.Color(2, 39, 87));
        wuxiaWorldLatestChapterName.setText("None");

        wuxiaWorldLatestChapterLabel.setBackground(new java.awt.Color(2, 39, 87));
        wuxiaWorldLatestChapterLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        wuxiaWorldLatestChapterLabel.setForeground(new java.awt.Color(2, 39, 87));
        wuxiaWorldLatestChapterLabel.setText("Latest Chapter:");

        wuxiaWorldTranslatorLabel.setBackground(new java.awt.Color(2, 39, 87));
        wuxiaWorldTranslatorLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        wuxiaWorldTranslatorLabel.setForeground(new java.awt.Color(2, 39, 87));
        wuxiaWorldTranslatorLabel.setText("Translator:");

        wuxiaWorldUpdateTimeLabel.setBackground(new java.awt.Color(2, 39, 87));
        wuxiaWorldUpdateTimeLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        wuxiaWorldUpdateTimeLabel.setForeground(new java.awt.Color(2, 39, 87));
        wuxiaWorldUpdateTimeLabel.setText("Time:");

        wuxiaWorldTranslatorName.setBackground(new java.awt.Color(2, 39, 87));
        wuxiaWorldTranslatorName.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        wuxiaWorldTranslatorName.setForeground(new java.awt.Color(2, 39, 87));
        wuxiaWorldTranslatorName.setText("None");

        wuxiaWorldUpdateTime.setBackground(new java.awt.Color(2, 39, 87));
        wuxiaWorldUpdateTime.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        wuxiaWorldUpdateTime.setForeground(new java.awt.Color(2, 39, 87));
        wuxiaWorldUpdateTime.setText("None");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(wuxiaWorldNovelCover)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wuxiaWorldLatestChapterLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wuxiaWorldLatestChapterName, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wuxiaWorldTranslatorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wuxiaWorldTranslatorName, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wuxiaWorldUpdateTimeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wuxiaWorldUpdateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(wuxiaWorldNovelName, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wuxiaWorldNovelCover, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wuxiaWorldNovelName)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wuxiaWorldLatestChapterLabel)
                    .addComponent(wuxiaWorldLatestChapterName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wuxiaWorldTranslatorLabel)
                    .addComponent(wuxiaWorldTranslatorName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wuxiaWorldUpdateTimeLabel)
                    .addComponent(wuxiaWorldUpdateTime)))
        );
    }// </editor-fold>//GEN-END:initComponents


    public void setNovel(Novel novel)
    {
        this.wuxiaWorldNovelName.setText(novel.getNovelName());
        this.wuxiaWorldNovelCover.setIcon(new ImageIcon(novel.getNovelCover()));
        this.wuxiaWorldTranslatorName.setText(novel.getTranslator());
        this.wuxiaWorldUpdateTime.setText(novel.getLastUpdateTime());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel wuxiaWorldLatestChapterLabel;
    private javax.swing.JLabel wuxiaWorldLatestChapterName;
    private javax.swing.JLabel wuxiaWorldNovelCover;
    private javax.swing.JLabel wuxiaWorldNovelName;
    private javax.swing.JLabel wuxiaWorldTranslatorLabel;
    private javax.swing.JLabel wuxiaWorldTranslatorName;
    private javax.swing.JLabel wuxiaWorldUpdateTime;
    private javax.swing.JLabel wuxiaWorldUpdateTimeLabel;
    // End of variables declaration//GEN-END:variables
}
