import java.text.DecimalFormat;
import java.util.Random;

/**
 * Project name(项目名称)：第二次实验 实验1
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/24
 * Time(创建时间)： 21:12
 * Version(版本): 1.0
 * Description(描述)： 测试类
 * 1、三角形、梯形和圆形的类封装：
 * 编写一个Java应用程序，该程序中有3个类：Trangle、Leder和Circle，分别用来刻画“三角形”、“梯形”和“圆形”。具体要求如下：
 * a) Trangle类具有类型为double的三个边，以及周长、面积属性，Trangle类具有返回周长、面积以及修改三个边的功能。
 * 另外，Trangle类还具有一个boolean型的属性，该属性用来判断三个属能否构成一个三角形。
 * b) Lader类具有类型double的上底、下底、高、面积属性，具有返回面积的功能。
 * c) Circle类具有类型为double的半径、周长和面积属性，具有返回周长、面积的功能。
 */

public class test
{
    public static void main(String[] args)
    {
        Triangle t = new Triangle(6, 9.9, 69);
        t.setA1(Math.random() * 10);
        t.setA2(Math.random() * 10);
        t.setA3(Math.random() * 10);
        t.TriangleIsRight();
        DecimalFormat decimalFormat = new DecimalFormat("##.###");
        System.out.println("三条边：");
        System.out.println(decimalFormat.format(t.getA1()));
        System.out.println(decimalFormat.format(t.getA2()));
        System.out.println(decimalFormat.format(t.getA3()));
        System.out.println("周长：");
        System.out.println(decimalFormat.format(t.getCircumference()));
        System.out.println("面积：");
        System.out.println(decimalFormat.format(t.getArea()));
        System.out.println(t);

        System.out.println();
        System.out.println("----------------------");
        System.out.println();
        Leder l = new Leder();
        l.setUpper_bottom(Math.random() * 20);
        l.setBottom(Math.random() * 20);
        l.setHeight(Math.random() * 20);
        System.out.println(decimalFormat.format(l.getArea()));
        System.out.println(l);

        System.out.println();
        System.out.println("----------------------");
        System.out.println();
        Circle c = new Circle();
        c.setRadius(Math.random() * 100);
        System.out.println("半径：" + decimalFormat.format(c.getRadius()));
        System.out.println("周长：" + decimalFormat.format(c.getCircumference()));
        System.out.println("面积：" + decimalFormat.format(c.getArea()));
        System.out.println(c);
    }
}
