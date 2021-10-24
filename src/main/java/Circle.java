import java.text.DecimalFormat;

/**
 * Project name(项目名称)：第二次实验 实验1
 * Package(包名): PACKAGE_NAME
 * Class(类名): Circle
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/24
 * Time(创建时间)： 20:38
 * Version(版本): 1.0
 * Description(描述)： 圆
 */

public class Circle
{
    private static final double PI = 3.1415926;
    private double radius;          //半径
    private double circumference;   //周长
    private double area;            //面积

    public Circle(double radius)
    {
        if (radius >= 0)
        {
            this.radius = radius;
        }
        else
        {
            this.radius = 0.0;
        }
    }

    public Circle()
    {

    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        if (radius >= 0)
        {
            this.radius = radius;
        }
        else
        {
            this.radius = 0.0;
        }
    }

    public double getCircumference()
    {
        this.circumference = PI * radius * 2;
        return circumference;
    }

    public double getArea()
    {
        this.area = PI * radius * radius;
        return area;
    }

    public String toString()
    {
        DecimalFormat decimalFormat = new DecimalFormat("##.###");
        return "圆半径：" + decimalFormat.format(getRadius()) + "   圆周长："
                + decimalFormat.format(getCircumference())
                + "   圆面积：" + decimalFormat.format(this.getArea());
    }


}
