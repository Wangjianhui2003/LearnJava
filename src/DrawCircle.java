//画图
import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class DrawCircle extends JFrame{//窗口
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle(){
        Mypanel mp = new Mypanel();
        this.add(mp);//加入面板
        this.setSize(400,280);//设置窗口大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点叉后程序结束
        this.setVisible(true);//设为可见
    }
}

class Mypanel extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint method is called");
//        g.drawOval(10,10,100,100);
//        g.drawLine(10,10,100,100);
//        g.drawRect(10,10,100,100);//矩形
//        g.setColor(OOP.Color.blue);//设置颜色
//        g.fillRect(10,10,100,100);//填充
        Image image = Toolkit.getDefaultToolkit().getImage(Mypanel.class.getResource("LinaImage.jpg"));
        g.drawImage(image,10,10,153,216,this);
        g.setColor(Color.pink);
        g.setFont(new Font("幼圆",Font.BOLD,50));
        g.drawString("Lina",200,130);
    }
}
