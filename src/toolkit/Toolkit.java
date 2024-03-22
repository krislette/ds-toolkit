package toolkit;

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
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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
        jLabel2 = new javax.swing.JLabel();
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
        jLabel4 = new javax.swing.JLabel();
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
        jLabel5 = new javax.swing.JLabel();
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
        jLabel6 = new javax.swing.JLabel();
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
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 400));

        pnlBackground.setPreferredSize(new java.awt.Dimension(812, 450));
        pnlBackground.setLayout(new java.awt.CardLayout());

        pnlLanding.setBackground(new java.awt.Color(255, 255, 255));
        pnlLanding.setPreferredSize(new java.awt.Dimension(812, 450));
        pnlLanding.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnlLanding.add(btnArray, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 180, 65));

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
        pnlLanding.add(btnLinkedList, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 180, 65));

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
        pnlLanding.add(btnQueue, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 180, 65));

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
        pnlLanding.add(btnStack, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 180, 65));

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
        pnlLanding.add(btnTree, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 180, 65));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 45)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(248, 248, 248));
        jLabel3.setText("Data Structures Toolkit ");
        pnlLanding.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 610, 70));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toolkit/brain2.png"))); // NOI18N
        pnlLanding.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 550, 360));

        jLabel1.setBackground(new java.awt.Color(51, 0, 0));
        jLabel1.setForeground(new java.awt.Color(249, 243, 243));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toolkit/landing.png"))); // NOI18N
        pnlLanding.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 830, 470));

        pnlBackground.add(pnlLanding, "card2");

        pnlArray.setBackground(new java.awt.Color(29, 29, 29));
        pnlArray.setForeground(new java.awt.Color(29, 29, 29));
        pnlArray.setPreferredSize(new java.awt.Dimension(812, 450));
        pnlArray.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnArrayBack.setBackground(new java.awt.Color(29, 29, 29));
        btnArrayBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnArrayBack.setForeground(new java.awt.Color(255, 255, 255));
        btnArrayBack.setText("Back");
        btnArrayBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArrayBack.setFocusable(false);
        btnArrayBack.setPreferredSize(new java.awt.Dimension(90, 30));
        btnArrayBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArrayBackActionPerformed(evt);
            }
        });
        pnlArray.add(btnArrayBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 173, 40));

        btnCreateArray.setBackground(new java.awt.Color(29, 29, 29));
        btnCreateArray.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreateArray.setForeground(new java.awt.Color(255, 255, 255));
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
        pnlArray.add(btnCreateArray, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 287, 140, 40));

        btnInsertArray.setBackground(new java.awt.Color(29, 29, 29));
        btnInsertArray.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnInsertArray.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertArray.setText("Insert Element");
        btnInsertArray.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertArray.setFocusable(false);
        btnInsertArray.setPreferredSize(new java.awt.Dimension(90, 30));
        btnInsertArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertArrayActionPerformed(evt);
            }
        });
        pnlArray.add(btnInsertArray, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 287, 140, 40));

        btnDeleteArray.setBackground(new java.awt.Color(29, 29, 29));
        btnDeleteArray.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDeleteArray.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteArray.setText("Delete Element");
        btnDeleteArray.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteArray.setFocusable(false);
        btnDeleteArray.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDeleteArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteArrayActionPerformed(evt);
            }
        });
        pnlArray.add(btnDeleteArray, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 287, 140, 40));

        btnSearchArray.setBackground(new java.awt.Color(29, 29, 29));
        btnSearchArray.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSearchArray.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchArray.setText("Search Element");
        btnSearchArray.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchArray.setFocusable(false);
        btnSearchArray.setPreferredSize(new java.awt.Dimension(90, 30));
        btnSearchArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchArrayActionPerformed(evt);
            }
        });
        pnlArray.add(btnSearchArray, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 287, 140, 40));

        btnDisplayArray.setBackground(new java.awt.Color(29, 29, 29));
        btnDisplayArray.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDisplayArray.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplayArray.setText("Display Array");
        btnDisplayArray.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisplayArray.setFocusable(false);
        btnDisplayArray.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDisplayArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayArrayActionPerformed(evt);
            }
        });
        pnlArray.add(btnDisplayArray, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 287, 140, 40));

        lblArray.setBackground(new java.awt.Color(255, 255, 255));
        lblArray.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblArray.setForeground(new java.awt.Color(255, 255, 255));
        lblArray.setText("ARRAY");
        pnlArray.add(lblArray, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 17, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(29, 29, 29));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tpArrayCreate.setEditable(false);
        tpArrayCreate.setBackground(new java.awt.Color(29, 29, 29));
        tpArrayCreate.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayCreate.setText("This will allow you to create an array. Remember that you are only allowed to create one array per action item in the Array.");
        jScrollPane1.setViewportView(tpArrayCreate);

        pnlArray.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 108, 140, 140));

        tpArrayDisplay.setEditable(false);
        tpArrayDisplay.setBackground(new java.awt.Color(29, 29, 29));
        tpArrayDisplay.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayDisplay.setText("This will allow you to display the existing array and the elements may vary depending on the array manipulation based on the previous tasks.");
        jScrollPane2.setViewportView(tpArrayDisplay);

        pnlArray.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 108, 140, 140));

        tpArrayInsert.setEditable(false);
        tpArrayInsert.setBackground(new java.awt.Color(29, 29, 29));
        tpArrayInsert.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayInsert.setText("This will allow you to insert elements into the array one at a time.");
        jScrollPane3.setViewportView(tpArrayInsert);

        pnlArray.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 108, 140, 140));

        tpArrayDelete.setEditable(false);
        tpArrayDelete.setBackground(new java.awt.Color(29, 29, 29));
        tpArrayDelete.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayDelete.setText("This will allow you delete an element in the array. You are not allowed to delete an element that doesn’t exist within the array.");
        jScrollPane4.setViewportView(tpArrayDelete);

        pnlArray.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 108, 140, 140));

        tpArraySearch.setEditable(false);
        tpArraySearch.setBackground(new java.awt.Color(29, 29, 29));
        tpArraySearch.setForeground(new java.awt.Color(255, 255, 255));
        tpArraySearch.setText("This will allow you to search an element within the array.");
        jScrollPane5.setViewportView(tpArraySearch);

        pnlArray.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 108, 140, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toolkit/landing.png"))); // NOI18N
        pnlArray.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 820, 460));

        pnlBackground.add(pnlArray, "card3");

        pnlLinkedList.setBackground(new java.awt.Color(29, 29, 29));
        pnlLinkedList.setForeground(new java.awt.Color(29, 29, 29));
        pnlLinkedList.setPreferredSize(new java.awt.Dimension(812, 450));
        pnlLinkedList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLinkedListBack.setBackground(new java.awt.Color(24, 24, 24));
        pnlLinkedListBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        pnlLinkedListBack.setForeground(new java.awt.Color(255, 255, 255));
        pnlLinkedListBack.setText("Back");
        pnlLinkedListBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlLinkedListBack.setFocusable(false);
        pnlLinkedListBack.setPreferredSize(new java.awt.Dimension(90, 30));
        pnlLinkedListBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnlLinkedListBackActionPerformed(evt);
            }
        });
        pnlLinkedList.add(pnlLinkedListBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 173, 40));

        btnCreateLinkedList.setBackground(new java.awt.Color(24, 24, 24));
        btnCreateLinkedList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreateLinkedList.setForeground(new java.awt.Color(255, 255, 255));
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
        pnlLinkedList.add(btnCreateLinkedList, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 287, 140, 40));

        btnInsertLinkedList.setBackground(new java.awt.Color(24, 24, 24));
        btnInsertLinkedList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnInsertLinkedList.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertLinkedList.setText("Insert Element");
        btnInsertLinkedList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertLinkedList.setFocusable(false);
        btnInsertLinkedList.setPreferredSize(new java.awt.Dimension(90, 30));
        btnInsertLinkedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertLinkedListActionPerformed(evt);
            }
        });
        pnlLinkedList.add(btnInsertLinkedList, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 287, 140, 40));

        btnDeleteLinkedList.setBackground(new java.awt.Color(24, 24, 24));
        btnDeleteLinkedList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDeleteLinkedList.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteLinkedList.setText("Delete Element");
        btnDeleteLinkedList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteLinkedList.setFocusable(false);
        btnDeleteLinkedList.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDeleteLinkedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteLinkedListActionPerformed(evt);
            }
        });
        pnlLinkedList.add(btnDeleteLinkedList, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 287, 140, 40));

        btnSearchLinkedList.setBackground(new java.awt.Color(24, 24, 24));
        btnSearchLinkedList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSearchLinkedList.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchLinkedList.setText("Search Element");
        btnSearchLinkedList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchLinkedList.setFocusable(false);
        btnSearchLinkedList.setPreferredSize(new java.awt.Dimension(90, 30));
        btnSearchLinkedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchLinkedListActionPerformed(evt);
            }
        });
        pnlLinkedList.add(btnSearchLinkedList, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 287, 140, 40));

        btnDisplayLinkedList.setBackground(new java.awt.Color(24, 24, 24));
        btnDisplayLinkedList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDisplayLinkedList.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplayLinkedList.setText("Display List");
        btnDisplayLinkedList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisplayLinkedList.setFocusable(false);
        btnDisplayLinkedList.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDisplayLinkedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayLinkedListActionPerformed(evt);
            }
        });
        pnlLinkedList.add(btnDisplayLinkedList, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 287, 140, 40));

        lblLinkedList.setBackground(new java.awt.Color(255, 255, 255));
        lblLinkedList.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblLinkedList.setForeground(new java.awt.Color(255, 255, 255));
        lblLinkedList.setText("LINKED LIST");
        pnlLinkedList.add(lblLinkedList, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 17, -1, -1));

        tpArrayCreate1.setEditable(false);
        tpArrayCreate1.setBackground(new java.awt.Color(24, 24, 24));
        tpArrayCreate1.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayCreate1.setText("This will allow you to create a linked list. Remember that the you are only allowed to create one linked list per action item in the linked list.");
        tpArrayCreate1.setToolTipText("");
        tpArrayCreate1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane6.setViewportView(tpArrayCreate1);

        pnlLinkedList.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 108, 140, 140));

        tpArrayDisplay1.setEditable(false);
        tpArrayDisplay1.setBackground(new java.awt.Color(24, 24, 24));
        tpArrayDisplay1.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayDisplay1.setText("This will allow you to display the existing linked list and the elements may vary depending on the linked list manipulation based on the previous tasks.");
        jScrollPane7.setViewportView(tpArrayDisplay1);

        pnlLinkedList.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 108, 140, 140));

        tpArrayInsert1.setEditable(false);
        tpArrayInsert1.setBackground(new java.awt.Color(24, 24, 24));
        tpArrayInsert1.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayInsert1.setText("This will allow you to insert elements into the linked list one at a time.");
        jScrollPane8.setViewportView(tpArrayInsert1);

        pnlLinkedList.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 108, 140, 140));

        tpArrayDelete1.setEditable(false);
        tpArrayDelete1.setBackground(new java.awt.Color(24, 24, 24));
        tpArrayDelete1.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayDelete1.setText("This will allow you to delete an element in the linked list. You are also not allowed to delete an element that doesn’t exist within the linked list.");
        jScrollPane9.setViewportView(tpArrayDelete1);

        pnlLinkedList.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 108, 140, 140));

        tpArraySearch1.setEditable(false);
        tpArraySearch1.setBackground(new java.awt.Color(24, 24, 24));
        tpArraySearch1.setForeground(new java.awt.Color(255, 255, 255));
        tpArraySearch1.setText("This will allow you to search an element within the linked list.");
        jScrollPane10.setViewportView(tpArraySearch1);

        pnlLinkedList.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 108, 140, 140));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toolkit/landing.png"))); // NOI18N
        pnlLinkedList.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 460));

        pnlBackground.add(pnlLinkedList, "card3");

        pnlStack.setBackground(new java.awt.Color(29, 29, 29));
        pnlStack.setForeground(new java.awt.Color(29, 29, 29));
        pnlStack.setMinimumSize(new java.awt.Dimension(820, 460));
        pnlStack.setPreferredSize(new java.awt.Dimension(812, 450));
        pnlStack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStackBack.setBackground(new java.awt.Color(24, 24, 24));
        btnStackBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnStackBack.setForeground(new java.awt.Color(255, 255, 255));
        btnStackBack.setText("Back");
        btnStackBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStackBack.setFocusable(false);
        btnStackBack.setPreferredSize(new java.awt.Dimension(90, 30));
        btnStackBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStackBackActionPerformed(evt);
            }
        });
        pnlStack.add(btnStackBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 173, 40));

        btnCreateStack.setBackground(new java.awt.Color(24, 24, 24));
        btnCreateStack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreateStack.setForeground(new java.awt.Color(255, 255, 255));
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
        pnlStack.add(btnCreateStack, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 287, 140, 40));

        btnPushStack.setBackground(new java.awt.Color(24, 24, 24));
        btnPushStack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPushStack.setForeground(new java.awt.Color(255, 255, 255));
        btnPushStack.setText("Push To Stack");
        btnPushStack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPushStack.setFocusable(false);
        btnPushStack.setPreferredSize(new java.awt.Dimension(90, 30));
        btnPushStack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushStackActionPerformed(evt);
            }
        });
        pnlStack.add(btnPushStack, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 287, 140, 40));

        btnPopStack.setBackground(new java.awt.Color(24, 24, 24));
        btnPopStack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPopStack.setForeground(new java.awt.Color(255, 255, 255));
        btnPopStack.setText("Pop Stack");
        btnPopStack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPopStack.setFocusable(false);
        btnPopStack.setPreferredSize(new java.awt.Dimension(90, 30));
        btnPopStack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopStackActionPerformed(evt);
            }
        });
        pnlStack.add(btnPopStack, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 287, 140, 40));

        btnChangeStack.setBackground(new java.awt.Color(24, 24, 24));
        btnChangeStack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnChangeStack.setForeground(new java.awt.Color(255, 255, 255));
        btnChangeStack.setText("Change Element");
        btnChangeStack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangeStack.setFocusable(false);
        btnChangeStack.setPreferredSize(new java.awt.Dimension(90, 30));
        btnChangeStack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeStackActionPerformed(evt);
            }
        });
        pnlStack.add(btnChangeStack, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 287, 140, 40));

        btnDisplayStack.setBackground(new java.awt.Color(24, 24, 24));
        btnDisplayStack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDisplayStack.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplayStack.setText("Display Stack");
        btnDisplayStack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisplayStack.setFocusable(false);
        btnDisplayStack.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDisplayStack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayStackActionPerformed(evt);
            }
        });
        pnlStack.add(btnDisplayStack, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 287, 140, 40));

        lblStack.setBackground(new java.awt.Color(255, 255, 255));
        lblStack.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblStack.setForeground(new java.awt.Color(255, 255, 255));
        lblStack.setText("STACK");
        pnlStack.add(lblStack, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 17, -1, -1));

        tpArrayCreate2.setEditable(false);
        tpArrayCreate2.setBackground(new java.awt.Color(24, 24, 24));
        tpArrayCreate2.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayCreate2.setText("This will allow you to create a stack. Remember that the user is only allowed to create one stack per action item in the Stack.");
        jScrollPane11.setViewportView(tpArrayCreate2);

        pnlStack.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 108, 140, 140));

        tpArrayDisplay2.setEditable(false);
        tpArrayDisplay2.setBackground(new java.awt.Color(24, 24, 24));
        tpArrayDisplay2.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayDisplay2.setText("This will allow you to display the existing stack and the elements may vary depending on the stack manipulation based on the previous tasks.");
        jScrollPane12.setViewportView(tpArrayDisplay2);

        pnlStack.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 108, 140, 140));

        tpArrayInsert2.setEditable(false);
        tpArrayInsert2.setBackground(new java.awt.Color(24, 24, 24));
        tpArrayInsert2.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayInsert2.setText("This will allow you to push an element within the stack. This action will be done one at a time. You are not allowed to push beyond the stack size.");
        jScrollPane13.setViewportView(tpArrayInsert2);

        pnlStack.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 108, 140, 140));

        tpArrayDelete2.setEditable(false);
        tpArrayDelete2.setBackground(new java.awt.Color(24, 24, 24));
        tpArrayDelete2.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayDelete2.setText("This will allow you to pop an element within the stack. This action will be done one at a time. You are not allowed to pop beyond the stack size of 0.");
        jScrollPane14.setViewportView(tpArrayDelete2);

        pnlStack.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 108, 140, 140));

        tpArraySearch2.setEditable(false);
        tpArraySearch2.setBackground(new java.awt.Color(24, 24, 24));
        tpArraySearch2.setForeground(new java.awt.Color(255, 255, 255));
        tpArraySearch2.setText("This will allow you to change a specific element in the stack.");
        jScrollPane15.setViewportView(tpArraySearch2);

        pnlStack.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 108, 140, 140));

        jLabel5.setBackground(new java.awt.Color(24, 24, 24));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toolkit/landing.png"))); // NOI18N
        pnlStack.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 460));

        pnlBackground.add(pnlStack, "card3");

        pnlQueue.setBackground(new java.awt.Color(29, 29, 29));
        pnlQueue.setForeground(new java.awt.Color(29, 29, 29));
        pnlQueue.setPreferredSize(new java.awt.Dimension(812, 450));
        pnlQueue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQueueBack.setBackground(new java.awt.Color(24, 24, 24));
        btnQueueBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnQueueBack.setForeground(new java.awt.Color(255, 255, 255));
        btnQueueBack.setText("Back");
        btnQueueBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQueueBack.setFocusable(false);
        btnQueueBack.setPreferredSize(new java.awt.Dimension(90, 30));
        btnQueueBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueueBackActionPerformed(evt);
            }
        });
        pnlQueue.add(btnQueueBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 391, 173, 40));

        btnCreateQueue.setBackground(new java.awt.Color(24, 24, 24));
        btnCreateQueue.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreateQueue.setForeground(new java.awt.Color(255, 255, 255));
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
        pnlQueue.add(btnCreateQueue, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 287, 140, 40));

        btnEnqueue.setBackground(new java.awt.Color(24, 24, 24));
        btnEnqueue.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEnqueue.setForeground(new java.awt.Color(255, 255, 255));
        btnEnqueue.setText("Enqueue");
        btnEnqueue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnqueue.setFocusable(false);
        btnEnqueue.setPreferredSize(new java.awt.Dimension(90, 30));
        btnEnqueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnqueueActionPerformed(evt);
            }
        });
        pnlQueue.add(btnEnqueue, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 287, 140, 40));

        btnDequeue.setBackground(new java.awt.Color(24, 24, 24));
        btnDequeue.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDequeue.setForeground(new java.awt.Color(255, 255, 255));
        btnDequeue.setText("Dequeue");
        btnDequeue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDequeue.setFocusable(false);
        btnDequeue.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDequeue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDequeueActionPerformed(evt);
            }
        });
        pnlQueue.add(btnDequeue, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 287, 140, 40));

        btnFrontQueue.setBackground(new java.awt.Color(24, 24, 24));
        btnFrontQueue.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFrontQueue.setForeground(new java.awt.Color(255, 255, 255));
        btnFrontQueue.setText("Check Front");
        btnFrontQueue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFrontQueue.setFocusable(false);
        btnFrontQueue.setPreferredSize(new java.awt.Dimension(90, 30));
        btnFrontQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrontQueueActionPerformed(evt);
            }
        });
        pnlQueue.add(btnFrontQueue, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 287, 140, 40));

        btnRearQueue.setBackground(new java.awt.Color(24, 24, 24));
        btnRearQueue.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRearQueue.setForeground(new java.awt.Color(255, 255, 255));
        btnRearQueue.setText("Check Rear");
        btnRearQueue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRearQueue.setFocusable(false);
        btnRearQueue.setPreferredSize(new java.awt.Dimension(90, 30));
        btnRearQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRearQueueActionPerformed(evt);
            }
        });
        pnlQueue.add(btnRearQueue, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 287, 140, 40));

        lblQueue.setBackground(new java.awt.Color(255, 255, 255));
        lblQueue.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblQueue.setForeground(new java.awt.Color(255, 255, 255));
        lblQueue.setText("QUEUE");
        pnlQueue.add(lblQueue, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 17, -1, -1));

        tpArrayCreate3.setEditable(false);
        tpArrayCreate3.setBackground(new java.awt.Color(24, 24, 24));
        tpArrayCreate3.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayCreate3.setText("This will allow you to create a queue. Remember that you are only allowed to create one queue per action item in the Queue.");
        jScrollPane16.setViewportView(tpArrayCreate3);

        pnlQueue.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 108, 140, 140));

        tpArrayDisplay3.setEditable(false);
        tpArrayDisplay3.setBackground(new java.awt.Color(24, 24, 24));
        tpArrayDisplay3.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayDisplay3.setText("This will allow you to see the rear element and index upon display when selecting this option.");
        jScrollPane17.setViewportView(tpArrayDisplay3);

        pnlQueue.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 108, 140, 140));

        tpArrayInsert3.setEditable(false);
        tpArrayInsert3.setBackground(new java.awt.Color(24, 24, 24));
        tpArrayInsert3.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayInsert3.setText("This will allow you to enqueue an element within the queue. This action will be done one at a time.");
        jScrollPane18.setViewportView(tpArrayInsert3);

        pnlQueue.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 108, 140, 140));

        tpArrayDelete3.setEditable(false);
        tpArrayDelete3.setBackground(new java.awt.Color(24, 24, 24));
        tpArrayDelete3.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayDelete3.setText("This will allow you to dequeue an element within the queue. This action will be done one at a time.");
        jScrollPane19.setViewportView(tpArrayDelete3);

        pnlQueue.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 108, 140, 140));

        tpArraySearch3.setEditable(false);
        tpArraySearch3.setBackground(new java.awt.Color(24, 24, 24));
        tpArraySearch3.setForeground(new java.awt.Color(255, 255, 255));
        tpArraySearch3.setText("This will allow you to see the front element and index upon display when selecting this option.");
        jScrollPane20.setViewportView(tpArraySearch3);

        pnlQueue.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 108, 140, 140));

        btnDisplayQueue.setBackground(new java.awt.Color(24, 24, 24));
        btnDisplayQueue.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDisplayQueue.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplayQueue.setText("Display Queue");
        btnDisplayQueue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisplayQueue.setFocusable(false);
        btnDisplayQueue.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDisplayQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayQueueActionPerformed(evt);
            }
        });
        pnlQueue.add(btnDisplayQueue, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 345, 320, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toolkit/landing.png"))); // NOI18N
        pnlQueue.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 460));

        pnlBackground.add(pnlQueue, "card3");

        pnlTree.setBackground(new java.awt.Color(29, 29, 29));
        pnlTree.setForeground(new java.awt.Color(29, 29, 29));
        pnlTree.setPreferredSize(new java.awt.Dimension(812, 450));
        pnlTree.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTreeBack.setBackground(new java.awt.Color(24, 24, 24));
        pnlTreeBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        pnlTreeBack.setForeground(new java.awt.Color(255, 255, 255));
        pnlTreeBack.setText("Back");
        pnlTreeBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTreeBack.setFocusable(false);
        pnlTreeBack.setPreferredSize(new java.awt.Dimension(90, 30));
        pnlTreeBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnlTreeBackActionPerformed(evt);
            }
        });
        pnlTree.add(pnlTreeBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 388, 173, 40));

        btnCreateTree.setBackground(new java.awt.Color(24, 24, 24));
        btnCreateTree.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreateTree.setForeground(new java.awt.Color(255, 255, 255));
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
        pnlTree.add(btnCreateTree, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 287, 140, 40));

        btnInsertTree.setBackground(new java.awt.Color(24, 24, 24));
        btnInsertTree.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnInsertTree.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertTree.setText("Insert Element");
        btnInsertTree.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertTree.setFocusable(false);
        btnInsertTree.setPreferredSize(new java.awt.Dimension(90, 30));
        btnInsertTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertTreeActionPerformed(evt);
            }
        });
        pnlTree.add(btnInsertTree, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 287, 140, 40));

        btnDeleteTree.setBackground(new java.awt.Color(24, 24, 24));
        btnDeleteTree.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDeleteTree.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteTree.setText("Delete Element");
        btnDeleteTree.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteTree.setFocusable(false);
        btnDeleteTree.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDeleteTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTreeActionPerformed(evt);
            }
        });
        pnlTree.add(btnDeleteTree, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 287, 140, 40));

        btnDisplayTreeList.setBackground(new java.awt.Color(24, 24, 24));
        btnDisplayTreeList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDisplayTreeList.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplayTreeList.setText("Display Tree");
        btnDisplayTreeList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisplayTreeList.setFocusable(false);
        btnDisplayTreeList.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDisplayTreeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayTreeListActionPerformed(evt);
            }
        });
        pnlTree.add(btnDisplayTreeList, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 287, 140, 40));

        btnDisplayTreeStructure.setBackground(new java.awt.Color(24, 24, 24));
        btnDisplayTreeStructure.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDisplayTreeStructure.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplayTreeStructure.setText("Display Structure");
        btnDisplayTreeStructure.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisplayTreeStructure.setFocusable(false);
        btnDisplayTreeStructure.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDisplayTreeStructure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayTreeStructureActionPerformed(evt);
            }
        });
        pnlTree.add(btnDisplayTreeStructure, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 287, 140, 40));

        lblTree.setBackground(new java.awt.Color(255, 255, 255));
        lblTree.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTree.setForeground(new java.awt.Color(255, 255, 255));
        lblTree.setText("BINARY TREE");
        pnlTree.add(lblTree, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 17, -1, -1));

        tpArrayCreate4.setEditable(false);
        tpArrayCreate4.setBackground(new java.awt.Color(24, 24, 24));
        tpArrayCreate4.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayCreate4.setText("This will allow you to create a binary tree.");
        jScrollPane21.setViewportView(tpArrayCreate4);

        pnlTree.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 108, 140, 140));

        tpArrayDisplay4.setEditable(false);
        tpArrayDisplay4.setBackground(new java.awt.Color(24, 24, 24));
        tpArrayDisplay4.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayDisplay4.setText("This will allow you to display the tree structure (Parent Nodes, Leaf Nodes, and the Level of the tree).");
        jScrollPane22.setViewportView(tpArrayDisplay4);

        pnlTree.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 108, 140, 140));

        tpArrayInsert4.setEditable(false);
        tpArrayInsert4.setBackground(new java.awt.Color(24, 24, 24));
        tpArrayInsert4.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayInsert4.setText("This will allow you to insert a node within the binary tree.");
        jScrollPane23.setViewportView(tpArrayInsert4);

        pnlTree.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 108, 140, 140));

        tpArrayDelete4.setEditable(false);
        tpArrayDelete4.setBackground(new java.awt.Color(24, 24, 24));
        tpArrayDelete4.setForeground(new java.awt.Color(255, 255, 255));
        tpArrayDelete4.setText("This will allow you to delete a node within the binary tree.");
        jScrollPane24.setViewportView(tpArrayDelete4);

        pnlTree.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 108, 140, 140));

        tpArraySearch4.setEditable(false);
        tpArraySearch4.setBackground(new java.awt.Color(24, 24, 24));
        tpArraySearch4.setForeground(new java.awt.Color(255, 255, 255));
        tpArraySearch4.setText("This will allow you to display the binary tree and see how your elements are inserted in your tree based on the rules of binary tree.");
        jScrollPane25.setViewportView(tpArraySearch4);

        pnlTree.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 108, 140, 140));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toolkit/landing.png"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(832, 472));
        pnlTree.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 460));

        pnlBackground.add(pnlTree, "card3");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(pnlBackground, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
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