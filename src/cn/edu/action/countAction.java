package cn.edu.action;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;

import cn.edu.dao.JobCountDAO;

import com.opensymphony.xwork2.ActionSupport;

public class countAction extends ActionSupport {
	private String path;
	private JFreeChart chart;

	public JFreeChart getChart() {
		return chart;
	}

	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String totalCount() {
		JobCountDAO c = new JobCountDAO();
		c.count();
		c.getGraduation();
		c.getJonGrad();
		DefaultPieDataset dpd = new DefaultPieDataset();
		dpd.setValue("未就业总人数：" + (c.getGraduation() - c.getJonGrad()),
				c.getGraduation() - c.getJonGrad());
		dpd.setValue("已就业总人数：" + c.getJonGrad(), c.getJonGrad());
		chart = ChartFactory.createPieChart3D("XX学校就业结构图", dpd, true, false,
				false);
		PiePlot pieplot = (PiePlot) chart.getPlot();
		java.awt.Font font = new java.awt.Font("黑体", 20, 15);
		pieplot.setLabelFont(font); // 设置饼状图体里的的各个标签字体
		chart.getLegend().setItemFont(font);// 设置图表下方的图例说明字体
		chart.setTitle(new TextTitle("XX学校就业结构图", font));// 设置标题
		// pieplot.setExplodePercent("已就业总人数："+c.getJonGrad(), 0.5);//取出一部分
		pieplot.setLabelGenerator(new StandardPieSectionLabelGenerator(
				"{0}({2} percent)"));	

		return "success";

	}

}
