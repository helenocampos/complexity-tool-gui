package com.mycompany.complexity.tool.gui;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.mycompany.complexity.tool.mvn.App;
import com.mycompany.complexity.tool.mvn.GraphAnalysis;
import com.mycompany.complexity.tool.mvn.Path;
import com.mycompany.complexity.tool.mvn.Renderer;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Heleno
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form JFileChooserDemo
     */
    public MainForm() {
        initComponents();
        methods = new ArrayList<>();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private ArrayList<CustomComboBoxItem> methods;

    private CompilationUnit cu;

    private CustomComboBoxItem activeItem;

    private Renderer activeRenderer;

    private App app;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        className = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        metodos = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        paths = new javax.swing.JComboBox();
        txtComplexidade = new javax.swing.JLabel();
        complexidadeOtimizada = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        graphTab = new javax.swing.JPanel();
        controlButtonsArea = new javax.swing.JPanel();
        controlButtons = new javax.swing.JPanel();
        moveButton = new javax.swing.JToggleButton();
        selectButton = new javax.swing.JToggleButton();
        zoomInButton = new javax.swing.JButton();
        zoomOutButton = new javax.swing.JButton();
        graphArea = new javax.swing.JPanel();
        optimizedGraphTab = new javax.swing.JPanel();
        optimizedGraphButtonsArea = new javax.swing.JPanel();
        optimizedGraphArea = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        scrollPane = new javax.swing.JScrollPane();
        codeArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        txtCaminho = new javax.swing.JLabel();
        pathText = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        predicatesTable = new javax.swing.JTable();
        txtComplexidadeAnalise = new javax.swing.JLabel();
        complexidade = new javax.swing.JLabel();
        selectedNode = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        selectedCodeArea = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Exit = new javax.swing.JMenuItem();
        Open = new javax.swing.JMenuItem();

        fileChooser.setDialogTitle("Open dialog");
        fileChooser.setFileFilter(new MyCustomFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Complexity Tool");
        setMinimumSize(new java.awt.Dimension(900, 800));

        jLabel1.setText("Classe selecionada:");

        jLabel2.setText("Método:");

        metodos.setModel(new DefaultComboBoxModel());
        metodos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                metodosItemStateChanged(evt);
            }
        });

        jLabel3.setText("Caminho:");

        paths.setModel(new DefaultComboBoxModel());
        paths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathsActionPerformed(evt);
            }
        });

        txtComplexidade.setText("Complexidade otimizada:");

        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });
        jTabbedPane2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane2FocusGained(evt);
            }
        });

        graphTab.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        graphTab.setMinimumSize(new java.awt.Dimension(400, 700));
        graphTab.setPreferredSize(new java.awt.Dimension(400, 700));

        controlButtonsArea.setLayout(new java.awt.GridLayout(1, 0));

        moveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/move.png"))); // NOI18N
        moveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        selectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/select.png"))); // NOI18N
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        zoomInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoom_in.png"))); // NOI18N
        zoomInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomInButtonActionPerformed(evt);
            }
        });

        zoomOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoom_out.png"))); // NOI18N
        zoomOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlButtonsLayout = new javax.swing.GroupLayout(controlButtons);
        controlButtons.setLayout(controlButtonsLayout);
        controlButtonsLayout.setHorizontalGroup(
            controlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlButtonsLayout.createSequentialGroup()
                .addComponent(moveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zoomInButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zoomOutButton)
                .addGap(0, 117, Short.MAX_VALUE))
        );
        controlButtonsLayout.setVerticalGroup(
            controlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(moveButton)
                .addComponent(selectButton)
                .addComponent(zoomInButton)
                .addComponent(zoomOutButton))
        );

        controlButtonsArea.add(controlButtons);

        graphArea.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout graphTabLayout = new javax.swing.GroupLayout(graphTab);
        graphTab.setLayout(graphTabLayout);
        graphTabLayout.setHorizontalGroup(
            graphTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graphTabLayout.createSequentialGroup()
                .addGroup(graphTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(graphArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controlButtonsArea, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
                .addContainerGap())
        );
        graphTabLayout.setVerticalGroup(
            graphTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graphTabLayout.createSequentialGroup()
                .addComponent(controlButtonsArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graphArea, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Graph", graphTab);

        optimizedGraphTab.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        optimizedGraphTab.setMinimumSize(new java.awt.Dimension(400, 700));
        optimizedGraphTab.setPreferredSize(new java.awt.Dimension(400, 700));

        optimizedGraphButtonsArea.setPreferredSize(new java.awt.Dimension(0, 34));

        javax.swing.GroupLayout optimizedGraphButtonsAreaLayout = new javax.swing.GroupLayout(optimizedGraphButtonsArea);
        optimizedGraphButtonsArea.setLayout(optimizedGraphButtonsAreaLayout);
        optimizedGraphButtonsAreaLayout.setHorizontalGroup(
            optimizedGraphButtonsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        optimizedGraphButtonsAreaLayout.setVerticalGroup(
            optimizedGraphButtonsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        optimizedGraphArea.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout optimizedGraphTabLayout = new javax.swing.GroupLayout(optimizedGraphTab);
        optimizedGraphTab.setLayout(optimizedGraphTabLayout);
        optimizedGraphTabLayout.setHorizontalGroup(
            optimizedGraphTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(optimizedGraphArea, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
            .addComponent(optimizedGraphButtonsArea, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );
        optimizedGraphTabLayout.setVerticalGroup(
            optimizedGraphTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optimizedGraphTabLayout.createSequentialGroup()
                .addComponent(optimizedGraphButtonsArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optimizedGraphArea, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Optimized Graph", optimizedGraphTab);

        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setAutoscrolls(true);
        scrollPane.setMinimumSize(new java.awt.Dimension(400, 700));
        scrollPane.setPreferredSize(new java.awt.Dimension(400, 700));

        codeArea.setEditable(false);
        codeArea.setColumns(20);
        codeArea.setRows(5);
        codeArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        codeArea.setRequestFocusEnabled(false);
        scrollPane.setViewportView(codeArea);

        jTabbedPane1.addTab("Código", scrollPane);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCaminho.setText("Caminho");
        jPanel1.add(txtCaminho, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 31, -1, -1));
        jPanel1.add(pathText, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 31, -1, -1));

        predicatesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Predicado", "Condição", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        predicatesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(predicatesTable);
        if (predicatesTable.getColumnModel().getColumnCount() > 0) {
            predicatesTable.getColumnModel().getColumn(0).setMinWidth(70);
            predicatesTable.getColumnModel().getColumn(0).setPreferredWidth(70);
            predicatesTable.getColumnModel().getColumn(0).setMaxWidth(70);
            predicatesTable.getColumnModel().getColumn(2).setMinWidth(65);
            predicatesTable.getColumnModel().getColumn(2).setPreferredWidth(65);
            predicatesTable.getColumnModel().getColumn(2).setMaxWidth(65);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, 372, 242));

        txtComplexidadeAnalise.setText("Complexidade Ciclomática:");
        jPanel1.add(txtComplexidadeAnalise, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        jPanel1.add(complexidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 6, -1, -1));
        jPanel1.add(selectedNode, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 433, -1, -1));

        selectedCodeArea.setEditable(false);
        selectedCodeArea.setColumns(20);
        selectedCodeArea.setLineWrap(true);
        selectedCodeArea.setRows(5);
        jScrollPane3.setViewportView(selectedCodeArea);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 336, 372, 484));

        jLabel6.setText("Código do nó selecionado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 314, -1, -1));

        jTabbedPane1.addTab("Análise", jPanel1);

        jMenu1.setText("File");

        Exit.setText("Open");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        Open.setText("Exit");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        jMenu1.add(Open);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(metodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(className)))
                        .addGap(294, 294, 294)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paths, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtComplexidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(complexidadeOtimizada)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane2))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(className)
                    .addComponent(txtComplexidade)
                    .addComponent(complexidadeOtimizada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(metodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(paths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1203, Short.MAX_VALUE)
                    .addComponent(jTabbedPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pathsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathsActionPerformed

    private void metodosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_metodosItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_metodosItemStateChanged

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        System.exit(0);
    }//GEN-LAST:event_OpenActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        fileChooser.setAcceptAllFileFilterUsed(false);
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {

                metodos.removeAllItems();
                JavaParser.setDoNotAssignCommentsPreceedingEmptyLines(false);
                cu = JavaParser.parse(file);
                className.setText(file.getName());
                metodos.addItemListener(new ItemChangeListener());
                paths.addItemListener(new ItemChangeListener());
                new MethodVisitor().visit(cu, null);

            } catch (IOException ex) {
                System.out.println("problem accessing file" + file.getAbsolutePath());
            } catch (ParseException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void jTabbedPane2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane2FocusGained

    }//GEN-LAST:event_jTabbedPane2FocusGained

    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        JTabbedPane sourceTabbedPane = (JTabbedPane) evt.getSource();
        int index = sourceTabbedPane.getSelectedIndex();
        //        System.out.println("Tab changed to: " + sourceTabbedPane.getTitleAt(index));
        if (index == 0) {
            if (jTabbedPane1.getComponentCount() > 0) {
                jTabbedPane1.setEnabledAt(0, true);
                unhideAnalysisElements();

            }
            if (app != null) {
                activeRenderer = app.getRenderer();
                setMoveMode(true);
            }
            moveControlButtons(controlButtonsArea);
        } else {
            jTabbedPane1.setEnabledAt(0, false);
            jTabbedPane1.setSelectedIndex(1);
            hideAnalysisElements();
            if (app != null) {
                activeRenderer = app.getOptimizedRenderer();
                setMoveMode(true);
            }
            moveControlButtons(optimizedGraphButtonsArea);
        }
    }//GEN-LAST:event_jTabbedPane2StateChanged

    private void moveControlButtons(JPanel panel){
        panel.removeAll();
        panel.add(controlButtons);
        panel.revalidate();
    }
    
    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtonActionPerformed
        if (selectButton.isSelected()) {
            setMoveMode(true);
        } else {
            setMoveMode(false);
        }
    }//GEN-LAST:event_moveButtonActionPerformed

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        if (moveButton.isSelected()) {
            setSelectMode(true);
        } else {
            setSelectMode(false);
        }
    }//GEN-LAST:event_selectButtonActionPerformed

    private void setMoveMode(boolean value) {
        moveButton.setSelected(value);
        if (activeRenderer != null) {
            if (moveButton.isSelected()) {
                activeRenderer.setMoveMode();
                selectButton.setSelected(false);
            } else {
                setSelectMode(true);
            }
        }
    }

    private void setSelectMode(boolean value) {
        selectButton.setSelected(value);
        if (activeRenderer != null) {
            if (selectButton.isSelected()) {
                activeRenderer.setSelectingMode();
                moveButton.setSelected(false);
            } else {
                setMoveMode(true);
            }
        }
    }
    private void zoomInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomInButtonActionPerformed
        if (activeRenderer != null) {
            activeRenderer.zoomIn();
        }
    }//GEN-LAST:event_zoomInButtonActionPerformed

    private void zoomOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomOutButtonActionPerformed
        if (activeRenderer != null) {
            activeRenderer.zoomOut();
        }
    }//GEN-LAST:event_zoomOutButtonActionPerformed

    class ItemChangeListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent event) {

            if (event.getStateChange() == ItemEvent.SELECTED) {
                if (event.getSource().equals(metodos)) {
                    if (metodos.getItemCount() > 0) {
                        CustomComboBoxItem item = (CustomComboBoxItem) event.getItem();
                        activeItem = item;
                        app = item.getApp();
                        codeArea.setText(app.getCode());

                        TextLineNumber tln = new TextLineNumber(codeArea);
                        scrollPane.setRowHeaderView(tln);

                        updateGraphArea(app.getRenderer());
                        updateOptimizedGraphArea(app.getOptimizedRenderer());
                        GraphAnalysis analysis = app.getAnalysis();
                        if (app.hasOptimizingSugestions()) {
                            jTabbedPane2.setEnabledAt(1, true);
                        } else {
                            jTabbedPane2.setEnabledAt(1, false);
                        }
                        paths.removeAllItems();
                        activeRenderer = app.getRenderer();
                        setMoveMode(true);
                        analysis.getPaths().stream().forEach((path) -> {
                            paths.addItem(path);
                        });

                        complexidade.setText(Integer.toString(paths.getItemCount()));
                        if (app.hasOptimizingSugestions()) {
                            txtComplexidade.setVisible(true);
                            complexidadeOtimizada.setText(Integer.toString(app.getOptimizedAnalysis().getPaths().size()));
                        } else {
                            txtComplexidade.setVisible(false);
                            complexidadeOtimizada.setText("");
                        }
                    }

                } else if (event.getSource().equals(paths)) {
                    if (paths.getItemCount() > 0) {
                        Path path = (Path) event.getItem();
                        if (path != null) {
                            pathText.setText(path.getPathString());
                            DefaultTableModel tableModel = (DefaultTableModel) predicatesTable.getModel();
                            tableModel.setRowCount(0);
                            String[][] predicateData = path.getPredicateData();
                            for (String[] data : predicateData) {
                                tableModel.addRow(data);
                            }

                            activeItem.getApp().getRenderer().fillPath(path.getNodes());
                            updateGraphArea(activeItem.getApp().getRenderer());

                        }

                    }
                }
            }

        }
    }

    private void hideAnalysisElements() {
        jScrollPane2.setVisible(false);
        txtCaminho.setVisible(false);
        txtComplexidadeAnalise.setVisible(false);
        complexidade.setVisible(false);
        pathText.setVisible(false);
    }

    private void unhideAnalysisElements() {
        jScrollPane2.setVisible(true);
        txtCaminho.setVisible(true);
        txtComplexidadeAnalise.setVisible(true);
        complexidade.setVisible(true);
        pathText.setVisible(true);
    }

    private void updateGraphArea(Renderer renderer) {
        if (renderer != null) {
            graphArea.removeAll();
            graphArea.add(renderer.getVisualizationViewer(), BorderLayout.CENTER);
            graphArea.revalidate();
            graphArea.repaint();
            graphArea.requestFocus();
        }
    }

    private void updateOptimizedGraphArea(Renderer renderer) {
        if (renderer != null) {
            optimizedGraphArea.removeAll();
            optimizedGraphArea.add(renderer.getVisualizationViewer(), BorderLayout.CENTER);
            optimizedGraphArea.revalidate();
            optimizedGraphArea.repaint();
            optimizedGraphArea.requestFocus();
        }
    }

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
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);

            }
        });

    }

    private class MethodVisitor extends VoidVisitorAdapter {

        @Override
        public void visit(MethodDeclaration n, Object arg) {
            CustomComboBoxItem item = new CustomComboBoxItem(n, codeArea, selectedCodeArea);
            metodos.addItem(item);
            methods.add(item);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem Open;
    private javax.swing.JLabel className;
    private javax.swing.JTextArea codeArea;
    private javax.swing.JLabel complexidade;
    private javax.swing.JLabel complexidadeOtimizada;
    private javax.swing.JPanel controlButtons;
    private javax.swing.JPanel controlButtonsArea;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JPanel graphArea;
    private javax.swing.JPanel graphTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JComboBox metodos;
    private javax.swing.JToggleButton moveButton;
    private javax.swing.JPanel optimizedGraphArea;
    private javax.swing.JPanel optimizedGraphButtonsArea;
    private javax.swing.JPanel optimizedGraphTab;
    private javax.swing.JLabel pathText;
    private javax.swing.JComboBox paths;
    private javax.swing.JTable predicatesTable;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JToggleButton selectButton;
    private javax.swing.JTextArea selectedCodeArea;
    private javax.swing.JLabel selectedNode;
    private javax.swing.JLabel txtCaminho;
    private javax.swing.JLabel txtComplexidade;
    private javax.swing.JLabel txtComplexidadeAnalise;
    private javax.swing.JButton zoomInButton;
    private javax.swing.JButton zoomOutButton;
    // End of variables declaration//GEN-END:variables
}
