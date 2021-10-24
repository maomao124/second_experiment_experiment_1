import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Project name(项目名称)：第二次实验 实验1
 * Package(包名): PACKAGE_NAME
 * Class(类名): Triangle
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/24
 * Time(创建时间)： 20:38
 * Version(版本): 1.0
 * Description(描述)： 三角形
 */

public class Triangle
{
    private double a1;      //三条边
    private double a2;
    private double a3;
    private double circumference;   //周长
    private double area;            //面积
    private boolean isRight = false;        //该属性用来判断三个属能否构成一个三角形

    public Triangle(double a1, double a2, double a3)
    {
        LinkedList<Double> a = new LinkedList<>();
        a.add(a1);
        a.add(a2);
        a.add(a3);
        Collections.sort(a);
        //a.forEach(System.out::println);
        if (a.removeFirst() + a.removeFirst() > a.removeFirst())
        {
            isRight = true;
            if (a1 >= 0)
            {
                this.a1 = a1;
            }
            else
            {
                this.a1 = 0.0;
            }
            if (a2 >= 0)
            {
                this.a2 = a2;
            }
            else
            {
                this.a2 = 0.0;
            }
            if (a3 >= 0)
            {
                this.a3 = a3;
            }
            else
            {
                this.a3 = 0.0;
            }
        }
        else
        {
            System.out.println("两边之和不大于大于第三边！！！构造函数赋值失败！！！");
        }
        a = null;
    }

    public boolean TriangleIsRight()
    {
        LinkedList<Double> a = new LinkedList<>();
        a.add(a1);
        a.add(a2);
        a.add(a3);
        Collections.sort(a);

        if (a.removeFirst() + a.removeFirst() > a.removeFirst())
        {
            isRight = true;
            System.out.println("两边之和大于大于第三边");
            a = null;
            return true;
        }
        else
        {
            isRight = false;
            System.out.println("两边之和不大于大于第三边!!!");
            a = null;
            return false;
        }

    }

    public double getA1()
    {
        return a1;
    }

    public double getA2()
    {
        return a2;
    }

    public double getA3()
    {
        return a3;
    }

    public void setA1(double a1)
    {
        if (a1 >= 0)
        {
            this.a1 = a1;
        }
        else
        {
            this.a1 = 0.0;
        }
    }

    public void setA2(double a2)
    {
        if (a2 >= 0)
        {
            this.a2 = a2;
        }
        else
        {
            this.a2 = 0.0;
        }
    }

    public void setA3(double a3)
    {
        if (a3 >= 0)
        {
            this.a3 = a3;
        }
        else
        {
            this.a3 = 0.0;
        }
    }

    public double getCircumference()
    {
        this.circumference = a1 + a2 + a3;
        return this.circumference;
    }

    public double getArea()
    {
        if (TriangleIsRight())
        {
            double p;           //周长的一半
            p = 0.5 * (a1 + a2 + a3);
            this.area = Math.sqrt(p * (p - a1) * (p - a2) * (p - a3));      //海伦公式  S=√[p(p-a)(p-b)(p-c)]  p=(a+b+c)/2
            return area;
        }
        else
        {
            System.out.println("面积无法计算");
            return 0.0;
        }
    }

    public String toString()
    {
        this.getCircumference();
        this.getArea();
        DecimalFormat decimalFormat = new DecimalFormat("##.###");   //保留3位小数
        return "三条边：" + decimalFormat.format(a1) + "  " + decimalFormat.format(a2) + "  " + decimalFormat.format(a3)
                + "\n周长：" + decimalFormat.format(this.circumference) + "\n面积：" + decimalFormat.format(this.area);
    }

}
