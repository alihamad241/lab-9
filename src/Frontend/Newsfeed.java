/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.User;
import Backend.UserManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author DELL
 */
public final class Newsfeed extends javax.swing.JFrame {
    private final User user;
    /**
     * Creates new form newsfeed
     * @param user
     */
    
    public Newsfeed(User user) {
        initComponents();
        this.user = user;
        NewsFeed_Updates.RefreshNewsFeed(user, friendsList, suggestedFriendPanel, postPanel, storyPanel, NotificationsPanel, groupsList);
        UpdateFriends();
        UpdateSuggestedFriends();
        UpdatePosts();
        UpdateStories();
        UpdateNotifications();
        UpdateGroups();
        this.setLocationRelativeTo(null);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                UserManager.logout(user);
            }
        });
    }

    public void UpdateFriends() {
        NewsFeed_Updates.UpdateFriends(user, friendsList);
    }

    public void UpdateSuggestedFriends(){
        NewsFeed_Updates.UpdateSuggestedFriends(user, suggestedFriendPanel);
}

    public void UpdatePosts() {
    NewsFeed_Updates.UpdatePosts(user, postPanel);
}

    public void UpdateStories() {
        NewsFeed_Updates.UpdateStories(user, storyPanel);
}

    public void UpdateNotifications() {
        NewsFeed_Updates.UpdateNotifications(user, NotificationsPanel);
    }

    public void UpdateGroups(){
        NewsFeed_Updates.UpdateGroups(user, groupsList);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JButton addStoryOrPost = new javax.swing.JButton();
        javax.swing.JButton profileManagement = new javax.swing.JButton();
        javax.swing.JButton refresh = new javax.swing.JButton();
        javax.swing.JButton friendManagement = new javax.swing.JButton();
        postPanel = new javax.swing.JScrollPane();
        storyPanel = new javax.swing.JScrollPane();
        suggestedFriendPanel = new javax.swing.JScrollPane();
        friendsList = new javax.swing.JScrollPane();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NotificationsPanel = new javax.swing.JScrollPane();
        createGroups = new javax.swing.JButton();
        seachForGroups = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        groupsList = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addStoryOrPost.setBackground(new java.awt.Color(0, 0, 0));
        addStoryOrPost.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addStoryOrPost.setForeground(new java.awt.Color(255, 255, 255));
        addStoryOrPost.setText("Add Story or Post");
        addStoryOrPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStoryOrPostActionPerformed(evt);
            }
        });

        profileManagement.setBackground(new java.awt.Color(0, 0, 0));
        profileManagement.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profileManagement.setForeground(new java.awt.Color(255, 255, 255));
        profileManagement.setText("Profile Management");
        profileManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileManagementActionPerformed(evt);
            }
        });

        refresh.setBackground(new java.awt.Color(0, 0, 0));
        refresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        friendManagement.setBackground(new java.awt.Color(0, 0, 0));
        friendManagement.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        friendManagement.setForeground(new java.awt.Color(255, 255, 255));
        friendManagement.setText("Friends Management");
        friendManagement.setPreferredSize(new java.awt.Dimension(168, 31));
        friendManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friendManagementActionPerformed(evt);
            }
        });

        postPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        postPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        storyPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        storyPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        suggestedFriendPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        friendsList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Friends List");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Friends Suggestions");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Notifications");

        NotificationsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        createGroups.setBackground(new java.awt.Color(0, 0, 0));
        createGroups.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        createGroups.setForeground(new java.awt.Color(255, 255, 255));
        createGroups.setText("Create Group");
        createGroups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGroupsActionPerformed(evt);
            }
        });

        seachForGroups.setBackground(new java.awt.Color(0, 0, 0));
        seachForGroups.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seachForGroups.setForeground(new java.awt.Color(255, 255, 255));
        seachForGroups.setText("Search For Groups");
        seachForGroups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seachForGroupsActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Groups Lists");

        groupsList.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(createGroups))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                        .addComponent(friendsList))
                    .addComponent(groupsList))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(storyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(suggestedFriendPanel)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NotificationsPanel)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(seachForGroups)
                        .addGap(18, 18, 18)
                        .addComponent(addStoryOrPost, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(friendManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(profileManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addStoryOrPost, createGroups, seachForGroups});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 292, Short.MAX_VALUE)
                        .addComponent(NotificationsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(friendsList, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suggestedFriendPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(groupsList, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(storyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(postPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createGroups)
                    .addComponent(seachForGroups)
                    .addComponent(addStoryOrPost, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(friendManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addStoryOrPost, createGroups, profileManagement, refresh, seachForGroups});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStoryOrPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStoryOrPostActionPerformed
        // TODO add your handling code here:
        new CreateContent(user).setVisible(true);
    }//GEN-LAST:event_addStoryOrPostActionPerformed

    private void profileManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileManagementActionPerformed
        // TODO add your handling code here:
        new ProfilePage(user, this).setVisible(true);
    }//GEN-LAST:event_profileManagementActionPerformed

    private void friendManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friendManagementActionPerformed
        // TODO add your handling code here:
        new FriendManagement(user).setVisible(true);
    }//GEN-LAST:event_friendManagementActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
    // Refresh the news feed
    NewsFeed_Updates.RefreshNewsFeed(user, friendsList, suggestedFriendPanel, postPanel, storyPanel, NotificationsPanel, groupsList);
    }//GEN-LAST:event_refreshActionPerformed

    private void createGroupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createGroupsActionPerformed
        // TODO add your handling code here:
        new CreateNewGroup(user).setVisible(true);
    }//GEN-LAST:event_createGroupsActionPerformed

    private void seachForGroupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seachForGroupsActionPerformed
        // TODO add your handling code here:
        new SearchForGroups(user).setVisible(true);
    }//GEN-LAST:event_seachForGroupsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane NotificationsPanel;
    private javax.swing.JButton createGroups;
    private javax.swing.JScrollPane friendsList;
    private javax.swing.JScrollPane groupsList;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane postPanel;
    private javax.swing.JButton seachForGroups;
    private javax.swing.JScrollPane storyPanel;
    private javax.swing.JScrollPane suggestedFriendPanel;
    // End of variables declaration//GEN-END:variables
}
