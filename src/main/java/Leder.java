import java.text.DecimalFormat;

/**
 * Project name(项目名称)：第二次实验 实验1
 * Package(包名): PACKAGE_NAME
 * Class(类名): Leder
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/24
 * Time(创建时间)： 20:38
 * Version(版本): 1.0
 * Description(描述)： 梯形
 */

public class Leder
{
    private double upper_bottom;       //上底
    private double bottom;             //下底
    private double height;             //高
    private double area;               //面积

    public Leder(double upper_bottom, double bottom, double height)
    {
        if (upper_bottom >= 0)
        {
            this.upper_bottom = upper_bottom;
        }
        else
        {
            this.upper_bottom = 0.0;
        }
        if (bottom >= 0)
        {
            this.bottom = bottom;
        }
        else
        {
            this.bottom = 0.0;
        }
        if (height >= 0)
        {
            this.height = height;
        }
        else
        {
            this.height = 0;
        }
    }

    public Leder()
    {

    }

    public double getUpper_bottom()
    {
        return upper_bottom;
    }

    public void setUpper_bottom(double upper_bottom)
    {
        if (upper_bottom >= 0)
        {
            this.upper_bottom = upper_bottom;
        }
        else
        {
            this.upper_bottom = 0.0;
        }
    }

    public double getBottom()
    {
        return bottom;
    }

    public void setBottom(double bottom)
    {
        if (bottom >= 0)
        {
            this.bottom = bottom;
        }
        else
        {
            this.bottom = 0.0;
        }
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        if (height >= 0)
        {
            this.height = height;
        }
        else
        {
            this.height = 0;
        }
    }

    public double getArea()
    {
        this.area = (upper_bottom + bottom) * height / 2;
        return this.area;
    }

    public String toString()
    {
        DecimalFormat decimalFormat = new DecimalFormat("##.###");
        this.getArea();
        return "上底：" + decimalFormat.format(getUpper_bottom()) + "   下底：" + decimalFormat.format(getBottom())
                + "   高" + decimalFormat.format(getHeight()) + "   面积：" + decimalFormat.format(getArea());
    }
}
