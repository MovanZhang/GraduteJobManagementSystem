package cn.edu.action;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import cn.edu.dao.JobCountDAO;

import com.opensymphony.xwork2.ActionSupport;

public class sexCountAction extends ActionSupport {
	private String search;
	private JFreeChart chart;

	public JFreeChart getChart() {
		return chart;
	}

	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String totalCount() {
		JobCountDAO c = new JobCountDAO();
		// System.out.println(search);
		HttpServletRequest request = ServletActionContext.getRequest();
		search = request.getParameter("search");
		String str = null;
		try {
			str = new String(search.getBytes("iso-8859-1"), "utf8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.total(str);
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(c.getMtotal(), "总数", "男生");
		dataset.addValue(c.getMtotal1(), "就业人数", "男生");
		dataset.addValue(c.getWtotal(), "总数", "女生");
		dataset.addValue(c.getWtotal1(), "就业人数", "女生");
		chart = ChartFactory.createBarChart3D("男、女统计图", // 图表标题
				"性别", // 目录轴的显示标签
				"人数", // 数值轴的显示标签
				dataset, // 数据集
				PlotOrientation.VERTICAL, // 图表方向：水平、垂直
				true, // 是否显示图例(对于简单的柱状图必须是false)
				false, // 是否生成工具
				false // 是否生成URL链接
				);

		CategoryPlot plot = chart.getCategoryPlot();// 获取图表区域对象
		java.awt.Font font = new java.awt.Font("黑体", 20, 15);
		CategoryAxis domainAxis = plot.getDomainAxis();// (柱状图的x轴)
		domainAxis.setTickLabelFont(font);// 设置x轴坐标上的字体
		domainAxis.setLabelFont(font);// 设置x轴上的标题的字体
		ValueAxis valueAxis = plot.getRangeAxis();// (柱状图的y轴)
		valueAxis.setTickLabelFont(font);// 设置y轴坐标上的字体
		valueAxis.setLabelFont(font);// 设置y轴坐标上的标题的字体
		chart.getTitle().setFont(font);
		chart.getLegend().setItemFont(font);
		domainAxis.setVisible(true);
		// ChartFrame chartframe = new ChartFrame("BarChart", chart);
		// chartframe.pack();
		// chartframe.setVisible(true);
		return "success";

	}

}
