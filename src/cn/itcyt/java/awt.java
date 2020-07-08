package cn.itcyt.java;

import java.awt.*;

public class awt {
    public static void main(String[] args) {
        javax.swing.JFrame jf = new javax.swing.JFrame();
        jf.setTitle("Index");
        jf.setSize(400,500);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        FlowLayout flowLayout = new FlowLayout();
        jf.setLayout(flowLayout);
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon("C:\\Users\\Administrator.SXCSXC-MVCT39V1\\Desktop\\timg.jpg");
//        //标签
//        javax.swing.JLabel jla = new javax.swing.JLabel(icon);
//        java.awt.Dimension dm0=new java.awt.Dimension(280,200);
//        //设置大小
//        jla.setPreferredSize(dm0);//应用大小到相应组件
//        jf.add(jla);//将组件加到窗体上
//
//        //文本框
//        javax.swing.JTextField jtf = new javax.swing.JTextField();
//        java.awt.Dimension dm = new java.awt.Dimension(280, 30);
//        //(除了JFrame)其它所有组件设置大小都是该方法
//        jtf.setPreferredSize(dm);
//        jf.add(jtf);
//
//        //复选框
//        javax.swing.JCheckBox jcb = new javax.swing.JCheckBox("记住密码");
//        jf.add(jcb);
//
//        javax.swing.JCheckBox jcb2 = new javax.swing.JCheckBox("忘记密码");
//        jf.add(jcb2);
//
//        //按钮
//        javax.swing.JButton jbu = new javax.swing.JButton("登陆");
//        jf.add(jbu);   //给窗体添加一个按钮对象

       jf.setVisible(true);   //设置可见，放在代码最后一句
    }
}
