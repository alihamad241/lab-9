/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.User;

import javax.swing.*;

/**
 *
 * @author youssef
 */
public final class FriendManagement extends javax.swing.JFrame {

    private final User user;
    /**
     * Creates new form friendManagement
     * @param user
     */
    public FriendManagement(User user) {
        initComponents();
        this.user = user;
        Profile_Updates.RefreshProfile();
        UpdateFriends();
        UpdateSuggestedFriends();
        UpdateFriendRequests();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void UpdateFriends() {
        JPanel containerPanel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(containerPanel, BoxLayout.Y_AXIS);
        containerPanel.setLayout(boxLayout);

        for (int i = 0; i < user.getFriendManagement().getFriends().size(); i++) {
            User removedFriend = user.getFriendManagement().getFriends().get(i);
            JLabel friendLabel = new JLabel(user.getFriendManagement().getFriends().get(i).getUsername());
            JButton removeFriendButton = new JButton("Remove");
            removeFriendButton.addActionListener((java.awt.event.ActionEvent evt) -> {
                user.removeFriend(removedFriend);
                JOptionPane.showMessageDialog(null, "Friend removed successfully.");
                user.getFriendManagement().fillSuggestedFriends();
                Profile_Updates.RefreshProfile();
                UpdateFriends();
                UpdateSuggestedFriends();
            });
            JButton blockFriendButton = new JButton("Block");
            blockFriendButton.addActionListener((java.awt.event.ActionEvent evt) -> {
                user.getFriendManagement().blockUser(removedFriend);
                JOptionPane.showMessageDialog(null, "User Blocked");
                user.getFriendManagement().fillSuggestedFriends();
                Profile_Updates.RefreshProfile();
                UpdateFriends();
                UpdateSuggestedFriends();
            });

            JPanel friendPanel = new JPanel();
            friendPanel.add(friendLabel);
            friendPanel.add(removeFriendButton);
            friendPanel.add(blockFriendButton);
            containerPanel.add(friendPanel);

        }
        friendsList.setViewportView(containerPanel);
    }

    public void UpdateSuggestedFriends(){
        JPanel containerPanel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(containerPanel, BoxLayout.Y_AXIS);
        containerPanel.setLayout(boxLayout);

        for (int i=0;i<user.getFriendManagement().getSuggestedFriends().size();i++){
            User suggestedFriend = user.getFriendManagement().getSuggestedFriends().get(i);
            JLabel friendLabel = new JLabel(suggestedFriend.getUsername());
            JButton addFriendButton = new JButton("Add Friend");
            addFriendButton.addActionListener((java.awt.event.ActionEvent evt) -> {
                user.sendFriendRequest(suggestedFriend);
                JOptionPane.showMessageDialog(null, "Friend Request Sent");
                addFriendButton.setEnabled(false);
                addFriendButton.setText("Pending");
                Profile_Updates.RefreshProfile();
                user.getFriendManagement().fillSuggestedFriends();
            });
            JButton blockFriendButton = new JButton("Block");
            blockFriendButton.addActionListener((java.awt.event.ActionEvent evt) -> {
                user.getFriendManagement().blockUser(suggestedFriend);
                JOptionPane.showMessageDialog(null, "User Blocked");
                user.getFriendManagement().fillSuggestedFriends();
                Profile_Updates.RefreshProfile();
                UpdateSuggestedFriends();
                UpdateFriends();
            });
            JPanel suggestedFriendPanel = new JPanel();
            suggestedFriendPanel.add(friendLabel);
            suggestedFriendPanel.add(addFriendButton);
            suggestedFriendPanel.add(blockFriendButton);
            containerPanel.add(suggestedFriendPanel);
        }
        suggestedFriendsList.setViewportView(containerPanel);
    }

    public void UpdateFriendRequests()
    {
        JPanel containerPanel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(containerPanel, BoxLayout.Y_AXIS);
        containerPanel.setLayout(boxLayout);

        for (int i = 0; i < user.getFriendManagement().getReceivedRequests().size(); i++) {
            User receivedRequest = user.getFriendManagement().getReceivedRequests().get(i);
            JLabel friendLabel = new JLabel(user.getFriendManagement().getReceivedRequests().get(i).getUsername());
            JButton acceptFriendButton = new JButton("Accept");
            acceptFriendButton.addActionListener((java.awt.event.ActionEvent evt) -> {
                user.acceptFriendRequest(receivedRequest);
                JOptionPane.showMessageDialog(null, "Friend Request Accepted");
                user.getFriendManagement().fillSuggestedFriends();
                Profile_Updates.RefreshProfile();
                UpdateFriendRequests();
                UpdateFriends();
            });
            JButton rejectFriendButton = new JButton("Reject");
            rejectFriendButton.addActionListener((java.awt.event.ActionEvent evt) -> {
                user.getFriendManagement().declineFriendRequest(receivedRequest);
                JOptionPane.showMessageDialog(null, "Friend Request Rejected");
                user.getFriendManagement().fillSuggestedFriends();
                Profile_Updates.RefreshProfile();
                UpdateFriendRequests();
                UpdateFriends();
            });

            JPanel friendPanel = new JPanel();
            friendPanel.add(friendLabel);
            friendPanel.add(acceptFriendButton);
            friendPanel.add(rejectFriendButton);
            containerPanel.add(friendPanel);

        }
        friendRequestList.setViewportView(containerPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        friendsList = new javax.swing.JScrollPane();
        suggestedFriendsList = new javax.swing.JScrollPane();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        friendRequestList = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FRIEND MANAGEMENT");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FRIEND REQUESTS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SUGGESTED FRIENDS LIST");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FRIENDS LIST");

        jButton1.setText("Search for User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(friendsList, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(friendRequestList, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suggestedFriendsList))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(friendsList, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(friendRequestList, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(suggestedFriendsList, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new SearchForFriends(user).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane friendRequestList;
    private javax.swing.JScrollPane friendsList;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane suggestedFriendsList;
    // End of variables declaration//GEN-END:variables
}
