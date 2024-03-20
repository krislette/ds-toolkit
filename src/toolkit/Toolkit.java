package toolkit;

import java.util.*;
import javax.swing.*;

public class Toolkit extends javax.swing.JFrame {
    
    // Global declaration of the array and its monitoring boolean value.
    private Array arrIntegers = new Array();
    private boolean isArrayCreated = false;
    
    // Global declaration of the linked list and its monitoring boolean value.
    private LinkedList listIntegers = new LinkedList();
    private boolean isListCreated = false;
    
    // Global declaration of the stack and its monitoring boolean value.
    private Stack stackIntegers;
    private boolean isStackCreated = false;
    
    // Global declration of the queue and its monitoring boolean value.
    private Queue queueIntegers = new Queue();
    private boolean isQueueCreated = false;
    
    // Global declration of the binary tree and its monitoring boolean value.
    private BinaryTree treeIntegers = new BinaryTree();
    private boolean isTreeCreated = false;

    public Toolkit() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlLanding = new javax.swing.JPanel();
        btnArray = new javax.swing.JButton();
        btnLinkedList = new javax.swing.JButton();
        btnQueue = new javax.swing.JButton();
        btnStack = new javax.swing.JButton();
        btnTree = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlArray = new javax.swing.JPanel();
        btnArrayBack = new javax.swing.JButton();
        btnCreateArray = new javax.swing.JButton();
        btnInsertArray = new javax.swing.JButton();
        btnDeleteArray = new javax.swing.JButton();
        btnSearchArray = new javax.swing.JButton();
        btnDisplayArray = new javax.swing.JButton();
        lblArray = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpArrayCreate = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpArrayDisplay = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tpArrayInsert = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tpArrayDelete = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        tpArraySearch = new javax.swing.JTextPane();
        pnlLinkedList = new javax.swing.JPanel();
        pnlLinkedListBack = new javax.swing.JButton();
        btnCreateLinkedList = new javax.swing.JButton();
        btnInsertLinkedList = new javax.swing.JButton();
        btnDeleteLinkedList = new javax.swing.JButton();
        btnSearchLinkedList = new javax.swing.JButton();
        btnDisplayLinkedList = new javax.swing.JButton();
        lblLinkedList = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tpArrayCreate1 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        tpArrayDisplay1 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        tpArrayInsert1 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        tpArrayDelete1 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        tpArraySearch1 = new javax.swing.JTextPane();
        pnlStack = new javax.swing.JPanel();
        btnStackBack = new javax.swing.JButton();
        btnCreateStack = new javax.swing.JButton();
        btnPushStack = new javax.swing.JButton();
        btnPopStack = new javax.swing.JButton();
        btnChangeStack = new javax.swing.JButton();
        btnDisplayStack = new javax.swing.JButton();
        lblStack = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tpArrayCreate2 = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        tpArrayDisplay2 = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        tpArrayInsert2 = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        tpArrayDelete2 = new javax.swing.JTextPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        tpArraySearch2 = new javax.swing.JTextPane();
        pnlQueue = new javax.swing.JPanel();
        btnQueueBack = new javax.swing.JButton();
        btnCreateQueue = new javax.swing.JButton();
        btnEnqueue = new javax.swing.JButton();
        btnDequeue = new javax.swing.JButton();
        btnFrontQueue = new javax.swing.JButton();
        btnRearQueue = new javax.swing.JButton();
        lblQueue = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tpArrayCreate3 = new javax.swing.JTextPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        tpArrayDisplay3 = new javax.swing.JTextPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        tpArrayInsert3 = new javax.swing.JTextPane();
        jScrollPane19 = new javax.swing.JScrollPane();
        tpArrayDelete3 = new javax.swing.JTextPane();
        jScrollPane20 = new javax.swing.JScrollPane();
        tpArraySearch3 = new javax.swing.JTextPane();
        btnDisplayQueue = new javax.swing.JButton();
        pnlTree = new javax.swing.JPanel();
        pnlTreeBack = new javax.swing.JButton();
        btnCreateTree = new javax.swing.JButton();
        btnInsertTree = new javax.swing.JButton();
        btnDeleteTree = new javax.swing.JButton();
        btnDisplayTreeList = new javax.swing.JButton();
        btnDisplayTreeStructure = new javax.swing.JButton();
        lblTree = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        tpArrayCreate4 = new javax.swing.JTextPane();
        jScrollPane22 = new javax.swing.JScrollPane();
        tpArrayDisplay4 = new javax.swing.JTextPane();
        jScrollPane23 = new javax.swing.JScrollPane();
        tpArrayInsert4 = new javax.swing.JTextPane();
        jScrollPane24 = new javax.swing.JScrollPane();
        tpArrayDelete4 = new javax.swing.JTextPane();
        jScrollPane25 = new javax.swing.JScrollPane();
        tpArraySearch4 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 400));

        pnlBackground.setPreferredSize(new java.awt.Dimension(812, 450));
        pnlBackground.setLayout(new java.awt.CardLayout());

        pnlLanding.setBackground(new java.awt.Color(255, 255, 255));
        pnlLanding.setPreferredSize(new java.awt.Dimension(812, 450));

        btnArray.setBackground(new java.awt.Color(29, 29, 29));
        btnArray.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnArray.setForeground(new java.awt.Color(248, 243, 243));
        btnArray.setText("Array");
        btnArray.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArray.setFocusable(false);
        btnArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArrayActionPerformed(evt);
            }
        });

        btnLinkedList.setBackground(new java.awt.Color(29, 29, 29));
        btnLinkedList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLinkedList.setForeground(new java.awt.Color(248, 243, 243));
        btnLinkedList.setText("Linked List");
        btnLinkedList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLinkedList.setFocusable(false);
        btnLinkedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinkedListActionPerformed(evt);
            }
        });

        btnQueue.setBackground(new java.awt.Color(29, 29, 29));
        btnQueue.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnQueue.setForeground(new java.awt.Color(248, 243, 243));
        btnQueue.setText("Queue");
        btnQueue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQueue.setFocusable(false);
        btnQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueueActionPerformed(evt);
            }
        });

        btnStack.setBackground(new java.awt.Color(29, 29, 29));
        btnStack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnStack.setForeground(new java.awt.Color(248, 243, 243));
        btnStack.setText("Stack");
        btnStack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStack.setFocusable(false);
        btnStack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStackActionPerformed(evt);
            }
        });

        btnTree.setBackground(new java.awt.Color(29, 29, 29));
        btnTree.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnTree.setForeground(new java.awt.Color(248, 243, 243));
        btnTree.setText("Binary Tree");
        btnTree.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTree.setFocusable(false);
        btnTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Welcome to");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Data Structures");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Toolkit!");

        org.jdesktop.layout.GroupLayout pnlLandingLayout = new org.jdesktop.layout.GroupLayout(pnlLanding);
        pnlLanding.setLayout(pnlLandingLayout);
        pnlLandingLayout.setHorizontalGroup(
            pnlLandingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, pnlLandingLayout.createSequentialGroup()
                .add(pnlLandingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(pnlLandingLayout.createSequentialGroup()
                        .add(59, 59, 59)
                        .add(pnlLandingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(jLabel4)
                            .add(jLabel2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(btnArray, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(pnlLandingLayout.createSequentialGroup()
                        .add(62, 62, 62)
                        .add(btnStack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(77, 77, 77)
                        .add(btnQueue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 71, Short.MAX_VALUE)
                .add(pnlLandingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, btnTree, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, btnLinkedList, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(62, 62, 62))
        );
        pnlLandingLayout.setVerticalGroup(
            pnlLandingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlLandingLayout.createSequentialGroup()
                .add(45, 45, 45)
                .add(pnlLandingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlLandingLayout.createSequentialGroup()
                        .add(24, 24, 24)
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel4)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(pnlLandingLayout.createSequentialGroup()
                        .add(pnlLandingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(btnArray, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnLinkedList, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 55, Short.MAX_VALUE)
                        .add(pnlLandingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(btnTree, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnQueue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnStack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(50, 50, 50))))
        );

        pnlBackground.add(pnlLanding, "card2");

        pnlArray.setBackground(new java.awt.Color(29, 29, 29));
        pnlArray.setForeground(new java.awt.Color(29, 29, 29));

        btnArrayBack.setBackground(new java.awt.Color(248, 243, 243));
        btnArrayBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnArrayBack.setText("Back");
        btnArrayBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArrayBack.setFocusable(false);
        btnArrayBack.setPreferredSize(new java.awt.Dimension(90, 30));
        btnArrayBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArrayBackActionPerformed(evt);
            }
        });

        btnCreateArray.setBackground(new java.awt.Color(248, 243, 243));
        btnCreateArray.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreateArray.setText("Create Array");
        btnCreateArray.setToolTipText("");
        btnCreateArray.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateArray.setFocusable(false);
        btnCreateArray.setPreferredSize(new java.awt.Dimension(90, 30));
        btnCreateArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateArrayActionPerformed(evt);
            }
        });

        btnInsertArray.setBackground(new java.awt.Color(248, 243, 243));
        btnInsertArray.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnInsertArray.setText("Insert Element");
        btnInsertArray.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertArray.setFocusable(false);
        btnInsertArray.setPreferredSize(new java.awt.Dimension(90, 30));
        btnInsertArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertArrayActionPerformed(evt);
            }
        });

        btnDeleteArray.setBackground(new java.awt.Color(248, 243, 243));
        btnDeleteArray.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDeleteArray.setText("Delete Element");
        btnDeleteArray.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteArray.setFocusable(false);
        btnDeleteArray.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDeleteArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteArrayActionPerformed(evt);
            }
        });

        btnSearchArray.setBackground(new java.awt.Color(248, 243, 243));
        btnSearchArray.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSearchArray.setText("Search Element");
        btnSearchArray.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchArray.setFocusable(false);
        btnSearchArray.setPreferredSize(new java.awt.Dimension(90, 30));
        btnSearchArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchArrayActionPerformed(evt);
            }
        });

        btnDisplayArray.setBackground(new java.awt.Color(248, 243, 243));
        btnDisplayArray.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDisplayArray.setText("Display Array");
        btnDisplayArray.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisplayArray.setFocusable(false);
        btnDisplayArray.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDisplayArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayArrayActionPerformed(evt);
            }
        });

        lblArray.setBackground(new java.awt.Color(255, 255, 255));
        lblArray.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblArray.setForeground(new java.awt.Color(255, 255, 255));
        lblArray.setText("ARRAY");

        tpArrayCreate.setEditable(false);
        tpArrayCreate.setText("This will allow you to create an array. Remember that you are only allowed to create one array per action item in the Array.");
        jScrollPane1.setViewportView(tpArrayCreate);

        tpArrayDisplay.setEditable(false);
        tpArrayDisplay.setText("This will allow you to display the existing array and the elements may vary depending on the array manipulation based on the previous tasks.");
        jScrollPane2.setViewportView(tpArrayDisplay);

        tpArrayInsert.setEditable(false);
        tpArrayInsert.setText("This will allow you to insert elements into the array one at a time.");
        jScrollPane3.setViewportView(tpArrayInsert);

        tpArrayDelete.setEditable(false);
        tpArrayDelete.setText("This will allow you delete an element in the array. You are not allowed to delete an element that doesn’t exist within the array.");
        jScrollPane4.setViewportView(tpArrayDelete);

        tpArraySearch.setEditable(false);
        tpArraySearch.setText("This will allow you to search an element within the array.");
        jScrollPane5.setViewportView(tpArraySearch);

        org.jdesktop.layout.GroupLayout pnlArrayLayout = new org.jdesktop.layout.GroupLayout(pnlArray);
        pnlArray.setLayout(pnlArrayLayout);
        pnlArrayLayout.setHorizontalGroup(
            pnlArrayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, pnlArrayLayout.createSequentialGroup()
                .add(pnlArrayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(pnlArrayLayout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(pnlArrayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(lblArray)
                            .add(pnlArrayLayout.createSequentialGroup()
                                .add(pnlArrayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(pnlArrayLayout.createSequentialGroup()
                                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(pnlArrayLayout.createSequentialGroup()
                                        .add(btnCreateArray, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(btnInsertArray, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .add(18, 18, 18)
                                .add(pnlArrayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(btnDeleteArray, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .add(21, 21, 21)
                                .add(pnlArrayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, btnSearchArray, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(18, 18, 18)
                        .add(pnlArrayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnDisplayArray, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(pnlArrayLayout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(btnArrayBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 173, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(19, 19, 19))
        );
        pnlArrayLayout.setVerticalGroup(
            pnlArrayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlArrayLayout.createSequentialGroup()
                .add(pnlArrayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlArrayLayout.createSequentialGroup()
                        .add(17, 17, 17)
                        .add(lblArray)
                        .add(63, 63, 63)
                        .add(pnlArrayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jScrollPane5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(pnlArrayLayout.createSequentialGroup()
                        .add(108, 108, 108)
                        .add(pnlArrayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(39, 39, 39)
                        .add(pnlArrayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(btnCreateArray, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnDeleteArray, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnSearchArray, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnInsertArray, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnDisplayArray, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 64, Short.MAX_VALUE)
                .add(btnArrayBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(20, 20, 20))
        );

        pnlBackground.add(pnlArray, "card3");

        pnlLinkedList.setBackground(new java.awt.Color(29, 29, 29));
        pnlLinkedList.setForeground(new java.awt.Color(29, 29, 29));

        pnlLinkedListBack.setBackground(new java.awt.Color(248, 243, 243));
        pnlLinkedListBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        pnlLinkedListBack.setText("Back");
        pnlLinkedListBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlLinkedListBack.setFocusable(false);
        pnlLinkedListBack.setPreferredSize(new java.awt.Dimension(90, 30));
        pnlLinkedListBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnlLinkedListBackActionPerformed(evt);
            }
        });

        btnCreateLinkedList.setBackground(new java.awt.Color(248, 243, 243));
        btnCreateLinkedList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreateLinkedList.setText("Create List");
        btnCreateLinkedList.setToolTipText("");
        btnCreateLinkedList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateLinkedList.setFocusable(false);
        btnCreateLinkedList.setPreferredSize(new java.awt.Dimension(90, 30));
        btnCreateLinkedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateLinkedListActionPerformed(evt);
            }
        });

        btnInsertLinkedList.setBackground(new java.awt.Color(248, 243, 243));
        btnInsertLinkedList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnInsertLinkedList.setText("Insert Element");
        btnInsertLinkedList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertLinkedList.setFocusable(false);
        btnInsertLinkedList.setPreferredSize(new java.awt.Dimension(90, 30));
        btnInsertLinkedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertLinkedListActionPerformed(evt);
            }
        });

        btnDeleteLinkedList.setBackground(new java.awt.Color(248, 243, 243));
        btnDeleteLinkedList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDeleteLinkedList.setText("Delete Element");
        btnDeleteLinkedList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteLinkedList.setFocusable(false);
        btnDeleteLinkedList.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDeleteLinkedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteLinkedListActionPerformed(evt);
            }
        });

        btnSearchLinkedList.setBackground(new java.awt.Color(248, 243, 243));
        btnSearchLinkedList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSearchLinkedList.setText("Search Element");
        btnSearchLinkedList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchLinkedList.setFocusable(false);
        btnSearchLinkedList.setPreferredSize(new java.awt.Dimension(90, 30));
        btnSearchLinkedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchLinkedListActionPerformed(evt);
            }
        });

        btnDisplayLinkedList.setBackground(new java.awt.Color(248, 243, 243));
        btnDisplayLinkedList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDisplayLinkedList.setText("Display List");
        btnDisplayLinkedList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisplayLinkedList.setFocusable(false);
        btnDisplayLinkedList.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDisplayLinkedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayLinkedListActionPerformed(evt);
            }
        });

        lblLinkedList.setBackground(new java.awt.Color(255, 255, 255));
        lblLinkedList.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblLinkedList.setForeground(new java.awt.Color(255, 255, 255));
        lblLinkedList.setText("LINKED LIST");

        tpArrayCreate1.setEditable(false);
        tpArrayCreate1.setText("This will allow you to create a linked list. Remember that the you are only allowed to create one linked list per action item in the linked list.");
        tpArrayCreate1.setToolTipText("");
        tpArrayCreate1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane6.setViewportView(tpArrayCreate1);

        tpArrayDisplay1.setEditable(false);
        tpArrayDisplay1.setText("This will allow you to display the existing linked list and the elements may vary depending on the linked list manipulation based on the previous tasks.");
        jScrollPane7.setViewportView(tpArrayDisplay1);

        tpArrayInsert1.setEditable(false);
        tpArrayInsert1.setText("This will allow you to insert elements into the linked list one at a time.");
        jScrollPane8.setViewportView(tpArrayInsert1);

        tpArrayDelete1.setEditable(false);
        tpArrayDelete1.setText("This will allow you to delete an element in the linked list. You are also not allowed to delete an element that doesn’t exist within the linked list.");
        jScrollPane9.setViewportView(tpArrayDelete1);

        tpArraySearch1.setEditable(false);
        tpArraySearch1.setText("This will allow you to search an element within the linked list.");
        jScrollPane10.setViewportView(tpArraySearch1);

        org.jdesktop.layout.GroupLayout pnlLinkedListLayout = new org.jdesktop.layout.GroupLayout(pnlLinkedList);
        pnlLinkedList.setLayout(pnlLinkedListLayout);
        pnlLinkedListLayout.setHorizontalGroup(
            pnlLinkedListLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, pnlLinkedListLayout.createSequentialGroup()
                .add(pnlLinkedListLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(pnlLinkedListLayout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(pnlLinkedListLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(lblLinkedList)
                            .add(pnlLinkedListLayout.createSequentialGroup()
                                .add(pnlLinkedListLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(pnlLinkedListLayout.createSequentialGroup()
                                        .add(jScrollPane6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(jScrollPane8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(pnlLinkedListLayout.createSequentialGroup()
                                        .add(btnCreateLinkedList, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(btnInsertLinkedList, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .add(18, 18, 18)
                                .add(pnlLinkedListLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(pnlLinkedListLayout.createSequentialGroup()
                                        .add(btnDeleteLinkedList, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(btnSearchLinkedList, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(pnlLinkedListLayout.createSequentialGroup()
                                        .add(jScrollPane9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(21, 21, 21)
                                        .add(jScrollPane10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                        .add(18, 18, 18)
                        .add(pnlLinkedListLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnDisplayLinkedList, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(pnlLinkedListLayout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(pnlLinkedListBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 173, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(19, 19, 19))
        );
        pnlLinkedListLayout.setVerticalGroup(
            pnlLinkedListLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlLinkedListLayout.createSequentialGroup()
                .add(pnlLinkedListLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlLinkedListLayout.createSequentialGroup()
                        .add(17, 17, 17)
                        .add(lblLinkedList)
                        .add(63, 63, 63)
                        .add(pnlLinkedListLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jScrollPane10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(pnlLinkedListLayout.createSequentialGroup()
                        .add(108, 108, 108)
                        .add(pnlLinkedListLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jScrollPane6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(39, 39, 39)
                        .add(pnlLinkedListLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(btnCreateLinkedList, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnDeleteLinkedList, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnSearchLinkedList, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnInsertLinkedList, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnDisplayLinkedList, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 64, Short.MAX_VALUE)
                .add(pnlLinkedListBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(20, 20, 20))
        );

        pnlBackground.add(pnlLinkedList, "card3");

        pnlStack.setBackground(new java.awt.Color(29, 29, 29));
        pnlStack.setForeground(new java.awt.Color(29, 29, 29));

        btnStackBack.setBackground(new java.awt.Color(248, 243, 243));
        btnStackBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnStackBack.setText("Back");
        btnStackBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStackBack.setFocusable(false);
        btnStackBack.setPreferredSize(new java.awt.Dimension(90, 30));
        btnStackBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStackBackActionPerformed(evt);
            }
        });

        btnCreateStack.setBackground(new java.awt.Color(248, 243, 243));
        btnCreateStack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreateStack.setText("Create Stack");
        btnCreateStack.setToolTipText("");
        btnCreateStack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateStack.setFocusable(false);
        btnCreateStack.setPreferredSize(new java.awt.Dimension(90, 30));
        btnCreateStack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateStackActionPerformed(evt);
            }
        });

        btnPushStack.setBackground(new java.awt.Color(248, 243, 243));
        btnPushStack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPushStack.setText("Push To Stack");
        btnPushStack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPushStack.setFocusable(false);
        btnPushStack.setPreferredSize(new java.awt.Dimension(90, 30));
        btnPushStack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushStackActionPerformed(evt);
            }
        });

        btnPopStack.setBackground(new java.awt.Color(248, 243, 243));
        btnPopStack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPopStack.setText("Pop Stack");
        btnPopStack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPopStack.setFocusable(false);
        btnPopStack.setPreferredSize(new java.awt.Dimension(90, 30));
        btnPopStack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopStackActionPerformed(evt);
            }
        });

        btnChangeStack.setBackground(new java.awt.Color(248, 243, 243));
        btnChangeStack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnChangeStack.setText("Change Element");
        btnChangeStack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangeStack.setFocusable(false);
        btnChangeStack.setPreferredSize(new java.awt.Dimension(90, 30));
        btnChangeStack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeStackActionPerformed(evt);
            }
        });

        btnDisplayStack.setBackground(new java.awt.Color(248, 243, 243));
        btnDisplayStack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDisplayStack.setText("Display Stack");
        btnDisplayStack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisplayStack.setFocusable(false);
        btnDisplayStack.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDisplayStack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayStackActionPerformed(evt);
            }
        });

        lblStack.setBackground(new java.awt.Color(255, 255, 255));
        lblStack.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblStack.setForeground(new java.awt.Color(255, 255, 255));
        lblStack.setText("STACK");

        tpArrayCreate2.setEditable(false);
        tpArrayCreate2.setText("This will allow you to create a stack. Remember that the user is only allowed to create one stack per action item in the Stack.");
        jScrollPane11.setViewportView(tpArrayCreate2);

        tpArrayDisplay2.setEditable(false);
        tpArrayDisplay2.setText("This will allow you to display the existing stack and the elements may vary depending on the stack manipulation based on the previous tasks.");
        jScrollPane12.setViewportView(tpArrayDisplay2);

        tpArrayInsert2.setEditable(false);
        tpArrayInsert2.setText("This will allow you to push an element within the stack. This action will be done one at a time. You are not allowed to push beyond the stack size.");
        jScrollPane13.setViewportView(tpArrayInsert2);

        tpArrayDelete2.setEditable(false);
        tpArrayDelete2.setText("This will allow you to pop an element within the stack. This action will be done one at a time. You are not allowed to pop beyond the stack size of 0.");
        jScrollPane14.setViewportView(tpArrayDelete2);

        tpArraySearch2.setEditable(false);
        tpArraySearch2.setText("This will allow you to change a specific element in the stack.");
        jScrollPane15.setViewportView(tpArraySearch2);

        org.jdesktop.layout.GroupLayout pnlStackLayout = new org.jdesktop.layout.GroupLayout(pnlStack);
        pnlStack.setLayout(pnlStackLayout);
        pnlStackLayout.setHorizontalGroup(
            pnlStackLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, pnlStackLayout.createSequentialGroup()
                .add(pnlStackLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(pnlStackLayout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(pnlStackLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(lblStack)
                            .add(pnlStackLayout.createSequentialGroup()
                                .add(pnlStackLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(pnlStackLayout.createSequentialGroup()
                                        .add(jScrollPane11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(jScrollPane13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(pnlStackLayout.createSequentialGroup()
                                        .add(btnCreateStack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(btnPushStack, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .add(18, 18, 18)
                                .add(pnlStackLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(pnlStackLayout.createSequentialGroup()
                                        .add(btnPopStack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(btnChangeStack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(pnlStackLayout.createSequentialGroup()
                                        .add(jScrollPane14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(21, 21, 21)
                                        .add(jScrollPane15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                        .add(18, 18, 18)
                        .add(pnlStackLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnDisplayStack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(pnlStackLayout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(btnStackBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 173, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(19, 19, 19))
        );
        pnlStackLayout.setVerticalGroup(
            pnlStackLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlStackLayout.createSequentialGroup()
                .add(pnlStackLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlStackLayout.createSequentialGroup()
                        .add(17, 17, 17)
                        .add(lblStack)
                        .add(63, 63, 63)
                        .add(pnlStackLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jScrollPane15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(pnlStackLayout.createSequentialGroup()
                        .add(108, 108, 108)
                        .add(pnlStackLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jScrollPane11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(39, 39, 39)
                        .add(pnlStackLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(btnCreateStack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnPopStack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnChangeStack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnPushStack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnDisplayStack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 64, Short.MAX_VALUE)
                .add(btnStackBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(20, 20, 20))
        );

        pnlBackground.add(pnlStack, "card3");

        pnlQueue.setBackground(new java.awt.Color(29, 29, 29));
        pnlQueue.setForeground(new java.awt.Color(29, 29, 29));

        btnQueueBack.setBackground(new java.awt.Color(248, 243, 243));
        btnQueueBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnQueueBack.setText("Back");
        btnQueueBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQueueBack.setFocusable(false);
        btnQueueBack.setPreferredSize(new java.awt.Dimension(90, 30));
        btnQueueBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueueBackActionPerformed(evt);
            }
        });

        btnCreateQueue.setBackground(new java.awt.Color(248, 243, 243));
        btnCreateQueue.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreateQueue.setText("Create Queue");
        btnCreateQueue.setToolTipText("");
        btnCreateQueue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateQueue.setFocusable(false);
        btnCreateQueue.setPreferredSize(new java.awt.Dimension(90, 30));
        btnCreateQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateQueueActionPerformed(evt);
            }
        });

        btnEnqueue.setBackground(new java.awt.Color(248, 243, 243));
        btnEnqueue.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEnqueue.setText("Enqueue");
        btnEnqueue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnqueue.setFocusable(false);
        btnEnqueue.setPreferredSize(new java.awt.Dimension(90, 30));
        btnEnqueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnqueueActionPerformed(evt);
            }
        });

        btnDequeue.setBackground(new java.awt.Color(248, 243, 243));
        btnDequeue.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDequeue.setText("Dequeue");
        btnDequeue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDequeue.setFocusable(false);
        btnDequeue.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDequeue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDequeueActionPerformed(evt);
            }
        });

        btnFrontQueue.setBackground(new java.awt.Color(248, 243, 243));
        btnFrontQueue.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFrontQueue.setText("Check Front");
        btnFrontQueue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFrontQueue.setFocusable(false);
        btnFrontQueue.setPreferredSize(new java.awt.Dimension(90, 30));
        btnFrontQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrontQueueActionPerformed(evt);
            }
        });

        btnRearQueue.setBackground(new java.awt.Color(248, 243, 243));
        btnRearQueue.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRearQueue.setText("Check Rear");
        btnRearQueue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRearQueue.setFocusable(false);
        btnRearQueue.setPreferredSize(new java.awt.Dimension(90, 30));
        btnRearQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRearQueueActionPerformed(evt);
            }
        });

        lblQueue.setBackground(new java.awt.Color(255, 255, 255));
        lblQueue.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblQueue.setForeground(new java.awt.Color(255, 255, 255));
        lblQueue.setText("QUEUE");

        tpArrayCreate3.setEditable(false);
        tpArrayCreate3.setText("This will allow you to create a queue. Remember that you are only allowed to create one queue per action item in the Queue.");
        jScrollPane16.setViewportView(tpArrayCreate3);

        tpArrayDisplay3.setEditable(false);
        tpArrayDisplay3.setText("This will allow you to see the rear element and index upon display when selecting this option.");
        jScrollPane17.setViewportView(tpArrayDisplay3);

        tpArrayInsert3.setEditable(false);
        tpArrayInsert3.setText("This will allow you to enqueue an element within the queue. This action will be done one at a time.");
        jScrollPane18.setViewportView(tpArrayInsert3);

        tpArrayDelete3.setEditable(false);
        tpArrayDelete3.setText("This will allow you to dequeue an element within the queue. This action will be done one at a time.");
        jScrollPane19.setViewportView(tpArrayDelete3);

        tpArraySearch3.setEditable(false);
        tpArraySearch3.setText("This will allow you to see the front element and index upon display when selecting this option.");
        jScrollPane20.setViewportView(tpArraySearch3);

        btnDisplayQueue.setBackground(new java.awt.Color(248, 243, 243));
        btnDisplayQueue.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDisplayQueue.setText("Display Queue");
        btnDisplayQueue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisplayQueue.setFocusable(false);
        btnDisplayQueue.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDisplayQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayQueueActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout pnlQueueLayout = new org.jdesktop.layout.GroupLayout(pnlQueue);
        pnlQueue.setLayout(pnlQueueLayout);
        pnlQueueLayout.setHorizontalGroup(
            pnlQueueLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, pnlQueueLayout.createSequentialGroup()
                .add(pnlQueueLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(pnlQueueLayout.createSequentialGroup()
                        .add(pnlQueueLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(pnlQueueLayout.createSequentialGroup()
                                .add(18, 18, 18)
                                .add(pnlQueueLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(lblQueue)
                                    .add(pnlQueueLayout.createSequentialGroup()
                                        .add(pnlQueueLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                            .add(pnlQueueLayout.createSequentialGroup()
                                                .add(jScrollPane16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .add(18, 18, 18)
                                                .add(jScrollPane18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(pnlQueueLayout.createSequentialGroup()
                                                .add(btnCreateQueue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .add(18, 18, 18)
                                                .add(btnEnqueue, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .add(18, 18, 18)
                                        .add(pnlQueueLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                            .add(pnlQueueLayout.createSequentialGroup()
                                                .add(btnDequeue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .add(btnFrontQueue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(pnlQueueLayout.createSequentialGroup()
                                                .add(jScrollPane19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .add(21, 21, 21)
                                                .add(jScrollPane20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                            .add(pnlQueueLayout.createSequentialGroup()
                                .add(244, 244, 244)
                                .add(btnDisplayQueue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 320, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(18, 18, 18)
                        .add(pnlQueueLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnRearQueue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(pnlQueueLayout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(btnQueueBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 173, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(19, 19, 19))
        );
        pnlQueueLayout.setVerticalGroup(
            pnlQueueLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlQueueLayout.createSequentialGroup()
                .add(pnlQueueLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlQueueLayout.createSequentialGroup()
                        .add(17, 17, 17)
                        .add(lblQueue)
                        .add(63, 63, 63)
                        .add(pnlQueueLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jScrollPane20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(pnlQueueLayout.createSequentialGroup()
                        .add(108, 108, 108)
                        .add(pnlQueueLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jScrollPane16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(39, 39, 39)
                        .add(pnlQueueLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(btnCreateQueue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnDequeue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnFrontQueue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnEnqueue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnRearQueue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(18, 18, 18)
                .add(btnDisplayQueue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(btnQueueBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(20, 20, 20))
        );

        pnlBackground.add(pnlQueue, "card3");

        pnlTree.setBackground(new java.awt.Color(29, 29, 29));
        pnlTree.setForeground(new java.awt.Color(29, 29, 29));

        pnlTreeBack.setBackground(new java.awt.Color(248, 243, 243));
        pnlTreeBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        pnlTreeBack.setText("Back");
        pnlTreeBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTreeBack.setFocusable(false);
        pnlTreeBack.setPreferredSize(new java.awt.Dimension(90, 30));
        pnlTreeBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnlTreeBackActionPerformed(evt);
            }
        });

        btnCreateTree.setBackground(new java.awt.Color(248, 243, 243));
        btnCreateTree.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreateTree.setText("Create Tree");
        btnCreateTree.setToolTipText("");
        btnCreateTree.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateTree.setFocusable(false);
        btnCreateTree.setPreferredSize(new java.awt.Dimension(90, 30));
        btnCreateTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateTreeActionPerformed(evt);
            }
        });

        btnInsertTree.setBackground(new java.awt.Color(248, 243, 243));
        btnInsertTree.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnInsertTree.setText("Insert Element");
        btnInsertTree.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertTree.setFocusable(false);
        btnInsertTree.setPreferredSize(new java.awt.Dimension(90, 30));
        btnInsertTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertTreeActionPerformed(evt);
            }
        });

        btnDeleteTree.setBackground(new java.awt.Color(248, 243, 243));
        btnDeleteTree.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDeleteTree.setText("Delete Element");
        btnDeleteTree.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteTree.setFocusable(false);
        btnDeleteTree.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDeleteTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTreeActionPerformed(evt);
            }
        });

        btnDisplayTreeList.setBackground(new java.awt.Color(248, 243, 243));
        btnDisplayTreeList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDisplayTreeList.setText("Display Tree");
        btnDisplayTreeList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisplayTreeList.setFocusable(false);
        btnDisplayTreeList.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDisplayTreeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayTreeListActionPerformed(evt);
            }
        });

        btnDisplayTreeStructure.setBackground(new java.awt.Color(248, 243, 243));
        btnDisplayTreeStructure.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDisplayTreeStructure.setText("Display Structure");
        btnDisplayTreeStructure.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisplayTreeStructure.setFocusable(false);
        btnDisplayTreeStructure.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDisplayTreeStructure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayTreeStructureActionPerformed(evt);
            }
        });

        lblTree.setBackground(new java.awt.Color(255, 255, 255));
        lblTree.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTree.setForeground(new java.awt.Color(255, 255, 255));
        lblTree.setText("BINARY TREE");

        tpArrayCreate4.setEditable(false);
        tpArrayCreate4.setText("This will allow you to create a binary tree.");
        jScrollPane21.setViewportView(tpArrayCreate4);

        tpArrayDisplay4.setEditable(false);
        tpArrayDisplay4.setText("This will allow you to display the tree structure (Parent Nodes, Leaf Nodes, and the Level of the tree).");
        jScrollPane22.setViewportView(tpArrayDisplay4);

        tpArrayInsert4.setEditable(false);
        tpArrayInsert4.setText("This will allow you to insert a node within the binary tree.");
        jScrollPane23.setViewportView(tpArrayInsert4);

        tpArrayDelete4.setEditable(false);
        tpArrayDelete4.setText("This will allow you to delete a node within the binary tree.");
        jScrollPane24.setViewportView(tpArrayDelete4);

        tpArraySearch4.setEditable(false);
        tpArraySearch4.setText("This will allow you to display the binary tree and see how your elements are inserted in your tree based on the rules of binary tree.");
        jScrollPane25.setViewportView(tpArraySearch4);

        org.jdesktop.layout.GroupLayout pnlTreeLayout = new org.jdesktop.layout.GroupLayout(pnlTree);
        pnlTree.setLayout(pnlTreeLayout);
        pnlTreeLayout.setHorizontalGroup(
            pnlTreeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, pnlTreeLayout.createSequentialGroup()
                .add(pnlTreeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(pnlTreeLayout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(pnlTreeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(lblTree)
                            .add(pnlTreeLayout.createSequentialGroup()
                                .add(pnlTreeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(pnlTreeLayout.createSequentialGroup()
                                        .add(jScrollPane21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(jScrollPane23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(pnlTreeLayout.createSequentialGroup()
                                        .add(btnCreateTree, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(btnInsertTree, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .add(18, 18, 18)
                                .add(pnlTreeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(pnlTreeLayout.createSequentialGroup()
                                        .add(btnDeleteTree, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(btnDisplayTreeList, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(pnlTreeLayout.createSequentialGroup()
                                        .add(jScrollPane24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(21, 21, 21)
                                        .add(jScrollPane25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                        .add(18, 18, 18)
                        .add(pnlTreeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnDisplayTreeStructure, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(pnlTreeLayout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(pnlTreeBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 173, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(19, 19, 19))
        );
        pnlTreeLayout.setVerticalGroup(
            pnlTreeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlTreeLayout.createSequentialGroup()
                .add(pnlTreeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlTreeLayout.createSequentialGroup()
                        .add(17, 17, 17)
                        .add(lblTree)
                        .add(63, 63, 63)
                        .add(pnlTreeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jScrollPane25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(pnlTreeLayout.createSequentialGroup()
                        .add(108, 108, 108)
                        .add(pnlTreeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jScrollPane21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(39, 39, 39)
                        .add(pnlTreeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(btnCreateTree, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnDeleteTree, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnDisplayTreeList, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnInsertTree, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnDisplayTreeStructure, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 64, Short.MAX_VALUE)
                .add(pnlTreeBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(20, 20, 20))
        );

        pnlBackground.add(pnlTree, "card3");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(pnlBackground, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(pnlBackground, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayUncreatedWarning(String strMessage) {
        JOptionPane.showMessageDialog(null, 
                                      "You must create " + strMessage + " first.", 
                                      "Invalid Operation",
                                      JOptionPane.WARNING_MESSAGE);
    }
    
    private void displaySimpleMessage(String strMessage) {
        JOptionPane.showMessageDialog(null, strMessage);
    }
    
    private void displaySimpleMessage(String strMessage, String strTitle) {
        JOptionPane.showMessageDialog(null, 
                                      strMessage, 
                                      strTitle, 
                                      JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void displayCreationFailed(String strMessage) {
        JOptionPane.showMessageDialog(null, 
                                      "You already created " + strMessage + ".", 
                                      "Creation Failed",
                                      JOptionPane.WARNING_MESSAGE);
    }
    
    private void displayDeletionFailed(int intDeletedElement, String strMessage) {
        JOptionPane.showMessageDialog(null,
                                      intDeletedElement + " doesn't exist within the " + strMessage + ".",
                                      "Deletion Failed",
                                      JOptionPane.WARNING_MESSAGE);
    }
    
    private void displayPlainMessage(String strMessage, String strTitle) {
        JOptionPane.showMessageDialog(null, 
                                      strMessage, 
                                      strTitle, 
                                      JOptionPane.PLAIN_MESSAGE);
    }
    
    private boolean isDelete(int intDeletedElement) {
        int intDeletionConfirmation = JOptionPane.showConfirmDialog(null, 
                                                                    "Are you sure you want to delete " + intDeletedElement + "?", 
                                                                    "Deletion Confirmation", 
                                                                    JOptionPane.YES_NO_OPTION);
        
        if (intDeletionConfirmation == JOptionPane.CLOSED_OPTION) {
            displaySimpleMessage("You should pick between Yes or No.");
            return isDelete(intDeletedElement);
        } else if (intDeletionConfirmation == JOptionPane.NO_OPTION) {
            displaySimpleMessage(intDeletedElement + " is not deleted.");
            return false;
        }
        
        return true; // Default return case because it won't let me enclose all things inside elifs.
    }
    
    private int getUserInput(String strMessage) {
        while (true) {
            try {
                String strInput = JOptionPane.showInputDialog(null, strMessage);
                if (strInput == null) {
                    JOptionPane.showMessageDialog(null, 
                                                  "You should input an integer.",
                                                  "Input Required", 
                                                  JOptionPane.WARNING_MESSAGE);
                    continue;
                }
                return Integer.parseInt(strInput);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Enter integer values only.");
            }
            
        }
    }
    
    private void btnArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArrayActionPerformed
        pnlLanding.setVisible(false);
        pnlArray.setVisible(true);
    }//GEN-LAST:event_btnArrayActionPerformed

    private void btnLinkedListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinkedListActionPerformed
        pnlLanding.setVisible(false);
        pnlLinkedList.setVisible(true);
    }//GEN-LAST:event_btnLinkedListActionPerformed

    private void btnTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreeActionPerformed
        pnlLanding.setVisible(false);
        pnlTree.setVisible(true);
    }//GEN-LAST:event_btnTreeActionPerformed

    private void btnStackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStackActionPerformed
        pnlLanding.setVisible(false);
        pnlStack.setVisible(true);
    }//GEN-LAST:event_btnStackActionPerformed

    private void btnQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueueActionPerformed
        pnlLanding.setVisible(false);
        pnlQueue.setVisible(true);
    }//GEN-LAST:event_btnQueueActionPerformed

    private void btnDisplayArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayArrayActionPerformed
        if (!isArrayCreated) {
            displayUncreatedWarning("an array");
            return;
        }
        
        if (arrIntegers.isEmpty()) {
            displaySimpleMessage("Array is empty.", "Display Array");
            return;
        }
        
        displayPlainMessage(arrIntegers.toString(), "Display Array");
    }//GEN-LAST:event_btnDisplayArrayActionPerformed

    private void btnSearchArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchArrayActionPerformed
        while (true) {
            if (!isArrayCreated) {
                displayUncreatedWarning("an array");
                return;
            }
            
            int intSearchedElement = getUserInput("Enter integer to be searched:");
            int intSearchedIndex = arrIntegers.search(intSearchedElement);
            
            if (intSearchedIndex != -1) {
                displaySimpleMessage(intSearchedElement + " is found in the array at index " + intSearchedIndex + ".");
            } else {
                displaySimpleMessage(intSearchedElement + " is not found in the array.");
            }
            
            break;
        }
    }//GEN-LAST:event_btnSearchArrayActionPerformed

    private void btnDeleteArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteArrayActionPerformed
        while (true) {
            if (!isArrayCreated) {
                displayUncreatedWarning("an array");
                return;
            }
            
            int intDeletedElement = getUserInput("Enter integer to be deleted:");
            
            if (arrIntegers.search(intDeletedElement) != -1) {
                if (isDelete(intDeletedElement)) {
                    arrIntegers.delete(intDeletedElement);
                    displaySimpleMessage(intDeletedElement + " is successfully deleted from the array.");
                }
            } else {
                displayDeletionFailed(intDeletedElement, "array");
            }
            
            break;
        }
    }//GEN-LAST:event_btnDeleteArrayActionPerformed

    private void btnInsertArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertArrayActionPerformed
        // This is the button responsible for inserting an element into the array.
        while (true) {
            if (!isArrayCreated) {
                displayUncreatedWarning("an array");
                return;
            }

            int intInsertedElement = getUserInput("Enter integer to be inserted:");
            arrIntegers.insert(intInsertedElement);
            displaySimpleMessage(intInsertedElement + " is successfully inserted into the array.");
            
            break;
        }
    }//GEN-LAST:event_btnInsertArrayActionPerformed

    private void btnCreateArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateArrayActionPerformed
        // This is the button responsible for creating an array.
        if (isArrayCreated) {
            displayCreationFailed("an array");
            return;
        }
        
        isArrayCreated = true;
        displaySimpleMessage("Integer array successfully created.");
    }//GEN-LAST:event_btnCreateArrayActionPerformed

    private void btnArrayBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArrayBackActionPerformed
        arrIntegers.clear();
        isArrayCreated = false;
        pnlArray.setVisible(false);
        pnlLanding.setVisible(true);
    }//GEN-LAST:event_btnArrayBackActionPerformed

    private void pnlLinkedListBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnlLinkedListBackActionPerformed
        listIntegers.clear();
        isListCreated = false;
        pnlLinkedList.setVisible(false);
        pnlLanding.setVisible(true);
    }//GEN-LAST:event_pnlLinkedListBackActionPerformed

    private void btnCreateLinkedListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateLinkedListActionPerformed
        // This is the button responsible for creating a linked list.
        if (isListCreated) {
            displayCreationFailed("a linked list");
            return;
        }
        
        isListCreated = true;
        displaySimpleMessage("Integer linked list successfully created.");
    }//GEN-LAST:event_btnCreateLinkedListActionPerformed

    private void btnInsertLinkedListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertLinkedListActionPerformed
        while (true) {
            if (!isListCreated) {
                displayUncreatedWarning("a linked list");
                return;
            }

            int intInsertedElement = getUserInput("Enter integer to be inserted:");
            listIntegers.insert(intInsertedElement);
            displaySimpleMessage(intInsertedElement + " is successfully inserted into the linked list.");
            
            break;
        }
    }//GEN-LAST:event_btnInsertLinkedListActionPerformed

    private void btnDeleteLinkedListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteLinkedListActionPerformed
        while (true) {
            if (!isListCreated) {
                displayUncreatedWarning("a linked list");
                return;
            }
            
            int intDeletedElement = getUserInput("Enter integer to be deleted:");
            
            if (listIntegers.search(intDeletedElement)) {
                if (isDelete(intDeletedElement)) {
                    listIntegers.delete(intDeletedElement);
                    displaySimpleMessage(intDeletedElement + " is successfully deleted from the linked list.");
                }
            } else {
                displayDeletionFailed(intDeletedElement, "linked list");
            }
            
            break;
        }
    }//GEN-LAST:event_btnDeleteLinkedListActionPerformed

    private void btnSearchLinkedListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchLinkedListActionPerformed
        while (true) {
            if (!isListCreated) {
                displayUncreatedWarning("a linked list");
                return;
            }
            
            int intSearchedElement = getUserInput("Enter integer to be searched:");
            
            if (listIntegers.search(intSearchedElement)) {
                displaySimpleMessage(intSearchedElement + " is found in the linked list.");
            } else {
                displaySimpleMessage(intSearchedElement + " is not found in the linked list.");
            }
            
            break;
        }
    }//GEN-LAST:event_btnSearchLinkedListActionPerformed

    private void btnDisplayLinkedListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayLinkedListActionPerformed
        if (!isListCreated) {
            displayUncreatedWarning("a linked list");
            return;
        }
        
        if (listIntegers.isEmpty()) {
            displaySimpleMessage("Linked list is empty.", "Display Linked List");
            return;
        }
        
        displayPlainMessage(listIntegers.display().toString(), "Display Linked List");
    }//GEN-LAST:event_btnDisplayLinkedListActionPerformed

    private void btnStackBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStackBackActionPerformed
        if (stackIntegers != null) {
            stackIntegers.clear();
        }
        
        isStackCreated = false;
        pnlStack.setVisible(false);
        pnlLanding.setVisible(true);
    }//GEN-LAST:event_btnStackBackActionPerformed

    private void btnCreateStackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateStackActionPerformed
        if (isStackCreated) {
            displayCreationFailed("a stack");
            return;
        }
        
        int intStackSize = getUserInput("Enter integer stack size:");
        stackIntegers = new Stack(intStackSize);
        isStackCreated = true;
        displaySimpleMessage("Integer stack successfully created.");
    }//GEN-LAST:event_btnCreateStackActionPerformed

    private void btnPushStackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushStackActionPerformed
        while (true) {
            if (!isStackCreated) {
                displayUncreatedWarning("a stack");
                return;
            }

            int intPushedElement = getUserInput("Stack Size: " + stackIntegers.getMaxSize() 
                                                + "\nElement Count: " + (stackIntegers.getTop() + 1) 
                                                + "\n\nEnter integer to be pushed:");
            stackIntegers.push(intPushedElement);
            
            break;
        }
    }//GEN-LAST:event_btnPushStackActionPerformed

    private void btnPopStackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopStackActionPerformed
        if (!isStackCreated) {
            displayUncreatedWarning("a stack");
            return;
        }

        stackIntegers.pop();
    }//GEN-LAST:event_btnPopStackActionPerformed

    private void btnChangeStackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeStackActionPerformed
        if (!isStackCreated) {
            displayUncreatedWarning("a stack");
            return;
        }

        int intOldValue = getUserInput("Enter element to be changed:");
        int intNewValue = getUserInput("Enter replacing element:");
        stackIntegers.changeElement(intOldValue, intNewValue);
    }//GEN-LAST:event_btnChangeStackActionPerformed

    private void btnDisplayStackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayStackActionPerformed
        if (!isStackCreated) {
            displayUncreatedWarning("a stack");
            return;
        }
        
        if (stackIntegers.isEmpty()) {
            displaySimpleMessage("Stack is empty.", "Display Stack");
            return;
        }
        
        displayPlainMessage(stackIntegers.display().toString(), "Display Stack");
    }//GEN-LAST:event_btnDisplayStackActionPerformed

    private void btnQueueBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueueBackActionPerformed
        queueIntegers.clear();
        isQueueCreated = false;
        pnlQueue.setVisible(false);
        pnlLanding.setVisible(true);
    }//GEN-LAST:event_btnQueueBackActionPerformed

    private void btnCreateQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateQueueActionPerformed
        if (isQueueCreated) {
            displayCreationFailed("a queue");
            return;
        }
        
        isQueueCreated = true;
        displaySimpleMessage("Integer queue successfully created.");
    }//GEN-LAST:event_btnCreateQueueActionPerformed

    private void btnEnqueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnqueueActionPerformed
        while (true) {
            if (!isQueueCreated) {
                displayUncreatedWarning("a queue");
                return;
            }
            
            int intQueuedElement = getUserInput("Enter integer to be queued:");
            queueIntegers.enqueue(intQueuedElement);
            
            break;
        }
    }//GEN-LAST:event_btnEnqueueActionPerformed

    private void btnDequeueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDequeueActionPerformed
        if (!isQueueCreated) {
            displayUncreatedWarning("a queue");
            return;
        }

        queueIntegers.dequeue();
    }//GEN-LAST:event_btnDequeueActionPerformed

    private void btnFrontQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrontQueueActionPerformed
        if (!isQueueCreated) {
            displayUncreatedWarning("a queue");
            return;
        }
        
        if (queueIntegers.isEmpty()) {
            displaySimpleMessage("Queue is empty.", "Check Front");
        } else {
            displaySimpleMessage("Front Element: " + queueIntegers.front() + "\nFront Index: " + queueIntegers.getFrontIndex(), 
                                 "Check Front");
        }
    }//GEN-LAST:event_btnFrontQueueActionPerformed

    private void btnRearQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRearQueueActionPerformed
        if (!isQueueCreated) {
            displayUncreatedWarning("a queue");
            return;
        }
        
        if (queueIntegers.isEmpty()) {
            displaySimpleMessage("Queue is empty.", "Check Rear");
        } else {
            displaySimpleMessage("Rear Element: " + queueIntegers.rear() + "\nRear Index: " + queueIntegers.getRearIndex(), 
                                 "Check Rear");
        }
    }//GEN-LAST:event_btnRearQueueActionPerformed

    private void pnlTreeBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnlTreeBackActionPerformed
        treeIntegers.clear();
        isTreeCreated = false;
        pnlTree.setVisible(false);
        pnlLanding.setVisible(true);
    }//GEN-LAST:event_pnlTreeBackActionPerformed

    private void btnCreateTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTreeActionPerformed
        if (isTreeCreated) {
            displayCreationFailed("a tree");
            return;
        }
        
        isTreeCreated = true;
        displaySimpleMessage("Integer tree successfully created.");
    }//GEN-LAST:event_btnCreateTreeActionPerformed

    private void btnInsertTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertTreeActionPerformed
        while (true) {
            if (!isTreeCreated) {
                displayUncreatedWarning("a tree");
                return;
            }
            
            int intInsertedNode = getUserInput("Enter integer to be inserted:");
            treeIntegers.nodeRoot = treeIntegers.insert(treeIntegers.nodeRoot, intInsertedNode);
            displaySimpleMessage(intInsertedNode + " is successfully inserted into the tree.");
            
            break;
        }
    }//GEN-LAST:event_btnInsertTreeActionPerformed

    private void btnDeleteTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTreeActionPerformed
        while (true) {
            if (!isTreeCreated) {
                displayUncreatedWarning("a tree");
                return;
            }
            
            int intDeletedNode = getUserInput("Enter integer to be deleted:");
            
            if (treeIntegers.search(treeIntegers.nodeRoot, intDeletedNode) != null) {
                if (isDelete(intDeletedNode)) {
                    treeIntegers.nodeRoot = treeIntegers.delete(treeIntegers.nodeRoot, intDeletedNode);
                    displaySimpleMessage(intDeletedNode + " is successfully deleted from the tree.");
                }
            } else {
                displayDeletionFailed(intDeletedNode, "tree");
            }
            
            break;
        }
    }//GEN-LAST:event_btnDeleteTreeActionPerformed

    private void btnDisplayTreeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayTreeListActionPerformed
        if (!isTreeCreated) {
            displayUncreatedWarning("a tree");
            return;
        }
        
        if (treeIntegers.isEmpty()) {
            displaySimpleMessage("Tree is empty.", "Display Tree");
            return;
        }
        
        displayPlainMessage(treeIntegers.display().toString(), "Display Tree");
    }//GEN-LAST:event_btnDisplayTreeListActionPerformed

    private void btnDisplayTreeStructureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayTreeStructureActionPerformed
        if (!isTreeCreated) {
            displayUncreatedWarning("a tree");
            return;
        }
        
        if (treeIntegers.isEmpty()) {
            displaySimpleMessage("Tree is empty.", "Display Tree Structure");
            return;
        }
        
        displayPlainMessage(treeIntegers.displayStructure().toString(), "Display Tree Structure");
    }//GEN-LAST:event_btnDisplayTreeStructureActionPerformed

    private void btnDisplayQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayQueueActionPerformed
        if (!isQueueCreated) {
            displayUncreatedWarning("a queue");
            return;
        }
        
        if (queueIntegers.isEmpty()) {
            displaySimpleMessage("Queue is empty.", "Display Queue");
            return;
        }
        
        displayPlainMessage(queueIntegers.display().toString(), "Display Queue");
    }//GEN-LAST:event_btnDisplayQueueActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArray;
    private javax.swing.JButton btnArrayBack;
    private javax.swing.JButton btnChangeStack;
    private javax.swing.JButton btnCreateArray;
    private javax.swing.JButton btnCreateLinkedList;
    private javax.swing.JButton btnCreateQueue;
    private javax.swing.JButton btnCreateStack;
    private javax.swing.JButton btnCreateTree;
    private javax.swing.JButton btnDeleteArray;
    private javax.swing.JButton btnDeleteLinkedList;
    private javax.swing.JButton btnDeleteTree;
    private javax.swing.JButton btnDequeue;
    private javax.swing.JButton btnDisplayArray;
    private javax.swing.JButton btnDisplayLinkedList;
    private javax.swing.JButton btnDisplayQueue;
    private javax.swing.JButton btnDisplayStack;
    private javax.swing.JButton btnDisplayTreeList;
    private javax.swing.JButton btnDisplayTreeStructure;
    private javax.swing.JButton btnEnqueue;
    private javax.swing.JButton btnFrontQueue;
    private javax.swing.JButton btnInsertArray;
    private javax.swing.JButton btnInsertLinkedList;
    private javax.swing.JButton btnInsertTree;
    private javax.swing.JButton btnLinkedList;
    private javax.swing.JButton btnPopStack;
    private javax.swing.JButton btnPushStack;
    private javax.swing.JButton btnQueue;
    private javax.swing.JButton btnQueueBack;
    private javax.swing.JButton btnRearQueue;
    private javax.swing.JButton btnSearchArray;
    private javax.swing.JButton btnSearchLinkedList;
    private javax.swing.JButton btnStack;
    private javax.swing.JButton btnStackBack;
    private javax.swing.JButton btnTree;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblArray;
    private javax.swing.JLabel lblLinkedList;
    private javax.swing.JLabel lblQueue;
    private javax.swing.JLabel lblStack;
    private javax.swing.JLabel lblTree;
    private javax.swing.JPanel pnlArray;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlLanding;
    private javax.swing.JPanel pnlLinkedList;
    private javax.swing.JButton pnlLinkedListBack;
    private javax.swing.JPanel pnlQueue;
    private javax.swing.JPanel pnlStack;
    private javax.swing.JPanel pnlTree;
    private javax.swing.JButton pnlTreeBack;
    private javax.swing.JTextPane tpArrayCreate;
    private javax.swing.JTextPane tpArrayCreate1;
    private javax.swing.JTextPane tpArrayCreate2;
    private javax.swing.JTextPane tpArrayCreate3;
    private javax.swing.JTextPane tpArrayCreate4;
    private javax.swing.JTextPane tpArrayDelete;
    private javax.swing.JTextPane tpArrayDelete1;
    private javax.swing.JTextPane tpArrayDelete2;
    private javax.swing.JTextPane tpArrayDelete3;
    private javax.swing.JTextPane tpArrayDelete4;
    private javax.swing.JTextPane tpArrayDisplay;
    private javax.swing.JTextPane tpArrayDisplay1;
    private javax.swing.JTextPane tpArrayDisplay2;
    private javax.swing.JTextPane tpArrayDisplay3;
    private javax.swing.JTextPane tpArrayDisplay4;
    private javax.swing.JTextPane tpArrayInsert;
    private javax.swing.JTextPane tpArrayInsert1;
    private javax.swing.JTextPane tpArrayInsert2;
    private javax.swing.JTextPane tpArrayInsert3;
    private javax.swing.JTextPane tpArrayInsert4;
    private javax.swing.JTextPane tpArraySearch;
    private javax.swing.JTextPane tpArraySearch1;
    private javax.swing.JTextPane tpArraySearch2;
    private javax.swing.JTextPane tpArraySearch3;
    private javax.swing.JTextPane tpArraySearch4;
    // End of variables declaration//GEN-END:variables
}