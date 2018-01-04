package menu;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.jdbc.JDBCPieDataset;

/**
 *
 * @author Alfian
 */
public class grafik1 extends javax.swing.JPanel {
    public grafik1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Grafik Hasil Penjualan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("Grafik Metode Pembayaran");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText("Gragik Stok Kendaraan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Airstrike Bold", 0, 24)); // NOI18N
        jLabel1.setText("Daftar Grafik Dealer Motor");

        jLabel2.setFont(new java.awt.Font("Airstrike Academy", 0, 24)); // NOI18N
        jLabel2.setText("MzMotor");

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(51, 51, 255));
        jButton4.setText("Grafik Kinerja Pegawai");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton1))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
public class frameChart extends JFrame {
    private JPanel contentPane;
    
    public frameChart() 
	{
		super("Grafik Penjualan Tahun 2017");
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 6850, 4290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
                  
	}
}
public class frameChart2 extends JFrame {
    private JPanel contentPane;
    public frameChart2() 
	{
		super("Grafik Peforma Staff Tahun 2017");
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 6850, 4290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
	}
}
public class frameChart3 extends JFrame {
    private JPanel contentPane;
    public frameChart3() 
	{
		super("Grafik Nilai");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
	}
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try 
	{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            String query = "select j.jenis, m.jumlah from dim_motor j, fakta_penjualan m where j.id_motor=m.id_motor";
            JDBCCategoryDataset data = new JDBCCategoryDataset("jdbc:mysql://localhost/sorum","com.mysql.jdbc.Driver","root","");
            data.executeQuery(query);
            JFreeChart chart = ChartFactory.createBarChart("Grafik Penjualan Tahun 2017","Jenis", "Jumlah", data,PlotOrientation.VERTICAL,true, true, false);
            ChartPanel cPanel = new ChartPanel(chart);
            jPanel1.removeAll();
            jPanel1.add(cPanel, BorderLayout.CENTER);
            jPanel1.validate();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try 
	{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
           
            String query = "select j.jenis_pembayaran, m.jumlah from dim_pembayaran j, fakta_penjualan m where j.id_pembayaran=m.id_pembayaran";
            JDBCCategoryDataset data = new JDBCCategoryDataset("jdbc:mysql://localhost/sorum","com.mysql.jdbc.Driver","root","");
            data.executeQuery(query);
            JFreeChart chart = ChartFactory.createLineChart("Grafik Metode Pembayaran Tahun 2017","Metode Pembayaran", "Jumlah", data,PlotOrientation.VERTICAL,true, true, false);
            ChartPanel cPanel = new ChartPanel(chart);
            jPanel1.removeAll();
            jPanel1.add(cPanel, BorderLayout.CENTER);
            jPanel1.validate();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Connection connection = null;
    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sorum","root","");
        } catch (SQLException e) {
        e.printStackTrace();
        }
    }
    catch (InstantiationException e) {
        e.printStackTrace();
    }
    catch (IllegalAccessException e) {
        e.printStackTrace();
    }
    catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

    JDBCPieDataset dataset= new JDBCPieDataset (connection) ;
    try {
        dataset.executeQuery("select jenis, stok from dim_motor;");
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart", dataset, true, true, false);
        if (chart != null) {
        }
    }
    catch (SQLException e) {
        e.printStackTrace();
    }
    try {
        if(connection != null){connection.close();}
    }
    catch (SQLException e) {e.printStackTrace();}
    JFreeChart chart=ChartFactory.createPieChart("Grafik Stok Kendaraan Tahun 2017",dataset,true,true,false);
    ChartPanel cPanel = new ChartPanel(chart);
            jPanel1.removeAll();
            jPanel1.add(cPanel, BorderLayout.CENTER);
            jPanel1.validate();
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try 
	{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            
            String query = "select j.dim_nama_staff, m.jumlah from dim_staff_sp j, fakta_penjualan m where j.dim_id_staff=m.dim_id_staff";
            JDBCCategoryDataset data = new JDBCCategoryDataset("jdbc:mysql://localhost/sorum","com.mysql.jdbc.Driver","root","");
            data.executeQuery(query);
            JFreeChart chart = ChartFactory.createBarChart("Grafik Peforma Salles Marketing Tahun 2017","Nama Staff", "Terjual", data,PlotOrientation.VERTICAL,true, true, false);
            ChartPanel cPanel = new ChartPanel(chart);
            jPanel1.removeAll();
            jPanel1.add(cPanel, BorderLayout.CENTER);
            jPanel1.validate();
            
	} catch (Exception e) {
            e.printStackTrace();
	}
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
